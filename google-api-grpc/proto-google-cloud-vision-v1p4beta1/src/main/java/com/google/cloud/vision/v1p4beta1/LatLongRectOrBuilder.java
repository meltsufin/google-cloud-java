// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface LatLongRectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.LatLongRect)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   */
  boolean hasMinLatLng();
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   */
  com.google.type.LatLng getMinLatLng();
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   */
  com.google.type.LatLngOrBuilder getMinLatLngOrBuilder();

  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   */
  boolean hasMaxLatLng();
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   */
  com.google.type.LatLng getMaxLatLng();
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   */
  com.google.type.LatLngOrBuilder getMaxLatLngOrBuilder();
}
