// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/date.proto

package com.google.type;

public final class DateProto {
  private DateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_Date_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_type_Date_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/type/date.proto\022\013google.type\"0\n" +
      "\004Date\022\014\n\004year\030\001 \001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003da" +
      "y\030\003 \001(\005B\'\n\017com.google.typeB\tDateProtoP\001\240" +
      "\001\001\242\002\003GTPb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_type_Date_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_Date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_type_Date_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
