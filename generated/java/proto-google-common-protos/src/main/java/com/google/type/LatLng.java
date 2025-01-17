// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/latlng.proto

package com.google.type;

/**
 * <pre>
 * An object representing a latitude/longitude pair. This is expressed as a pair
 * of doubles representing degrees latitude and degrees longitude. Unless
 * specified otherwise, this must conform to the
 * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
 * standard&lt;/a&gt;. Values must be within normalized ranges.
 * Example of normalization code in Python:
 *     def NormalizeLongitude(longitude):
 *       """Wraps decimal degrees longitude to [-180.0, 180.0]."""
 *       q, r = divmod(longitude, 360.0)
 *       if r &gt; 180.0 or (r == 180.0 and q &lt;= -1.0):
 *         return r - 360.0
 *       return r
 *     def NormalizeLatLng(latitude, longitude):
 *       """Wraps decimal degrees latitude and longitude to
 *       [-90.0, 90.0] and [-180.0, 180.0], respectively."""
 *       r = latitude % 360.0
 *       if r &lt;= 90.0:
 *         return r, NormalizeLongitude(longitude)
 *       elif r &gt;= 270.0:
 *         return r - 360, NormalizeLongitude(longitude)
 *       else:
 *         return 180 - r, NormalizeLongitude(longitude + 180.0)
 *     assert 180.0 == NormalizeLongitude(180.0)
 *     assert -180.0 == NormalizeLongitude(-180.0)
 *     assert -179.0 == NormalizeLongitude(181.0)
 *     assert (0.0, 0.0) == NormalizeLatLng(360.0, 0.0)
 *     assert (0.0, 0.0) == NormalizeLatLng(-360.0, 0.0)
 *     assert (85.0, 180.0) == NormalizeLatLng(95.0, 0.0)
 *     assert (-85.0, -170.0) == NormalizeLatLng(-95.0, 10.0)
 *     assert (90.0, 10.0) == NormalizeLatLng(90.0, 10.0)
 *     assert (-90.0, -10.0) == NormalizeLatLng(-90.0, -10.0)
 *     assert (0.0, -170.0) == NormalizeLatLng(-180.0, 10.0)
 *     assert (0.0, -170.0) == NormalizeLatLng(180.0, 10.0)
 *     assert (-90.0, 10.0) == NormalizeLatLng(270.0, 10.0)
 *     assert (90.0, 10.0) == NormalizeLatLng(-270.0, 10.0)
 * </pre>
 *
 * Protobuf type {@code google.type.LatLng}
 */
public  final class LatLng extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.type.LatLng)
    LatLngOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LatLng.newBuilder() to construct.
  private LatLng(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LatLng() {
    latitude_ = 0D;
    longitude_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LatLng(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            latitude_ = input.readDouble();
            break;
          }
          case 17: {

            longitude_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.type.LatLngProto.internal_static_google_type_LatLng_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.type.LatLngProto.internal_static_google_type_LatLng_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.type.LatLng.class, com.google.type.LatLng.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_;
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>double latitude = 1;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>double longitude = 2;</code>
   */
  public double getLongitude() {
    return longitude_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (latitude_ != 0D) {
      output.writeDouble(1, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(2, longitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.type.LatLng)) {
      return super.equals(obj);
    }
    com.google.type.LatLng other = (com.google.type.LatLng) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.type.LatLng parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.LatLng parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.type.LatLng parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.LatLng parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.LatLng parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.type.LatLng parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.type.LatLng prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * An object representing a latitude/longitude pair. This is expressed as a pair
   * of doubles representing degrees latitude and degrees longitude. Unless
   * specified otherwise, this must conform to the
   * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
   * standard&lt;/a&gt;. Values must be within normalized ranges.
   * Example of normalization code in Python:
   *     def NormalizeLongitude(longitude):
   *       """Wraps decimal degrees longitude to [-180.0, 180.0]."""
   *       q, r = divmod(longitude, 360.0)
   *       if r &gt; 180.0 or (r == 180.0 and q &lt;= -1.0):
   *         return r - 360.0
   *       return r
   *     def NormalizeLatLng(latitude, longitude):
   *       """Wraps decimal degrees latitude and longitude to
   *       [-90.0, 90.0] and [-180.0, 180.0], respectively."""
   *       r = latitude % 360.0
   *       if r &lt;= 90.0:
   *         return r, NormalizeLongitude(longitude)
   *       elif r &gt;= 270.0:
   *         return r - 360, NormalizeLongitude(longitude)
   *       else:
   *         return 180 - r, NormalizeLongitude(longitude + 180.0)
   *     assert 180.0 == NormalizeLongitude(180.0)
   *     assert -180.0 == NormalizeLongitude(-180.0)
   *     assert -179.0 == NormalizeLongitude(181.0)
   *     assert (0.0, 0.0) == NormalizeLatLng(360.0, 0.0)
   *     assert (0.0, 0.0) == NormalizeLatLng(-360.0, 0.0)
   *     assert (85.0, 180.0) == NormalizeLatLng(95.0, 0.0)
   *     assert (-85.0, -170.0) == NormalizeLatLng(-95.0, 10.0)
   *     assert (90.0, 10.0) == NormalizeLatLng(90.0, 10.0)
   *     assert (-90.0, -10.0) == NormalizeLatLng(-90.0, -10.0)
   *     assert (0.0, -170.0) == NormalizeLatLng(-180.0, 10.0)
   *     assert (0.0, -170.0) == NormalizeLatLng(180.0, 10.0)
   *     assert (-90.0, 10.0) == NormalizeLatLng(270.0, 10.0)
   *     assert (90.0, 10.0) == NormalizeLatLng(-270.0, 10.0)
   * </pre>
   *
   * Protobuf type {@code google.type.LatLng}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.LatLng)
      com.google.type.LatLngOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.type.LatLngProto.internal_static_google_type_LatLng_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.type.LatLngProto.internal_static_google_type_LatLng_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.type.LatLng.class, com.google.type.LatLng.Builder.class);
    }

    // Construct using com.google.type.LatLng.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      latitude_ = 0D;

      longitude_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.type.LatLngProto.internal_static_google_type_LatLng_descriptor;
    }

    @java.lang.Override
    public com.google.type.LatLng getDefaultInstanceForType() {
      return com.google.type.LatLng.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.type.LatLng build() {
      com.google.type.LatLng result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.type.LatLng buildPartial() {
      com.google.type.LatLng result = new com.google.type.LatLng(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.type.LatLng) {
        return mergeFrom((com.google.type.LatLng)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.type.LatLng other) {
      if (other == com.google.type.LatLng.getDefaultInstance()) return this;
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.type.LatLng parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.type.LatLng) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double latitude_ ;
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.type.LatLng)
  }

  // @@protoc_insertion_point(class_scope:google.type.LatLng)
  private static final com.google.type.LatLng DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.type.LatLng();
  }

  public static com.google.type.LatLng getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatLng>
      PARSER = new com.google.protobuf.AbstractParser<LatLng>() {
    @java.lang.Override
    public LatLng parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LatLng(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LatLng> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatLng> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.type.LatLng getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

