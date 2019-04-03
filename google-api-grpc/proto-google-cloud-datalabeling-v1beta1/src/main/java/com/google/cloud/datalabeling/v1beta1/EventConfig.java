// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Config for video event human labeling task.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.EventConfig}
 */
public final class EventConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.EventConfig)
    EventConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventConfig.newBuilder() to construct.
  private EventConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventConfig() {
    annotationSpecSets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EventConfig(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                annotationSpecSets_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              annotationSpecSets_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        annotationSpecSets_ = annotationSpecSets_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_EventConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_EventConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.EventConfig.class,
            com.google.cloud.datalabeling.v1beta1.EventConfig.Builder.class);
  }

  public static final int ANNOTATION_SPEC_SETS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList annotationSpecSets_;
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList getAnnotationSpecSetsList() {
    return annotationSpecSets_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  public int getAnnotationSpecSetsCount() {
    return annotationSpecSets_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  public java.lang.String getAnnotationSpecSets(int index) {
    return annotationSpecSets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set resource name. Similar to video
   * classification, we support selecting event from multiple AnnotationSpecSet
   * at the same time.
   * </pre>
   *
   * <code>repeated string annotation_spec_sets = 1;</code>
   */
  public com.google.protobuf.ByteString getAnnotationSpecSetsBytes(int index) {
    return annotationSpecSets_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < annotationSpecSets_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, annotationSpecSets_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < annotationSpecSets_.size(); i++) {
        dataSize += computeStringSizeNoTag(annotationSpecSets_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnnotationSpecSetsList().size();
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.EventConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.EventConfig other =
        (com.google.cloud.datalabeling.v1beta1.EventConfig) obj;

    if (!getAnnotationSpecSetsList().equals(other.getAnnotationSpecSetsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAnnotationSpecSetsCount() > 0) {
      hash = (37 * hash) + ANNOTATION_SPEC_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSpecSetsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.EventConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Config for video event human labeling task.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.EventConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.EventConfig)
      com.google.cloud.datalabeling.v1beta1.EventConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_EventConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_EventConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.EventConfig.class,
              com.google.cloud.datalabeling.v1beta1.EventConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.EventConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      annotationSpecSets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_EventConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EventConfig getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.EventConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EventConfig build() {
      com.google.cloud.datalabeling.v1beta1.EventConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.EventConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.EventConfig result =
          new com.google.cloud.datalabeling.v1beta1.EventConfig(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        annotationSpecSets_ = annotationSpecSets_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.annotationSpecSets_ = annotationSpecSets_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.EventConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.EventConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.EventConfig other) {
      if (other == com.google.cloud.datalabeling.v1beta1.EventConfig.getDefaultInstance())
        return this;
      if (!other.annotationSpecSets_.isEmpty()) {
        if (annotationSpecSets_.isEmpty()) {
          annotationSpecSets_ = other.annotationSpecSets_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAnnotationSpecSetsIsMutable();
          annotationSpecSets_.addAll(other.annotationSpecSets_);
        }
        onChanged();
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
      com.google.cloud.datalabeling.v1beta1.EventConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.EventConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList annotationSpecSets_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureAnnotationSpecSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotationSpecSets_ = new com.google.protobuf.LazyStringArrayList(annotationSpecSets_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getAnnotationSpecSetsList() {
      return annotationSpecSets_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public int getAnnotationSpecSetsCount() {
      return annotationSpecSets_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public java.lang.String getAnnotationSpecSets(int index) {
      return annotationSpecSets_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public com.google.protobuf.ByteString getAnnotationSpecSetsBytes(int index) {
      return annotationSpecSets_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public Builder setAnnotationSpecSets(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAnnotationSpecSetsIsMutable();
      annotationSpecSets_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public Builder addAnnotationSpecSets(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAnnotationSpecSetsIsMutable();
      annotationSpecSets_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public Builder addAllAnnotationSpecSets(java.lang.Iterable<java.lang.String> values) {
      ensureAnnotationSpecSetsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, annotationSpecSets_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public Builder clearAnnotationSpecSets() {
      annotationSpecSets_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of annotation spec set resource name. Similar to video
     * classification, we support selecting event from multiple AnnotationSpecSet
     * at the same time.
     * </pre>
     *
     * <code>repeated string annotation_spec_sets = 1;</code>
     */
    public Builder addAnnotationSpecSetsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAnnotationSpecSetsIsMutable();
      annotationSpecSets_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.EventConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.EventConfig)
  private static final com.google.cloud.datalabeling.v1beta1.EventConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.EventConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.EventConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventConfig> PARSER =
      new com.google.protobuf.AbstractParser<EventConfig>() {
        @java.lang.Override
        public EventConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EventConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EventConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EventConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}