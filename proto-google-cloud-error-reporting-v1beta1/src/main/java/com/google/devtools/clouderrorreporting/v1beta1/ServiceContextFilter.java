/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * Specifies criteria for filtering a subset of service contexts.
 * The fields in the filter correspond to the fields in `ServiceContext`.
 * Only exact, case-sensitive matches are supported.
 * If a field is unset or empty, it matches arbitrary values.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter}
 */
public final class ServiceContextFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter)
    ServiceContextFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ServiceContextFilter.newBuilder() to construct.
  private ServiceContextFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServiceContextFilter() {
    service_ = "";
    version_ = "";
    resourceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServiceContextFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ServiceContextFilter(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              service_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              version_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resourceType_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter.class,
            com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 2;
  private volatile java.lang.Object service_;
  /**
   *
   *
   * <pre>
   * Optional. The exact value to match against
   * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
   * </pre>
   *
   * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The service.
   */
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The exact value to match against
   * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
   * </pre>
   *
   * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for service.
   */
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object version_;
  /**
   *
   *
   * <pre>
   * Optional. The exact value to match against
   * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
   * </pre>
   *
   * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The exact value to match against
   * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
   * </pre>
   *
   * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for version.
   */
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object resourceType_;
  /**
   *
   *
   * <pre>
   * Optional. The exact value to match against
   * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
   * </pre>
   *
   * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The resourceType.
   */
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The exact value to match against
   * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
   * </pre>
   *
   * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for resourceType.
   */
  public com.google.protobuf.ByteString getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, version_);
    }
    if (!getResourceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, resourceType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, version_);
    }
    if (!getResourceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, resourceType_);
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter other =
        (com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter) obj;

    if (!getService().equals(other.getService())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (!getResourceType().equals(other.getResourceType())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parseFrom(
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

  public static Builder newBuilder(
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter prototype) {
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
   * Specifies criteria for filtering a subset of service contexts.
   * The fields in the filter correspond to the fields in `ServiceContext`.
   * Only exact, case-sensitive matches are supported.
   * If a field is unset or empty, it matches arbitrary values.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter)
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter.class,
              com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter.Builder.class);
    }

    // Construct using
    // com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter.newBuilder()
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
      service_ = "";

      version_ = "";

      resourceType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContextFilter_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
        getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter build() {
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter result =
          new com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter(this);
      result.service_ = service_;
      result.version_ = version_;
      result.resourceType_ = resourceType_;
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter) {
        return mergeFrom(
            (com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter other) {
      if (other
          == com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
              .getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
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
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object service_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      service_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {

      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
     * </pre>
     *
     * <code>string service = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
     * </pre>
     *
     * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
     * </pre>
     *
     * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
     * </pre>
     *
     * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
     * </pre>
     *
     * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
     * </pre>
     *
     * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      version_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceType_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
     * </pre>
     *
     * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The resourceType.
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
     * </pre>
     *
     * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for resourceType.
     */
    public com.google.protobuf.ByteString getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
     * </pre>
     *
     * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resourceType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
     * </pre>
     *
     * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {

      resourceType_ = getDefaultInstance().getResourceType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The exact value to match against
     * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
     * </pre>
     *
     * <code>string resource_type = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resourceType_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter)
  private static final com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceContextFilter> PARSER =
      new com.google.protobuf.AbstractParser<ServiceContextFilter>() {
        @java.lang.Override
        public ServiceContextFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ServiceContextFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ServiceContextFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceContextFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
