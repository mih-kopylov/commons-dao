/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JBugTrackingSystemRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class JBugTrackingSystem extends TableImpl<JBugTrackingSystemRecord> {

    private static final long serialVersionUID = -1172955783;

    /**
     * The reference instance of <code>public.bug_tracking_system</code>
     */
    public static final JBugTrackingSystem BUG_TRACKING_SYSTEM = new JBugTrackingSystem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JBugTrackingSystemRecord> getRecordType() {
        return JBugTrackingSystemRecord.class;
    }

    /**
     * The column <code>public.bug_tracking_system.id</code>.
     */
    public final TableField<JBugTrackingSystemRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('bug_tracking_system_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.bug_tracking_system.url</code>.
     */
    public final TableField<JBugTrackingSystemRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.bug_tracking_system.type</code>.
     */
    public final TableField<JBugTrackingSystemRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.bug_tracking_system.bts_project</code>.
     */
    public final TableField<JBugTrackingSystemRecord, String> BTS_PROJECT = createField("bts_project", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.bug_tracking_system.project_id</code>.
     */
    public final TableField<JBugTrackingSystemRecord, Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.bug_tracking_system</code> table reference
     */
    public JBugTrackingSystem() {
        this(DSL.name("bug_tracking_system"), null);
    }

    /**
     * Create an aliased <code>public.bug_tracking_system</code> table reference
     */
    public JBugTrackingSystem(String alias) {
        this(DSL.name(alias), BUG_TRACKING_SYSTEM);
    }

    /**
     * Create an aliased <code>public.bug_tracking_system</code> table reference
     */
    public JBugTrackingSystem(Name alias) {
        this(alias, BUG_TRACKING_SYSTEM);
    }

    private JBugTrackingSystem(Name alias, Table<JBugTrackingSystemRecord> aliased) {
        this(alias, aliased, null);
    }

    private JBugTrackingSystem(Name alias, Table<JBugTrackingSystemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JBugTrackingSystem(Table<O> child, ForeignKey<O, JBugTrackingSystemRecord> key) {
        super(child, key, BUG_TRACKING_SYSTEM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BUG_TRACKING_SYSTEM_PK, Indexes.UNIQUE_BTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JBugTrackingSystemRecord, Long> getIdentity() {
        return Keys.IDENTITY_BUG_TRACKING_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JBugTrackingSystemRecord> getPrimaryKey() {
        return Keys.BUG_TRACKING_SYSTEM_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JBugTrackingSystemRecord>> getKeys() {
        return Arrays.<UniqueKey<JBugTrackingSystemRecord>>asList(Keys.BUG_TRACKING_SYSTEM_PK, Keys.UNIQUE_BTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JBugTrackingSystemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JBugTrackingSystemRecord, ?>>asList(Keys.BUG_TRACKING_SYSTEM__BUG_TRACKING_SYSTEM_PROJECT_ID_FKEY);
    }

    public JProject project() {
        return new JProject(this, Keys.BUG_TRACKING_SYSTEM__BUG_TRACKING_SYSTEM_PROJECT_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystem as(String alias) {
        return new JBugTrackingSystem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JBugTrackingSystem as(Name alias) {
        return new JBugTrackingSystem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JBugTrackingSystem rename(String name) {
        return new JBugTrackingSystem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JBugTrackingSystem rename(Name name) {
        return new JBugTrackingSystem(name, null);
    }
}
