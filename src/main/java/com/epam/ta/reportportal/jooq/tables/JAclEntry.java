/*
 * Copyright 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JAclEntryRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JAclEntry extends TableImpl<JAclEntryRecord> {

	private static final long serialVersionUID = -256155194;

	/**
	 * The reference instance of <code>public.acl_entry</code>
	 */
	public static final JAclEntry ACL_ENTRY = new JAclEntry();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JAclEntryRecord> getRecordType() {
		return JAclEntryRecord.class;
	}

	/**
	 * The column <code>public.acl_entry.id</code>.
	 */
	public final TableField<JAclEntryRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('acl_entry_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

	/**
	 * The column <code>public.acl_entry.acl_object_identity</code>.
	 */
	public final TableField<JAclEntryRecord, Long> ACL_OBJECT_IDENTITY = createField("acl_object_identity", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.acl_entry.ace_order</code>.
	 */
	public final TableField<JAclEntryRecord, Integer> ACE_ORDER = createField("ace_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.acl_entry.sid</code>.
	 */
	public final TableField<JAclEntryRecord, Long> SID = createField("sid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.acl_entry.mask</code>.
	 */
	public final TableField<JAclEntryRecord, Integer> MASK = createField("mask", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.acl_entry.granting</code>.
	 */
	public final TableField<JAclEntryRecord, Boolean> GRANTING = createField("granting", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>public.acl_entry.audit_success</code>.
	 */
	public final TableField<JAclEntryRecord, Boolean> AUDIT_SUCCESS = createField("audit_success", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>public.acl_entry.audit_failure</code>.
	 */
	public final TableField<JAclEntryRecord, Boolean> AUDIT_FAILURE = createField("audit_failure", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>public.acl_entry</code> table reference
	 */
	public JAclEntry() {
		this(DSL.name("acl_entry"), null);
	}

	/**
	 * Create an aliased <code>public.acl_entry</code> table reference
	 */
	public JAclEntry(String alias) {
		this(DSL.name(alias), ACL_ENTRY);
	}

	/**
	 * Create an aliased <code>public.acl_entry</code> table reference
	 */
	public JAclEntry(Name alias) {
		this(alias, ACL_ENTRY);
	}

	private JAclEntry(Name alias, Table<JAclEntryRecord> aliased) {
		this(alias, aliased, null);
	}

	private JAclEntry(Name alias, Table<JAclEntryRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> JAclEntry(Table<O> child, ForeignKey<O, JAclEntryRecord> key) {
		super(child, key, ACL_ENTRY);
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
		return Arrays.<Index>asList(Indexes.ACL_ENTRY_PKEY, Indexes.UNIQUE_UK_4);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JAclEntryRecord, Long> getIdentity() {
		return Keys.IDENTITY_ACL_ENTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JAclEntryRecord> getPrimaryKey() {
		return Keys.ACL_ENTRY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JAclEntryRecord>> getKeys() {
		return Arrays.<UniqueKey<JAclEntryRecord>>asList(Keys.ACL_ENTRY_PKEY, Keys.UNIQUE_UK_4);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JAclEntryRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JAclEntryRecord, ?>>asList(Keys.ACL_ENTRY__FOREIGN_FK_4, Keys.ACL_ENTRY__FOREIGN_FK_5);
	}

	public JAclObjectIdentity aclObjectIdentity() {
		return new JAclObjectIdentity(this, Keys.ACL_ENTRY__FOREIGN_FK_4);
	}

	public JAclSid aclSid() {
		return new JAclSid(this, Keys.ACL_ENTRY__FOREIGN_FK_5);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JAclEntry as(String alias) {
		return new JAclEntry(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JAclEntry as(Name alias) {
		return new JAclEntry(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JAclEntry rename(String name) {
		return new JAclEntry(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JAclEntry rename(Name name) {
		return new JAclEntry(name, null);
	}
}
