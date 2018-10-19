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
 * Provides a wrapper for {@link Vehicle_CatalogueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_CatalogueLocalService
 * @generated
 */
@ProviderType
public class Vehicle_CatalogueLocalServiceWrapper
	implements Vehicle_CatalogueLocalService,
		ServiceWrapper<Vehicle_CatalogueLocalService> {
	public Vehicle_CatalogueLocalServiceWrapper(
		Vehicle_CatalogueLocalService vehicle_CatalogueLocalService) {
		_vehicle_CatalogueLocalService = vehicle_CatalogueLocalService;
	}

	/**
	* Adds the vehicle_ catalogue to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicle_Catalogue the vehicle_ catalogue
	* @return the vehicle_ catalogue that was added
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue addVehicle_Catalogue(
		com.axa.glf.masterdata.model.Vehicle_Catalogue vehicle_Catalogue) {
		return _vehicle_CatalogueLocalService.addVehicle_Catalogue(vehicle_Catalogue);
	}

	/**
	* Creates a new vehicle_ catalogue with the primary key. Does not add the vehicle_ catalogue to the database.
	*
	* @param vehicleId the primary key for the new vehicle_ catalogue
	* @return the new vehicle_ catalogue
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue createVehicle_Catalogue(
		long vehicleId) {
		return _vehicle_CatalogueLocalService.createVehicle_Catalogue(vehicleId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vehicle_CatalogueLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the vehicle_ catalogue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue that was removed
	* @throws PortalException if a vehicle_ catalogue with the primary key could not be found
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue deleteVehicle_Catalogue(
		long vehicleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vehicle_CatalogueLocalService.deleteVehicle_Catalogue(vehicleId);
	}

	/**
	* Deletes the vehicle_ catalogue from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicle_Catalogue the vehicle_ catalogue
	* @return the vehicle_ catalogue that was removed
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue deleteVehicle_Catalogue(
		com.axa.glf.masterdata.model.Vehicle_Catalogue vehicle_Catalogue) {
		return _vehicle_CatalogueLocalService.deleteVehicle_Catalogue(vehicle_Catalogue);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicle_CatalogueLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vehicle_CatalogueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.axa.glf.masterdata.model.impl.Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vehicle_CatalogueLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.axa.glf.masterdata.model.impl.Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vehicle_CatalogueLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vehicle_CatalogueLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vehicle_CatalogueLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue fetchVehicle_Catalogue(
		long vehicleId) {
		return _vehicle_CatalogueLocalService.fetchVehicle_Catalogue(vehicleId);
	}

	/**
	* Returns the vehicle_ catalogue matching the UUID and group.
	*
	* @param uuid the vehicle_ catalogue's UUID
	* @param groupId the primary key of the group
	* @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue fetchVehicle_CatalogueByUuidAndGroupId(
		String uuid, long groupId) {
		return _vehicle_CatalogueLocalService.fetchVehicle_CatalogueByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vehicle_CatalogueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _vehicle_CatalogueLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vehicle_CatalogueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _vehicle_CatalogueLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vehicle_CatalogueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the vehicle_ catalogue with the primary key.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue
	* @throws PortalException if a vehicle_ catalogue with the primary key could not be found
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue getVehicle_Catalogue(
		long vehicleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vehicle_CatalogueLocalService.getVehicle_Catalogue(vehicleId);
	}

	/**
	* Returns the vehicle_ catalogue matching the UUID and group.
	*
	* @param uuid the vehicle_ catalogue's UUID
	* @param groupId the primary key of the group
	* @return the matching vehicle_ catalogue
	* @throws PortalException if a matching vehicle_ catalogue could not be found
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue getVehicle_CatalogueByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vehicle_CatalogueLocalService.getVehicle_CatalogueByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the vehicle_ catalogues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.axa.glf.masterdata.model.impl.Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @return the range of vehicle_ catalogues
	*/
	@Override
	public java.util.List<com.axa.glf.masterdata.model.Vehicle_Catalogue> getVehicle_Catalogues(
		int start, int end) {
		return _vehicle_CatalogueLocalService.getVehicle_Catalogues(start, end);
	}

	/**
	* Returns all the vehicle_ catalogues matching the UUID and company.
	*
	* @param uuid the UUID of the vehicle_ catalogues
	* @param companyId the primary key of the company
	* @return the matching vehicle_ catalogues, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.axa.glf.masterdata.model.Vehicle_Catalogue> getVehicle_CataloguesByUuidAndCompanyId(
		String uuid, long companyId) {
		return _vehicle_CatalogueLocalService.getVehicle_CataloguesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of vehicle_ catalogues matching the UUID and company.
	*
	* @param uuid the UUID of the vehicle_ catalogues
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching vehicle_ catalogues, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.axa.glf.masterdata.model.Vehicle_Catalogue> getVehicle_CataloguesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.axa.glf.masterdata.model.Vehicle_Catalogue> orderByComparator) {
		return _vehicle_CatalogueLocalService.getVehicle_CataloguesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of vehicle_ catalogues.
	*
	* @return the number of vehicle_ catalogues
	*/
	@Override
	public int getVehicle_CataloguesCount() {
		return _vehicle_CatalogueLocalService.getVehicle_CataloguesCount();
	}

	/**
	* Updates the vehicle_ catalogue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicle_Catalogue the vehicle_ catalogue
	* @return the vehicle_ catalogue that was updated
	*/
	@Override
	public com.axa.glf.masterdata.model.Vehicle_Catalogue updateVehicle_Catalogue(
		com.axa.glf.masterdata.model.Vehicle_Catalogue vehicle_Catalogue) {
		return _vehicle_CatalogueLocalService.updateVehicle_Catalogue(vehicle_Catalogue);
	}

	@Override
	public Vehicle_CatalogueLocalService getWrappedService() {
		return _vehicle_CatalogueLocalService;
	}

	@Override
	public void setWrappedService(
		Vehicle_CatalogueLocalService vehicle_CatalogueLocalService) {
		_vehicle_CatalogueLocalService = vehicle_CatalogueLocalService;
	}

	private Vehicle_CatalogueLocalService _vehicle_CatalogueLocalService;
}