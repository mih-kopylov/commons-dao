/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JTestItemStructureRecord;
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
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTestItemStructure extends TableImpl<JTestItemStructureRecord> {

    private static final long serialVersionUID = -1175566650;

    /**
     * The reference instance of <code>public.test_item_structure</code>
     */
    public static final JTestItemStructure TEST_ITEM_STRUCTURE = new JTestItemStructure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTestItemStructureRecord> getRecordType() {
        return JTestItemStructureRecord.class;
    }

    /**
     * The column <code>public.test_item_structure.structure_id</code>.
     */
    public final TableField<JTestItemStructureRecord, Long> STRUCTURE_ID = createField("structure_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_item_structure_structure_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_item_structure.parent_id</code>.
     */
    public final TableField<JTestItemStructureRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JTestItemStructureRecord, Object> PATH = createField("path", org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"ltree\""), this, "");

    /**
     * The column <code>public.test_item_structure.retry_of</code>.
     */
    public final TableField<JTestItemStructureRecord, Long> RETRY_OF = createField("retry_of", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.test_item_structure.launch_id</code>.
     */
    public final TableField<JTestItemStructureRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.test_item_structure</code> table reference
     */
    public JTestItemStructure() {
        this(DSL.name("test_item_structure"), null);
    }

    /**
     * Create an aliased <code>public.test_item_structure</code> table reference
     */
    public JTestItemStructure(String alias) {
        this(DSL.name(alias), TEST_ITEM_STRUCTURE);
    }

    /**
     * Create an aliased <code>public.test_item_structure</code> table reference
     */
    public JTestItemStructure(Name alias) {
        this(alias, TEST_ITEM_STRUCTURE);
    }

    private JTestItemStructure(Name alias, Table<JTestItemStructureRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTestItemStructure(Name alias, Table<JTestItemStructureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JTestItemStructure(Table<O> child, ForeignKey<O, JTestItemStructureRecord> key) {
        super(child, key, TEST_ITEM_STRUCTURE);
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
        return Arrays.<Index>asList(Indexes.PATH_GIST_IDX, Indexes.PATH_IDX, Indexes.TEST_ITEM_STRUCTURE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JTestItemStructureRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_ITEM_STRUCTURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JTestItemStructureRecord> getPrimaryKey() {
        return Keys.TEST_ITEM_STRUCTURE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JTestItemStructureRecord>> getKeys() {
        return Arrays.<UniqueKey<JTestItemStructureRecord>>asList(Keys.TEST_ITEM_STRUCTURE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JTestItemStructureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JTestItemStructureRecord, ?>>asList(Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_LAUNCH_ID_FKEY);
    }

    public com.epam.ta.reportportal.jooq.tables.JTestItemStructure testItemStructure_TestItemStructureParentIdFkey() {
        return new com.epam.ta.reportportal.jooq.tables.JTestItemStructure(this, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY);
    }

    public com.epam.ta.reportportal.jooq.tables.JTestItemStructure testItemStructure_TestItemStructureRetryOfFkey() {
        return new com.epam.ta.reportportal.jooq.tables.JTestItemStructure(this, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY);
    }

    public JLaunch launch() {
        return new JLaunch(this, Keys.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_LAUNCH_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructure as(String alias) {
        return new JTestItemStructure(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JTestItemStructure as(Name alias) {
        return new JTestItemStructure(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTestItemStructure rename(String name) {
        return new JTestItemStructure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTestItemStructure rename(Name name) {
        return new JTestItemStructure(name, null);
    }
}
