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

package com.epam.ta.reportportal.dao;

import com.epam.ta.reportportal.entity.enums.IntegrationGroupEnum;
import com.epam.ta.reportportal.entity.integration.IntegrationType;

import java.util.List;

/**
 * Repository for {@link com.epam.ta.reportportal.entity.integration.IntegrationType} entity
 *
 * @author Yauheni_Martynau
 */
public interface IntegrationTypeRepository extends ReportPortalRepository<IntegrationType, Long>, IntegrationTypeRepositoryCustom {

	/**
	 * Retrieve all {@link IntegrationType} by {@link IntegrationType#integrationGroup}
	 *
	 * @param integrationGroup {@link IntegrationType#integrationGroup}
	 * @return @return The {@link List} of the {@link IntegrationType}
	 */
	List<IntegrationType> findAllByIntegrationGroup(IntegrationGroupEnum integrationGroup);
}
