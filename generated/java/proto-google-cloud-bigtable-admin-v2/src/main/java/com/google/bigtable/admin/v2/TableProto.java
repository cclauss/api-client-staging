// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public final class TableProto {
  private TableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_Table_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_GcRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_Intersection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_Union_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/bigtable/admin/v2/table.proto\022\030" +
      "google.bigtable.admin.v2\032\034google/api/ann" +
      "otations.proto\032\036google/protobuf/duration" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\240\003\n\005Table\022\014\n\004name\030\001 \001(\t\022L\n\017column_famili" +
      "es\030\003 \003(\01323.google.bigtable.admin.v2.Tabl" +
      "e.ColumnFamiliesEntry\022I\n\013granularity\030\004 \001" +
      "(\01624.google.bigtable.admin.v2.Table.Time" +
      "stampGranularity\032]\n\023ColumnFamiliesEntry\022" +
      "\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.google.big",
      "table.admin.v2.ColumnFamily:\0028\001\"I\n\024Times" +
      "tampGranularity\022%\n!TIMESTAMP_GRANULARITY" +
      "_UNSPECIFIED\020\000\022\n\n\006MILLIS\020\001\"F\n\004View\022\024\n\020VI" +
      "EW_UNSPECIFIED\020\000\022\r\n\tNAME_ONLY\020\001\022\017\n\013SCHEM" +
      "A_VIEW\020\002\022\010\n\004FULL\020\004\"A\n\014ColumnFamily\0221\n\007gc" +
      "_rule\030\001 \001(\0132 .google.bigtable.admin.v2.G" +
      "cRule\"\325\002\n\006GcRule\022\032\n\020max_num_versions\030\001 \001" +
      "(\005H\000\022,\n\007max_age\030\002 \001(\0132\031.google.protobuf." +
      "DurationH\000\022E\n\014intersection\030\003 \001(\0132-.googl" +
      "e.bigtable.admin.v2.GcRule.IntersectionH",
      "\000\0227\n\005union\030\004 \001(\0132&.google.bigtable.admin" +
      ".v2.GcRule.UnionH\000\032?\n\014Intersection\022/\n\005ru" +
      "les\030\001 \003(\0132 .google.bigtable.admin.v2.GcR" +
      "ule\0328\n\005Union\022/\n\005rules\030\001 \003(\0132 .google.big" +
      "table.admin.v2.GcRuleB\006\n\004ruleB\214\001\n\034com.go" +
      "ogle.bigtable.admin.v2B\nTableProtoP\001Z=go" +
      "ogle.golang.org/genproto/googleapis/bigt" +
      "able/admin/v2;admin\252\002\036Google.Cloud.Bigta" +
      "ble.Admin.V2b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_bigtable_admin_v2_Table_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_Table_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_Table_descriptor,
        new java.lang.String[] { "Name", "ColumnFamilies", "Granularity", });
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor =
      internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor,
        new java.lang.String[] { "GcRule", });
    internal_static_google_bigtable_admin_v2_GcRule_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_v2_GcRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_GcRule_descriptor,
        new java.lang.String[] { "MaxNumVersions", "MaxAge", "Intersection", "Union", "Rule", });
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor =
      internal_static_google_bigtable_admin_v2_GcRule_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor =
      internal_static_google_bigtable_admin_v2_GcRule_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_GcRule_Union_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor,
        new java.lang.String[] { "Rules", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
