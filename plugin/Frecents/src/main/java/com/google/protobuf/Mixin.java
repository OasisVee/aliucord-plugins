// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/api.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.Mixin}
 */
public  final class Mixin extends
    com.google.protobuf.GeneratedMessageLite<
        Mixin, Mixin.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Mixin)
    MixinOrBuilder {
  private Mixin() {
    name_ = "";
    root_ = "";
  }
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

  public static final int ROOT_FIELD_NUMBER = 2;
  private java.lang.String root_;
  /**
   * <code>string root = 2 [json_name = "root"];</code>
   * @return The root.
   */
  @java.lang.Override
  public java.lang.String getRoot() {
    return root_;
  }
  /**
   * <code>string root = 2 [json_name = "root"];</code>
   * @return The bytes for root.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRootBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(root_);
  }
  /**
   * <code>string root = 2 [json_name = "root"];</code>
   * @param value The root to set.
   */
  private void setRoot(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    root_ = value;
  }
  /**
   * <code>string root = 2 [json_name = "root"];</code>
   */
  private void clearRoot() {

    root_ = getDefaultInstance().getRoot();
  }
  /**
   * <code>string root = 2 [json_name = "root"];</code>
   * @param value The bytes for root to set.
   */
  private void setRootBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    root_ = value.toStringUtf8();

  }

  public static com.google.protobuf.Mixin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Mixin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Mixin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Mixin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.protobuf.Mixin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.protobuf.Mixin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Mixin prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.protobuf.Mixin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Mixin, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Mixin)
      com.google.protobuf.MixinOrBuilder {
    // Construct using com.google.protobuf.Mixin.newBuilder()
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
     * <code>string root = 2 [json_name = "root"];</code>
     * @return The root.
     */
    @java.lang.Override
    public java.lang.String getRoot() {
      return instance.getRoot();
    }
    /**
     * <code>string root = 2 [json_name = "root"];</code>
     * @return The bytes for root.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRootBytes() {
      return instance.getRootBytes();
    }
    /**
     * <code>string root = 2 [json_name = "root"];</code>
     * @param value The root to set.
     * @return This builder for chaining.
     */
    public Builder setRoot(
        java.lang.String value) {
      copyOnWrite();
      instance.setRoot(value);
      return this;
    }
    /**
     * <code>string root = 2 [json_name = "root"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRoot() {
      copyOnWrite();
      instance.clearRoot();
      return this;
    }
    /**
     * <code>string root = 2 [json_name = "root"];</code>
     * @param value The bytes for root to set.
     * @return This builder for chaining.
     */
    public Builder setRootBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRootBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Mixin)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Mixin();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "root_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.protobuf.Mixin> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.protobuf.Mixin.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.protobuf.Mixin>(
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


  // @@protoc_insertion_point(class_scope:google.protobuf.Mixin)
  private static final com.google.protobuf.Mixin DEFAULT_INSTANCE;
  static {
    Mixin defaultInstance = new Mixin();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Mixin.class, defaultInstance);
  }

  public static com.google.protobuf.Mixin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Mixin> PARSER;

  public static com.google.protobuf.Parser<Mixin> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

