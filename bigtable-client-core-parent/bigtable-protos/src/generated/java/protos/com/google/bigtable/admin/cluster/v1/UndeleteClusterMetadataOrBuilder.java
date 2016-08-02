// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_service_messages.proto

package com.google.bigtable.admin.cluster.v1;

public interface UndeleteClusterMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.cluster.v1.UndeleteClusterMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
   */
  boolean hasRequestTime();
  /**
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
   */
  com.google.protobuf.Timestamp getRequestTime();
  /**
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp request_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
   */
  boolean hasFinishTime();
  /**
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
   */
  com.google.protobuf.Timestamp getFinishTime();
  /**
   * <pre>
   * The time at which this operation failed or was completed successfully.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp finish_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();
}
