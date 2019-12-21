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
 * Requests might be rejected or the resulting timed count durations might be
 * adjusted for lower durations.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.QueryTimeRange}
 */
public final class QueryTimeRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.QueryTimeRange)
    QueryTimeRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryTimeRange.newBuilder() to construct.
  private QueryTimeRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryTimeRange() {
    period_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryTimeRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private QueryTimeRange(
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
          case 8:
            {
              int rawValue = input.readEnum();

              period_ = rawValue;
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
        .internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.class,
            com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The supported time ranges.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period}
   */
  public enum Period implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Do not use.
     * </pre>
     *
     * <code>PERIOD_UNSPECIFIED = 0;</code>
     */
    PERIOD_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Retrieve data for the last hour.
     * Recommended minimum timed count duration: 1 min.
     * </pre>
     *
     * <code>PERIOD_1_HOUR = 1;</code>
     */
    PERIOD_1_HOUR(1),
    /**
     *
     *
     * <pre>
     * Retrieve data for the last 6 hours.
     * Recommended minimum timed count duration: 10 min.
     * </pre>
     *
     * <code>PERIOD_6_HOURS = 2;</code>
     */
    PERIOD_6_HOURS(2),
    /**
     *
     *
     * <pre>
     * Retrieve data for the last day.
     * Recommended minimum timed count duration: 1 hour.
     * </pre>
     *
     * <code>PERIOD_1_DAY = 3;</code>
     */
    PERIOD_1_DAY(3),
    /**
     *
     *
     * <pre>
     * Retrieve data for the last week.
     * Recommended minimum timed count duration: 6 hours.
     * </pre>
     *
     * <code>PERIOD_1_WEEK = 4;</code>
     */
    PERIOD_1_WEEK(4),
    /**
     *
     *
     * <pre>
     * Retrieve data for the last 30 days.
     * Recommended minimum timed count duration: 1 day.
     * </pre>
     *
     * <code>PERIOD_30_DAYS = 5;</code>
     */
    PERIOD_30_DAYS(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Do not use.
     * </pre>
     *
     * <code>PERIOD_UNSPECIFIED = 0;</code>
     */
    public static final int PERIOD_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Retrieve data for the last hour.
     * Recommended minimum timed count duration: 1 min.
     * </pre>
     *
     * <code>PERIOD_1_HOUR = 1;</code>
     */
    public static final int PERIOD_1_HOUR_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Retrieve data for the last 6 hours.
     * Recommended minimum timed count duration: 10 min.
     * </pre>
     *
     * <code>PERIOD_6_HOURS = 2;</code>
     */
    public static final int PERIOD_6_HOURS_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Retrieve data for the last day.
     * Recommended minimum timed count duration: 1 hour.
     * </pre>
     *
     * <code>PERIOD_1_DAY = 3;</code>
     */
    public static final int PERIOD_1_DAY_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Retrieve data for the last week.
     * Recommended minimum timed count duration: 6 hours.
     * </pre>
     *
     * <code>PERIOD_1_WEEK = 4;</code>
     */
    public static final int PERIOD_1_WEEK_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Retrieve data for the last 30 days.
     * Recommended minimum timed count duration: 1 day.
     * </pre>
     *
     * <code>PERIOD_30_DAYS = 5;</code>
     */
    public static final int PERIOD_30_DAYS_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Period valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Period forNumber(int value) {
      switch (value) {
        case 0:
          return PERIOD_UNSPECIFIED;
        case 1:
          return PERIOD_1_HOUR;
        case 2:
          return PERIOD_6_HOURS;
        case 3:
          return PERIOD_1_DAY;
        case 4:
          return PERIOD_1_WEEK;
        case 5:
          return PERIOD_30_DAYS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Period> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Period> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Period>() {
          public Period findValueByNumber(int number) {
            return Period.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Period[] VALUES = values();

    public static Period valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Period(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period)
  }

  public static final int PERIOD_FIELD_NUMBER = 1;
  private int period_;
  /**
   *
   *
   * <pre>
   * Restricts the query to the specified time range.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
   *
   * @return The enum numeric value on the wire for period.
   */
  public int getPeriodValue() {
    return period_;
  }
  /**
   *
   *
   * <pre>
   * Restricts the query to the specified time range.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
   *
   * @return The period.
   */
  public com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period getPeriod() {
    @SuppressWarnings("deprecation")
    com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period result =
        com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period.valueOf(period_);
    return result == null
        ? com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period.UNRECOGNIZED
        : result;
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
    if (period_
        != com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period.PERIOD_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, period_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (period_
        != com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period.PERIOD_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, period_);
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange other =
        (com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange) obj;

    if (period_ != other.period_) return false;
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
    hash = (37 * hash) + PERIOD_FIELD_NUMBER;
    hash = (53 * hash) + period_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parseFrom(
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
      com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange prototype) {
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
   * Requests might be rejected or the resulting timed count durations might be
   * adjusted for lower durations.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.QueryTimeRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.QueryTimeRange)
      com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.class,
              com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.newBuilder()
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
      period_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_QueryTimeRange_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange
        getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange build() {
      com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange result =
          new com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange(this);
      result.period_ = period_;
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange other) {
      if (other
          == com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.getDefaultInstance())
        return this;
      if (other.period_ != 0) {
        setPeriodValue(other.getPeriodValue());
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
      com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int period_ = 0;
    /**
     *
     *
     * <pre>
     * Restricts the query to the specified time range.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
     *
     * @return The enum numeric value on the wire for period.
     */
    public int getPeriodValue() {
      return period_;
    }
    /**
     *
     *
     * <pre>
     * Restricts the query to the specified time range.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
     *
     * @param value The enum numeric value on the wire for period to set.
     * @return This builder for chaining.
     */
    public Builder setPeriodValue(int value) {
      period_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Restricts the query to the specified time range.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
     *
     * @return The period.
     */
    public com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period getPeriod() {
      @SuppressWarnings("deprecation")
      com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period result =
          com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period.valueOf(period_);
      return result == null
          ? com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Restricts the query to the specified time range.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
     *
     * @param value The period to set.
     * @return This builder for chaining.
     */
    public Builder setPeriod(
        com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period value) {
      if (value == null) {
        throw new NullPointerException();
      }

      period_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Restricts the query to the specified time range.
     * </pre>
     *
     * <code>.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange.Period period = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPeriod() {

      period_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.QueryTimeRange)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.QueryTimeRange)
  private static final com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTimeRange> PARSER =
      new com.google.protobuf.AbstractParser<QueryTimeRange>() {
        @java.lang.Override
        public QueryTimeRange parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new QueryTimeRange(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<QueryTimeRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTimeRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
