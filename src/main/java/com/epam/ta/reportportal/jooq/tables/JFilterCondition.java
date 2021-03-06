/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.enums.JFilterConditionEnum;
import com.epam.ta.reportportal.jooq.tables.records.JFilterConditionRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JFilterCondition extends TableImpl<JFilterConditionRecord> {

    private static final long serialVersionUID = 1735686331;

    /**
     * The reference instance of <code>public.filter_condition</code>
     */
    public static final JFilterCondition FILTER_CONDITION = new JFilterCondition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JFilterConditionRecord> getRecordType() {
        return JFilterConditionRecord.class;
    }

    /**
     * The column <code>public.filter_condition.id</code>.
     */
    public final TableField<JFilterConditionRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('filter_condition_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.filter_condition.filter_id</code>.
     */
    public final TableField<JFilterConditionRecord, Long> FILTER_ID = createField(DSL.name("filter_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.filter_condition.condition</code>.
     */
    public final TableField<JFilterConditionRecord, JFilterConditionEnum> CONDITION = createField(DSL.name("condition"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(com.epam.ta.reportportal.jooq.enums.JFilterConditionEnum.class), this, "");

    /**
     * The column <code>public.filter_condition.value</code>.
     */
    public final TableField<JFilterConditionRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.filter_condition.search_criteria</code>.
     */
    public final TableField<JFilterConditionRecord, String> SEARCH_CRITERIA = createField(DSL.name("search_criteria"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.filter_condition.negative</code>.
     */
    public final TableField<JFilterConditionRecord, Boolean> NEGATIVE = createField(DSL.name("negative"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>public.filter_condition</code> table reference
     */
    public JFilterCondition() {
        this(DSL.name("filter_condition"), null);
    }

    /**
     * Create an aliased <code>public.filter_condition</code> table reference
     */
    public JFilterCondition(String alias) {
        this(DSL.name(alias), FILTER_CONDITION);
    }

    /**
     * Create an aliased <code>public.filter_condition</code> table reference
     */
    public JFilterCondition(Name alias) {
        this(alias, FILTER_CONDITION);
    }

    private JFilterCondition(Name alias, Table<JFilterConditionRecord> aliased) {
        this(alias, aliased, null);
    }

    private JFilterCondition(Name alias, Table<JFilterConditionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JFilterCondition(Table<O> child, ForeignKey<O, JFilterConditionRecord> key) {
        super(child, key, FILTER_CONDITION);
    }

    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FILTER_COND_FILTER_IDX, Indexes.FILTER_CONDITION_PK);
    }

    @Override
    public Identity<JFilterConditionRecord, Long> getIdentity() {
        return Keys.IDENTITY_FILTER_CONDITION;
    }

    @Override
    public UniqueKey<JFilterConditionRecord> getPrimaryKey() {
        return Keys.FILTER_CONDITION_PK;
    }

    @Override
    public List<UniqueKey<JFilterConditionRecord>> getKeys() {
        return Arrays.<UniqueKey<JFilterConditionRecord>>asList(Keys.FILTER_CONDITION_PK);
    }

    @Override
    public List<ForeignKey<JFilterConditionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JFilterConditionRecord, ?>>asList(Keys.FILTER_CONDITION__FILTER_CONDITION_FILTER_ID_FKEY);
    }

    public JFilter filter() {
        return new JFilter(this, Keys.FILTER_CONDITION__FILTER_CONDITION_FILTER_ID_FKEY);
    }

    @Override
    public JFilterCondition as(String alias) {
        return new JFilterCondition(DSL.name(alias), this);
    }

    @Override
    public JFilterCondition as(Name alias) {
        return new JFilterCondition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JFilterCondition rename(String name) {
        return new JFilterCondition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JFilterCondition rename(Name name) {
        return new JFilterCondition(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, JFilterConditionEnum, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
