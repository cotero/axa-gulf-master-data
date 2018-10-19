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

package com.axa.glf.masterdata.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Vehicle_Catalogue service. Represents a row in the &quot;glf_Vehicle_Catalogue&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_CatalogueModel
 * @see com.axa.glf.masterdata.model.impl.Vehicle_CatalogueImpl
 * @see com.axa.glf.masterdata.model.impl.Vehicle_CatalogueModelImpl
 * @generated
 */
@ImplementationClassName("com.axa.glf.masterdata.model.impl.Vehicle_CatalogueImpl")
@ProviderType
public interface Vehicle_Catalogue extends Vehicle_CatalogueModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.axa.glf.masterdata.model.impl.Vehicle_CatalogueImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Vehicle_Catalogue, Long> VEHICLE_ID_ACCESSOR = new Accessor<Vehicle_Catalogue, Long>() {
			@Override
			public Long get(Vehicle_Catalogue vehicle_Catalogue) {
				return vehicle_Catalogue.getVehicleId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Vehicle_Catalogue> getTypeClass() {
				return Vehicle_Catalogue.class;
			}
		};
}