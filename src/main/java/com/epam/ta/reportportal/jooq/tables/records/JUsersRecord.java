/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JUsers;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JUsersRecord extends UpdatableRecordImpl<JUsersRecord> implements Record11<Long, String, String, String, String, String, String, String, Boolean, String, JSONB> {

    private static final long serialVersionUID = -329787849;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.users.login</code>.
     */
    public void setLogin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.login</code>.
     */
    public String getLogin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.users.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.attachment</code>.
     */
    public void setAttachment(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.attachment</code>.
     */
    public String getAttachment() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.users.attachment_thumbnail</code>.
     */
    public void setAttachmentThumbnail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.attachment_thumbnail</code>.
     */
    public String getAttachmentThumbnail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.users.role</code>.
     */
    public void setRole(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.users.role</code>.
     */
    public String getRole() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.users.type</code>.
     */
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.users.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.users.expired</code>.
     */
    public void setExpired(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.users.expired</code>.
     */
    public Boolean getExpired() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.users.full_name</code>.
     */
    public void setFullName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.users.full_name</code>.
     */
    public String getFullName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.users.metadata</code>.
     */
    public void setMetadata(JSONB value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.users.metadata</code>.
     */
    public JSONB getMetadata() {
        return (JSONB) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, String, String, String, String, Boolean, String, JSONB> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, String, String, String, String, String, Boolean, String, JSONB> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JUsers.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return JUsers.USERS.LOGIN;
    }

    @Override
    public Field<String> field3() {
        return JUsers.USERS.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return JUsers.USERS.EMAIL;
    }

    @Override
    public Field<String> field5() {
        return JUsers.USERS.ATTACHMENT;
    }

    @Override
    public Field<String> field6() {
        return JUsers.USERS.ATTACHMENT_THUMBNAIL;
    }

    @Override
    public Field<String> field7() {
        return JUsers.USERS.ROLE;
    }

    @Override
    public Field<String> field8() {
        return JUsers.USERS.TYPE;
    }

    @Override
    public Field<Boolean> field9() {
        return JUsers.USERS.EXPIRED;
    }

    @Override
    public Field<String> field10() {
        return JUsers.USERS.FULL_NAME;
    }

    @Override
    public Field<JSONB> field11() {
        return JUsers.USERS.METADATA;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getLogin();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getEmail();
    }

    @Override
    public String component5() {
        return getAttachment();
    }

    @Override
    public String component6() {
        return getAttachmentThumbnail();
    }

    @Override
    public String component7() {
        return getRole();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public Boolean component9() {
        return getExpired();
    }

    @Override
    public String component10() {
        return getFullName();
    }

    @Override
    public JSONB component11() {
        return getMetadata();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getLogin();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getEmail();
    }

    @Override
    public String value5() {
        return getAttachment();
    }

    @Override
    public String value6() {
        return getAttachmentThumbnail();
    }

    @Override
    public String value7() {
        return getRole();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public Boolean value9() {
        return getExpired();
    }

    @Override
    public String value10() {
        return getFullName();
    }

    @Override
    public JSONB value11() {
        return getMetadata();
    }

    @Override
    public JUsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public JUsersRecord value2(String value) {
        setLogin(value);
        return this;
    }

    @Override
    public JUsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public JUsersRecord value4(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public JUsersRecord value5(String value) {
        setAttachment(value);
        return this;
    }

    @Override
    public JUsersRecord value6(String value) {
        setAttachmentThumbnail(value);
        return this;
    }

    @Override
    public JUsersRecord value7(String value) {
        setRole(value);
        return this;
    }

    @Override
    public JUsersRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public JUsersRecord value9(Boolean value) {
        setExpired(value);
        return this;
    }

    @Override
    public JUsersRecord value10(String value) {
        setFullName(value);
        return this;
    }

    @Override
    public JUsersRecord value11(JSONB value) {
        setMetadata(value);
        return this;
    }

    @Override
    public JUsersRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Boolean value9, String value10, JSONB value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JUsersRecord
     */
    public JUsersRecord() {
        super(JUsers.USERS);
    }

    /**
     * Create a detached, initialised JUsersRecord
     */
    public JUsersRecord(Long id, String login, String password, String email, String attachment, String attachmentThumbnail, String role, String type, Boolean expired, String fullName, JSONB metadata) {
        super(JUsers.USERS);

        set(0, id);
        set(1, login);
        set(2, password);
        set(3, email);
        set(4, attachment);
        set(5, attachmentThumbnail);
        set(6, role);
        set(7, type);
        set(8, expired);
        set(9, fullName);
        set(10, metadata);
    }
}
