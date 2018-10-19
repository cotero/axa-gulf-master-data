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

import com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException;
import com.axa.glf.masterdata.model.Vehicle_Catalogue;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vehicle_ catalogue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.axa.glf.masterdata.service.persistence.impl.Vehicle_CataloguePersistenceImpl
 * @see Vehicle_CatalogueUtil
 * @generated
 */
@ProviderType
public interface Vehicle_CataloguePersistence extends BasePersistence<Vehicle_Catalogue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Vehicle_CatalogueUtil} to access the vehicle_ catalogue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vehicle_ catalogues where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vehicle_ catalogues
	*/
	public java.util.List<Vehicle_Catalogue> findByUuid(String uuid);

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
	public java.util.List<Vehicle_Catalogue> findByUuid(String uuid, int start,
		int end);

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
	public java.util.List<Vehicle_Catalogue> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

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
	public java.util.List<Vehicle_Catalogue> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

	/**
	* Returns the vehicle_ catalogues before and after the current vehicle_ catalogue in the ordered set where uuid = &#63;.
	*
	* @param vehicleId the primary key of the current vehicle_ catalogue
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public Vehicle_Catalogue[] findByUuid_PrevAndNext(long vehicleId,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Removes all the vehicle_ catalogues where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of vehicle_ catalogues where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vehicle_ catalogues
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVehicle_CatalogueException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue findByUUID_G(String uuid, long groupId)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the vehicle_ catalogue where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vehicle_ catalogue that was removed
	*/
	public Vehicle_Catalogue removeByUUID_G(String uuid, long groupId)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the number of vehicle_ catalogues where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vehicle_ catalogues
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vehicle_ catalogues
	*/
	public java.util.List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId);

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
	public java.util.List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

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
	public java.util.List<Vehicle_Catalogue> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the first vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the last vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	*/
	public Vehicle_Catalogue fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

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
	public Vehicle_Catalogue[] findByUuid_C_PrevAndNext(long vehicleId,
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Removes all the vehicle_ catalogues where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vehicle_ catalogues
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Caches the vehicle_ catalogue in the entity cache if it is enabled.
	*
	* @param vehicle_Catalogue the vehicle_ catalogue
	*/
	public void cacheResult(Vehicle_Catalogue vehicle_Catalogue);

	/**
	* Caches the vehicle_ catalogues in the entity cache if it is enabled.
	*
	* @param vehicle_Catalogues the vehicle_ catalogues
	*/
	public void cacheResult(
		java.util.List<Vehicle_Catalogue> vehicle_Catalogues);

	/**
	* Creates a new vehicle_ catalogue with the primary key. Does not add the vehicle_ catalogue to the database.
	*
	* @param vehicleId the primary key for the new vehicle_ catalogue
	* @return the new vehicle_ catalogue
	*/
	public Vehicle_Catalogue create(long vehicleId);

	/**
	* Removes the vehicle_ catalogue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue that was removed
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public Vehicle_Catalogue remove(long vehicleId)
		throws NoSuchVehicle_CatalogueException;

	public Vehicle_Catalogue updateImpl(Vehicle_Catalogue vehicle_Catalogue);

	/**
	* Returns the vehicle_ catalogue with the primary key or throws a {@link NoSuchVehicle_CatalogueException} if it could not be found.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue
	* @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	*/
	public Vehicle_Catalogue findByPrimaryKey(long vehicleId)
		throws NoSuchVehicle_CatalogueException;

	/**
	* Returns the vehicle_ catalogue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vehicleId the primary key of the vehicle_ catalogue
	* @return the vehicle_ catalogue, or <code>null</code> if a vehicle_ catalogue with the primary key could not be found
	*/
	public Vehicle_Catalogue fetchByPrimaryKey(long vehicleId);

	@Override
	public java.util.Map<java.io.Serializable, Vehicle_Catalogue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vehicle_ catalogues.
	*
	* @return the vehicle_ catalogues
	*/
	public java.util.List<Vehicle_Catalogue> findAll();

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
	public java.util.List<Vehicle_Catalogue> findAll(int start, int end);

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
	public java.util.List<Vehicle_Catalogue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator);

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
	public java.util.List<Vehicle_Catalogue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vehicle_ catalogues from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vehicle_ catalogues.
	*
	* @return the number of vehicle_ catalogues
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}