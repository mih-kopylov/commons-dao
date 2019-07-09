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

package com.epam.ta.reportportal.entity.activity;

import com.epam.ta.reportportal.commons.JsonbUserType;
import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * @author Ihar Kahadouski
 */
public class ActivityDetails extends JsonbUserType implements Serializable {

	@Override
	public Class<?> returnedClass() {
		return ActivityDetails.class;
	}

	private List<HistoryField> history = Lists.newArrayList();

	private String objectName;

	public ActivityDetails() {
	}

	public ActivityDetails(String objectName) {
		this.objectName = objectName;
	}

	public ActivityDetails(List<HistoryField> history, String objectName) {
		this.history = history;
		this.objectName = objectName;
	}

	public List<HistoryField> getHistory() {
		return history;
	}

	public void setHistory(List<HistoryField> history) {
		this.history = history;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public void addHistoryField(HistoryField historyField) {
		history.add(historyField);
	}
}