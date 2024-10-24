// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/type.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.Type}
 */
public  final class Type extends
    com.google.protobuf.GeneratedMessageLite<
        Type, Type.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Type)
    TypeOrBuilder {
  private Type() {
    name_ = "";
    fields_ = emptyProtobufList();
    oneofs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    options_ = emptyProtobufList();
    edition_ = "";
  }
  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();

  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Field> fields_;
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Field> getFieldsList() {
    return fields_;
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  public java.util.List<? extends com.google.protobuf.FieldOrBuilder> 
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Field getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  public com.google.protobuf.FieldOrBuilder getFieldsOrBuilder(
      int index) {
    return fields_.get(index);
  }
  private void ensureFieldsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Field> tmp = fields_;
    if (!tmp.isModifiable()) {
      fields_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  private void setFields(
      int index, com.google.protobuf.Field value) {
    value.getClass();
  ensureFieldsIsMutable();
    fields_.set(index, value);
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  private void addFields(com.google.protobuf.Field value) {
    value.getClass();
  ensureFieldsIsMutable();
    fields_.add(value);
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  private void addFields(
      int index, com.google.protobuf.Field value) {
    value.getClass();
  ensureFieldsIsMutable();
    fields_.add(index, value);
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  private void addAllFields(
      java.lang.Iterable<? extends com.google.protobuf.Field> values) {
    ensureFieldsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, fields_);
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  private void clearFields() {
    fields_ = emptyProtobufList();
  }
  /**
   * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
   */
  private void removeFields(int index) {
    ensureFieldsIsMutable();
    fields_.remove(index);
  }

  public static final int ONEOFS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> oneofs_;
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @return A list containing the oneofs.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getOneofsList() {
    return oneofs_;
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @return The count of oneofs.
   */
  @java.lang.Override
  public int getOneofsCount() {
    return oneofs_.size();
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @param index The index of the element to return.
   * @return The oneofs at the given index.
   */
  @java.lang.Override
  public java.lang.String getOneofs(int index) {
    return oneofs_.get(index);
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the oneofs at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOneofsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        oneofs_.get(index));
  }
  private void ensureOneofsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        oneofs_;  if (!tmp.isModifiable()) {
      oneofs_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @param index The index to set the value at.
   * @param value The oneofs to set.
   */
  private void setOneofs(
      int index, java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureOneofsIsMutable();
    oneofs_.set(index, value);
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @param value The oneofs to add.
   */
  private void addOneofs(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensureOneofsIsMutable();
    oneofs_.add(value);
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @param values The oneofs to add.
   */
  private void addAllOneofs(
      java.lang.Iterable<java.lang.String> values) {
    ensureOneofsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, oneofs_);
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   */
  private void clearOneofs() {
    oneofs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
   * @param value The bytes of the oneofs to add.
   */
  private void addOneofsBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    ensureOneofsIsMutable();
    oneofs_.add(value.toStringUtf8());
  }

  public static final int OPTIONS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_;
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Option> getOptionsList() {
    return options_;
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  public java.util.List<? extends com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Option getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  public com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
  }
  private void ensureOptionsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> tmp = options_;
    if (!tmp.isModifiable()) {
      options_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  private void setOptions(
      int index, com.google.protobuf.Option value) {
    value.getClass();
  ensureOptionsIsMutable();
    options_.set(index, value);
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  private void addOptions(com.google.protobuf.Option value) {
    value.getClass();
  ensureOptionsIsMutable();
    options_.add(value);
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  private void addOptions(
      int index, com.google.protobuf.Option value) {
    value.getClass();
  ensureOptionsIsMutable();
    options_.add(index, value);
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  private void addAllOptions(
      java.lang.Iterable<? extends com.google.protobuf.Option> values) {
    ensureOptionsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, options_);
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  private void clearOptions() {
    options_ = emptyProtobufList();
  }
  /**
   * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
   */
  private void removeOptions(int index) {
    ensureOptionsIsMutable();
    options_.remove(index);
  }

  public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
  private com.google.protobuf.SourceContext sourceContext_;
  /**
   * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
   */
  @java.lang.Override
  public boolean hasSourceContext() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.SourceContext getSourceContext() {
    return sourceContext_ == null ? com.google.protobuf.SourceContext.getDefaultInstance() : sourceContext_;
  }
  /**
   * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
   */
  private void setSourceContext(com.google.protobuf.SourceContext value) {
    value.getClass();
  sourceContext_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSourceContext(com.google.protobuf.SourceContext value) {
    value.getClass();
  if (sourceContext_ != null &&
        sourceContext_ != com.google.protobuf.SourceContext.getDefaultInstance()) {
      sourceContext_ =
        com.google.protobuf.SourceContext.newBuilder(sourceContext_).mergeFrom(value).buildPartial();
    } else {
      sourceContext_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
   */
  private void clearSourceContext() {  sourceContext_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int SYNTAX_FIELD_NUMBER = 6;
  private int syntax_;
  /**
   * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
   * @return The enum numeric value on the wire for syntax.
   */
  @java.lang.Override
  public int getSyntaxValue() {
    return syntax_;
  }
  /**
   * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
   * @return The syntax.
   */
  @java.lang.Override
  public com.google.protobuf.Syntax getSyntax() {
    com.google.protobuf.Syntax result = com.google.protobuf.Syntax.forNumber(syntax_);
    return result == null ? com.google.protobuf.Syntax.UNRECOGNIZED : result;
  }
  /**
   * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
   * @param value The enum numeric value on the wire for syntax to set.
   */
  private void setSyntaxValue(int value) {
      syntax_ = value;
  }
  /**
   * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
   * @param value The syntax to set.
   */
  private void setSyntax(com.google.protobuf.Syntax value) {
    syntax_ = value.getNumber();

  }
  /**
   * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
   */
  private void clearSyntax() {

    syntax_ = 0;
  }

  public static final int EDITION_FIELD_NUMBER = 7;
  private java.lang.String edition_;
  /**
   * <code>string edition = 7 [json_name = "edition"];</code>
   * @return The edition.
   */
  @java.lang.Override
  public java.lang.String getEdition() {
    return edition_;
  }
  /**
   * <code>string edition = 7 [json_name = "edition"];</code>
   * @return The bytes for edition.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEditionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(edition_);
  }
  /**
   * <code>string edition = 7 [json_name = "edition"];</code>
   * @param value The edition to set.
   */
  private void setEdition(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    edition_ = value;
  }
  /**
   * <code>string edition = 7 [json_name = "edition"];</code>
   */
  private void clearEdition() {

    edition_ = getDefaultInstance().getEdition();
  }
  /**
   * <code>string edition = 7 [json_name = "edition"];</code>
   * @param value The bytes for edition to set.
   */
  private void setEditionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    edition_ = value.toStringUtf8();

  }

  public static com.google.protobuf.Type parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Type parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Type parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Type parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Type parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Type parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Type parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Type parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.protobuf.Type parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.protobuf.Type parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Type parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Type parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Type prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.protobuf.Type}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Type, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Type)
      com.google.protobuf.TypeOrBuilder {
    // Construct using com.google.protobuf.Type.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.Field> getFieldsList() {
      return java.util.Collections.unmodifiableList(
          instance.getFieldsList());
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public int getFieldsCount() {
      return instance.getFieldsCount();
    }/**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Field getFields(int index) {
      return instance.getFields(index);
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder setFields(
        int index, com.google.protobuf.Field value) {
      copyOnWrite();
      instance.setFields(index, value);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder setFields(
        int index, com.google.protobuf.Field.Builder builderForValue) {
      copyOnWrite();
      instance.setFields(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(com.google.protobuf.Field value) {
      copyOnWrite();
      instance.addFields(value);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(
        int index, com.google.protobuf.Field value) {
      copyOnWrite();
      instance.addFields(index, value);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(
        com.google.protobuf.Field.Builder builderForValue) {
      copyOnWrite();
      instance.addFields(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(
        int index, com.google.protobuf.Field.Builder builderForValue) {
      copyOnWrite();
      instance.addFields(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends com.google.protobuf.Field> values) {
      copyOnWrite();
      instance.addAllFields(values);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder clearFields() {
      copyOnWrite();
      instance.clearFields();
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Field fields = 2 [json_name = "fields"];</code>
     */
    public Builder removeFields(int index) {
      copyOnWrite();
      instance.removeFields(index);
      return this;
    }

    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @return A list containing the oneofs.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getOneofsList() {
      return java.util.Collections.unmodifiableList(
          instance.getOneofsList());
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @return The count of oneofs.
     */
    @java.lang.Override
    public int getOneofsCount() {
      return instance.getOneofsCount();
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @param index The index of the element to return.
     * @return The oneofs at the given index.
     */
    @java.lang.Override
    public java.lang.String getOneofs(int index) {
      return instance.getOneofs(index);
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the oneofs at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOneofsBytes(int index) {
      return instance.getOneofsBytes(index);
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @param index The index to set the value at.
     * @param value The oneofs to set.
     * @return This builder for chaining.
     */
    public Builder setOneofs(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setOneofs(index, value);
      return this;
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @param value The oneofs to add.
     * @return This builder for chaining.
     */
    public Builder addOneofs(
        java.lang.String value) {
      copyOnWrite();
      instance.addOneofs(value);
      return this;
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @param values The oneofs to add.
     * @return This builder for chaining.
     */
    public Builder addAllOneofs(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllOneofs(values);
      return this;
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOneofs() {
      copyOnWrite();
      instance.clearOneofs();
      return this;
    }
    /**
     * <code>repeated string oneofs = 3 [json_name = "oneofs"];</code>
     * @param value The bytes of the oneofs to add.
     * @return This builder for chaining.
     */
    public Builder addOneofsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addOneofsBytes(value);
      return this;
    }

    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
      return java.util.Collections.unmodifiableList(
          instance.getOptionsList());
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    @java.lang.Override
    public int getOptionsCount() {
      return instance.getOptionsCount();
    }/**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Option getOptions(int index) {
      return instance.getOptions(index);
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.google.protobuf.Option value) {
      copyOnWrite();
      instance.setOptions(index, value);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder setOptions(
        int index, com.google.protobuf.Option.Builder builderForValue) {
      copyOnWrite();
      instance.setOptions(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(com.google.protobuf.Option value) {
      copyOnWrite();
      instance.addOptions(value);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.google.protobuf.Option value) {
      copyOnWrite();
      instance.addOptions(index, value);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(
        com.google.protobuf.Option.Builder builderForValue) {
      copyOnWrite();
      instance.addOptions(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder addOptions(
        int index, com.google.protobuf.Option.Builder builderForValue) {
      copyOnWrite();
      instance.addOptions(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder addAllOptions(
        java.lang.Iterable<? extends com.google.protobuf.Option> values) {
      copyOnWrite();
      instance.addAllOptions(values);
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder clearOptions() {
      copyOnWrite();
      instance.clearOptions();
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Option options = 4 [json_name = "options"];</code>
     */
    public Builder removeOptions(int index) {
      copyOnWrite();
      instance.removeOptions(index);
      return this;
    }

    /**
     * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
     */
    @java.lang.Override
    public boolean hasSourceContext() {
      return instance.hasSourceContext();
    }
    /**
     * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.SourceContext getSourceContext() {
      return instance.getSourceContext();
    }
    /**
     * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
     */
    public Builder setSourceContext(com.google.protobuf.SourceContext value) {
      copyOnWrite();
      instance.setSourceContext(value);
      return this;
      }
    /**
     * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
     */
    public Builder setSourceContext(
        com.google.protobuf.SourceContext.Builder builderForValue) {
      copyOnWrite();
      instance.setSourceContext(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
     */
    public Builder mergeSourceContext(com.google.protobuf.SourceContext value) {
      copyOnWrite();
      instance.mergeSourceContext(value);
      return this;
    }
    /**
     * <code>.google.protobuf.SourceContext source_context = 5 [json_name = "sourceContext"];</code>
     */
    public Builder clearSourceContext() {  copyOnWrite();
      instance.clearSourceContext();
      return this;
    }

    /**
     * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
     * @return The enum numeric value on the wire for syntax.
     */
    @java.lang.Override
    public int getSyntaxValue() {
      return instance.getSyntaxValue();
    }
    /**
     * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
     * @param value The syntax to set.
     * @return This builder for chaining.
     */
    public Builder setSyntaxValue(int value) {
      copyOnWrite();
      instance.setSyntaxValue(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
     * @return The syntax.
     */
    @java.lang.Override
    public com.google.protobuf.Syntax getSyntax() {
      return instance.getSyntax();
    }
    /**
     * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
     * @param value The enum numeric value on the wire for syntax to set.
     * @return This builder for chaining.
     */
    public Builder setSyntax(com.google.protobuf.Syntax value) {
      copyOnWrite();
      instance.setSyntax(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Syntax syntax = 6 [json_name = "syntax"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSyntax() {
      copyOnWrite();
      instance.clearSyntax();
      return this;
    }

    /**
     * <code>string edition = 7 [json_name = "edition"];</code>
     * @return The edition.
     */
    @java.lang.Override
    public java.lang.String getEdition() {
      return instance.getEdition();
    }
    /**
     * <code>string edition = 7 [json_name = "edition"];</code>
     * @return The bytes for edition.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEditionBytes() {
      return instance.getEditionBytes();
    }
    /**
     * <code>string edition = 7 [json_name = "edition"];</code>
     * @param value The edition to set.
     * @return This builder for chaining.
     */
    public Builder setEdition(
        java.lang.String value) {
      copyOnWrite();
      instance.setEdition(value);
      return this;
    }
    /**
     * <code>string edition = 7 [json_name = "edition"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEdition() {
      copyOnWrite();
      instance.clearEdition();
      return this;
    }
    /**
     * <code>string edition = 7 [json_name = "edition"];</code>
     * @param value The bytes for edition to set.
     * @return This builder for chaining.
     */
    public Builder setEditionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEditionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Type)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Type();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "name_",
            "fields_",
            com.google.protobuf.Field.class,
            "oneofs_",
            "options_",
            com.google.protobuf.Option.class,
            "sourceContext_",
            "syntax_",
            "edition_",
          };
          java.lang.String info =
              "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0208\u0002\u001b" +
              "\u0003\u021a\u0004\u001b\u0005\u1009\u0000\u0006\f\u0007\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.protobuf.Type> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.protobuf.Type.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.protobuf.Type>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.protobuf.Type)
  private static final com.google.protobuf.Type DEFAULT_INSTANCE;
  static {
    Type defaultInstance = new Type();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Type.class, defaultInstance);
  }

  public static com.google.protobuf.Type getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Type> PARSER;

  public static com.google.protobuf.Parser<Type> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

