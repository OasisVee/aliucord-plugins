// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/wrappers.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializeuInt32Value")
public inline fun uInt32Value(block: com.google.protobuf.UInt32ValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.UInt32Value =
  com.google.protobuf.UInt32ValueKt.Dsl._create(com.google.protobuf.UInt32Value.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.UInt32Value`
 */
public object UInt32ValueKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.UInt32Value.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.UInt32Value.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.UInt32Value = _builder.build()

    /**
     * <code>uint32 value = 1 [json_name = "value"];</code>
     */
    public var value: kotlin.Int
      @JvmName("getValue")
      get() = _builder.value
      @JvmName("setValue")
      set(value) {
        _builder.value = value
      }
    /**
     * `uint32 value = 1 [json_name = "value"];`
     */
    public fun clearValue() {
      _builder.clearValue()
    }
  }
}
public inline fun com.google.protobuf.UInt32Value.copy(block: `com.google.protobuf`.UInt32ValueKt.Dsl.() -> kotlin.Unit): com.google.protobuf.UInt32Value =
  `com.google.protobuf`.UInt32ValueKt.Dsl._create(this.toBuilder()).apply { block() }._build()

