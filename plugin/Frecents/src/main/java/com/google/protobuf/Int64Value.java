// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/wrappers.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.Int64Value}
 */
public  final class Int64Value extends
    com.google.protobuf.GeneratedMessageLite<
        Int64Value, Int64Value.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Int64Value)
    Int64ValueOrBuilder {
  private Int64Value() {
  }
  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_;
  /**
   * <code>int64 value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }
  /**
   * <code>int64 value = 1 [json_name = "value"];</code>
   * @param value The value to set.
   */
  private void setValue(long value) {
    
    value_ = value;
  }
  /**
   * <code>int64 value = 1 [json_name = "value"];</code>
   */
  private void clearValue() {

    value_ = 0L;
  }

  public static com.google.protobuf.Int64Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Int64Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Int64Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.protobuf.Int64Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.protobuf.Int64Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Int64Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Int64Value prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.protobuf.Int64Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Int64Value, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Int64Value)
      com.google.protobuf.Int64ValueOrBuilder {
    // Construct using com.google.protobuf.Int64Value.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int64 value = 1 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return instance.getValue();
    }
    /**
     * <code>int64 value = 1 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <code>int64 value = 1 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Int64Value)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Int64Value();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "value_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.protobuf.Int64Value> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.protobuf.Int64Value.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.protobuf.Int64Value>(
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


  // @@protoc_insertion_point(class_scope:google.protobuf.Int64Value)
  private static final com.google.protobuf.Int64Value DEFAULT_INSTANCE;
  static {
    Int64Value defaultInstance = new Int64Value();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Int64Value.class, defaultInstance);
  }

  public static com.google.protobuf.Int64Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static com.google.protobuf.Int64Value of(long value) {
    return newBuilder().setValue(value).build();
  }

  private static volatile com.google.protobuf.Parser<Int64Value> PARSER;

  public static com.google.protobuf.Parser<Int64Value> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

