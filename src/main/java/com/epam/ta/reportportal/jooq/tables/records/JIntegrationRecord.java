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
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JIntegration;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIntegrationRecord extends UpdatableRecordImpl<JIntegrationRecord>
		implements Record8<Integer, String, Long, Integer, Boolean, Object, String, Timestamp> {

	private static final long serialVersionUID = 311402324;

	/**
	 * Setter for <code>public.integration.id</code>.
	 */
	public void setId(Integer value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.integration.id</code>.
	 */
	public Integer getId() {
		return (Integer) get(0);
	}

	/**
	 * Setter for <code>public.integration.name</code>.
	 */
	public void setName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.integration.name</code>.
	 */
	public String getName() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>public.integration.project_id</code>.
	 */
	public void setProjectId(Long value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.integration.project_id</code>.
	 */
	public Long getProjectId() {
		return (Long) get(2);
	}

	/**
	 * Setter for <code>public.integration.type</code>.
	 */
	public void setType(Integer value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.integration.type</code>.
	 */
	public Integer getType() {
		return (Integer) get(3);
	}

	/**
	 * Setter for <code>public.integration.enabled</code>.
	 */
	public void setEnabled(Boolean value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.integration.enabled</code>.
	 */
	public Boolean getEnabled() {
		return (Boolean) get(4);
	}

	/**
	 * Setter for <code>public.integration.params</code>.
	 */
	public void setParams(Object value) {
		set(5, value);
	}

	/**
	 * Getter for <code>public.integration.params</code>.
	 */
	public Object getParams() {
		return get(5);
	}

	/**
	 * Setter for <code>public.integration.creator</code>.
	 */
	public void setCreator(String value) {
		set(6, value);
	}

	/**
	 * Getter for <code>public.integration.creator</code>.
	 */
	public String getCreator() {
		return (String) get(6);
	}

	/**
	 * Setter for <code>public.integration.creation_date</code>.
	 */
	public void setCreationDate(Timestamp value) {
		set(7, value);
	}

	/**
	 * Getter for <code>public.integration.creation_date</code>.
	 */
	public Timestamp getCreationDate() {
		return (Timestamp) get(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, Long, Integer, Boolean, Object, String, Timestamp> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, Long, Integer, Boolean, Object, String, Timestamp> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return JIntegration.INTEGRATION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return JIntegration.INTEGRATION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return JIntegration.INTEGRATION.PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return JIntegration.INTEGRATION.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field5() {
		return JIntegration.INTEGRATION.ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field6() {
		return JIntegration.INTEGRATION.PARAMS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return JIntegration.INTEGRATION.CREATOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return JIntegration.INTEGRATION.CREATION_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component1() {
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
	public Integer component4() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean component5() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object component6() {
		return getParams();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component7() {
		return getCreator();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp component8() {
		return getCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
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
	public Integer value4() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value5() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value6() {
		return getParams();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCreator();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getCreationDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value3(Long value) {
		setProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value4(Integer value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value5(Boolean value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value6(Object value) {
		setParams(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value7(String value) {
		setCreator(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord value8(Timestamp value) {
		setCreationDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIntegrationRecord values(Integer value1, String value2, Long value3, Integer value4, Boolean value5, Object value6,
			String value7, Timestamp value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIntegrationRecord
	 */
	public JIntegrationRecord() {
		super(JIntegration.INTEGRATION);
	}

	/**
	 * Create a detached, initialised JIntegrationRecord
	 */
	public JIntegrationRecord(Integer id, String name, Long projectId, Integer type, Boolean enabled, Object params, String creator,
			Timestamp creationDate) {
		super(JIntegration.INTEGRATION);

		set(0, id);
		set(1, name);
		set(2, projectId);
		set(3, type);
		set(4, enabled);
		set(5, params);
		set(6, creator);
		set(7, creationDate);
	}
}