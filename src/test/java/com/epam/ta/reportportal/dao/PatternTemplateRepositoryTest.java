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

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.BaseTest;
import com.epam.ta.reportportal.entity.pattern.PatternTemplate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@Sql("/db/fill/pattern/pattern-fill.sql")
class PatternTemplateRepositoryTest extends BaseTest {

	@Autowired
	private PatternTemplateRepository patternTemplateRepository;

	@Test
	void findAllByProjectIdAndEnabled() {

		List<PatternTemplate> allByProjectIdAndEnabled = patternTemplateRepository.findAllByProjectIdAndEnabled(1L, true);

		Assertions.assertNotNull(allByProjectIdAndEnabled);
		Assertions.assertEquals(2, allByProjectIdAndEnabled.size());
	}
}