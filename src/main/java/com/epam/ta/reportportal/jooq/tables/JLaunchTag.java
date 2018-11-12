/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JLaunchTagRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLaunchTag extends TableImpl<JLaunchTagRecord> {

    private static final long serialVersionUID = 2042991958;

    /**
     * The reference instance of <code>public.launch_tag</code>
     */
    public static final JLaunchTag LAUNCH_TAG = new JLaunchTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JLaunchTagRecord> getRecordType() {
        return JLaunchTagRecord.class;
    }

    /**
     * The column <code>public.launch_tag.id</code>.
     */
    public final TableField<JLaunchTagRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('launch_tag_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.launch_tag.value</code>.
     */
    public final TableField<JLaunchTagRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.launch_tag.launch_id</code>.
     */
    public final TableField<JLaunchTagRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.launch_tag</code> table reference
     */
    public JLaunchTag() {
        this(DSL.name("launch_tag"), null);
    }

    /**
     * Create an aliased <code>public.launch_tag</code> table reference
     */
    public JLaunchTag(String alias) {
        this(DSL.name(alias), LAUNCH_TAG);
    }

    /**
     * Create an aliased <code>public.launch_tag</code> table reference
     */
    public JLaunchTag(Name alias) {
        this(alias, LAUNCH_TAG);
    }

    private JLaunchTag(Name alias, Table<JLaunchTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private JLaunchTag(Name alias, Table<JLaunchTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JLaunchTag(Table<O> child, ForeignKey<O, JLaunchTagRecord> key) {
        super(child, key, LAUNCH_TAG);
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
        return Arrays.<Index>asList(Indexes.LAUNCH_TAG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JLaunchTagRecord, Long> getIdentity() {
        return Keys.IDENTITY_LAUNCH_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JLaunchTagRecord> getPrimaryKey() {
        return Keys.LAUNCH_TAG_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JLaunchTagRecord>> getKeys() {
        return Arrays.<UniqueKey<JLaunchTagRecord>>asList(Keys.LAUNCH_TAG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JLaunchTagRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JLaunchTagRecord, ?>>asList(Keys.LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY);
    }

    public JLaunch launch() {
        return new JLaunch(this, Keys.LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchTag as(String alias) {
        return new JLaunchTag(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchTag as(Name alias) {
        return new JLaunchTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JLaunchTag rename(String name) {
        return new JLaunchTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JLaunchTag rename(Name name) {
        return new JLaunchTag(name, null);
    }
}
