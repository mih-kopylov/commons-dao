/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JTestItemStructure;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemStructureRecord extends UpdatableRecordImpl<JTestItemStructureRecord> implements Record5<Long, Long, Object, Long, Long> {

    private static final long serialVersionUID = -1486341073;

    /**
     * Setter for <code>public.test_item_structure.structure_id</code>.
     */
    public void setStructureId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.test_item_structure.structure_id</code>.
     */
    public Long getStructureId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.test_item_structure.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.test_item_structure.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(1);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPath(Object value) {
        set(2, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPath() {
        return get(2);
    }

    /**
     * Setter for <code>public.test_item_structure.retry_of</code>.
     */
    public void setRetryOf(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.test_item_structure.retry_of</code>.
     */
    public Long getRetryOf() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.test_item_structure.launch_id</code>.
     */
    public void setLaunchId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.test_item_structure.launch_id</code>.
     */
    public Long getLaunchId() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Object, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Object, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JTestItemStructure.TEST_ITEM_STRUCTURE.STRUCTURE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JTestItemStructure.TEST_ITEM_STRUCTURE.PARENT_ID;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field3() {
        return JTestItemStructure.TEST_ITEM_STRUCTURE.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return JTestItemStructure.TEST_ITEM_STRUCTURE.RETRY_OF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return JTestItemStructure.TEST_ITEM_STRUCTURE.LAUNCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getStructureId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getParentId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRetryOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getStructureId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getParentId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRetryOf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getLaunchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructureRecord value1(Long value) {
        setStructureId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructureRecord value2(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public JTestItemStructureRecord value3(Object value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructureRecord value4(Long value) {
        setRetryOf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructureRecord value5(Long value) {
        setLaunchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructureRecord values(Long value1, Long value2, Object value3, Long value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JTestItemStructureRecord
     */
    public JTestItemStructureRecord() {
        super(JTestItemStructure.TEST_ITEM_STRUCTURE);
    }

    /**
     * Create a detached, initialised JTestItemStructureRecord
     */
    public JTestItemStructureRecord(Long structureId, Long parentId, Object path, Long retryOf, Long launchId) {
        super(JTestItemStructure.TEST_ITEM_STRUCTURE);

        set(0, structureId);
        set(1, parentId);
        set(2, path);
        set(3, retryOf);
        set(4, launchId);
    }
}
