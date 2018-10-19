/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.axa.glf.masterdata.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Vehicle_CatalogueService}.
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_CatalogueService
 * @generated
 */
@ProviderType
public class Vehicle_CatalogueServiceWrapper implements Vehicle_CatalogueService,
	ServiceWrapper<Vehicle_CatalogueService> {
	public Vehicle_CatalogueServiceWrapper(
		Vehicle_CatalogueService vehicle_CatalogueService) {
		_vehicle_CatalogueService = vehicle_CatalogueService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _vehicle_CatalogueService.getOSGiServiceIdentifier();
	}

	@Override
	public Vehicle_CatalogueService getWrappedService() {
		return _vehicle_CatalogueService;
	}

	@Override
	public void setWrappedService(
		Vehicle_CatalogueService vehicle_CatalogueService) {
		_vehicle_CatalogueService = vehicle_CatalogueService;
	}

	private Vehicle_CatalogueService _vehicle_CatalogueService;
}