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

package com.axa.glf.masterdata.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.axa.glf.masterdata.exception.NoSuchVehicle_CatalogueException;
import com.axa.glf.masterdata.model.Vehicle_Catalogue;
import com.axa.glf.masterdata.model.impl.Vehicle_CatalogueImpl;
import com.axa.glf.masterdata.model.impl.Vehicle_CatalogueModelImpl;
import com.axa.glf.masterdata.service.persistence.Vehicle_CataloguePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vehicle_ catalogue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_CataloguePersistence
 * @see com.axa.glf.masterdata.service.persistence.Vehicle_CatalogueUtil
 * @generated
 */
@ProviderType
public class Vehicle_CataloguePersistenceImpl extends BasePersistenceImpl<Vehicle_Catalogue>
	implements Vehicle_CataloguePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Vehicle_CatalogueUtil} to access the vehicle_ catalogue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Vehicle_CatalogueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			Vehicle_CatalogueModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vehicle_ catalogues where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vehicle_ catalogues
	 */
	@Override
	public List<Vehicle_Catalogue> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Vehicle_Catalogue> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Vehicle_Catalogue> findByUuid(String uuid, int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Vehicle_Catalogue> findByUuid(String uuid, int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Vehicle_Catalogue> list = null;

		if (retrieveFromCache) {
			list = (List<Vehicle_Catalogue>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Vehicle_Catalogue vehicle_Catalogue : list) {
					if (!Objects.equals(uuid, vehicle_Catalogue.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VEHICLE_CATALOGUE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Vehicle_CatalogueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Vehicle_Catalogue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Vehicle_Catalogue>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first vehicle_ catalogue in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle_ catalogue
	 * @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue findByUuid_First(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = fetchByUuid_First(uuid,
				orderByComparator);

		if (vehicle_Catalogue != null) {
			return vehicle_Catalogue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchVehicle_CatalogueException(msg.toString());
	}

	/**
	 * Returns the first vehicle_ catalogue in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByUuid_First(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		List<Vehicle_Catalogue> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vehicle_ catalogue in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle_ catalogue
	 * @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue findByUuid_Last(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = fetchByUuid_Last(uuid,
				orderByComparator);

		if (vehicle_Catalogue != null) {
			return vehicle_Catalogue;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchVehicle_CatalogueException(msg.toString());
	}

	/**
	 * Returns the last vehicle_ catalogue in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByUuid_Last(String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Vehicle_Catalogue> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Vehicle_Catalogue[] findByUuid_PrevAndNext(long vehicleId,
		String uuid, OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = findByPrimaryKey(vehicleId);

		Session session = null;

		try {
			session = openSession();

			Vehicle_Catalogue[] array = new Vehicle_CatalogueImpl[3];

			array[0] = getByUuid_PrevAndNext(session, vehicle_Catalogue, uuid,
					orderByComparator, true);

			array[1] = vehicle_Catalogue;

			array[2] = getByUuid_PrevAndNext(session, vehicle_Catalogue, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vehicle_Catalogue getByUuid_PrevAndNext(Session session,
		Vehicle_Catalogue vehicle_Catalogue, String uuid,
		OrderByComparator<Vehicle_Catalogue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VEHICLE_CATALOGUE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(Vehicle_CatalogueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicle_Catalogue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vehicle_Catalogue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle_ catalogues where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Vehicle_Catalogue vehicle_Catalogue : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicle_Catalogue);
		}
	}

	/**
	 * Returns the number of vehicle_ catalogues where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vehicle_ catalogues
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VEHICLE_CATALOGUE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "vehicle_Catalogue.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "vehicle_Catalogue.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(vehicle_Catalogue.uuid IS NULL OR vehicle_Catalogue.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			Vehicle_CatalogueModelImpl.UUID_COLUMN_BITMASK |
			Vehicle_CatalogueModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVehicle_CatalogueException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vehicle_ catalogue
	 * @throws NoSuchVehicle_CatalogueException if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue findByUUID_G(String uuid, long groupId)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = fetchByUUID_G(uuid, groupId);

		if (vehicle_Catalogue == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVehicle_CatalogueException(msg.toString());
		}

		return vehicle_Catalogue;
	}

	/**
	 * Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the vehicle_ catalogue where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Vehicle_Catalogue) {
			Vehicle_Catalogue vehicle_Catalogue = (Vehicle_Catalogue)result;

			if (!Objects.equals(uuid, vehicle_Catalogue.getUuid()) ||
					(groupId != vehicle_Catalogue.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VEHICLE_CATALOGUE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Vehicle_Catalogue> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Vehicle_Catalogue vehicle_Catalogue = list.get(0);

					result = vehicle_Catalogue;

					cacheResult(vehicle_Catalogue);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Vehicle_Catalogue)result;
		}
	}

	/**
	 * Removes the vehicle_ catalogue where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the vehicle_ catalogue that was removed
	 */
	@Override
	public Vehicle_Catalogue removeByUUID_G(String uuid, long groupId)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = findByUUID_G(uuid, groupId);

		return remove(vehicle_Catalogue);
	}

	/**
	 * Returns the number of vehicle_ catalogues where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching vehicle_ catalogues
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VEHICLE_CATALOGUE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "vehicle_Catalogue.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "vehicle_Catalogue.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(vehicle_Catalogue.uuid IS NULL OR vehicle_Catalogue.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "vehicle_Catalogue.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			Vehicle_CatalogueModelImpl.UUID_COLUMN_BITMASK |
			Vehicle_CatalogueModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching vehicle_ catalogues
	 */
	@Override
	public List<Vehicle_Catalogue> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Vehicle_Catalogue> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Vehicle_Catalogue> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Vehicle_Catalogue> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Vehicle_Catalogue> list = null;

		if (retrieveFromCache) {
			list = (List<Vehicle_Catalogue>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Vehicle_Catalogue vehicle_Catalogue : list) {
					if (!Objects.equals(uuid, vehicle_Catalogue.getUuid()) ||
							(companyId != vehicle_Catalogue.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VEHICLE_CATALOGUE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Vehicle_CatalogueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Vehicle_Catalogue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Vehicle_Catalogue>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Vehicle_Catalogue findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (vehicle_Catalogue != null) {
			return vehicle_Catalogue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchVehicle_CatalogueException(msg.toString());
	}

	/**
	 * Returns the first vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		List<Vehicle_Catalogue> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Vehicle_Catalogue findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (vehicle_Catalogue != null) {
			return vehicle_Catalogue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchVehicle_CatalogueException(msg.toString());
	}

	/**
	 * Returns the last vehicle_ catalogue in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vehicle_ catalogue, or <code>null</code> if a matching vehicle_ catalogue could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Vehicle_Catalogue> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Vehicle_Catalogue[] findByUuid_C_PrevAndNext(long vehicleId,
		String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = findByPrimaryKey(vehicleId);

		Session session = null;

		try {
			session = openSession();

			Vehicle_Catalogue[] array = new Vehicle_CatalogueImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, vehicle_Catalogue,
					uuid, companyId, orderByComparator, true);

			array[1] = vehicle_Catalogue;

			array[2] = getByUuid_C_PrevAndNext(session, vehicle_Catalogue,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vehicle_Catalogue getByUuid_C_PrevAndNext(Session session,
		Vehicle_Catalogue vehicle_Catalogue, String uuid, long companyId,
		OrderByComparator<Vehicle_Catalogue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VEHICLE_CATALOGUE_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(Vehicle_CatalogueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vehicle_Catalogue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vehicle_Catalogue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vehicle_ catalogues where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Vehicle_Catalogue vehicle_Catalogue : findByUuid_C(uuid,
				companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vehicle_Catalogue);
		}
	}

	/**
	 * Returns the number of vehicle_ catalogues where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching vehicle_ catalogues
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VEHICLE_CATALOGUE_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "vehicle_Catalogue.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "vehicle_Catalogue.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(vehicle_Catalogue.uuid IS NULL OR vehicle_Catalogue.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "vehicle_Catalogue.companyId = ?";

	public Vehicle_CataloguePersistenceImpl() {
		setModelClass(Vehicle_Catalogue.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the vehicle_ catalogue in the entity cache if it is enabled.
	 *
	 * @param vehicle_Catalogue the vehicle_ catalogue
	 */
	@Override
	public void cacheResult(Vehicle_Catalogue vehicle_Catalogue) {
		entityCache.putResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class, vehicle_Catalogue.getPrimaryKey(),
			vehicle_Catalogue);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				vehicle_Catalogue.getUuid(), vehicle_Catalogue.getGroupId()
			}, vehicle_Catalogue);

		vehicle_Catalogue.resetOriginalValues();
	}

	/**
	 * Caches the vehicle_ catalogues in the entity cache if it is enabled.
	 *
	 * @param vehicle_Catalogues the vehicle_ catalogues
	 */
	@Override
	public void cacheResult(List<Vehicle_Catalogue> vehicle_Catalogues) {
		for (Vehicle_Catalogue vehicle_Catalogue : vehicle_Catalogues) {
			if (entityCache.getResult(
						Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
						Vehicle_CatalogueImpl.class,
						vehicle_Catalogue.getPrimaryKey()) == null) {
				cacheResult(vehicle_Catalogue);
			}
			else {
				vehicle_Catalogue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vehicle_ catalogues.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Vehicle_CatalogueImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vehicle_ catalogue.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Vehicle_Catalogue vehicle_Catalogue) {
		entityCache.removeResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class, vehicle_Catalogue.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((Vehicle_CatalogueModelImpl)vehicle_Catalogue,
			true);
	}

	@Override
	public void clearCache(List<Vehicle_Catalogue> vehicle_Catalogues) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Vehicle_Catalogue vehicle_Catalogue : vehicle_Catalogues) {
			entityCache.removeResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
				Vehicle_CatalogueImpl.class, vehicle_Catalogue.getPrimaryKey());

			clearUniqueFindersCache((Vehicle_CatalogueModelImpl)vehicle_Catalogue,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		Vehicle_CatalogueModelImpl vehicle_CatalogueModelImpl) {
		Object[] args = new Object[] {
				vehicle_CatalogueModelImpl.getUuid(),
				vehicle_CatalogueModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			vehicle_CatalogueModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		Vehicle_CatalogueModelImpl vehicle_CatalogueModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vehicle_CatalogueModelImpl.getUuid(),
					vehicle_CatalogueModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((vehicle_CatalogueModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vehicle_CatalogueModelImpl.getOriginalUuid(),
					vehicle_CatalogueModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new vehicle_ catalogue with the primary key. Does not add the vehicle_ catalogue to the database.
	 *
	 * @param vehicleId the primary key for the new vehicle_ catalogue
	 * @return the new vehicle_ catalogue
	 */
	@Override
	public Vehicle_Catalogue create(long vehicleId) {
		Vehicle_Catalogue vehicle_Catalogue = new Vehicle_CatalogueImpl();

		vehicle_Catalogue.setNew(true);
		vehicle_Catalogue.setPrimaryKey(vehicleId);

		String uuid = PortalUUIDUtil.generate();

		vehicle_Catalogue.setUuid(uuid);

		vehicle_Catalogue.setCompanyId(companyProvider.getCompanyId());

		return vehicle_Catalogue;
	}

	/**
	 * Removes the vehicle_ catalogue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vehicleId the primary key of the vehicle_ catalogue
	 * @return the vehicle_ catalogue that was removed
	 * @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	 */
	@Override
	public Vehicle_Catalogue remove(long vehicleId)
		throws NoSuchVehicle_CatalogueException {
		return remove((Serializable)vehicleId);
	}

	/**
	 * Removes the vehicle_ catalogue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vehicle_ catalogue
	 * @return the vehicle_ catalogue that was removed
	 * @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	 */
	@Override
	public Vehicle_Catalogue remove(Serializable primaryKey)
		throws NoSuchVehicle_CatalogueException {
		Session session = null;

		try {
			session = openSession();

			Vehicle_Catalogue vehicle_Catalogue = (Vehicle_Catalogue)session.get(Vehicle_CatalogueImpl.class,
					primaryKey);

			if (vehicle_Catalogue == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVehicle_CatalogueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vehicle_Catalogue);
		}
		catch (NoSuchVehicle_CatalogueException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Vehicle_Catalogue removeImpl(Vehicle_Catalogue vehicle_Catalogue) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vehicle_Catalogue)) {
				vehicle_Catalogue = (Vehicle_Catalogue)session.get(Vehicle_CatalogueImpl.class,
						vehicle_Catalogue.getPrimaryKeyObj());
			}

			if (vehicle_Catalogue != null) {
				session.delete(vehicle_Catalogue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vehicle_Catalogue != null) {
			clearCache(vehicle_Catalogue);
		}

		return vehicle_Catalogue;
	}

	@Override
	public Vehicle_Catalogue updateImpl(Vehicle_Catalogue vehicle_Catalogue) {
		boolean isNew = vehicle_Catalogue.isNew();

		if (!(vehicle_Catalogue instanceof Vehicle_CatalogueModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(vehicle_Catalogue.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(vehicle_Catalogue);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in vehicle_Catalogue proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Vehicle_Catalogue implementation " +
				vehicle_Catalogue.getClass());
		}

		Vehicle_CatalogueModelImpl vehicle_CatalogueModelImpl = (Vehicle_CatalogueModelImpl)vehicle_Catalogue;

		if (Validator.isNull(vehicle_Catalogue.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			vehicle_Catalogue.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (vehicle_Catalogue.getCreateDate() == null)) {
			if (serviceContext == null) {
				vehicle_Catalogue.setCreateDate(now);
			}
			else {
				vehicle_Catalogue.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!vehicle_CatalogueModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				vehicle_Catalogue.setModifiedDate(now);
			}
			else {
				vehicle_Catalogue.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (vehicle_Catalogue.isNew()) {
				session.save(vehicle_Catalogue);

				vehicle_Catalogue.setNew(false);
			}
			else {
				vehicle_Catalogue = (Vehicle_Catalogue)session.merge(vehicle_Catalogue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!Vehicle_CatalogueModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { vehicle_CatalogueModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					vehicle_CatalogueModelImpl.getUuid(),
					vehicle_CatalogueModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((vehicle_CatalogueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicle_CatalogueModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { vehicle_CatalogueModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((vehicle_CatalogueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vehicle_CatalogueModelImpl.getOriginalUuid(),
						vehicle_CatalogueModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						vehicle_CatalogueModelImpl.getUuid(),
						vehicle_CatalogueModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		entityCache.putResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
			Vehicle_CatalogueImpl.class, vehicle_Catalogue.getPrimaryKey(),
			vehicle_Catalogue, false);

		clearUniqueFindersCache(vehicle_CatalogueModelImpl, false);
		cacheUniqueFindersCache(vehicle_CatalogueModelImpl);

		vehicle_Catalogue.resetOriginalValues();

		return vehicle_Catalogue;
	}

	/**
	 * Returns the vehicle_ catalogue with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle_ catalogue
	 * @return the vehicle_ catalogue
	 * @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	 */
	@Override
	public Vehicle_Catalogue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVehicle_CatalogueException {
		Vehicle_Catalogue vehicle_Catalogue = fetchByPrimaryKey(primaryKey);

		if (vehicle_Catalogue == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVehicle_CatalogueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vehicle_Catalogue;
	}

	/**
	 * Returns the vehicle_ catalogue with the primary key or throws a {@link NoSuchVehicle_CatalogueException} if it could not be found.
	 *
	 * @param vehicleId the primary key of the vehicle_ catalogue
	 * @return the vehicle_ catalogue
	 * @throws NoSuchVehicle_CatalogueException if a vehicle_ catalogue with the primary key could not be found
	 */
	@Override
	public Vehicle_Catalogue findByPrimaryKey(long vehicleId)
		throws NoSuchVehicle_CatalogueException {
		return findByPrimaryKey((Serializable)vehicleId);
	}

	/**
	 * Returns the vehicle_ catalogue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vehicle_ catalogue
	 * @return the vehicle_ catalogue, or <code>null</code> if a vehicle_ catalogue with the primary key could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
				Vehicle_CatalogueImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Vehicle_Catalogue vehicle_Catalogue = (Vehicle_Catalogue)serializable;

		if (vehicle_Catalogue == null) {
			Session session = null;

			try {
				session = openSession();

				vehicle_Catalogue = (Vehicle_Catalogue)session.get(Vehicle_CatalogueImpl.class,
						primaryKey);

				if (vehicle_Catalogue != null) {
					cacheResult(vehicle_Catalogue);
				}
				else {
					entityCache.putResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
						Vehicle_CatalogueImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
					Vehicle_CatalogueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vehicle_Catalogue;
	}

	/**
	 * Returns the vehicle_ catalogue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vehicleId the primary key of the vehicle_ catalogue
	 * @return the vehicle_ catalogue, or <code>null</code> if a vehicle_ catalogue with the primary key could not be found
	 */
	@Override
	public Vehicle_Catalogue fetchByPrimaryKey(long vehicleId) {
		return fetchByPrimaryKey((Serializable)vehicleId);
	}

	@Override
	public Map<Serializable, Vehicle_Catalogue> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Vehicle_Catalogue> map = new HashMap<Serializable, Vehicle_Catalogue>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Vehicle_Catalogue vehicle_Catalogue = fetchByPrimaryKey(primaryKey);

			if (vehicle_Catalogue != null) {
				map.put(primaryKey, vehicle_Catalogue);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
					Vehicle_CatalogueImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Vehicle_Catalogue)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VEHICLE_CATALOGUE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Vehicle_Catalogue vehicle_Catalogue : (List<Vehicle_Catalogue>)q.list()) {
				map.put(vehicle_Catalogue.getPrimaryKeyObj(), vehicle_Catalogue);

				cacheResult(vehicle_Catalogue);

				uncachedPrimaryKeys.remove(vehicle_Catalogue.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(Vehicle_CatalogueModelImpl.ENTITY_CACHE_ENABLED,
					Vehicle_CatalogueImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the vehicle_ catalogues.
	 *
	 * @return the vehicle_ catalogues
	 */
	@Override
	public List<Vehicle_Catalogue> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Vehicle_Catalogue> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Vehicle_Catalogue> findAll(int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Vehicle_Catalogue> findAll(int start, int end,
		OrderByComparator<Vehicle_Catalogue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Vehicle_Catalogue> list = null;

		if (retrieveFromCache) {
			list = (List<Vehicle_Catalogue>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VEHICLE_CATALOGUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VEHICLE_CATALOGUE;

				if (pagination) {
					sql = sql.concat(Vehicle_CatalogueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Vehicle_Catalogue>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Vehicle_Catalogue>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the vehicle_ catalogues from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Vehicle_Catalogue vehicle_Catalogue : findAll()) {
			remove(vehicle_Catalogue);
		}
	}

	/**
	 * Returns the number of vehicle_ catalogues.
	 *
	 * @return the number of vehicle_ catalogues
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VEHICLE_CATALOGUE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return Vehicle_CatalogueModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vehicle_ catalogue persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(Vehicle_CatalogueImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VEHICLE_CATALOGUE = "SELECT vehicle_Catalogue FROM Vehicle_Catalogue vehicle_Catalogue";
	private static final String _SQL_SELECT_VEHICLE_CATALOGUE_WHERE_PKS_IN = "SELECT vehicle_Catalogue FROM Vehicle_Catalogue vehicle_Catalogue WHERE vehicleId IN (";
	private static final String _SQL_SELECT_VEHICLE_CATALOGUE_WHERE = "SELECT vehicle_Catalogue FROM Vehicle_Catalogue vehicle_Catalogue WHERE ";
	private static final String _SQL_COUNT_VEHICLE_CATALOGUE = "SELECT COUNT(vehicle_Catalogue) FROM Vehicle_Catalogue vehicle_Catalogue";
	private static final String _SQL_COUNT_VEHICLE_CATALOGUE_WHERE = "SELECT COUNT(vehicle_Catalogue) FROM Vehicle_Catalogue vehicle_Catalogue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vehicle_Catalogue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Vehicle_Catalogue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Vehicle_Catalogue exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(Vehicle_CataloguePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}