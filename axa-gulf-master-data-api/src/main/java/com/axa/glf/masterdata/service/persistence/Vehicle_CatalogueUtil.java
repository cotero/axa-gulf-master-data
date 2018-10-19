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

package com.axa.glf.masterdata.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.axa.glf.masterdata.model.Vehicle_Catalogue;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vehicle_ catalogue service. This utility wraps {@link com.axa.glf.masterdata.service.persistence.impl.Vehicle_CataloguePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_CataloguePersistence
 * @see com.axa.glf.masterdata.service.persistence.impl.Vehicle_CataloguePersistenceImpl
 * @generated
 */
@ProviderType
public class Vehicle_CatalogueUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Vehicle_Catalogue vehicle_Catalogue) {
		getPersistence().clearCache(vehicle_Catalogue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Vehicle_Catalogue> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Vehicle_Catalogue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Vehicle_Catalogue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Vehicle_Catalogue update(Vehicle_Catalogue vehicle_Catalogue) {
		return getPersistence().update(vehicle_Catalogue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Vehicle_Catalogue update(
		Vehicle_Catalogue vehicle_Catalogue, ServiceContext serviceContext) {
		return getPersistence().update(vehicle_Catalogue, serviceContext);
	}

	/**
	* Returns all the vehicle_ catalogues where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the vehicle_ catalogues where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @return the range of matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid(String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the vehicle_ catalogues where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid(String uuid, int start,
		int end, OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vehicle_ catalogues where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid(String uuid, int start,
		int end, OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue findByUuid_First(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue fetchByUuid_First(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue findByUuid_Last(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue fetchByUuid_Last(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the vehicle_ catalogues before and after the current vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param vehicleId the primary key of the current vehicle_ catalogue
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public static Vehicle_Catalogue[] findByUuid_PrevAndNext(long vehicleId,
		String uuid, OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence()
				   .findByUuid_PrevAndNext(vehicleId, uuid, orderByComparator);
	}

	/**
	* Removes all the vehicle_ catalogues where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of vehicle_ catalogues where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vehicle_ catalogues
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVehicle_CatalogueException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue findByUUID_G(String uuid, long groupId)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the vehicle_ catalogue where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vehicle_ catalogue that was removed
	*/
	public static Vehicle_Catalogue removeByUUID_G(String uuid, long groupId)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of vehicle_ catalogues where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vehicle_ catalogues
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @return the range of matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue findByUuid_C_First(String uuid,
		long companyId, OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue fetchByUuid_C_First(String uuid,
		long companyId, OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue findByUuid_C_Last(String uuid,
		long companyId, OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public static Vehicle_Catalogue fetchByUuid_C_Last(String uuid,
		long companyId, OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the vehicle_ catalogues before and after the current vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param vehicleId the primary key of the current vehicle_ catalogue
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public static Vehicle_Catalogue[] findByUuid_C_PrevAndNext(long vehicleId,
		String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(vehicleId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the vehicle_ catalogues where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vehicle_ catalogues
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the vehicle_ catalogue in the entity cache if it is enabled.
	*
	* @param vehicle_Catalogue the vehicle_ catalogue
	*/
	public static void cacheResult(Vehicle_Catalogue vehicle_Catalogue) {
		getPersistence().cacheResult(vehicle_Catalogue);
	}

	/**
	* Caches the vehicle_ catalogues in the entity cache if it is enabled.
	*
	* @param vehicle_Catalogues the vehicle_ catalogues
	*/
	public static void cacheResult(List<Vehicle_Catalogue> vehicle_Catalogues) {
		getPersistence().cacheResult(vehicle_Catalogues);
	}

	/**
	* Creates a new vehicle_ catalogue with the primary key. Does not add the vehicle_ catalogue to the database.
	*
	* @param vehicleId the primary key for the new vehicle_ catalogue
	* @return the new vehicle_ catalogue
	*/
	public static Vehicle_Catalogue create(long vehicleId) {
		return getPersistence().create(vehicleId);
	}

	/**
	* Removes the vehicle_ catalogue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue that was removed
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public static Vehicle_Catalogue remove(long vehicleId)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence().remove(vehicleId);
	}

	public static Vehicle_Catalogue updateImpl(
		Vehicle_Catalogue vehicle_Catalogue) {
		return getPersistence().updateImpl(vehicle_Catalogue);
	}

	/**
	* Returns the vehicle_ catalogue with the primary key or throws a {@link NoSuchVehicle_CatalogueException} if it could not be found.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public static Vehicle_Catalogue findByPrimaryKey(long vehicleId)
		throws com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException {
		return getPersistence().findByPrimaryKey(vehicleId);
	}

	/**
	* Returns the vehicle_ catalogue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue, or <code>null</code> if a vehicle_ catalogue with the primary key could not be found
	*/
	public static Vehicle_Catalogue fetchByPrimaryKey(long vehicleId) {
		return getPersistence().fetchByPrimaryKey(vehicleId);
	}

	public static java.util.Map<java.io.Serializable, Vehicle_Catalogue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vehicle_ catalogues.
	*
	* @return the vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vehicle_ catalogues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @return the range of vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vehicle_ catalogues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findAll(int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vehicle_ catalogues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Vehicle_CatalogueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle_ catalogues
	* @param end the upper bound of the range of vehicle_ catalogues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vehicle_ catalogues
	*/
	public static List<Vehicle_Catalogue> findAll(int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vehicle_ catalogues from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vehicle_ catalogues.
	*
	* @return the number of vehicle_ catalogues
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static Vehicle_CataloguePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<Vehicle_CataloguePersistence, Vehicle_CataloguePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Vehicle_CataloguePersistence.class);

		ServiceTracker<Vehicle_CataloguePersistence, Vehicle_CataloguePersistence> serviceTracker =
			new ServiceTracker<Vehicle_CataloguePersistence, Vehicle_CataloguePersistence>(bundle.getBundleContext(),
				Vehicle_CataloguePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}