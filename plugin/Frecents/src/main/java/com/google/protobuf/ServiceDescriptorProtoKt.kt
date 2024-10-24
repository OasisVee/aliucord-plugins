// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/descriptor.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.google.protobuf;

@kotlin.jvm.JvmName("-initializeserviceDescriptorProto")
public inline fun serviceDescriptorProto(block: com.google.protobuf.ServiceDescriptorProtoKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto =
  com.google.protobuf.ServiceDescriptorProtoKt.Dsl._create(com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `google.protobuf.ServiceDescriptorProto`
 */
public object ServiceDescriptorProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto = _builder.build()

    /**
     * `optional string name = 1 [json_name = "name"];`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.name
      @JvmName("setName")
      set(value) {
        _builder.name = value
      }
    /**
     * `optional string name = 1 [json_name = "name"];`
     */
    public fun clearName() {
      _builder.clearName()
    }
    /**
     * `optional string name = 1 [json_name = "name"];`
     * @return Whether the name field is set.
     */
    public fun hasName(): kotlin.Boolean {
      return _builder.hasName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MethodProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     */
     public val method: com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.methodList
      )
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     * @param value The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMethod")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.add(value: com.google.protobuf.DescriptorProtos.MethodDescriptorProto) {
      _builder.addMethod(value)
    }
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     * @param value The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMethod")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.plusAssign(value: com.google.protobuf.DescriptorProtos.MethodDescriptorProto) {
      add(value)
    }
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     * @param values The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMethod")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.MethodDescriptorProto>) {
      _builder.addAllMethod(values)
    }
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     * @param values The method to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMethod")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.DescriptorProtos.MethodDescriptorProto>) {
      addAll(values)
    }
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     * @param index The index to set the value at.
     * @param value The method to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMethod")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.set(index: kotlin.Int, value: com.google.protobuf.DescriptorProtos.MethodDescriptorProto) {
      _builder.setMethod(index, value)
    }
    /**
     * `repeated .google.protobuf.MethodDescriptorProto method = 2 [json_name = "method"];`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMethod")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.DescriptorProtos.MethodDescriptorProto, MethodProxy>.clear() {
      _builder.clearMethod()
    }

    /**
     * `optional .google.protobuf.ServiceOptions options = 3 [json_name = "options"];`
     */
    public var options: com.google.protobuf.DescriptorProtos.ServiceOptions
      @JvmName("getOptions")
      get() = _builder.options
      @JvmName("setOptions")
      set(value) {
        _builder.options = value
      }
    /**
     * `optional .google.protobuf.ServiceOptions options = 3 [json_name = "options"];`
     */
    public fun clearOptions() {
      _builder.clearOptions()
    }
    /**
     * `optional .google.protobuf.ServiceOptions options = 3 [json_name = "options"];`
     * @return Whether the options field is set.
     */
    public fun hasOptions(): kotlin.Boolean {
      return _builder.hasOptions()
    }
    public val ServiceDescriptorProtoKt.Dsl.optionsOrNull: com.google.protobuf.DescriptorProtos.ServiceOptions?
      get() = _builder.optionsOrNull
  }
}
public inline fun com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.copy(block: `com.google.protobuf`.ServiceDescriptorProtoKt.Dsl.() -> kotlin.Unit): com.google.protobuf.DescriptorProtos.ServiceDescriptorProto =
  `com.google.protobuf`.ServiceDescriptorProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder.optionsOrNull: com.google.protobuf.DescriptorProtos.ServiceOptions?
  get() = if (hasOptions()) getOptions() else null

