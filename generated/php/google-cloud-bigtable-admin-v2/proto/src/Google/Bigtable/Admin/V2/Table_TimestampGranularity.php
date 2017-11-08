<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/admin/v2/table.proto

namespace Google\Bigtable\Admin\V2;

/**
 * <pre>
 * Possible timestamp granularities to use when keeping multiple versions
 * of data in a table.
 * </pre>
 *
 * Protobuf enum <code>google.bigtable.admin.v2.Table.TimestampGranularity</code>
 */
class Table_TimestampGranularity
{
    /**
     * <pre>
     * The user did not specify a granularity. Should not be returned.
     * When specified during table creation, MILLIS will be used.
     * </pre>
     *
     * <code>TIMESTAMP_GRANULARITY_UNSPECIFIED = 0;</code>
     */
    const TIMESTAMP_GRANULARITY_UNSPECIFIED = 0;
    /**
     * <pre>
     * The table keeps data versioned at a granularity of 1ms.
     * </pre>
     *
     * <code>MILLIS = 1;</code>
     */
    const MILLIS = 1;
}
