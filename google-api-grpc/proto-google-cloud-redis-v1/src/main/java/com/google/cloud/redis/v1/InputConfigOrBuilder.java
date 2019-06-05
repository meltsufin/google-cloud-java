// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.v1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.cloud.redis.v1.GcsSource gcs_source = 1;</code>
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.cloud.redis.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.redis.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.cloud.redis.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.redis.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  public com.google.cloud.redis.v1.InputConfig.SourceCase getSourceCase();
}
