// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/table/v1/bigtable_table_service_messages.proto

package com.google.bigtable.admin.table.v1;

/**
 * Protobuf type {@code google.bigtable.admin.table.v1.BulkDeleteRowsRequest}
 */
public  final class BulkDeleteRowsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.table.v1.BulkDeleteRowsRequest)
    BulkDeleteRowsRequestOrBuilder {
  // Use BulkDeleteRowsRequest.newBuilder() to construct.
  private BulkDeleteRowsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private BulkDeleteRowsRequest() {
    tableName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BulkDeleteRowsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            tableName_ = s;
            break;
          }
          case 18: {
            targetCase_ = 2;
            target_ = input.readBytes();
            break;
          }
          case 24: {
            targetCase_ = 3;
            target_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_BulkDeleteRowsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_BulkDeleteRowsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.class, com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.Builder.class);
  }

  private int targetCase_ = 0;
  private java.lang.Object target_;
  public enum TargetCase
      implements com.google.protobuf.Internal.EnumLite {
    ROW_KEY_PREFIX(2),
    DELETE_ALL_DATA_FROM_TABLE(3),
    TARGET_NOT_SET(0);
    private final int value;
    private TargetCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetCase forNumber(int value) {
      switch (value) {
        case 2: return ROW_KEY_PREFIX;
        case 3: return DELETE_ALL_DATA_FROM_TABLE;
        case 0: return TARGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TargetCase
  getTargetCase() {
    return TargetCase.forNumber(
        targetCase_);
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <pre>
   * The unique name of the table on which to perform the bulk delete
   * </pre>
   *
   * <code>optional string table_name = 1;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique name of the table on which to perform the bulk delete
   * </pre>
   *
   * <code>optional string table_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROW_KEY_PREFIX_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Delete all rows that start with this row key prefix. Prefix cannot be
   * zero length.
   * </pre>
   *
   * <code>optional bytes row_key_prefix = 2;</code>
   */
  public com.google.protobuf.ByteString getRowKeyPrefix() {
    if (targetCase_ == 2) {
      return (com.google.protobuf.ByteString) target_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int DELETE_ALL_DATA_FROM_TABLE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Delete all rows in the table. Setting this to false is a no-op.
   * </pre>
   *
   * <code>optional bool delete_all_data_from_table = 3;</code>
   */
  public boolean getDeleteAllDataFromTable() {
    if (targetCase_ == 3) {
      return (java.lang.Boolean) target_;
    }
    return false;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, tableName_);
    }
    if (targetCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) target_));
    }
    if (targetCase_ == 3) {
      output.writeBool(
          3, (boolean)((java.lang.Boolean) target_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, tableName_);
    }
    if (targetCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) target_));
    }
    if (targetCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            3, (boolean)((java.lang.Boolean) target_));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.table.v1.BulkDeleteRowsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.table.v1.BulkDeleteRowsRequest)
      com.google.bigtable.admin.table.v1.BulkDeleteRowsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_BulkDeleteRowsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_BulkDeleteRowsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.class, com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tableName_ = "";

      targetCase_ = 0;
      target_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.internal_static_google_bigtable_admin_table_v1_BulkDeleteRowsRequest_descriptor;
    }

    public com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest build() {
      com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest buildPartial() {
      com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest result = new com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest(this);
      result.tableName_ = tableName_;
      if (targetCase_ == 2) {
        result.target_ = target_;
      }
      if (targetCase_ == 3) {
        result.target_ = target_;
      }
      result.targetCase_ = targetCase_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest) {
        return mergeFrom((com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest other) {
      if (other == com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      switch (other.getTargetCase()) {
        case ROW_KEY_PREFIX: {
          setRowKeyPrefix(other.getRowKeyPrefix());
          break;
        }
        case DELETE_ALL_DATA_FROM_TABLE: {
          setDeleteAllDataFromTable(other.getDeleteAllDataFromTable());
          break;
        }
        case TARGET_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int targetCase_ = 0;
    private java.lang.Object target_;
    public TargetCase
        getTargetCase() {
      return TargetCase.forNumber(
          targetCase_);
    }

    public Builder clearTarget() {
      targetCase_ = 0;
      target_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object tableName_ = "";
    /**
     * <pre>
     * The unique name of the table on which to perform the bulk delete
     * </pre>
     *
     * <code>optional string table_name = 1;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the table on which to perform the bulk delete
     * </pre>
     *
     * <code>optional string table_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the table on which to perform the bulk delete
     * </pre>
     *
     * <code>optional string table_name = 1;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the table on which to perform the bulk delete
     * </pre>
     *
     * <code>optional string table_name = 1;</code>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the table on which to perform the bulk delete
     * </pre>
     *
     * <code>optional string table_name = 1;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableName_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Delete all rows that start with this row key prefix. Prefix cannot be
     * zero length.
     * </pre>
     *
     * <code>optional bytes row_key_prefix = 2;</code>
     */
    public com.google.protobuf.ByteString getRowKeyPrefix() {
      if (targetCase_ == 2) {
        return (com.google.protobuf.ByteString) target_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Delete all rows that start with this row key prefix. Prefix cannot be
     * zero length.
     * </pre>
     *
     * <code>optional bytes row_key_prefix = 2;</code>
     */
    public Builder setRowKeyPrefix(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  targetCase_ = 2;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Delete all rows that start with this row key prefix. Prefix cannot be
     * zero length.
     * </pre>
     *
     * <code>optional bytes row_key_prefix = 2;</code>
     */
    public Builder clearRowKeyPrefix() {
      if (targetCase_ == 2) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Delete all rows in the table. Setting this to false is a no-op.
     * </pre>
     *
     * <code>optional bool delete_all_data_from_table = 3;</code>
     */
    public boolean getDeleteAllDataFromTable() {
      if (targetCase_ == 3) {
        return (java.lang.Boolean) target_;
      }
      return false;
    }
    /**
     * <pre>
     * Delete all rows in the table. Setting this to false is a no-op.
     * </pre>
     *
     * <code>optional bool delete_all_data_from_table = 3;</code>
     */
    public Builder setDeleteAllDataFromTable(boolean value) {
      targetCase_ = 3;
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Delete all rows in the table. Setting this to false is a no-op.
     * </pre>
     *
     * <code>optional bool delete_all_data_from_table = 3;</code>
     */
    public Builder clearDeleteAllDataFromTable() {
      if (targetCase_ == 3) {
        targetCase_ = 0;
        target_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.table.v1.BulkDeleteRowsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.table.v1.BulkDeleteRowsRequest)
  private static final com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest();
  }

  public static com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkDeleteRowsRequest>
      PARSER = new com.google.protobuf.AbstractParser<BulkDeleteRowsRequest>() {
    public BulkDeleteRowsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BulkDeleteRowsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BulkDeleteRowsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkDeleteRowsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.table.v1.BulkDeleteRowsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

