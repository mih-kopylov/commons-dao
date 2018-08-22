/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JFilter;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class JFilterRecord extends UpdatableRecordImpl<JFilterRecord> implements Record5<Long, String, Long, String, String> {

    private static final long serialVersionUID = -1283291322;

    /**
     * Setter for <code>public.filter.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.filter.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.filter.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.filter.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.filter.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.filter.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.filter.target</code>.
     */
    public void setTarget(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.filter.target</code>.
     */
    public String getTarget() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.filter.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.filter.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
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
    public Row5<Long, String, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Long, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JFilter.FILTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JFilter.FILTER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return JFilter.FILTER.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JFilter.FILTER.TARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JFilter.FILTER.DESCRIPTION;
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
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterRecord value3(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterRecord value4(String value) {
        setTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JFilterRecord values(Long value1, String value2, Long value3, String value4, String value5) {
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
     * Create a detached JFilterRecord
     */
    public JFilterRecord() {
        super(JFilter.FILTER);
    }

    /**
     * Create a detached, initialised JFilterRecord
     */
    public JFilterRecord(Long id, String name, Long projectId, String target, String description) {
        super(JFilter.FILTER);

        set(0, id);
        set(1, name);
        set(2, projectId);
        set(3, target);
        set(4, description);
    }
}
