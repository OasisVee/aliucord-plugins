// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/wrappers.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializebytesValue")
public inline fun bytesValue(block: com.google.protobuf.BytesValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.BytesValue =
  com.google.protobuf.BytesValueKt.Dsl._create(com.google.protobuf.BytesValue.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.BytesValue`
 */
public object BytesValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.BytesValue.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.BytesValue.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.BytesValue = _builder.build()

    /**
     * <code>bytes value = 1 [json_name = "value"];</code>
     */
    public var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.value
      @JvmName("setValue")
      set(value) {
        _builder.value = value
      }
    /**
     * `bytes value = 1 [json_name = "value"];`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
public inline fun com.google.protobuf.BytesValue.copy(block: `com.google.protobuf`.BytesValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.BytesValue =
  `com.google.protobuf`.BytesValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()

