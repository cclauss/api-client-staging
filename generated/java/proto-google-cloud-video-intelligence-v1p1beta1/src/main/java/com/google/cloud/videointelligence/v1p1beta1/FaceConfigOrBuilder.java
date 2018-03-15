// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface FaceConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.FaceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Model to use for face detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model to use for face detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Whether bounding boxes be included in the face annotation output.
   * </pre>
   *
   * <code>bool include_bounding_boxes = 2;</code>
   */
  boolean getIncludeBoundingBoxes();

  /**
   * <pre>
   * Whether to enable emotion detection. Ignored if 'include_bounding_boxes' is
   * false.
   * </pre>
   *
   * <code>bool include_emotions = 4;</code>
   */
  boolean getIncludeEmotions();
}