// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/api.proto
// Protobuf Java Version: 4.28.3

package com.google.protobuf;

public interface MethodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Method)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string request_type_url = 2 [json_name = "requestTypeUrl"];</code>
   * @return The requestTypeUrl.
   */
  java.lang.String getRequestTypeUrl();
  /**
   * <code>string request_type_url = 2 [json_name = "requestTypeUrl"];</code>
   * @return The bytes for requestTypeUrl.
   */
  com.google.protobuf.ByteString
      getRequestTypeUrlBytes();

  /**
   * <code>bool request_streaming = 3 [json_name = "requestStreaming"];</code>
   * @return The requestStreaming.
   */
  boolean getRequestStreaming();

  /**
   * <code>string response_type_url = 4 [json_name = "responseTypeUrl"];</code>
   * @return The responseTypeUrl.
   */
  java.lang.String getResponseTypeUrl();
  /**
   * <code>string response_type_url = 4 [json_name = "responseTypeUrl"];</code>
   * @return The bytes for responseTypeUrl.
   */
  com.google.protobuf.ByteString
      getResponseTypeUrlBytes();

  /**
   * <code>bool response_streaming = 5 [json_name = "responseStreaming"];</code>
   * @return The responseStreaming.
   */
  boolean getResponseStreaming();

  /**
   * <code>repeated .google.protobuf.Option options = 6 [json_name = "options"];</code>
   */
  java.util.List<com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <code>repeated .google.protobuf.Option options = 6 [json_name = "options"];</code>
   */
  com.google.protobuf.Option getOptions(int index);
  /**
   * <code>repeated .google.protobuf.Option options = 6 [json_name = "options"];</code>
   */
  int getOptionsCount();

  /**
   * <code>.google.protobuf.Syntax syntax = 7 [json_name = "syntax"];</code>
   * @return The enum numeric value on the wire for syntax.
   */
  int getSyntaxValue();
  /**
   * <code>.google.protobuf.Syntax syntax = 7 [json_name = "syntax"];</code>
   * @return The syntax.
   */
  com.google.protobuf.Syntax getSyntax();
}
