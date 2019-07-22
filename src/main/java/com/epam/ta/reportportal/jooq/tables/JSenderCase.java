/*
 * Copyright 2019 EPAM Systems
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
import com.epam.ta.reportportal.jooq.tables.records.JSenderCaseRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JSenderCase extends TableImpl<JSenderCaseRecord> {

	private static final long serialVersionUID = -1937269450;

	/**
	 * The reference instance of <code>public.sender_case</code>
	 */
	public static final JSenderCase SENDER_CASE = new JSenderCase();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JSenderCaseRecord> getRecordType() {
		return JSenderCaseRecord.class;
	}

	/**
	 * The column <code>public.sender_case.id</code>.
	 */
	public final TableField<JSenderCaseRecord, Long> ID = createField(
			"id",
			org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("nextval('sender_case_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)),
			this,
			""
	);

	/**
	 * The column <code>public.sender_case.send_case</code>.
	 */
	public final TableField<JSenderCaseRecord, String> SEND_CASE = createField(
			"send_case",
			org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false),
			this,
			""
	);

	/**
	 * The column <code>public.sender_case.project_id</code>.
	 */
	public final TableField<JSenderCaseRecord, Long> PROJECT_ID = createField(
			"project_id",
			org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field(
							"nextval('sender_case_project_id_seq'::regclass)",
							org.jooq.impl.SQLDataType.BIGINT
					)),
			this,
			""
	);

	/**
	 * Create a <code>public.sender_case</code> table reference
	 */
	public JSenderCase() {
		this(DSL.name("sender_case"), null);
	}

	/**
	 * Create an aliased <code>public.sender_case</code> table reference
	 */
	public JSenderCase(String alias) {
		this(DSL.name(alias), SENDER_CASE);
	}

	/**
	 * Create an aliased <code>public.sender_case</code> table reference
	 */
	public JSenderCase(Name alias) {
		this(alias, SENDER_CASE);
	}

	private JSenderCase(Name alias, Table<JSenderCaseRecord> aliased) {
		this(alias, aliased, null);
	}

	private JSenderCase(Name alias, Table<JSenderCaseRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, DSL.comment(""));
	}

	public <O extends Record> JSenderCase(Table<O> child, ForeignKey<O, JSenderCaseRecord> key) {
		super(child, key, SENDER_CASE);
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
		return Arrays.<Index>asList(Indexes.SENDER_CASE_PK, Indexes.SENDER_CASE_PROJECT_IDX);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JSenderCaseRecord, Long> getIdentity() {
		return Keys.IDENTITY_SENDER_CASE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JSenderCaseRecord> getPrimaryKey() {
		return Keys.SENDER_CASE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JSenderCaseRecord>> getKeys() {
		return Arrays.<UniqueKey<JSenderCaseRecord>>asList(Keys.SENDER_CASE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JSenderCaseRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JSenderCaseRecord, ?>>asList(Keys.SENDER_CASE__SENDER_CASE_PROJECT_ID_FKEY);
	}

	public JProject project() {
		return new JProject(this, Keys.SENDER_CASE__SENDER_CASE_PROJECT_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSenderCase as(String alias) {
		return new JSenderCase(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JSenderCase as(Name alias) {
		return new JSenderCase(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JSenderCase rename(String name) {
		return new JSenderCase(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JSenderCase rename(Name name) {
		return new JSenderCase(name, null);
	}
}