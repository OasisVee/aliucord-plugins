@file:Suppress("UnstableApiUsage")

import com.aliucord.gradle.AliucordExtension
import com.android.build.gradle.LibraryExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.KtlintExtension

subprojects {
    val libs = rootProject.libs

    apply {
        plugin(libs.plugins.android.library.get().pluginId)
        plugin(libs.plugins.aliucord.get().pluginId)
        plugin(libs.plugins.kotlin.android.get().pluginId)
        plugin(libs.plugins.ktlint.get().pluginId)
    }

    configure<LibraryExtension> {
        namespace = "com.aliucord.plugins"

        compileSdk = 34

        defaultConfig {
            minSdk = 21
        }

        buildFeatures {
            renderScript = false
            shaders = false
            buildConfig = true
            resValues = false
            androidResources = false
            aidl = false
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }

        lint {
            disable += "SetTextI18n"
        }
    }

    configure<AliucordExtension> {
        author("zt", 289556910426816513L)

        updateUrl.set("https://raw.githubusercontent.com/zt64/aliucord-plugins/builds/updater.json")
        buildUrl.set("https://raw.githubusercontent.com/zt64/aliucord-plugins/builds/%s.zip")
    }

    configure<KtlintExtension> {
        version.set(libs.versions.ktlint)

        coloredOutput.set(true)
        outputColorName.set("RED")
        ignoreFailures.set(true)
    }

    dependencies {
        val discord by configurations
        val compileOnly by configurations
        val implementation by configurations

        discord(libs.discord)
        compileOnly(libs.aliucord)
        // compileOnly("com.github.Aliucord:Aliucord:unspecified")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
        }
    }
}

tasks.register("generateReadMe") {
    group = "aliucord"
    description = "Generates the README.md file with download links for all plugins"

    outputs.file(rootProject.file("README.md"))

    doLast {
        val readMe = rootProject.file("README.md")
        val plugins = subprojects
            .filterNot {
                it.extensions.getByType<AliucordExtension>().excludeFromUpdaterJson.get()
            }
            .sortedBy { it.name }

        val content = buildString {
            // Header with badges
            appendLine("# Aliucord Plugins")
            appendLine()
            appendLine(
                "[![Plugins](https://img.shields.io/badge/Plugins-${plugins.size}-blue?style=for-the-badge)](https://github.com/zt64/aliucord-plugins)"
            )
            appendLine()
            appendLine("A collection of plugins for [Aliucord](https://github.com/Aliucord), a Discord mobile client mod.")
            appendLine()

            // Installation section with emoji
            appendLine("## 📥 Installation")
            appendLine()
            appendLine("Click on a plugin name to download, then move the downloaded file to the `Aliucord/plugins` folder on your device.")
            appendLine()

            // Plugin list in table format
            appendLine("## 🧩 Available Plugins")
            appendLine()
            appendLine("| Plugin | Description |")
            appendLine("|:-------|:------------|")

            plugins.forEach { subproject ->
                val description = subproject.description ?: "No description provided."
                appendLine(
                    "| [**${subproject.name}**](https://github.com/zt64/aliucord-plugins/raw/builds/${subproject.name}.zip) | $description |"
                )
            }
        }

        readMe.writeText(content)
    }
}