/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JBugTrackingSystem;

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
public class JBugTrackingSystemRecord extends UpdatableRecordImpl<JBugTrackingSystemRecord> implements Record5<Long, String, String, String, Long> {

    private static final long serialVersionUID = 189559797;

    /**
     * Setter for <code>public.bug_tracking_system.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.bug_tracking_system.url</code>.
     */
    public void setUrl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system.url</code>.
     */
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.bug_tracking_system.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.bug_tracking_system.bts_project</code>.
     */
    public void setBtsProject(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system.bts_project</code>.
     */
    public String getBtsProject() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.bug_tracking_system.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bug_tracking_system.project_id</code>.
     */
    public Long getProjectId() {
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
    public Row5<Long, String, String, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JBugTrackingSystem.BUG_TRACKING_SYSTEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JBugTrackingSystem.BUG_TRACKING_SYSTEM.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JBugTrackingSystem.BUG_TRACKING_SYSTEM.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JBugTrackingSystem.BUG_TRACKING_SYSTEM.BTS_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return JBugTrackingSystem.BUG_TRACKING_SYSTEM.PROJECT_ID;
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBtsProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getProjectId();
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBtsProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemRecord value2(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemRecord value4(String value) {
        setBtsProject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemRecord value5(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystemRecord values(Long value1, String value2, String value3, String value4, Long value5) {
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
     * Create a detached JBugTrackingSystemRecord
     */
    public JBugTrackingSystemRecord() {
        super(JBugTrackingSystem.BUG_TRACKING_SYSTEM);
    }

    /**
     * Create a detached, initialised JBugTrackingSystemRecord
     */
    public JBugTrackingSystemRecord(Long id, String url, String type, String btsProject, Long projectId) {
        super(JBugTrackingSystem.BUG_TRACKING_SYSTEM);

        set(0, id);
        set(1, url);
        set(2, type);
        set(3, btsProject);
        set(4, projectId);
    }
}
