// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/api.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializemethod")
public inline fun method(block: com.google.protobuf.MethodKt.Dsl.() -> kotlin.Unit): com.google.protobuf.Method =
  com.google.protobuf.MethodKt.Dsl._create(com.google.protobuf.Method.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.Method`
 */
public object MethodKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.Method.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.Method.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.Method = _builder.build()

    /**
     * `string name = 1 [json_name = "name"];`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.name
      @JvmName("setName")
      set(value) {
        _builder.name = value
      }
    /**
     * `string name = 1 [json_name = "name"];`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * `string request_type_url = 2 [json_name = "requestTypeUrl"];`
     */
    public var requestTypeUrl: kotlin.String
      @JvmName("getRequestTypeUrl")
      get() = _builder.requestTypeUrl
      @JvmName("setRequestTypeUrl")
      set(value) {
        _builder.requestTypeUrl = value
      }
    /**
     * `string request_type_url = 2 [json_name = "requestTypeUrl"];`
     */
    public fun clearRequestTypeUrl() {
      _builder.clearRequestTypeUrl()
    }

    /**
     * <code>bool request_streaming = 3 [json_name = "requestStreaming"];</code>
     */
    public var requestStreaming: kotlin.Boolean
      @JvmName("getRequestStreaming")
      get() = _builder.requestStreaming
      @JvmName("setRequestStreaming")
      set(value) {
        _builder.requestStreaming = value
      }
    /**
     * `bool request_streaming = 3 [json_name = "requestStreaming"];`
     */
    public fun clearRequestStreaming() {
      _builder.clearRequestStreaming()
    }

    /**
     * `string response_type_url = 4 [json_name = "responseTypeUrl"];`
     */
    public var responseTypeUrl: kotlin.String
      @JvmName("getResponseTypeUrl")
      get() = _builder.responseTypeUrl
      @JvmName("setResponseTypeUrl")
      set(value) {
        _builder.responseTypeUrl = value
      }
    /**
     * `string response_type_url = 4 [json_name = "responseTypeUrl"];`
     */
    public fun clearResponseTypeUrl() {
      _builder.clearResponseTypeUrl()
    }

    /**
     * <code>bool response_streaming = 5 [json_name = "responseStreaming"];</code>
     */
    public var responseStreaming: kotlin.Boolean
      @JvmName("getResponseStreaming")
      get() = _builder.responseStreaming
      @JvmName("setResponseStreaming")
      set(value) {
        _builder.responseStreaming = value
      }
    /**
     * `bool response_streaming = 5 [json_name = "responseStreaming"];`
     */
    public fun clearResponseStreaming() {
      _builder.clearResponseStreaming()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OptionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     */
     public val options: com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.optionsList
      )
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     * @param value The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOptions")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>.add(value: com.google.protobuf.Option) {
      _builder.addOptions(value)
    }
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     * @param value The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>.plusAssign(value: com.google.protobuf.Option) {
      add(value)
    }
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     * @param values The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOptions")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.Option>) {
      _builder.addAllOptions(values)
    }
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     * @param values The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.Option>) {
      addAll(values)
    }
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     * @param index The index to set the value at.
     * @param value The options to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOptions")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>.set(index: kotlin.Int, value: com.google.protobuf.Option) {
      _builder.setOptions(index, value)
    }
    /**
     * `repeated .google.protobuf.Option options = 6 [json_name = "options"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOptions")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Option, OptionsProxy>.clear() {
      _builder.clearOptions()
    }

    /**
     * `.google.protobuf.Syntax syntax = 7 [json_name = "syntax"];`
     */
    public var syntax: com.google.protobuf.Syntax
      @JvmName("getSyntax")
      get() = _builder.syntax
      @JvmName("setSyntax")
      set(value) {
        _builder.syntax = value
      }
    public var syntaxValue: kotlin.Int
      @JvmName("getSyntaxValue")
      get() = _builder.syntaxValue
      @JvmName("setSyntaxValue")
      set(value) {
        _builder.syntaxValue = value
      }
    /**
     * `.google.protobuf.Syntax syntax = 7 [json_name = "syntax"];`
     */
    public fun clearSyntax() {
      _builder.clearSyntax()
    }
  }
}
public inline fun com.google.protobuf.Method.copy(block: `com.google.protobuf`.MethodKt.Dsl.() -> kotlin.Unit): com.google.protobuf.Method =
  `com.google.protobuf`.MethodKt.Dsl._create(this.toBuilder()).apply { block() }._build()

