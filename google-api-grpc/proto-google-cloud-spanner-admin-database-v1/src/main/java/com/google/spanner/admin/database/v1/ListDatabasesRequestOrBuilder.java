// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

public interface ListDatabasesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.ListDatabasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The instance whose databases should be listed.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The instance whose databases should be listed.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Number of databases to be returned in the response. If 0 or less,
   * defaults to the server's maximum allowed page size.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` should contain a
   * [next_page_token][google.spanner.admin.database.v1.ListDatabasesResponse.next_page_token]
   * from a previous
   * [ListDatabasesResponse][google.spanner.admin.database.v1.ListDatabasesResponse].
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If non-empty, `page_token` should contain a
   * [next_page_token][google.spanner.admin.database.v1.ListDatabasesResponse.next_page_token]
   * from a previous
   * [ListDatabasesResponse][google.spanner.admin.database.v1.ListDatabasesResponse].
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
