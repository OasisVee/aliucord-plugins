// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/duration.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

/**
 * Protobuf type {@code google.protobuf.Duration}
 */
public  final class Duration extends
    com.google.protobuf.GeneratedMessageLite<
        Duration, Duration.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Duration)
    DurationOrBuilder {
  private Duration() {
  }
  public static final int SECONDS_FIELD_NUMBER = 1;
  private long seconds_;
  /**
   * <code>int64 seconds = 1 [json_name = "seconds"];</code>
   * @return The seconds.
   */
  @java.lang.Override
  public long getSeconds() {
    return seconds_;
  }
  /**
   * <code>int64 seconds = 1 [json_name = "seconds"];</code>
   * @param value The seconds to set.
   */
  private void setSeconds(long value) {
    
    seconds_ = value;
  }
  /**
   * <code>int64 seconds = 1 [json_name = "seconds"];</code>
   */
  private void clearSeconds() {

    seconds_ = 0L;
  }

  public static final int NANOS_FIELD_NUMBER = 2;
  private int nanos_;
  /**
   * <code>int32 nanos = 2 [json_name = "nanos"];</code>
   * @return The nanos.
   */
  @java.lang.Override
  public int getNanos() {
    return nanos_;
  }
  /**
   * <code>int32 nanos = 2 [json_name = "nanos"];</code>
   * @param value The nanos to set.
   */
  private void setNanos(int value) {
    
    nanos_ = value;
  }
  /**
   * <code>int32 nanos = 2 [json_name = "nanos"];</code>
   */
  private void clearNanos() {

    nanos_ = 0;
  }

  public static com.google.protobuf.Duration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Duration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Duration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Duration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.protobuf.Duration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.protobuf.Duration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Duration parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Duration prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code google.protobuf.Duration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Duration, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Duration)
      com.google.protobuf.DurationOrBuilder {
    // Construct using com.google.protobuf.Duration.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int64 seconds = 1 [json_name = "seconds"];</code>
     * @return The seconds.
     */
    @java.lang.Override
    public long getSeconds() {
      return instance.getSeconds();
    }
    /**
     * <code>int64 seconds = 1 [json_name = "seconds"];</code>
     * @param value The seconds to set.
     * @return This builder for chaining.
     */
    public Builder setSeconds(long value) {
      copyOnWrite();
      instance.setSeconds(value);
      return this;
    }
    /**
     * <code>int64 seconds = 1 [json_name = "seconds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSeconds() {
      copyOnWrite();
      instance.clearSeconds();
      return this;
    }

    /**
     * <code>int32 nanos = 2 [json_name = "nanos"];</code>
     * @return The nanos.
     */
    @java.lang.Override
    public int getNanos() {
      return instance.getNanos();
    }
    /**
     * <code>int32 nanos = 2 [json_name = "nanos"];</code>
     * @param value The nanos to set.
     * @return This builder for chaining.
     */
    public Builder setNanos(int value) {
      copyOnWrite();
      instance.setNanos(value);
      return this;
    }
    /**
     * <code>int32 nanos = 2 [json_name = "nanos"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNanos() {
      copyOnWrite();
      instance.clearNanos();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Duration)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Duration();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "seconds_",
            "nanos_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.protobuf.Duration> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.protobuf.Duration.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.protobuf.Duration>(
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


  // @@protoc_insertion_point(class_scope:google.protobuf.Duration)
  private static final com.google.protobuf.Duration DEFAULT_INSTANCE;
  static {
    Duration defaultInstance = new Duration();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Duration.class, defaultInstance);
  }

  public static com.google.protobuf.Duration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Duration> PARSER;

  public static com.google.protobuf.Parser<Duration> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

