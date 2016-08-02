// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public interface InstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * &#64;OutputOnly
   * The unique name of the instance. Values are of the form
   * projects/&lt;project&gt;/instances/[a-z][a-z0-9&#92;&#92;-]+[a-z0-9]
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * &#64;OutputOnly
   * The unique name of the instance. Values are of the form
   * projects/&lt;project&gt;/instances/[a-z][a-z0-9&#92;&#92;-]+[a-z0-9]
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The descriptive name for this instance as it appears in UIs.
   * Can be changed at any time, but should be kept globally unique
   * to avoid confusion.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The descriptive name for this instance as it appears in UIs.
   * Can be changed at any time, but should be kept globally unique
   * to avoid confusion.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The current state of the instance.
   * </pre>
   *
   * <code>optional .google.bigtable.admin.v2.Instance.State state = 3;</code>
   */
  int getStateValue();
  /**
   * <pre>
   * The current state of the instance.
   * </pre>
   *
   * <code>optional .google.bigtable.admin.v2.Instance.State state = 3;</code>
   */
  com.google.bigtable.admin.v2.Instance.State getState();
}
