/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.enums.JFilterConditionEnum;
import com.epam.ta.reportportal.jooq.tables.JFilterCondition;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JFilterConditionRecord extends UpdatableRecordImpl<JFilterConditionRecord> implements Record6<Long, Long, JFilterConditionEnum, String, String, Boolean> {

    private static final long serialVersionUID = 1740593621;

    /**
     * Setter for <code>public.filter_condition.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.filter_condition.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.filter_condition.filter_id</code>.
     */
    public void setFilterId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.filter_condition.filter_id</code>.
     */
    public Long getFilterId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.filter_condition.condition</code>.
     */
    public void setCondition(JFilterConditionEnum value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.filter_condition.condition</code>.
     */
    public JFilterConditionEnum getCondition() {
        return (JFilterConditionEnum) get(2);
    }

    /**
     * Setter for <code>public.filter_condition.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.filter_condition.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.filter_condition.field</code>.
     */
    public void setField(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.filter_condition.field</code>.
     */
    public String getField() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.filter_condition.negative</code>.
     */
    public void setNegative(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.filter_condition.negative</code>.
     */
    public Boolean getNegative() {
        return (Boolean) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, JFilterConditionEnum, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, JFilterConditionEnum, String, String, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JFilterCondition.FILTER_CONDITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JFilterCondition.FILTER_CONDITION.FILTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JFilterConditionEnum> field3() {
        return JFilterCondition.FILTER_CONDITION.CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JFilterCondition.FILTER_CONDITION.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JFilterCondition.FILTER_CONDITION.FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return JFilterCondition.FILTER_CONDITION.NEGATIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getFilterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionEnum component3() {
        return getCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getNegative();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getFilterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionEnum value3() {
        return getCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getField();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getNegative();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord value2(Long value) {
        setFilterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord value3(JFilterConditionEnum value) {
        setCondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord value5(String value) {
        setField(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord value6(Boolean value) {
        setNegative(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterConditionRecord values(Long value1, Long value2, JFilterConditionEnum value3, String value4, String value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JFilterConditionRecord
     */
    public JFilterConditionRecord() {
        super(JFilterCondition.FILTER_CONDITION);
    }

    /**
     * Create a detached, initialised JFilterConditionRecord
     */
    public JFilterConditionRecord(Long id, Long filterId, JFilterConditionEnum condition, String value, String field, Boolean negative) {
        super(JFilterCondition.FILTER_CONDITION);

        set(0, id);
        set(1, filterId);
        set(2, condition);
        set(3, value);
        set(4, field);
        set(5, negative);
    }
}
