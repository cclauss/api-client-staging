<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/bigtable/v2/data.proto

namespace Google\Bigtable\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 * Specifies an atomic read/modify/write operation on the latest value of the
 * specified column.
 * </pre>
 *
 * Protobuf type <code>google.bigtable.v2.ReadModifyWriteRule</code>
 */
class ReadModifyWriteRule extends \Google\Protobuf\Internal\Message
{
    /**
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    private $family_name = '';
    /**
     * <pre>
     * The qualifier of the column to which the read/modify/write should be
     * applied.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    private $column_qualifier = '';
    protected $rule;

    public function __construct() {
        \GPBMetadata\Google\Bigtable\V2\Data::initOnce();
        parent::__construct();
    }

    /**
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public function getFamilyName()
    {
        return $this->family_name;
    }

    /**
     * <pre>
     * The name of the family to which the read/modify/write should be applied.
     * Must match `[-_.a-zA-Z0-9]+`
     * </pre>
     *
     * <code>string family_name = 1;</code>
     */
    public function setFamilyName($var)
    {
        GPBUtil::checkString($var, True);
        $this->family_name = $var;
    }

    /**
     * <pre>
     * The qualifier of the column to which the read/modify/write should be
     * applied.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public function getColumnQualifier()
    {
        return $this->column_qualifier;
    }

    /**
     * <pre>
     * The qualifier of the column to which the read/modify/write should be
     * applied.
     * Can be any byte string, including the empty string.
     * </pre>
     *
     * <code>bytes column_qualifier = 2;</code>
     */
    public function setColumnQualifier($var)
    {
        GPBUtil::checkString($var, False);
        $this->column_qualifier = $var;
    }

    /**
     * <pre>
     * Rule specifying that `append_value` be appended to the existing value.
     * If the targeted cell is unset, it will be treated as containing the
     * empty string.
     * </pre>
     *
     * <code>bytes append_value = 3;</code>
     */
    public function getAppendValue()
    {
        return $this->readOneof(3);
    }

    /**
     * <pre>
     * Rule specifying that `append_value` be appended to the existing value.
     * If the targeted cell is unset, it will be treated as containing the
     * empty string.
     * </pre>
     *
     * <code>bytes append_value = 3;</code>
     */
    public function setAppendValue($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(3, $var);
    }

    /**
     * <pre>
     * Rule specifying that `increment_amount` be added to the existing value.
     * If the targeted cell is unset, it will be treated as containing a zero.
     * Otherwise, the targeted cell must contain an 8-byte value (interpreted
     * as a 64-bit big-endian signed integer), or the entire request will fail.
     * </pre>
     *
     * <code>int64 increment_amount = 4;</code>
     */
    public function getIncrementAmount()
    {
        return $this->readOneof(4);
    }

    /**
     * <pre>
     * Rule specifying that `increment_amount` be added to the existing value.
     * If the targeted cell is unset, it will be treated as containing a zero.
     * Otherwise, the targeted cell must contain an 8-byte value (interpreted
     * as a 64-bit big-endian signed integer), or the entire request will fail.
     * </pre>
     *
     * <code>int64 increment_amount = 4;</code>
     */
    public function setIncrementAmount($var)
    {
        GPBUtil::checkInt64($var);
        $this->writeOneof(4, $var);
    }

    public function getRule()
    {
        return $this->whichOneof("rule");
    }

}
