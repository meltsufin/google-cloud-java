// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1beta1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1beta1;

public interface AnnotateAssessmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Assessment, in the format
   * "projects/{project_number}/assessments/{assessment_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Assessment, in the format
   * "projects/{project_number}/assessments/{assessment_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
   * </code>
   */
  int getAnnotationValue();
  /**
   *
   *
   * <pre>
   * The annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation annotation = 2;
   * </code>
   */
  com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest.Annotation getAnnotation();
}