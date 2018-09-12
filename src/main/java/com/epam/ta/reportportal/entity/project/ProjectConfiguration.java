package com.epam.ta.reportportal.entity.project;

import com.epam.ta.reportportal.entity.enums.EntryType;
import com.epam.ta.reportportal.entity.project.email.ProjectEmailConfig;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

import static com.epam.ta.reportportal.entity.enums.ProjectAttributeEnum.*;

/**
 * @author Ivan Budayeu
 */
public class ProjectConfiguration implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntryType entryType;

	private String interruptJobTime;

	private String keepLogs;

	private String keepScreenshots;

	private ProjectAnalyzerConfig analyzerConfig;

	private ProjectEmailConfig projectEmailConfig;

	public ProjectConfiguration() {
		this.analyzerConfig = new ProjectAnalyzerConfig();
	}

	public ProjectConfiguration(Set<ProjectAttribute> projectAttributes) {
		if (CollectionUtils.isNotEmpty(projectAttributes)) {
			Map<String, String> attributes = projectAttributes.stream().collect(Collectors.toMap(projectAttribute -> projectAttribute.getAttribute().getName(), ProjectAttribute::getValue));
			this.entryType = EntryType.getByName(attributes.get(ENTRY_TYPE.getValue()));
			this.interruptJobTime = attributes.get(INTERRUPT_JOB_TIME.getValue());
			this.keepLogs = attributes.get(KEEP_LOGS.getValue());
			this.keepScreenshots = attributes.get(KEEP_SCREENSHOTS.getValue());
			this.analyzerConfig =  new ProjectAnalyzerConfig(getOptionValueOrDefault(attributes.get(MIN_DOC_FREQ.getValue()), ProjectAnalyzerConfig.MIN_DOC_FREQ),
															 getOptionValueOrDefault(attributes.get(MIN_TERM_FREQ.getValue()), ProjectAnalyzerConfig.MIN_TERM_FREQ),
															 getOptionValueOrDefault(attributes.get(MIN_SHOULD_MATCH.getValue()), ProjectAnalyzerConfig.MIN_SHOULD_MATCH),
															 getOptionValueOrDefault(attributes.get(NUMBER_OF_LOG_LINES.getValue()), ProjectAnalyzerConfig.NUMBER_OF_LOG_LINES),
															 BooleanUtils.toBoolean(attributes.get(INDEXING_RUNNING.getValue())),
															 BooleanUtils.toBooleanObject(attributes.get(AUTO_ANALYZER_ENABLED.getValue())));
			this.projectEmailConfig = new ProjectEmailConfig(BooleanUtils.toBooleanObject(attributes.get(EMAIL_ENABLED.getValue())), attributes.get(EMAIL_FROM.getValue()));
		}
	}


	public ProjectAnalyzerConfig getAnalyzerConfig() {
		return analyzerConfig;
	}

	public void setAnalyzerConfig(ProjectAnalyzerConfig analyzerConfig) {
		this.analyzerConfig = analyzerConfig;
	}

	public void setEntryType(EntryType value) {
		this.entryType = value;
	}

	public EntryType getEntryType() {
		return entryType;
	}

	public void setInterruptJobTime(String value) {
		this.interruptJobTime = value;
	}

	public String getInterruptJobTime() {
		return interruptJobTime;
	}

	public void setKeepLogs(String value) {
		this.keepLogs = value;
	}

	public String getKeepLogs() {
		return keepLogs;
	}

	public void setKeepScreenshots(String value) {
		this.keepScreenshots = value;
	}

	public String getKeepScreenshots() {
		return keepScreenshots;
	}

	public ProjectEmailConfig getProjectEmailConfig() {
		return projectEmailConfig;
	}

	public void setProjectEmailConfig(ProjectEmailConfig projectEmailConfig) {
		this.projectEmailConfig = projectEmailConfig;
	}

	private int getOptionValueOrDefault(String optionValue, int defaultValue) {
		try {
			return Integer.parseInt(optionValue);
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}
}