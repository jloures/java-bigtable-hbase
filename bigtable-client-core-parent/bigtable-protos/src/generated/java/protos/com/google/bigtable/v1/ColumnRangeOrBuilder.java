// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_data.proto

package com.google.bigtable.v1;

public interface ColumnRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.ColumnRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   *
   * <code>optional string family_name = 1;</code>
   */
  java.lang.String getFamilyName();
  /**
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   *
   * <code>optional string family_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   *
   * <code>optional bytes start_qualifier_inclusive = 2;</code>
   */
  com.google.protobuf.ByteString getStartQualifierInclusive();

  /**
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   *
   * <code>optional bytes start_qualifier_exclusive = 3;</code>
   */
  com.google.protobuf.ByteString getStartQualifierExclusive();

  /**
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   *
   * <code>optional bytes end_qualifier_inclusive = 4;</code>
   */
  com.google.protobuf.ByteString getEndQualifierInclusive();

  /**
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   *
   * <code>optional bytes end_qualifier_exclusive = 5;</code>
   */
  com.google.protobuf.ByteString getEndQualifierExclusive();

  public com.google.bigtable.v1.ColumnRange.StartQualifierCase getStartQualifierCase();

  public com.google.bigtable.v1.ColumnRange.EndQualifierCase getEndQualifierCase();
}
