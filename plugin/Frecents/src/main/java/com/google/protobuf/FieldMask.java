// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/field_mask.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.FieldMask}
 */
public  final class FieldMask extends
    com.google.protobuf.GeneratedMessageLite<
        FieldMask, FieldMask.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.FieldMask)
    FieldMaskOrBuilder {
  private FieldMask() {
    paths_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int PATHS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<java.lang.String> paths_;
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @return A list containing the paths.
   */
  @java.lang.Override
  public java.util.List<java.lang.String> getPathsList() {
    return paths_;
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @return The count of paths.
   */
  @java.lang.Override
  public int getPathsCount() {
    return paths_.size();
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  @java.lang.Override
  public java.lang.String getPaths(int index) {
    return paths_.get(index);
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        paths_.get(index));
  }
  private void ensurePathsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<java.lang.String> tmp =
        paths_;  if (!tmp.isModifiable()) {
      paths_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param index The index to set the value at.
   * @param value The paths to set.
   */
  private void setPaths(
      int index, java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensurePathsIsMutable();
    paths_.set(index, value);
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param value The paths to add.
   */
  private void addPaths(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  ensurePathsIsMutable();
    paths_.add(value);
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param values The paths to add.
   */
  private void addAllPaths(
      java.lang.Iterable<java.lang.String> values) {
    ensurePathsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, paths_);
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   */
  private void clearPaths() {
    paths_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <code>repeated string paths = 1 [json_name = "paths"];</code>
   * @param value The bytes of the paths to add.
   */
  private void addPathsBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    ensurePathsIsMutable();
    paths_.add(value.toStringUtf8());
  }

  public static com.google.protobuf.FieldMask parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.FieldMask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.FieldMask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.protobuf.FieldMask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.protobuf.FieldMask parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.FieldMask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.FieldMask prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.protobuf.FieldMask}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.FieldMask, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.FieldMask)
      com.google.protobuf.FieldMaskOrBuilder {
    // Construct using com.google.protobuf.FieldMask.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @return A list containing the paths.
     */
    @java.lang.Override
    public java.util.List<java.lang.String>
        getPathsList() {
      return java.util.Collections.unmodifiableList(
          instance.getPathsList());
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @return The count of paths.
     */
    @java.lang.Override
    public int getPathsCount() {
      return instance.getPathsCount();
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @param index The index of the element to return.
     * @return The paths at the given index.
     */
    @java.lang.Override
    public java.lang.String getPaths(int index) {
      return instance.getPaths(index);
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the paths at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathsBytes(int index) {
      return instance.getPathsBytes(index);
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @param index The index to set the value at.
     * @param value The paths to set.
     * @return This builder for chaining.
     */
    public Builder setPaths(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setPaths(index, value);
      return this;
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @param value The paths to add.
     * @return This builder for chaining.
     */
    public Builder addPaths(
        java.lang.String value) {
      copyOnWrite();
      instance.addPaths(value);
      return this;
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @param values The paths to add.
     * @return This builder for chaining.
     */
    public Builder addAllPaths(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllPaths(values);
      return this;
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPaths() {
      copyOnWrite();
      instance.clearPaths();
      return this;
    }
    /**
     * <code>repeated string paths = 1 [json_name = "paths"];</code>
     * @param value The bytes of the paths to add.
     * @return This builder for chaining.
     */
    public Builder addPathsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addPathsBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.FieldMask)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.FieldMask();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "paths_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.protobuf.FieldMask> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.protobuf.FieldMask.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.protobuf.FieldMask>(
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


  // @@protoc_insertion_point(class_scope:google.protobuf.FieldMask)
  private static final com.google.protobuf.FieldMask DEFAULT_INSTANCE;
  static {
    FieldMask defaultInstance = new FieldMask();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FieldMask.class, defaultInstance);
  }

  public static com.google.protobuf.FieldMask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FieldMask> PARSER;

  public static com.google.protobuf.Parser<FieldMask> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

