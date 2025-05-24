import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.widget.NestedScrollView
import com.aliucord.Utils
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin
import com.aliucord.patcher.after
import com.aliucord.patcher.component1
import com.aliucord.patcher.component2
import com.discord.databinding.WidgetChatListActionsBinding
import com.discord.models.domain.emoji.Emoji
import com.discord.stores.StoreStream
import com.discord.utilities.color.ColorCompat
import com.discord.widgets.chat.list.actions.WidgetChatListActions
import com.lytefast.flexinput.R
import kotlin.random.Random

@Suppress("MISSING_DEPENDENCY_SUPERCLASS")
@AliucordPlugin
class QuickStar : Plugin() {
    private val getBindingMethod = WidgetChatListActions::class.java
        .getDeclaredMethod("getBinding")
        .apply { isAccessible = true }

    private fun WidgetChatListActions.getBinding() = getBindingMethod(this) as WidgetChatListActionsBinding

    private fun WidgetChatListActions.addReaction(emoji: Emoji) = WidgetChatListActions.`access$addReaction`(this, emoji)

    private fun getRandomStarEmoji(): Emoji {
        val starEmojiNames = listOf("dizzy", "star", "star2", "sparkles")
        val randomEmojiName = starEmojiNames[Random.nextInt(starEmojiNames.size)]
        return StoreStream.getEmojis().unicodeEmojisNamesMap[randomEmojiName]!!
    }

    override fun start(context: Context) {
        val actionsContainerId = Utils.getResId("dialog_chat_actions_container", "id")
        val quickStarId = View.generateViewId()
        val icon = ContextCompat.getDrawable(context, R.e.ic_star_24dp)

        patcher.after<WidgetChatListActions>(
            "configureUI",
            WidgetChatListActions.Model::class.java
        ) { (_, model: WidgetChatListActions.Model) ->
            val root = getBinding().root.findViewById<LinearLayout>(actionsContainerId)

            root.findViewById<TextView>(quickStarId).apply {
                visibility = if (model.manageMessageContext.canAddReactions) {
                    View.VISIBLE
                } else {
                    View.GONE
                }
                setOnClickListener {
                    val randomStarEmoji = getRandomStarEmoji()
                    addReaction(randomStarEmoji)
                    dismiss()
                }
            }
        }

        patcher.after<WidgetChatListActions>(
            "onViewCreated",
            View::class.java,
            Bundle::class.java
        ) {
            val linearLayout = (it.args[0] as NestedScrollView).getChildAt(0) as LinearLayout
            val ctx = linearLayout.context

            icon?.setTint(ColorCompat.getThemedColor(ctx, R.b.colorInteractiveNormal))

            val quickStar = TextView(ctx, null, 0, R.i.UiKit_Settings_Item_Icon).apply {
                id = quickStarId
                text = "Quick Star"
                setCompoundDrawablesRelativeWithIntrinsicBounds(icon, null, null, null)
            }

            linearLayout.addView(quickStar, 1)
        }
    }

    override fun stop(context: Context) = patcher.unpatchAll()
}