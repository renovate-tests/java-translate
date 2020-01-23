/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/translate/v3beta1/translation_service.proto

package com.google.cloud.translate.v3beta1;

/**
 *
 *
 * <pre>
 * A single supported language response corresponds to information related
 * to one supported language.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.SupportedLanguage}
 */
public final class SupportedLanguage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.SupportedLanguage)
    SupportedLanguageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SupportedLanguage.newBuilder() to construct.
  private SupportedLanguage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SupportedLanguage() {
    languageCode_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SupportedLanguage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SupportedLanguage(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              languageCode_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
              break;
            }
          case 24:
            {
              supportSource_ = input.readBool();
              break;
            }
          case 32:
            {
              supportTarget_ = input.readBool();
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
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_SupportedLanguage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto
        .internal_static_google_cloud_translation_v3beta1_SupportedLanguage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.SupportedLanguage.class,
            com.google.cloud.translate.v3beta1.SupportedLanguage.Builder.class);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * Supported language code, generally consisting of its ISO 639-1
   * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
   * including language and region identifiers are returned (for example,
   * 'zh-TW' and 'zh-CN')
   * </pre>
   *
   * <code>string language_code = 1;</code>
   *
   * @return The languageCode.
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Supported language code, generally consisting of its ISO 639-1
   * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
   * including language and region identifiers are returned (for example,
   * 'zh-TW' and 'zh-CN')
   * </pre>
   *
   * <code>string language_code = 1;</code>
   *
   * @return The bytes for languageCode.
   */
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Human readable name of the language localized in the display language
   * specified in the request.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human readable name of the language localized in the display language
   * specified in the request.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUPPORT_SOURCE_FIELD_NUMBER = 3;
  private boolean supportSource_;
  /**
   *
   *
   * <pre>
   * Can be used as source language.
   * </pre>
   *
   * <code>bool support_source = 3;</code>
   *
   * @return The supportSource.
   */
  public boolean getSupportSource() {
    return supportSource_;
  }

  public static final int SUPPORT_TARGET_FIELD_NUMBER = 4;
  private boolean supportTarget_;
  /**
   *
   *
   * <pre>
   * Can be used as target language.
   * </pre>
   *
   * <code>bool support_target = 4;</code>
   *
   * @return The supportTarget.
   */
  public boolean getSupportTarget() {
    return supportTarget_;
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
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageCode_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (supportSource_ != false) {
      output.writeBool(3, supportSource_);
    }
    if (supportTarget_ != false) {
      output.writeBool(4, supportTarget_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, languageCode_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (supportSource_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, supportSource_);
    }
    if (supportTarget_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, supportTarget_);
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
    if (!(obj instanceof com.google.cloud.translate.v3beta1.SupportedLanguage)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.SupportedLanguage other =
        (com.google.cloud.translate.v3beta1.SupportedLanguage) obj;

    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (getSupportSource() != other.getSupportSource()) return false;
    if (getSupportTarget() != other.getSupportTarget()) return false;
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
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + SUPPORT_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSupportSource());
    hash = (37 * hash) + SUPPORT_TARGET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSupportTarget());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage parseFrom(
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

  public static Builder newBuilder(com.google.cloud.translate.v3beta1.SupportedLanguage prototype) {
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
   * A single supported language response corresponds to information related
   * to one supported language.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.SupportedLanguage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.SupportedLanguage)
      com.google.cloud.translate.v3beta1.SupportedLanguageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_SupportedLanguage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_SupportedLanguage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.SupportedLanguage.class,
              com.google.cloud.translate.v3beta1.SupportedLanguage.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.SupportedLanguage.newBuilder()
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
      languageCode_ = "";

      displayName_ = "";

      supportSource_ = false;

      supportTarget_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto
          .internal_static_google_cloud_translation_v3beta1_SupportedLanguage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.SupportedLanguage getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.SupportedLanguage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.SupportedLanguage build() {
      com.google.cloud.translate.v3beta1.SupportedLanguage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.SupportedLanguage buildPartial() {
      com.google.cloud.translate.v3beta1.SupportedLanguage result =
          new com.google.cloud.translate.v3beta1.SupportedLanguage(this);
      result.languageCode_ = languageCode_;
      result.displayName_ = displayName_;
      result.supportSource_ = supportSource_;
      result.supportTarget_ = supportTarget_;
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
      if (other instanceof com.google.cloud.translate.v3beta1.SupportedLanguage) {
        return mergeFrom((com.google.cloud.translate.v3beta1.SupportedLanguage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3beta1.SupportedLanguage other) {
      if (other == com.google.cloud.translate.v3beta1.SupportedLanguage.getDefaultInstance())
        return this;
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.getSupportSource() != false) {
        setSupportSource(other.getSupportSource());
      }
      if (other.getSupportTarget() != false) {
        setSupportTarget(other.getSupportTarget());
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
      com.google.cloud.translate.v3beta1.SupportedLanguage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.translate.v3beta1.SupportedLanguage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * Supported language code, generally consisting of its ISO 639-1
     * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
     * including language and region identifiers are returned (for example,
     * 'zh-TW' and 'zh-CN')
     * </pre>
     *
     * <code>string language_code = 1;</code>
     *
     * @return The languageCode.
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Supported language code, generally consisting of its ISO 639-1
     * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
     * including language and region identifiers are returned (for example,
     * 'zh-TW' and 'zh-CN')
     * </pre>
     *
     * <code>string language_code = 1;</code>
     *
     * @return The bytes for languageCode.
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Supported language code, generally consisting of its ISO 639-1
     * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
     * including language and region identifiers are returned (for example,
     * 'zh-TW' and 'zh-CN')
     * </pre>
     *
     * <code>string language_code = 1;</code>
     *
     * @param value The languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Supported language code, generally consisting of its ISO 639-1
     * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
     * including language and region identifiers are returned (for example,
     * 'zh-TW' and 'zh-CN')
     * </pre>
     *
     * <code>string language_code = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLanguageCode() {

      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Supported language code, generally consisting of its ISO 639-1
     * identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes
     * including language and region identifiers are returned (for example,
     * 'zh-TW' and 'zh-CN')
     * </pre>
     *
     * <code>string language_code = 1;</code>
     *
     * @param value The bytes for languageCode to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      languageCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Human readable name of the language localized in the display language
     * specified in the request.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable name of the language localized in the display language
     * specified in the request.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human readable name of the language localized in the display language
     * specified in the request.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable name of the language localized in the display language
     * specified in the request.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human readable name of the language localized in the display language
     * specified in the request.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private boolean supportSource_;
    /**
     *
     *
     * <pre>
     * Can be used as source language.
     * </pre>
     *
     * <code>bool support_source = 3;</code>
     *
     * @return The supportSource.
     */
    public boolean getSupportSource() {
      return supportSource_;
    }
    /**
     *
     *
     * <pre>
     * Can be used as source language.
     * </pre>
     *
     * <code>bool support_source = 3;</code>
     *
     * @param value The supportSource to set.
     * @return This builder for chaining.
     */
    public Builder setSupportSource(boolean value) {

      supportSource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Can be used as source language.
     * </pre>
     *
     * <code>bool support_source = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSupportSource() {

      supportSource_ = false;
      onChanged();
      return this;
    }

    private boolean supportTarget_;
    /**
     *
     *
     * <pre>
     * Can be used as target language.
     * </pre>
     *
     * <code>bool support_target = 4;</code>
     *
     * @return The supportTarget.
     */
    public boolean getSupportTarget() {
      return supportTarget_;
    }
    /**
     *
     *
     * <pre>
     * Can be used as target language.
     * </pre>
     *
     * <code>bool support_target = 4;</code>
     *
     * @param value The supportTarget to set.
     * @return This builder for chaining.
     */
    public Builder setSupportTarget(boolean value) {

      supportTarget_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Can be used as target language.
     * </pre>
     *
     * <code>bool support_target = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSupportTarget() {

      supportTarget_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.SupportedLanguage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.SupportedLanguage)
  private static final com.google.cloud.translate.v3beta1.SupportedLanguage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.SupportedLanguage();
  }

  public static com.google.cloud.translate.v3beta1.SupportedLanguage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupportedLanguage> PARSER =
      new com.google.protobuf.AbstractParser<SupportedLanguage>() {
        @java.lang.Override
        public SupportedLanguage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SupportedLanguage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SupportedLanguage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupportedLanguage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.SupportedLanguage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
