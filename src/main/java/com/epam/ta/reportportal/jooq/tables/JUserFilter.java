/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JUserFilterRecord;
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
public class JUserFilter extends TableImpl<JUserFilterRecord> {

    private static final long serialVersionUID = -1179500261;

    /**
     * The reference instance of <code>public.user_filter</code>
     */
    public static final JUserFilter USER_FILTER = new JUserFilter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JUserFilterRecord> getRecordType() {
        return JUserFilterRecord.class;
    }

    /**
     * The column <code>public.user_filter.id</code>.
     */
    public final TableField<JUserFilterRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.user_filter</code> table reference
     */
    public JUserFilter() {
        this(DSL.name("user_filter"), null);
    }

    /**
     * Create an aliased <code>public.user_filter</code> table reference
     */
    public JUserFilter(String alias) {
        this(DSL.name(alias), USER_FILTER);
    }

    /**
     * Create an aliased <code>public.user_filter</code> table reference
     */
    public JUserFilter(Name alias) {
        this(alias, USER_FILTER);
    }

    private JUserFilter(Name alias, Table<JUserFilterRecord> aliased) {
        this(alias, aliased, null);
    }

    private JUserFilter(Name alias, Table<JUserFilterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JUserFilter(Table<O> child, ForeignKey<O, JUserFilterRecord> key) {
        super(child, key, USER_FILTER);
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
        return Arrays.<Index>asList(Indexes.USER_FILTER_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JUserFilterRecord> getPrimaryKey() {
        return Keys.USER_FILTER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JUserFilterRecord>> getKeys() {
        return Arrays.<UniqueKey<JUserFilterRecord>>asList(Keys.USER_FILTER_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JUserFilterRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JUserFilterRecord, ?>>asList(Keys.USER_FILTER__USER_FILTER_ID_FK);
    }

    public JFilter filter() {
        return new JFilter(this, Keys.USER_FILTER__USER_FILTER_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserFilter as(String alias) {
        return new JUserFilter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserFilter as(Name alias) {
        return new JUserFilter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JUserFilter rename(String name) {
        return new JUserFilter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JUserFilter rename(Name name) {
        return new JUserFilter(name, null);
    }
}
