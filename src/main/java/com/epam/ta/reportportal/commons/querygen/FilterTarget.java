/*
 * Copyright (C) 2018 EPAM Systems
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

package com.epam.ta.reportportal.commons.querygen;

import com.epam.ta.reportportal.entity.Activity;
import com.epam.ta.reportportal.entity.enums.IntegrationGroupEnum;
import com.epam.ta.reportportal.entity.enums.LogLevel;
import com.epam.ta.reportportal.entity.filter.UserFilter;
import com.epam.ta.reportportal.entity.integration.Integration;
import com.epam.ta.reportportal.entity.item.TestItem;
import com.epam.ta.reportportal.entity.launch.Launch;
import com.epam.ta.reportportal.entity.project.Project;
import com.epam.ta.reportportal.entity.user.User;
import com.epam.ta.reportportal.jooq.enums.JLaunchModeEnum;
import com.epam.ta.reportportal.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.jooq.enums.JTestItemTypeEnum;
import com.google.common.collect.Lists;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.epam.ta.reportportal.commons.querygen.constant.ActivityCriteriaConstant.CRITERIA_ACTION;
import static com.epam.ta.reportportal.commons.querygen.constant.ActivityCriteriaConstant.CRITERIA_OBJECT_ID;
import static com.epam.ta.reportportal.commons.querygen.constant.LaunchCriteriaConstant.*;
import static com.epam.ta.reportportal.commons.querygen.constant.LogCriteriaConstant.*;
import static com.epam.ta.reportportal.commons.querygen.constant.TestItemCriteriaConstant.*;
import static com.epam.ta.reportportal.commons.querygen.constant.UserCriteriaConstant.*;
import static com.epam.ta.reportportal.commons.querygen.constant.UserCriteriaConstant.CRITERIA_TYPE;
import static com.epam.ta.reportportal.dao.constant.WidgetContentRepositoryConstants.PROJECT_ID;
import static com.epam.ta.reportportal.dao.constant.WidgetRepositoryConstants.DESCRIPTION;
import static com.epam.ta.reportportal.jooq.Tables.*;
import static org.jooq.impl.DSL.field;

public enum FilterTarget {

	PROJECT_TARGET(Project.class, Arrays.asList(

			new CriteriaHolder("name", PROJECT.NAME.getQualifiedName().toString(), String.class),
			new CriteriaHolder("projectType", PROJECT.PROJECT_TYPE.getQualifiedName().toString(), String.class)
	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(PROJECT.ID,
					PROJECT.NAME,
					PROJECT.PROJECT_TYPE,
					PROJECT.CREATION_DATE,
					PROJECT.METADATA,
					PROJECT_ATTRIBUTE.VALUE,
					ATTRIBUTE.NAME,
					PROJECT_USER.PROJECT_ID,
					PROJECT_USER.PROJECT_ROLE,
					PROJECT_USER.USER_ID,
					USERS.LOGIN
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(PROJECT);
			query.addJoin(PROJECT_USER, JoinType.LEFT_OUTER_JOIN, PROJECT.ID.eq(PROJECT_USER.PROJECT_ID));
			query.addJoin(USERS, JoinType.LEFT_OUTER_JOIN, PROJECT_USER.USER_ID.eq(USERS.ID));
			query.addJoin(PROJECT_ATTRIBUTE, JoinType.LEFT_OUTER_JOIN, PROJECT.ID.eq(PROJECT_ATTRIBUTE.PROJECT_ID));
			query.addJoin(ATTRIBUTE, JoinType.LEFT_OUTER_JOIN, PROJECT_ATTRIBUTE.ATTRIBUTE_ID.eq(ATTRIBUTE.ID));
		}

		@Override
		protected Field<Long> idField() {
			return PROJECT.ID;
		}
	},

	USER_TARGET(User.class, Arrays.asList(

			new CriteriaHolder("id", USERS.ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder(CRITERIA_LOGIN, USERS.LOGIN.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_EMAIL, USERS.EMAIL.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_FULL_NAME, USERS.FULL_NAME.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_ROLE, USERS.ROLE.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_TYPE, USERS.TYPE.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_EXPIRED, USERS.EXPIRED.getQualifiedName().toString(), Boolean.class),
			new CriteriaHolder(CRITERIA_PROJECT_ID, PROJECT_USER.PROJECT_ID.getQualifiedName().toString(), Long.class)

	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(USERS.ID,
					USERS.LOGIN,
					USERS.DEFAULT_PROJECT_ID,
					USERS.FULL_NAME,
					USERS.ATTACHMENT,
					USERS.ATTACHMENT_THUMBNAIL,
					USERS.EMAIL,
					USERS.EXPIRED,
					USERS.PASSWORD,
					USERS.ROLE,
					USERS.METADATA,
					PROJECT_USER.PROJECT_ID,
					PROJECT_USER.PROJECT_ROLE,
					PROJECT_USER.USER_ID,
					PROJECT.PROJECT_TYPE,
					PROJECT.NAME
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(USERS);
			query.addJoin(PROJECT_USER, JoinType.LEFT_OUTER_JOIN, USERS.ID.eq(PROJECT_USER.USER_ID));
			query.addJoin(PROJECT, JoinType.LEFT_OUTER_JOIN, PROJECT_USER.PROJECT_ID.eq(PROJECT.ID));
		}

		@Override
		protected Field<Long> idField() {
			return USERS.ID;
		}
	},

	LAUNCH_TARGET(Launch.class, Arrays.asList(

			new CriteriaHolder("id", LAUNCH.ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("uuid", LAUNCH.UUID.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_LAUNCH_NAME, LAUNCH.NAME.getQualifiedName().toString(), String.class),
			new CriteriaHolder(DESCRIPTION, LAUNCH.DESCRIPTION.getQualifiedName().toString(), String.class),
			new CriteriaHolder("startTime", LAUNCH.START_TIME.getQualifiedName().toString(), Timestamp.class),
			new CriteriaHolder("endTime", LAUNCH.END_TIME.getQualifiedName().toString(), Timestamp.class),
			new CriteriaHolder(PROJECT_ID, LAUNCH.PROJECT_ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("userId", LAUNCH.USER_ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("number", LAUNCH.NUMBER.getQualifiedName().toString(), Integer.class),
			new CriteriaHolder("lastModified", LAUNCH.LAST_MODIFIED.getQualifiedName().toString(), Timestamp.class),
			new CriteriaHolder(CRITERIA_LAUNCH_MODE, LAUNCH.MODE.getQualifiedName().toString(), JLaunchModeEnum.class),
			new CriteriaHolder(CRITERIA_LAUNCH_STATUS, LAUNCH.STATUS.getQualifiedName().toString(), JStatusEnum.class),
			new CriteriaHolder(CRITERIA_LAUNCH_TAG, LAUNCH_TAG.VALUE.getQualifiedName().toString(), String.class),
			new CriteriaHolder("statisticsField", STATISTICS_FIELD.NAME.getQualifiedName().toString(), String.class),
			new CriteriaHolder("statisticsCount", STATISTICS.S_COUNTER.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("login", USERS.LOGIN.getQualifiedName().toString(), String.class)
	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(LAUNCH.ID,
					LAUNCH.UUID,
					LAUNCH.NAME,
					LAUNCH.DESCRIPTION,
					LAUNCH.START_TIME,
					LAUNCH.END_TIME,
					LAUNCH.PROJECT_ID,
					LAUNCH.USER_ID,
					LAUNCH.NUMBER,
					LAUNCH.LAST_MODIFIED,
					LAUNCH.MODE,
					LAUNCH.STATUS,
					LAUNCH_TAG.VALUE,
					STATISTICS.S_COUNTER,
					STATISTICS_FIELD.NAME,
					USERS.ID,
					USERS.LOGIN
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(LAUNCH);
			query.addJoin(LAUNCH_TAG, JoinType.LEFT_OUTER_JOIN, LAUNCH.ID.eq(LAUNCH_TAG.LAUNCH_ID));
			query.addJoin(USERS, JoinType.LEFT_OUTER_JOIN, LAUNCH.USER_ID.eq(USERS.ID));
			query.addJoin(STATISTICS, JoinType.LEFT_OUTER_JOIN, LAUNCH.ID.eq(STATISTICS.LAUNCH_ID));
			query.addJoin(STATISTICS_FIELD, JoinType.LEFT_OUTER_JOIN, STATISTICS.STATISTICS_FIELD_ID.eq(STATISTICS_FIELD.SF_ID));
		}

		@Override
		protected Field<Long> idField() {
			return LAUNCH.ID;
		}
	},

	TEST_ITEM_TARGET(TestItem.class,
			Arrays.asList(new CriteriaHolder(PROJECT_ID, LAUNCH.PROJECT_ID.getQualifiedName().toString(), Long.class),

					new CriteriaHolder(CRITERIA_NAME, TEST_ITEM.NAME.getQualifiedName().toString(), String.class),
					new CriteriaHolder(CRITERIA_TYPE, TEST_ITEM.TYPE.getQualifiedName().toString(), JTestItemTypeEnum.class),
					new CriteriaHolder("startTime", TEST_ITEM.START_TIME.getQualifiedName().toString(), Timestamp.class),
					new CriteriaHolder("description", TEST_ITEM.DESCRIPTION.getQualifiedName().toString(), String.class),
					new CriteriaHolder("lastModified", TEST_ITEM.LAST_MODIFIED.getQualifiedName().toString(), String.class),
					new CriteriaHolder(CRITERIA_PATH, TEST_ITEM.PATH.getQualifiedName().toString(), Long.class),
					new CriteriaHolder("uniqueId", TEST_ITEM.UNIQUE_ID.getQualifiedName().toString(), Long.class),
					new CriteriaHolder("parentId", TEST_ITEM.PARENT_ID.getQualifiedName().toString(), Long.class),
					new CriteriaHolder(CRITERIA_HAS_CHILDREN, TEST_ITEM.HAS_CHILDREN.getQualifiedName().toString(), Boolean.class),

					new CriteriaHolder(CRITERIA_TI_STATUS, TEST_ITEM_RESULTS.STATUS.getQualifiedName().toString(), JStatusEnum.class),
					new CriteriaHolder("endTime", TEST_ITEM_RESULTS.END_TIME.getQualifiedName().toString(), Timestamp.class),
					new CriteriaHolder("duration", TEST_ITEM_RESULTS.DURATION.getQualifiedName().toString(), Long.class),

					new CriteriaHolder("key", PARAMETER.KEY.getQualifiedName().toString(), String.class),
					new CriteriaHolder("value", PARAMETER.VALUE.getQualifiedName().toString(), String.class),
					new CriteriaHolder("statisticsField", STATISTICS_FIELD.NAME.getQualifiedName().toString(), String.class),
					new CriteriaHolder("statisticsCount", STATISTICS.S_COUNTER.getQualifiedName().toString(), Long.class),
					new CriteriaHolder("autoAnalyzed", ISSUE.AUTO_ANALYZED.getQualifiedName().toString(), Boolean.class),
					new CriteriaHolder("ignoreAnalyzer", ISSUE.IGNORE_ANALYZER.getQualifiedName().toString(), Boolean.class),
					new CriteriaHolder("locator", ISSUE_TYPE.LOCATOR.getQualifiedName().toString(), String.class),

					new CriteriaHolder(CRITERIA_LAUNCH_ID, TEST_ITEM.LAUNCH_ID.getQualifiedName().toString(), Long.class),
					new CriteriaHolder(CRITERIA_LAUNCH_MODE, LAUNCH.MODE.getQualifiedName().toString(), JLaunchModeEnum.class),
					new CriteriaHolder(CRITERIA_PARENT_ID, TEST_ITEM.PARENT_ID.getQualifiedName().toString(), Long.class),
					new CriteriaHolder(CRITERIA_ITEM_TAG, ITEM_TAG.VALUE.getQualifiedName().toString(), String.class),
					new CriteriaHolder(CRITERIA_ISSUE_TYPE, ISSUE_TYPE.LOCATOR.getQualifiedName().toString(), String.class)
			)
	) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(TEST_ITEM.ITEM_ID,
					TEST_ITEM.NAME,
					TEST_ITEM.TYPE,
					TEST_ITEM.START_TIME,
					TEST_ITEM.DESCRIPTION,
					TEST_ITEM.LAST_MODIFIED,
					TEST_ITEM.PATH,
					TEST_ITEM.UNIQUE_ID,
					TEST_ITEM.PARENT_ID,
					TEST_ITEM.RETRY_OF,
					TEST_ITEM.HAS_CHILDREN,
					TEST_ITEM.LAUNCH_ID,
					TEST_ITEM_RESULTS.STATUS,
					TEST_ITEM_RESULTS.END_TIME,
					TEST_ITEM_RESULTS.DURATION,
					ITEM_TAG.VALUE,
					PARAMETER.KEY,
					PARAMETER.VALUE,
					STATISTICS_FIELD.NAME,
					STATISTICS.S_COUNTER,
					ISSUE.AUTO_ANALYZED,
					ISSUE.IGNORE_ANALYZER,
					ISSUE.ISSUE_DESCRIPTION,
					ISSUE_TYPE.LOCATOR,
					ISSUE_TYPE.ABBREVIATION,
					ISSUE_TYPE.HEX_COLOR,
					ISSUE_TYPE.ISSUE_NAME,
					ISSUE_GROUP.ISSUE_GROUP_
			);
		}

		@Override
		protected Field<Long> idField() {
			return TEST_ITEM.ITEM_ID;
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(TEST_ITEM);
			query.addJoin(ITEM_TAG, JoinType.LEFT_OUTER_JOIN, TEST_ITEM.ITEM_ID.eq(ITEM_TAG.ITEM_ID));
			query.addJoin(PARAMETER, JoinType.LEFT_OUTER_JOIN, TEST_ITEM.ITEM_ID.eq(PARAMETER.ITEM_ID));
			query.addJoin(STATISTICS, JoinType.LEFT_OUTER_JOIN, TEST_ITEM.ITEM_ID.eq(STATISTICS.ITEM_ID));
			query.addJoin(STATISTICS_FIELD, JoinType.JOIN, STATISTICS.STATISTICS_FIELD_ID.eq(STATISTICS_FIELD.SF_ID));
			query.addJoin(LAUNCH, JoinType.LEFT_OUTER_JOIN, TEST_ITEM.LAUNCH_ID.eq(LAUNCH.ID));
			query.addJoin(TEST_ITEM_RESULTS, JoinType.LEFT_OUTER_JOIN, TEST_ITEM.ITEM_ID.eq(TEST_ITEM_RESULTS.RESULT_ID));
			query.addJoin(ISSUE, JoinType.LEFT_OUTER_JOIN, TEST_ITEM_RESULTS.RESULT_ID.eq(ISSUE.ISSUE_ID));
			query.addJoin(ISSUE_TYPE, JoinType.LEFT_OUTER_JOIN, ISSUE.ISSUE_TYPE.eq(ISSUE_TYPE.ID));
			query.addJoin(ISSUE_GROUP, JoinType.LEFT_OUTER_JOIN, ISSUE_TYPE.ISSUE_GROUP_ID.eq(ISSUE_GROUP.ISSUE_GROUP_ID));

		}
	},

	LOG_TARGET(Log.class, Arrays.asList(

			new CriteriaHolder(CRITERIA_LOG_ID, LOG.ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("logTime", LOG.LOG_TIME.getQualifiedName().toString(), Timestamp.class),
			new CriteriaHolder("lastModified", LOG.LAST_MODIFIED.getQualifiedName().toString(), Timestamp.class),
			new CriteriaHolder(CRITERIA_LOG_LEVEL, LOG.LOG_LEVEL.getQualifiedName().toString(), LogLevel.class),
			new CriteriaHolder(CRITERIA_LOG_MESSAGE, LOG.LOG_MESSAGE.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_TEST_ITEM_ID, LOG.ITEM_ID.getQualifiedName().toString(), Long.class)
	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(LOG.ID,
					LOG.LOG_TIME,
					LOG.LOG_MESSAGE,
					LOG.LAST_MODIFIED,
					LOG.LOG_LEVEL,
					LOG.ITEM_ID,
					LOG.ATTACHMENT,
					LOG.CONTENT_TYPE
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(LOG);
		}

		@Override
		protected Field<Long> idField() {
			return LOG.ID;
		}
	},

	ACTIVITY_TARGET(Activity.class, Arrays.asList(

			new CriteriaHolder("id", ACTIVITY.ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder(PROJECT_ID, ACTIVITY.PROJECT_ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("projectName", PROJECT.NAME.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("userId", ACTIVITY.USER_ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder("entity", ACTIVITY.ENTITY.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_ACTION, ACTIVITY.ACTION.getQualifiedName().toString(), String.class),
			new CriteriaHolder("creationDate", ACTIVITY.CREATION_DATE.getQualifiedName().toString(), String.class),
			new CriteriaHolder(CRITERIA_OBJECT_ID, ACTIVITY.ID.getQualifiedName().toString(), Long.class),
			new CriteriaHolder(CRITERIA_LOGIN, USERS.LOGIN.getQualifiedName().toString(), String.class)
	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(ACTIVITY.ID,
					ACTIVITY.PROJECT_ID,
					ACTIVITY.USER_ID,
					ACTIVITY.ENTITY,
					ACTIVITY.ACTION,
					ACTIVITY.CREATION_DATE,
					ACTIVITY.DETAILS,
					ACTIVITY.OBJECT_ID,
					USERS.LOGIN,
					PROJECT.NAME
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(ACTIVITY);
			query.addJoin(USERS, JoinType.JOIN, ACTIVITY.USER_ID.eq(USERS.ID));
			query.addJoin(PROJECT, JoinType.JOIN, ACTIVITY.PROJECT_ID.eq(PROJECT.ID));
		}

		@Override
		protected Field<Long> idField() {
			return ACTIVITY.ID;
		}
	},

	INTEGRATION_TARGET(Integration.class, Arrays.asList(

			new CriteriaHolder("project", INTEGRATION.PROJECT_ID.getQualifiedName().toString(), String.class),
			new CriteriaHolder("type", INTEGRATION_TYPE.GROUP_TYPE.getQualifiedName().toString(), IntegrationGroupEnum.class),
			new CriteriaHolder("name", INTEGRATION_TYPE.NAME.getQualifiedName().toString(), String.class),
			new CriteriaHolder("projectName", PROJECT.NAME.getQualifiedName().toString(), String.class)
	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(INTEGRATION.ID,
					INTEGRATION.PROJECT_ID,
					INTEGRATION.TYPE,
					INTEGRATION.PARAMS,
					INTEGRATION.CREATION_DATE,
					INTEGRATION_TYPE.NAME,
					INTEGRATION_TYPE.GROUP_TYPE,
					PROJECT.NAME
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(INTEGRATION);
			query.addJoin(INTEGRATION_TYPE, JoinType.JOIN, INTEGRATION.TYPE.eq(INTEGRATION_TYPE.ID));
			query.addJoin(PROJECT, JoinType.JOIN, INTEGRATION.PROJECT_ID.eq(PROJECT.ID));
		}

		@Override
		protected Field<Long> idField() {
			return DSL.cast(INTEGRATION.ID, Long.class);
		}
	},

	USER_FILTER_TARGET(UserFilter.class, Arrays.asList(

			new CriteriaHolder("name", FILTER.NAME.getQualifiedName().toString(), String.class),
			new CriteriaHolder("name", FILTER.NAME.getQualifiedName().toString(), String.class)

	)) {
		@Override
		protected Collection<? extends SelectFieldOrAsterisk> selectFields() {
			return Lists.newArrayList(USER_FILTER.ID,
					FILTER.NAME,
					FILTER.PROJECT_ID,
					FILTER.TARGET,
					FILTER.DESCRIPTION,
					FILTER_CONDITION.SEARCH_CRITERIA,
					FILTER_CONDITION.CONDITION,
					FILTER_CONDITION.VALUE,
					FILTER_CONDITION.NEGATIVE,
					FILTER_SORT.FIELD,
					FILTER_SORT.DIRECTION
			);
		}

		@Override
		protected void joinTables(SelectQuery<? extends Record> query) {
			query.addFrom(USER_FILTER);
			query.addJoin(FILTER, JoinType.JOIN, USER_FILTER.ID.eq(FILTER.ID));
			query.addJoin(FILTER_CONDITION, JoinType.LEFT_OUTER_JOIN, FILTER.ID.eq(FILTER_CONDITION.FILTER_ID));
			query.addJoin(FILTER_SORT, JoinType.LEFT_OUTER_JOIN, FILTER.ID.eq(FILTER_SORT.FILTER_ID));
			query.addJoin(ACL_OBJECT_IDENTITY, JoinType.JOIN, USER_FILTER.ID.cast(String.class).eq(ACL_OBJECT_IDENTITY.OBJECT_ID_IDENTITY));
			query.addJoin(ACL_CLASS, JoinType.JOIN, ACL_CLASS.ID.eq(ACL_OBJECT_IDENTITY.OBJECT_ID_CLASS));
			query.addJoin(ACL_ENTRY, JoinType.JOIN, ACL_ENTRY.ACL_OBJECT_IDENTITY.eq(ACL_OBJECT_IDENTITY.ID));
		}

		@Override
		protected Field<Long> idField() {
			return USER_FILTER.ID;
		}
	};

	public static final String FILTERED_QUERY = "filtered";
	public static final String FILTERED_ID = "id";

	private Class<?> clazz;
	private List<CriteriaHolder> criteriaHolders;

	FilterTarget(Class<?> clazz, List<CriteriaHolder> criteriaHolders) {
		this.clazz = clazz;
		this.criteriaHolders = criteriaHolders;
	}

	public SelectQuery<? extends Record> getQuery() {
		SelectQuery<? extends Record> query = DSL.selectDistinct(idField().as(FILTERED_ID)).orderBy(idField().as(FILTERED_ID)).getQuery();
		joinTables(query);
		return query;
	}

	protected abstract Collection<? extends SelectFieldOrAsterisk> selectFields();

	protected abstract void joinTables(SelectQuery<? extends Record> query);

	protected abstract Field<Long> idField();

	public SelectQuery<? extends Record> wrapQuery(SelectQuery<? extends Record> query) {
		SelectQuery<Record> wrappedQuery = DSL.with(FILTERED_QUERY).as(query).select(selectFields()).getQuery();
		joinTables(wrappedQuery);
		wrappedQuery.addJoin(DSL.table(DSL.name(FILTERED_QUERY)),
				JoinType.JOIN,
				idField().eq(field(DSL.name(FILTERED_QUERY, FILTERED_ID), Long.class))
		);
		return wrappedQuery;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public List<CriteriaHolder> getCriteriaHolders() {
		return criteriaHolders;
	}

	public Optional<CriteriaHolder> getCriteriaByFilter(String filterCriteria) {
		return criteriaHolders.stream().filter(holder -> holder.getFilterCriteria().equals(filterCriteria)).findAny();
	}

	public static FilterTarget findByClass(Class<?> clazz) {
		return Arrays.stream(values())
				.filter(val -> val.clazz.equals(clazz))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException(String.format("No target query builder for clazz %s", clazz)));
	}
}
