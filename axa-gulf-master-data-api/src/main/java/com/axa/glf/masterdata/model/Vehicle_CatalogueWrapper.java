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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Vehicle_Catalogue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_Catalogue
 * @generated
 */
@ProviderType
public class Vehicle_CatalogueWrapper implements Vehicle_Catalogue,
	ModelWrapper<Vehicle_Catalogue> {
	public Vehicle_CatalogueWrapper(Vehicle_Catalogue vehicle_Catalogue) {
		_vehicle_Catalogue = vehicle_Catalogue;
	}

	@Override
	public Class<?> getModelClass() {
		return Vehicle_Catalogue.class;
	}

	@Override
	public String getModelClassName() {
		return Vehicle_Catalogue.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("vehicleId", getVehicleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("automobile_cat_code", getAutomobile_cat_code());
		attributes.put("automobile_maker_code", getAutomobile_maker_code());
		attributes.put("automobile_maker_name", getAutomobile_maker_name());
		attributes.put("automobile_model_code", getAutomobile_model_code());
		attributes.put("automobile_model_name", getAutomobile_model_name());
		attributes.put("automobile_version_code", getAutomobile_version_code());
		attributes.put("automobile_version_name", getAutomobile_version_name());
		attributes.put("automobile_sub_type_name", getAutomobile_sub_type_name());
		attributes.put("automobile_usage_type_name",
			getAutomobile_usage_type_name());
		attributes.put("automobile_body_type_name",
			getAutomobile_body_type_name());
		attributes.put("automobile_body_type_desc",
			getAutomobile_body_type_desc());
		attributes.put("automobile_fuel_type_name",
			getAutomobile_fuel_type_name());
		attributes.put("automobile_type_name", getAutomobile_type_name());
		attributes.put("power", getPower());
		attributes.put("width", getWidth());
		attributes.put("surface", getSurface());
		attributes.put("weight", getWeight());
		attributes.put("vehicle_value", getVehicle_value());
		attributes.put("engine_cc", getEngine_cc());
		attributes.put("rate_category", getRate_category());
		attributes.put("doors", getDoors());
		attributes.put("allowed", getAllowed());
		attributes.put("no_of_cylinder", getNo_of_cylinder());
		attributes.put("restricted", getRestricted());
		attributes.put("no_of_seats", getNo_of_seats());
		attributes.put("engine_type", getEngine_type());
		attributes.put("transmission_type", getTransmission_type());
		attributes.put("no_of_gears", getNo_of_gears());
		attributes.put("final_drive", getFinal_drive());
		attributes.put("no_of_axels", getNo_of_axels());
		attributes.put("lower_threshold", getLower_threshold());
		attributes.put("upper_threshold", getUpper_threshold());
		attributes.put("depreciation_flat", getDepreciation_flat());
		attributes.put("value", getValue());
		attributes.put("_1st_yr_dep_per", get_1st_yr_dep_per());
		attributes.put("_2nd_yr_dep_per", get_2nd_yr_dep_per());
		attributes.put("_3rd_yr_dep_per", get_3rd_yr_dep_per());
		attributes.put("_4th_yr_dep_per", get_4th_yr_dep_per());
		attributes.put("_5th_yr_dep_per", get_5th_yr_dep_per());
		attributes.put("_6th_yr_dep_per", get_6th_yr_dep_per());
		attributes.put("_7th_yr_dep_per", get_7th_yr_dep_per());
		attributes.put("_8th_yr_dep_per", get_8th_yr_dep_per());
		attributes.put("_9th_yr_dep_per", get_9th_yr_dep_per());
		attributes.put("_10th_yr_dep_per", get_10th_yr_dep_per());
		attributes.put("_11th_yr_dep_per", get_11th_yr_dep_per());
		attributes.put("_12th_yr_dep_per", get_12th_yr_dep_per());
		attributes.put("_13th_yr_dep_per", get_13th_yr_dep_per());
		attributes.put("_14th_yr_dep_per", get_14th_yr_dep_per());
		attributes.put("_1st_yr_dep_val", get_1st_yr_dep_val());
		attributes.put("_2nd_yr_dep_val", get_2nd_yr_dep_val());
		attributes.put("_3rd_yr_dep_val", get_3rd_yr_dep_val());
		attributes.put("_4th_yr_dep_val", get_4th_yr_dep_val());
		attributes.put("_5th_yr_dep_val", get_5th_yr_dep_val());
		attributes.put("_6th_yr_dep_val", get_6th_yr_dep_val());
		attributes.put("_7th_yr_dep_val", get_7th_yr_dep_val());
		attributes.put("_8th_yr_dep_val", get_8th_yr_dep_val());
		attributes.put("_9th_yr_dep_val", get_9th_yr_dep_val());
		attributes.put("_10th_yr_dep_val", get_10th_yr_dep_val());
		attributes.put("_11th_yr_dep_val", get_11th_yr_dep_val());
		attributes.put("_12th_yr_dep_val", get_12th_yr_dep_val());
		attributes.put("_13th_yr_dep_val", get_13th_yr_dep_val());
		attributes.put("_14th_yr_dep_val", get_14th_yr_dep_val());
		attributes.put("_1st_yr_flat_val", get_1st_yr_flat_val());
		attributes.put("_2nd_yr_flat_val", get_2nd_yr_flat_val());
		attributes.put("_3rd_yr_flat_val", get_3rd_yr_flat_val());
		attributes.put("_4th_yr_flat_val", get_4th_yr_flat_val());
		attributes.put("_5th_yr_flat_val", get_5th_yr_flat_val());
		attributes.put("_6th_yr_flat_val", get_6th_yr_flat_val());
		attributes.put("_7th_yr_flat_val", get_7th_yr_flat_val());
		attributes.put("_8th_yr_flat_val", get_8th_yr_flat_val());
		attributes.put("_9th_yr_flat_val", get_9th_yr_flat_val());
		attributes.put("_10th_yr_flat_val", get_10th_yr_flat_val());
		attributes.put("_11th_yr_flat_val", get_11th_yr_flat_val());
		attributes.put("_12th_yr_flat_val", get_12th_yr_flat_val());
		attributes.put("_13th_yr_flat_val", get_13th_yr_flat_val());
		attributes.put("_14th_yr_flat_val", get_14th_yr_flat_val());
		attributes.put("default_flag", getDefault_flag());
		attributes.put("country_name", getCountry_name());
		attributes.put("enddate", getEnddate());
		attributes.put("order_sequence", getOrder_sequence());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long vehicleId = (Long)attributes.get("vehicleId");

		if (vehicleId != null) {
			setVehicleId(vehicleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String automobile_cat_code = (String)attributes.get(
				"automobile_cat_code");

		if (automobile_cat_code != null) {
			setAutomobile_cat_code(automobile_cat_code);
		}

		String automobile_maker_code = (String)attributes.get(
				"automobile_maker_code");

		if (automobile_maker_code != null) {
			setAutomobile_maker_code(automobile_maker_code);
		}

		String automobile_maker_name = (String)attributes.get(
				"automobile_maker_name");

		if (automobile_maker_name != null) {
			setAutomobile_maker_name(automobile_maker_name);
		}

		String automobile_model_code = (String)attributes.get(
				"automobile_model_code");

		if (automobile_model_code != null) {
			setAutomobile_model_code(automobile_model_code);
		}

		String automobile_model_name = (String)attributes.get(
				"automobile_model_name");

		if (automobile_model_name != null) {
			setAutomobile_model_name(automobile_model_name);
		}

		String automobile_version_code = (String)attributes.get(
				"automobile_version_code");

		if (automobile_version_code != null) {
			setAutomobile_version_code(automobile_version_code);
		}

		String automobile_version_name = (String)attributes.get(
				"automobile_version_name");

		if (automobile_version_name != null) {
			setAutomobile_version_name(automobile_version_name);
		}

		String automobile_sub_type_name = (String)attributes.get(
				"automobile_sub_type_name");

		if (automobile_sub_type_name != null) {
			setAutomobile_sub_type_name(automobile_sub_type_name);
		}

		String automobile_usage_type_name = (String)attributes.get(
				"automobile_usage_type_name");

		if (automobile_usage_type_name != null) {
			setAutomobile_usage_type_name(automobile_usage_type_name);
		}

		String automobile_body_type_name = (String)attributes.get(
				"automobile_body_type_name");

		if (automobile_body_type_name != null) {
			setAutomobile_body_type_name(automobile_body_type_name);
		}

		String automobile_body_type_desc = (String)attributes.get(
				"automobile_body_type_desc");

		if (automobile_body_type_desc != null) {
			setAutomobile_body_type_desc(automobile_body_type_desc);
		}

		String automobile_fuel_type_name = (String)attributes.get(
				"automobile_fuel_type_name");

		if (automobile_fuel_type_name != null) {
			setAutomobile_fuel_type_name(automobile_fuel_type_name);
		}

		String automobile_type_name = (String)attributes.get(
				"automobile_type_name");

		if (automobile_type_name != null) {
			setAutomobile_type_name(automobile_type_name);
		}

		String power = (String)attributes.get("power");

		if (power != null) {
			setPower(power);
		}

		String width = (String)attributes.get("width");

		if (width != null) {
			setWidth(width);
		}

		String surface = (String)attributes.get("surface");

		if (surface != null) {
			setSurface(surface);
		}

		String weight = (String)attributes.get("weight");

		if (weight != null) {
			setWeight(weight);
		}

		String vehicle_value = (String)attributes.get("vehicle_value");

		if (vehicle_value != null) {
			setVehicle_value(vehicle_value);
		}

		String engine_cc = (String)attributes.get("engine_cc");

		if (engine_cc != null) {
			setEngine_cc(engine_cc);
		}

		String rate_category = (String)attributes.get("rate_category");

		if (rate_category != null) {
			setRate_category(rate_category);
		}

		String doors = (String)attributes.get("doors");

		if (doors != null) {
			setDoors(doors);
		}

		String allowed = (String)attributes.get("allowed");

		if (allowed != null) {
			setAllowed(allowed);
		}

		String no_of_cylinder = (String)attributes.get("no_of_cylinder");

		if (no_of_cylinder != null) {
			setNo_of_cylinder(no_of_cylinder);
		}

		String restricted = (String)attributes.get("restricted");

		if (restricted != null) {
			setRestricted(restricted);
		}

		String no_of_seats = (String)attributes.get("no_of_seats");

		if (no_of_seats != null) {
			setNo_of_seats(no_of_seats);
		}

		String engine_type = (String)attributes.get("engine_type");

		if (engine_type != null) {
			setEngine_type(engine_type);
		}

		String transmission_type = (String)attributes.get("transmission_type");

		if (transmission_type != null) {
			setTransmission_type(transmission_type);
		}

		String no_of_gears = (String)attributes.get("no_of_gears");

		if (no_of_gears != null) {
			setNo_of_gears(no_of_gears);
		}

		String final_drive = (String)attributes.get("final_drive");

		if (final_drive != null) {
			setFinal_drive(final_drive);
		}

		String no_of_axels = (String)attributes.get("no_of_axels");

		if (no_of_axels != null) {
			setNo_of_axels(no_of_axels);
		}

		String lower_threshold = (String)attributes.get("lower_threshold");

		if (lower_threshold != null) {
			setLower_threshold(lower_threshold);
		}

		String upper_threshold = (String)attributes.get("upper_threshold");

		if (upper_threshold != null) {
			setUpper_threshold(upper_threshold);
		}

		String depreciation_flat = (String)attributes.get("depreciation_flat");

		if (depreciation_flat != null) {
			setDepreciation_flat(depreciation_flat);
		}

		String value = (String)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		String _1st_yr_dep_per = (String)attributes.get("_1st_yr_dep_per");

		if (_1st_yr_dep_per != null) {
			set_1st_yr_dep_per(_1st_yr_dep_per);
		}

		String _2nd_yr_dep_per = (String)attributes.get("_2nd_yr_dep_per");

		if (_2nd_yr_dep_per != null) {
			set_2nd_yr_dep_per(_2nd_yr_dep_per);
		}

		String _3rd_yr_dep_per = (String)attributes.get("_3rd_yr_dep_per");

		if (_3rd_yr_dep_per != null) {
			set_3rd_yr_dep_per(_3rd_yr_dep_per);
		}

		String _4th_yr_dep_per = (String)attributes.get("_4th_yr_dep_per");

		if (_4th_yr_dep_per != null) {
			set_4th_yr_dep_per(_4th_yr_dep_per);
		}

		String _5th_yr_dep_per = (String)attributes.get("_5th_yr_dep_per");

		if (_5th_yr_dep_per != null) {
			set_5th_yr_dep_per(_5th_yr_dep_per);
		}

		String _6th_yr_dep_per = (String)attributes.get("_6th_yr_dep_per");

		if (_6th_yr_dep_per != null) {
			set_6th_yr_dep_per(_6th_yr_dep_per);
		}

		String _7th_yr_dep_per = (String)attributes.get("_7th_yr_dep_per");

		if (_7th_yr_dep_per != null) {
			set_7th_yr_dep_per(_7th_yr_dep_per);
		}

		String _8th_yr_dep_per = (String)attributes.get("_8th_yr_dep_per");

		if (_8th_yr_dep_per != null) {
			set_8th_yr_dep_per(_8th_yr_dep_per);
		}

		String _9th_yr_dep_per = (String)attributes.get("_9th_yr_dep_per");

		if (_9th_yr_dep_per != null) {
			set_9th_yr_dep_per(_9th_yr_dep_per);
		}

		String _10th_yr_dep_per = (String)attributes.get("_10th_yr_dep_per");

		if (_10th_yr_dep_per != null) {
			set_10th_yr_dep_per(_10th_yr_dep_per);
		}

		String _11th_yr_dep_per = (String)attributes.get("_11th_yr_dep_per");

		if (_11th_yr_dep_per != null) {
			set_11th_yr_dep_per(_11th_yr_dep_per);
		}

		String _12th_yr_dep_per = (String)attributes.get("_12th_yr_dep_per");

		if (_12th_yr_dep_per != null) {
			set_12th_yr_dep_per(_12th_yr_dep_per);
		}

		String _13th_yr_dep_per = (String)attributes.get("_13th_yr_dep_per");

		if (_13th_yr_dep_per != null) {
			set_13th_yr_dep_per(_13th_yr_dep_per);
		}

		String _14th_yr_dep_per = (String)attributes.get("_14th_yr_dep_per");

		if (_14th_yr_dep_per != null) {
			set_14th_yr_dep_per(_14th_yr_dep_per);
		}

		String _1st_yr_dep_val = (String)attributes.get("_1st_yr_dep_val");

		if (_1st_yr_dep_val != null) {
			set_1st_yr_dep_val(_1st_yr_dep_val);
		}

		String _2nd_yr_dep_val = (String)attributes.get("_2nd_yr_dep_val");

		if (_2nd_yr_dep_val != null) {
			set_2nd_yr_dep_val(_2nd_yr_dep_val);
		}

		String _3rd_yr_dep_val = (String)attributes.get("_3rd_yr_dep_val");

		if (_3rd_yr_dep_val != null) {
			set_3rd_yr_dep_val(_3rd_yr_dep_val);
		}

		String _4th_yr_dep_val = (String)attributes.get("_4th_yr_dep_val");

		if (_4th_yr_dep_val != null) {
			set_4th_yr_dep_val(_4th_yr_dep_val);
		}

		String _5th_yr_dep_val = (String)attributes.get("_5th_yr_dep_val");

		if (_5th_yr_dep_val != null) {
			set_5th_yr_dep_val(_5th_yr_dep_val);
		}

		String _6th_yr_dep_val = (String)attributes.get("_6th_yr_dep_val");

		if (_6th_yr_dep_val != null) {
			set_6th_yr_dep_val(_6th_yr_dep_val);
		}

		String _7th_yr_dep_val = (String)attributes.get("_7th_yr_dep_val");

		if (_7th_yr_dep_val != null) {
			set_7th_yr_dep_val(_7th_yr_dep_val);
		}

		String _8th_yr_dep_val = (String)attributes.get("_8th_yr_dep_val");

		if (_8th_yr_dep_val != null) {
			set_8th_yr_dep_val(_8th_yr_dep_val);
		}

		String _9th_yr_dep_val = (String)attributes.get("_9th_yr_dep_val");

		if (_9th_yr_dep_val != null) {
			set_9th_yr_dep_val(_9th_yr_dep_val);
		}

		String _10th_yr_dep_val = (String)attributes.get("_10th_yr_dep_val");

		if (_10th_yr_dep_val != null) {
			set_10th_yr_dep_val(_10th_yr_dep_val);
		}

		String _11th_yr_dep_val = (String)attributes.get("_11th_yr_dep_val");

		if (_11th_yr_dep_val != null) {
			set_11th_yr_dep_val(_11th_yr_dep_val);
		}

		String _12th_yr_dep_val = (String)attributes.get("_12th_yr_dep_val");

		if (_12th_yr_dep_val != null) {
			set_12th_yr_dep_val(_12th_yr_dep_val);
		}

		String _13th_yr_dep_val = (String)attributes.get("_13th_yr_dep_val");

		if (_13th_yr_dep_val != null) {
			set_13th_yr_dep_val(_13th_yr_dep_val);
		}

		String _14th_yr_dep_val = (String)attributes.get("_14th_yr_dep_val");

		if (_14th_yr_dep_val != null) {
			set_14th_yr_dep_val(_14th_yr_dep_val);
		}

		String _1st_yr_flat_val = (String)attributes.get("_1st_yr_flat_val");

		if (_1st_yr_flat_val != null) {
			set_1st_yr_flat_val(_1st_yr_flat_val);
		}

		String _2nd_yr_flat_val = (String)attributes.get("_2nd_yr_flat_val");

		if (_2nd_yr_flat_val != null) {
			set_2nd_yr_flat_val(_2nd_yr_flat_val);
		}

		String _3rd_yr_flat_val = (String)attributes.get("_3rd_yr_flat_val");

		if (_3rd_yr_flat_val != null) {
			set_3rd_yr_flat_val(_3rd_yr_flat_val);
		}

		String _4th_yr_flat_val = (String)attributes.get("_4th_yr_flat_val");

		if (_4th_yr_flat_val != null) {
			set_4th_yr_flat_val(_4th_yr_flat_val);
		}

		String _5th_yr_flat_val = (String)attributes.get("_5th_yr_flat_val");

		if (_5th_yr_flat_val != null) {
			set_5th_yr_flat_val(_5th_yr_flat_val);
		}

		String _6th_yr_flat_val = (String)attributes.get("_6th_yr_flat_val");

		if (_6th_yr_flat_val != null) {
			set_6th_yr_flat_val(_6th_yr_flat_val);
		}

		String _7th_yr_flat_val = (String)attributes.get("_7th_yr_flat_val");

		if (_7th_yr_flat_val != null) {
			set_7th_yr_flat_val(_7th_yr_flat_val);
		}

		String _8th_yr_flat_val = (String)attributes.get("_8th_yr_flat_val");

		if (_8th_yr_flat_val != null) {
			set_8th_yr_flat_val(_8th_yr_flat_val);
		}

		String _9th_yr_flat_val = (String)attributes.get("_9th_yr_flat_val");

		if (_9th_yr_flat_val != null) {
			set_9th_yr_flat_val(_9th_yr_flat_val);
		}

		String _10th_yr_flat_val = (String)attributes.get("_10th_yr_flat_val");

		if (_10th_yr_flat_val != null) {
			set_10th_yr_flat_val(_10th_yr_flat_val);
		}

		String _11th_yr_flat_val = (String)attributes.get("_11th_yr_flat_val");

		if (_11th_yr_flat_val != null) {
			set_11th_yr_flat_val(_11th_yr_flat_val);
		}

		String _12th_yr_flat_val = (String)attributes.get("_12th_yr_flat_val");

		if (_12th_yr_flat_val != null) {
			set_12th_yr_flat_val(_12th_yr_flat_val);
		}

		String _13th_yr_flat_val = (String)attributes.get("_13th_yr_flat_val");

		if (_13th_yr_flat_val != null) {
			set_13th_yr_flat_val(_13th_yr_flat_val);
		}

		String _14th_yr_flat_val = (String)attributes.get("_14th_yr_flat_val");

		if (_14th_yr_flat_val != null) {
			set_14th_yr_flat_val(_14th_yr_flat_val);
		}

		String default_flag = (String)attributes.get("default_flag");

		if (default_flag != null) {
			setDefault_flag(default_flag);
		}

		String country_name = (String)attributes.get("country_name");

		if (country_name != null) {
			setCountry_name(country_name);
		}

		String enddate = (String)attributes.get("enddate");

		if (enddate != null) {
			setEnddate(enddate);
		}

		String order_sequence = (String)attributes.get("order_sequence");

		if (order_sequence != null) {
			setOrder_sequence(order_sequence);
		}
	}

	@Override
	public Object clone() {
		return new Vehicle_CatalogueWrapper((Vehicle_Catalogue)_vehicle_Catalogue.clone());
	}

	@Override
	public int compareTo(Vehicle_Catalogue vehicle_Catalogue) {
		return _vehicle_Catalogue.compareTo(vehicle_Catalogue);
	}

	/**
	* Returns the _10th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _10th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_10th_yr_dep_per() {
		return _vehicle_Catalogue.get_10th_yr_dep_per();
	}

	/**
	* Returns the _10th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _10th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_10th_yr_dep_val() {
		return _vehicle_Catalogue.get_10th_yr_dep_val();
	}

	/**
	* Returns the _10th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _10th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_10th_yr_flat_val() {
		return _vehicle_Catalogue.get_10th_yr_flat_val();
	}

	/**
	* Returns the _11th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _11th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_11th_yr_dep_per() {
		return _vehicle_Catalogue.get_11th_yr_dep_per();
	}

	/**
	* Returns the _11th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _11th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_11th_yr_dep_val() {
		return _vehicle_Catalogue.get_11th_yr_dep_val();
	}

	/**
	* Returns the _11th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _11th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_11th_yr_flat_val() {
		return _vehicle_Catalogue.get_11th_yr_flat_val();
	}

	/**
	* Returns the _12th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _12th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_12th_yr_dep_per() {
		return _vehicle_Catalogue.get_12th_yr_dep_per();
	}

	/**
	* Returns the _12th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _12th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_12th_yr_dep_val() {
		return _vehicle_Catalogue.get_12th_yr_dep_val();
	}

	/**
	* Returns the _12th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _12th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_12th_yr_flat_val() {
		return _vehicle_Catalogue.get_12th_yr_flat_val();
	}

	/**
	* Returns the _13th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _13th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_13th_yr_dep_per() {
		return _vehicle_Catalogue.get_13th_yr_dep_per();
	}

	/**
	* Returns the _13th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _13th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_13th_yr_dep_val() {
		return _vehicle_Catalogue.get_13th_yr_dep_val();
	}

	/**
	* Returns the _13th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _13th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_13th_yr_flat_val() {
		return _vehicle_Catalogue.get_13th_yr_flat_val();
	}

	/**
	* Returns the _14th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _14th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_14th_yr_dep_per() {
		return _vehicle_Catalogue.get_14th_yr_dep_per();
	}

	/**
	* Returns the _14th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _14th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_14th_yr_dep_val() {
		return _vehicle_Catalogue.get_14th_yr_dep_val();
	}

	/**
	* Returns the _14th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _14th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_14th_yr_flat_val() {
		return _vehicle_Catalogue.get_14th_yr_flat_val();
	}

	/**
	* Returns the _1st_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _1st_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_1st_yr_dep_per() {
		return _vehicle_Catalogue.get_1st_yr_dep_per();
	}

	/**
	* Returns the _1st_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _1st_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_1st_yr_dep_val() {
		return _vehicle_Catalogue.get_1st_yr_dep_val();
	}

	/**
	* Returns the _1st_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _1st_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_1st_yr_flat_val() {
		return _vehicle_Catalogue.get_1st_yr_flat_val();
	}

	/**
	* Returns the _2nd_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _2nd_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_2nd_yr_dep_per() {
		return _vehicle_Catalogue.get_2nd_yr_dep_per();
	}

	/**
	* Returns the _2nd_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _2nd_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_2nd_yr_dep_val() {
		return _vehicle_Catalogue.get_2nd_yr_dep_val();
	}

	/**
	* Returns the _2nd_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _2nd_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_2nd_yr_flat_val() {
		return _vehicle_Catalogue.get_2nd_yr_flat_val();
	}

	/**
	* Returns the _3rd_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _3rd_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_3rd_yr_dep_per() {
		return _vehicle_Catalogue.get_3rd_yr_dep_per();
	}

	/**
	* Returns the _3rd_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _3rd_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_3rd_yr_dep_val() {
		return _vehicle_Catalogue.get_3rd_yr_dep_val();
	}

	/**
	* Returns the _3rd_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _3rd_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_3rd_yr_flat_val() {
		return _vehicle_Catalogue.get_3rd_yr_flat_val();
	}

	/**
	* Returns the _4th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _4th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_4th_yr_dep_per() {
		return _vehicle_Catalogue.get_4th_yr_dep_per();
	}

	/**
	* Returns the _4th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _4th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_4th_yr_dep_val() {
		return _vehicle_Catalogue.get_4th_yr_dep_val();
	}

	/**
	* Returns the _4th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _4th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_4th_yr_flat_val() {
		return _vehicle_Catalogue.get_4th_yr_flat_val();
	}

	/**
	* Returns the _5th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _5th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_5th_yr_dep_per() {
		return _vehicle_Catalogue.get_5th_yr_dep_per();
	}

	/**
	* Returns the _5th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _5th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_5th_yr_dep_val() {
		return _vehicle_Catalogue.get_5th_yr_dep_val();
	}

	/**
	* Returns the _5th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _5th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_5th_yr_flat_val() {
		return _vehicle_Catalogue.get_5th_yr_flat_val();
	}

	/**
	* Returns the _6th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _6th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_6th_yr_dep_per() {
		return _vehicle_Catalogue.get_6th_yr_dep_per();
	}

	/**
	* Returns the _6th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _6th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_6th_yr_dep_val() {
		return _vehicle_Catalogue.get_6th_yr_dep_val();
	}

	/**
	* Returns the _6th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _6th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_6th_yr_flat_val() {
		return _vehicle_Catalogue.get_6th_yr_flat_val();
	}

	/**
	* Returns the _7th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _7th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_7th_yr_dep_per() {
		return _vehicle_Catalogue.get_7th_yr_dep_per();
	}

	/**
	* Returns the _7th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _7th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_7th_yr_dep_val() {
		return _vehicle_Catalogue.get_7th_yr_dep_val();
	}

	/**
	* Returns the _7th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _7th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_7th_yr_flat_val() {
		return _vehicle_Catalogue.get_7th_yr_flat_val();
	}

	/**
	* Returns the _8th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _8th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_8th_yr_dep_per() {
		return _vehicle_Catalogue.get_8th_yr_dep_per();
	}

	/**
	* Returns the _8th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _8th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_8th_yr_dep_val() {
		return _vehicle_Catalogue.get_8th_yr_dep_val();
	}

	/**
	* Returns the _8th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _8th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_8th_yr_flat_val() {
		return _vehicle_Catalogue.get_8th_yr_flat_val();
	}

	/**
	* Returns the _9th_yr_dep_per of this vehicle_ catalogue.
	*
	* @return the _9th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public String get_9th_yr_dep_per() {
		return _vehicle_Catalogue.get_9th_yr_dep_per();
	}

	/**
	* Returns the _9th_yr_dep_val of this vehicle_ catalogue.
	*
	* @return the _9th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public String get_9th_yr_dep_val() {
		return _vehicle_Catalogue.get_9th_yr_dep_val();
	}

	/**
	* Returns the _9th_yr_flat_val of this vehicle_ catalogue.
	*
	* @return the _9th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public String get_9th_yr_flat_val() {
		return _vehicle_Catalogue.get_9th_yr_flat_val();
	}

	/**
	* Returns the allowed of this vehicle_ catalogue.
	*
	* @return the allowed of this vehicle_ catalogue
	*/
	@Override
	public String getAllowed() {
		return _vehicle_Catalogue.getAllowed();
	}

	/**
	* Returns the automobile_body_type_desc of this vehicle_ catalogue.
	*
	* @return the automobile_body_type_desc of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_body_type_desc() {
		return _vehicle_Catalogue.getAutomobile_body_type_desc();
	}

	/**
	* Returns the automobile_body_type_name of this vehicle_ catalogue.
	*
	* @return the automobile_body_type_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_body_type_name() {
		return _vehicle_Catalogue.getAutomobile_body_type_name();
	}

	/**
	* Returns the automobile_cat_code of this vehicle_ catalogue.
	*
	* @return the automobile_cat_code of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_cat_code() {
		return _vehicle_Catalogue.getAutomobile_cat_code();
	}

	/**
	* Returns the automobile_fuel_type_name of this vehicle_ catalogue.
	*
	* @return the automobile_fuel_type_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_fuel_type_name() {
		return _vehicle_Catalogue.getAutomobile_fuel_type_name();
	}

	/**
	* Returns the automobile_maker_code of this vehicle_ catalogue.
	*
	* @return the automobile_maker_code of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_maker_code() {
		return _vehicle_Catalogue.getAutomobile_maker_code();
	}

	/**
	* Returns the automobile_maker_name of this vehicle_ catalogue.
	*
	* @return the automobile_maker_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_maker_name() {
		return _vehicle_Catalogue.getAutomobile_maker_name();
	}

	/**
	* Returns the automobile_model_code of this vehicle_ catalogue.
	*
	* @return the automobile_model_code of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_model_code() {
		return _vehicle_Catalogue.getAutomobile_model_code();
	}

	/**
	* Returns the automobile_model_name of this vehicle_ catalogue.
	*
	* @return the automobile_model_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_model_name() {
		return _vehicle_Catalogue.getAutomobile_model_name();
	}

	/**
	* Returns the automobile_sub_type_name of this vehicle_ catalogue.
	*
	* @return the automobile_sub_type_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_sub_type_name() {
		return _vehicle_Catalogue.getAutomobile_sub_type_name();
	}

	/**
	* Returns the automobile_type_name of this vehicle_ catalogue.
	*
	* @return the automobile_type_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_type_name() {
		return _vehicle_Catalogue.getAutomobile_type_name();
	}

	/**
	* Returns the automobile_usage_type_name of this vehicle_ catalogue.
	*
	* @return the automobile_usage_type_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_usage_type_name() {
		return _vehicle_Catalogue.getAutomobile_usage_type_name();
	}

	/**
	* Returns the automobile_version_code of this vehicle_ catalogue.
	*
	* @return the automobile_version_code of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_version_code() {
		return _vehicle_Catalogue.getAutomobile_version_code();
	}

	/**
	* Returns the automobile_version_name of this vehicle_ catalogue.
	*
	* @return the automobile_version_name of this vehicle_ catalogue
	*/
	@Override
	public String getAutomobile_version_name() {
		return _vehicle_Catalogue.getAutomobile_version_name();
	}

	/**
	* Returns the company ID of this vehicle_ catalogue.
	*
	* @return the company ID of this vehicle_ catalogue
	*/
	@Override
	public long getCompanyId() {
		return _vehicle_Catalogue.getCompanyId();
	}

	/**
	* Returns the country_name of this vehicle_ catalogue.
	*
	* @return the country_name of this vehicle_ catalogue
	*/
	@Override
	public String getCountry_name() {
		return _vehicle_Catalogue.getCountry_name();
	}

	/**
	* Returns the create date of this vehicle_ catalogue.
	*
	* @return the create date of this vehicle_ catalogue
	*/
	@Override
	public Date getCreateDate() {
		return _vehicle_Catalogue.getCreateDate();
	}

	/**
	* Returns the default_flag of this vehicle_ catalogue.
	*
	* @return the default_flag of this vehicle_ catalogue
	*/
	@Override
	public String getDefault_flag() {
		return _vehicle_Catalogue.getDefault_flag();
	}

	/**
	* Returns the depreciation_flat of this vehicle_ catalogue.
	*
	* @return the depreciation_flat of this vehicle_ catalogue
	*/
	@Override
	public String getDepreciation_flat() {
		return _vehicle_Catalogue.getDepreciation_flat();
	}

	/**
	* Returns the doors of this vehicle_ catalogue.
	*
	* @return the doors of this vehicle_ catalogue
	*/
	@Override
	public String getDoors() {
		return _vehicle_Catalogue.getDoors();
	}

	/**
	* Returns the enddate of this vehicle_ catalogue.
	*
	* @return the enddate of this vehicle_ catalogue
	*/
	@Override
	public String getEnddate() {
		return _vehicle_Catalogue.getEnddate();
	}

	/**
	* Returns the engine_cc of this vehicle_ catalogue.
	*
	* @return the engine_cc of this vehicle_ catalogue
	*/
	@Override
	public String getEngine_cc() {
		return _vehicle_Catalogue.getEngine_cc();
	}

	/**
	* Returns the engine_type of this vehicle_ catalogue.
	*
	* @return the engine_type of this vehicle_ catalogue
	*/
	@Override
	public String getEngine_type() {
		return _vehicle_Catalogue.getEngine_type();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vehicle_Catalogue.getExpandoBridge();
	}

	/**
	* Returns the final_drive of this vehicle_ catalogue.
	*
	* @return the final_drive of this vehicle_ catalogue
	*/
	@Override
	public String getFinal_drive() {
		return _vehicle_Catalogue.getFinal_drive();
	}

	/**
	* Returns the group ID of this vehicle_ catalogue.
	*
	* @return the group ID of this vehicle_ catalogue
	*/
	@Override
	public long getGroupId() {
		return _vehicle_Catalogue.getGroupId();
	}

	/**
	* Returns the lower_threshold of this vehicle_ catalogue.
	*
	* @return the lower_threshold of this vehicle_ catalogue
	*/
	@Override
	public String getLower_threshold() {
		return _vehicle_Catalogue.getLower_threshold();
	}

	/**
	* Returns the modified date of this vehicle_ catalogue.
	*
	* @return the modified date of this vehicle_ catalogue
	*/
	@Override
	public Date getModifiedDate() {
		return _vehicle_Catalogue.getModifiedDate();
	}

	/**
	* Returns the no_of_axels of this vehicle_ catalogue.
	*
	* @return the no_of_axels of this vehicle_ catalogue
	*/
	@Override
	public String getNo_of_axels() {
		return _vehicle_Catalogue.getNo_of_axels();
	}

	/**
	* Returns the no_of_cylinder of this vehicle_ catalogue.
	*
	* @return the no_of_cylinder of this vehicle_ catalogue
	*/
	@Override
	public String getNo_of_cylinder() {
		return _vehicle_Catalogue.getNo_of_cylinder();
	}

	/**
	* Returns the no_of_gears of this vehicle_ catalogue.
	*
	* @return the no_of_gears of this vehicle_ catalogue
	*/
	@Override
	public String getNo_of_gears() {
		return _vehicle_Catalogue.getNo_of_gears();
	}

	/**
	* Returns the no_of_seats of this vehicle_ catalogue.
	*
	* @return the no_of_seats of this vehicle_ catalogue
	*/
	@Override
	public String getNo_of_seats() {
		return _vehicle_Catalogue.getNo_of_seats();
	}

	/**
	* Returns the order_sequence of this vehicle_ catalogue.
	*
	* @return the order_sequence of this vehicle_ catalogue
	*/
	@Override
	public String getOrder_sequence() {
		return _vehicle_Catalogue.getOrder_sequence();
	}

	/**
	* Returns the power of this vehicle_ catalogue.
	*
	* @return the power of this vehicle_ catalogue
	*/
	@Override
	public String getPower() {
		return _vehicle_Catalogue.getPower();
	}

	/**
	* Returns the primary key of this vehicle_ catalogue.
	*
	* @return the primary key of this vehicle_ catalogue
	*/
	@Override
	public long getPrimaryKey() {
		return _vehicle_Catalogue.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vehicle_Catalogue.getPrimaryKeyObj();
	}

	/**
	* Returns the rate_category of this vehicle_ catalogue.
	*
	* @return the rate_category of this vehicle_ catalogue
	*/
	@Override
	public String getRate_category() {
		return _vehicle_Catalogue.getRate_category();
	}

	/**
	* Returns the restricted of this vehicle_ catalogue.
	*
	* @return the restricted of this vehicle_ catalogue
	*/
	@Override
	public String getRestricted() {
		return _vehicle_Catalogue.getRestricted();
	}

	/**
	* Returns the surface of this vehicle_ catalogue.
	*
	* @return the surface of this vehicle_ catalogue
	*/
	@Override
	public String getSurface() {
		return _vehicle_Catalogue.getSurface();
	}

	/**
	* Returns the transmission_type of this vehicle_ catalogue.
	*
	* @return the transmission_type of this vehicle_ catalogue
	*/
	@Override
	public String getTransmission_type() {
		return _vehicle_Catalogue.getTransmission_type();
	}

	/**
	* Returns the upper_threshold of this vehicle_ catalogue.
	*
	* @return the upper_threshold of this vehicle_ catalogue
	*/
	@Override
	public String getUpper_threshold() {
		return _vehicle_Catalogue.getUpper_threshold();
	}

	/**
	* Returns the user ID of this vehicle_ catalogue.
	*
	* @return the user ID of this vehicle_ catalogue
	*/
	@Override
	public long getUserId() {
		return _vehicle_Catalogue.getUserId();
	}

	/**
	* Returns the user name of this vehicle_ catalogue.
	*
	* @return the user name of this vehicle_ catalogue
	*/
	@Override
	public String getUserName() {
		return _vehicle_Catalogue.getUserName();
	}

	/**
	* Returns the user uuid of this vehicle_ catalogue.
	*
	* @return the user uuid of this vehicle_ catalogue
	*/
	@Override
	public String getUserUuid() {
		return _vehicle_Catalogue.getUserUuid();
	}

	/**
	* Returns the uuid of this vehicle_ catalogue.
	*
	* @return the uuid of this vehicle_ catalogue
	*/
	@Override
	public String getUuid() {
		return _vehicle_Catalogue.getUuid();
	}

	/**
	* Returns the value of this vehicle_ catalogue.
	*
	* @return the value of this vehicle_ catalogue
	*/
	@Override
	public String getValue() {
		return _vehicle_Catalogue.getValue();
	}

	/**
	* Returns the vehicle_value of this vehicle_ catalogue.
	*
	* @return the vehicle_value of this vehicle_ catalogue
	*/
	@Override
	public String getVehicle_value() {
		return _vehicle_Catalogue.getVehicle_value();
	}

	/**
	* Returns the vehicle ID of this vehicle_ catalogue.
	*
	* @return the vehicle ID of this vehicle_ catalogue
	*/
	@Override
	public long getVehicleId() {
		return _vehicle_Catalogue.getVehicleId();
	}

	/**
	* Returns the weight of this vehicle_ catalogue.
	*
	* @return the weight of this vehicle_ catalogue
	*/
	@Override
	public String getWeight() {
		return _vehicle_Catalogue.getWeight();
	}

	/**
	* Returns the width of this vehicle_ catalogue.
	*
	* @return the width of this vehicle_ catalogue
	*/
	@Override
	public String getWidth() {
		return _vehicle_Catalogue.getWidth();
	}

	@Override
	public int hashCode() {
		return _vehicle_Catalogue.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _vehicle_Catalogue.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vehicle_Catalogue.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vehicle_Catalogue.isNew();
	}

	@Override
	public void persist() {
		_vehicle_Catalogue.persist();
	}

	/**
	* Sets the _10th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _10th_yr_dep_per the _10th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_10th_yr_dep_per(String _10th_yr_dep_per) {
		_vehicle_Catalogue.set_10th_yr_dep_per(_10th_yr_dep_per);
	}

	/**
	* Sets the _10th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _10th_yr_dep_val the _10th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_10th_yr_dep_val(String _10th_yr_dep_val) {
		_vehicle_Catalogue.set_10th_yr_dep_val(_10th_yr_dep_val);
	}

	/**
	* Sets the _10th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _10th_yr_flat_val the _10th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_10th_yr_flat_val(String _10th_yr_flat_val) {
		_vehicle_Catalogue.set_10th_yr_flat_val(_10th_yr_flat_val);
	}

	/**
	* Sets the _11th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _11th_yr_dep_per the _11th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_11th_yr_dep_per(String _11th_yr_dep_per) {
		_vehicle_Catalogue.set_11th_yr_dep_per(_11th_yr_dep_per);
	}

	/**
	* Sets the _11th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _11th_yr_dep_val the _11th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_11th_yr_dep_val(String _11th_yr_dep_val) {
		_vehicle_Catalogue.set_11th_yr_dep_val(_11th_yr_dep_val);
	}

	/**
	* Sets the _11th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _11th_yr_flat_val the _11th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_11th_yr_flat_val(String _11th_yr_flat_val) {
		_vehicle_Catalogue.set_11th_yr_flat_val(_11th_yr_flat_val);
	}

	/**
	* Sets the _12th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _12th_yr_dep_per the _12th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_12th_yr_dep_per(String _12th_yr_dep_per) {
		_vehicle_Catalogue.set_12th_yr_dep_per(_12th_yr_dep_per);
	}

	/**
	* Sets the _12th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _12th_yr_dep_val the _12th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_12th_yr_dep_val(String _12th_yr_dep_val) {
		_vehicle_Catalogue.set_12th_yr_dep_val(_12th_yr_dep_val);
	}

	/**
	* Sets the _12th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _12th_yr_flat_val the _12th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_12th_yr_flat_val(String _12th_yr_flat_val) {
		_vehicle_Catalogue.set_12th_yr_flat_val(_12th_yr_flat_val);
	}

	/**
	* Sets the _13th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _13th_yr_dep_per the _13th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_13th_yr_dep_per(String _13th_yr_dep_per) {
		_vehicle_Catalogue.set_13th_yr_dep_per(_13th_yr_dep_per);
	}

	/**
	* Sets the _13th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _13th_yr_dep_val the _13th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_13th_yr_dep_val(String _13th_yr_dep_val) {
		_vehicle_Catalogue.set_13th_yr_dep_val(_13th_yr_dep_val);
	}

	/**
	* Sets the _13th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _13th_yr_flat_val the _13th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_13th_yr_flat_val(String _13th_yr_flat_val) {
		_vehicle_Catalogue.set_13th_yr_flat_val(_13th_yr_flat_val);
	}

	/**
	* Sets the _14th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _14th_yr_dep_per the _14th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_14th_yr_dep_per(String _14th_yr_dep_per) {
		_vehicle_Catalogue.set_14th_yr_dep_per(_14th_yr_dep_per);
	}

	/**
	* Sets the _14th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _14th_yr_dep_val the _14th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_14th_yr_dep_val(String _14th_yr_dep_val) {
		_vehicle_Catalogue.set_14th_yr_dep_val(_14th_yr_dep_val);
	}

	/**
	* Sets the _14th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _14th_yr_flat_val the _14th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_14th_yr_flat_val(String _14th_yr_flat_val) {
		_vehicle_Catalogue.set_14th_yr_flat_val(_14th_yr_flat_val);
	}

	/**
	* Sets the _1st_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _1st_yr_dep_per the _1st_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_1st_yr_dep_per(String _1st_yr_dep_per) {
		_vehicle_Catalogue.set_1st_yr_dep_per(_1st_yr_dep_per);
	}

	/**
	* Sets the _1st_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _1st_yr_dep_val the _1st_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_1st_yr_dep_val(String _1st_yr_dep_val) {
		_vehicle_Catalogue.set_1st_yr_dep_val(_1st_yr_dep_val);
	}

	/**
	* Sets the _1st_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _1st_yr_flat_val the _1st_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_1st_yr_flat_val(String _1st_yr_flat_val) {
		_vehicle_Catalogue.set_1st_yr_flat_val(_1st_yr_flat_val);
	}

	/**
	* Sets the _2nd_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _2nd_yr_dep_per the _2nd_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_2nd_yr_dep_per(String _2nd_yr_dep_per) {
		_vehicle_Catalogue.set_2nd_yr_dep_per(_2nd_yr_dep_per);
	}

	/**
	* Sets the _2nd_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _2nd_yr_dep_val the _2nd_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_2nd_yr_dep_val(String _2nd_yr_dep_val) {
		_vehicle_Catalogue.set_2nd_yr_dep_val(_2nd_yr_dep_val);
	}

	/**
	* Sets the _2nd_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _2nd_yr_flat_val the _2nd_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_2nd_yr_flat_val(String _2nd_yr_flat_val) {
		_vehicle_Catalogue.set_2nd_yr_flat_val(_2nd_yr_flat_val);
	}

	/**
	* Sets the _3rd_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _3rd_yr_dep_per the _3rd_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_3rd_yr_dep_per(String _3rd_yr_dep_per) {
		_vehicle_Catalogue.set_3rd_yr_dep_per(_3rd_yr_dep_per);
	}

	/**
	* Sets the _3rd_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _3rd_yr_dep_val the _3rd_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_3rd_yr_dep_val(String _3rd_yr_dep_val) {
		_vehicle_Catalogue.set_3rd_yr_dep_val(_3rd_yr_dep_val);
	}

	/**
	* Sets the _3rd_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _3rd_yr_flat_val the _3rd_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_3rd_yr_flat_val(String _3rd_yr_flat_val) {
		_vehicle_Catalogue.set_3rd_yr_flat_val(_3rd_yr_flat_val);
	}

	/**
	* Sets the _4th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _4th_yr_dep_per the _4th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_4th_yr_dep_per(String _4th_yr_dep_per) {
		_vehicle_Catalogue.set_4th_yr_dep_per(_4th_yr_dep_per);
	}

	/**
	* Sets the _4th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _4th_yr_dep_val the _4th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_4th_yr_dep_val(String _4th_yr_dep_val) {
		_vehicle_Catalogue.set_4th_yr_dep_val(_4th_yr_dep_val);
	}

	/**
	* Sets the _4th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _4th_yr_flat_val the _4th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_4th_yr_flat_val(String _4th_yr_flat_val) {
		_vehicle_Catalogue.set_4th_yr_flat_val(_4th_yr_flat_val);
	}

	/**
	* Sets the _5th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _5th_yr_dep_per the _5th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_5th_yr_dep_per(String _5th_yr_dep_per) {
		_vehicle_Catalogue.set_5th_yr_dep_per(_5th_yr_dep_per);
	}

	/**
	* Sets the _5th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _5th_yr_dep_val the _5th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_5th_yr_dep_val(String _5th_yr_dep_val) {
		_vehicle_Catalogue.set_5th_yr_dep_val(_5th_yr_dep_val);
	}

	/**
	* Sets the _5th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _5th_yr_flat_val the _5th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_5th_yr_flat_val(String _5th_yr_flat_val) {
		_vehicle_Catalogue.set_5th_yr_flat_val(_5th_yr_flat_val);
	}

	/**
	* Sets the _6th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _6th_yr_dep_per the _6th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_6th_yr_dep_per(String _6th_yr_dep_per) {
		_vehicle_Catalogue.set_6th_yr_dep_per(_6th_yr_dep_per);
	}

	/**
	* Sets the _6th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _6th_yr_dep_val the _6th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_6th_yr_dep_val(String _6th_yr_dep_val) {
		_vehicle_Catalogue.set_6th_yr_dep_val(_6th_yr_dep_val);
	}

	/**
	* Sets the _6th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _6th_yr_flat_val the _6th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_6th_yr_flat_val(String _6th_yr_flat_val) {
		_vehicle_Catalogue.set_6th_yr_flat_val(_6th_yr_flat_val);
	}

	/**
	* Sets the _7th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _7th_yr_dep_per the _7th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_7th_yr_dep_per(String _7th_yr_dep_per) {
		_vehicle_Catalogue.set_7th_yr_dep_per(_7th_yr_dep_per);
	}

	/**
	* Sets the _7th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _7th_yr_dep_val the _7th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_7th_yr_dep_val(String _7th_yr_dep_val) {
		_vehicle_Catalogue.set_7th_yr_dep_val(_7th_yr_dep_val);
	}

	/**
	* Sets the _7th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _7th_yr_flat_val the _7th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_7th_yr_flat_val(String _7th_yr_flat_val) {
		_vehicle_Catalogue.set_7th_yr_flat_val(_7th_yr_flat_val);
	}

	/**
	* Sets the _8th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _8th_yr_dep_per the _8th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_8th_yr_dep_per(String _8th_yr_dep_per) {
		_vehicle_Catalogue.set_8th_yr_dep_per(_8th_yr_dep_per);
	}

	/**
	* Sets the _8th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _8th_yr_dep_val the _8th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_8th_yr_dep_val(String _8th_yr_dep_val) {
		_vehicle_Catalogue.set_8th_yr_dep_val(_8th_yr_dep_val);
	}

	/**
	* Sets the _8th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _8th_yr_flat_val the _8th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_8th_yr_flat_val(String _8th_yr_flat_val) {
		_vehicle_Catalogue.set_8th_yr_flat_val(_8th_yr_flat_val);
	}

	/**
	* Sets the _9th_yr_dep_per of this vehicle_ catalogue.
	*
	* @param _9th_yr_dep_per the _9th_yr_dep_per of this vehicle_ catalogue
	*/
	@Override
	public void set_9th_yr_dep_per(String _9th_yr_dep_per) {
		_vehicle_Catalogue.set_9th_yr_dep_per(_9th_yr_dep_per);
	}

	/**
	* Sets the _9th_yr_dep_val of this vehicle_ catalogue.
	*
	* @param _9th_yr_dep_val the _9th_yr_dep_val of this vehicle_ catalogue
	*/
	@Override
	public void set_9th_yr_dep_val(String _9th_yr_dep_val) {
		_vehicle_Catalogue.set_9th_yr_dep_val(_9th_yr_dep_val);
	}

	/**
	* Sets the _9th_yr_flat_val of this vehicle_ catalogue.
	*
	* @param _9th_yr_flat_val the _9th_yr_flat_val of this vehicle_ catalogue
	*/
	@Override
	public void set_9th_yr_flat_val(String _9th_yr_flat_val) {
		_vehicle_Catalogue.set_9th_yr_flat_val(_9th_yr_flat_val);
	}

	/**
	* Sets the allowed of this vehicle_ catalogue.
	*
	* @param allowed the allowed of this vehicle_ catalogue
	*/
	@Override
	public void setAllowed(String allowed) {
		_vehicle_Catalogue.setAllowed(allowed);
	}

	/**
	* Sets the automobile_body_type_desc of this vehicle_ catalogue.
	*
	* @param automobile_body_type_desc the automobile_body_type_desc of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_body_type_desc(String automobile_body_type_desc) {
		_vehicle_Catalogue.setAutomobile_body_type_desc(automobile_body_type_desc);
	}

	/**
	* Sets the automobile_body_type_name of this vehicle_ catalogue.
	*
	* @param automobile_body_type_name the automobile_body_type_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_body_type_name(String automobile_body_type_name) {
		_vehicle_Catalogue.setAutomobile_body_type_name(automobile_body_type_name);
	}

	/**
	* Sets the automobile_cat_code of this vehicle_ catalogue.
	*
	* @param automobile_cat_code the automobile_cat_code of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_cat_code(String automobile_cat_code) {
		_vehicle_Catalogue.setAutomobile_cat_code(automobile_cat_code);
	}

	/**
	* Sets the automobile_fuel_type_name of this vehicle_ catalogue.
	*
	* @param automobile_fuel_type_name the automobile_fuel_type_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_fuel_type_name(String automobile_fuel_type_name) {
		_vehicle_Catalogue.setAutomobile_fuel_type_name(automobile_fuel_type_name);
	}

	/**
	* Sets the automobile_maker_code of this vehicle_ catalogue.
	*
	* @param automobile_maker_code the automobile_maker_code of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_maker_code(String automobile_maker_code) {
		_vehicle_Catalogue.setAutomobile_maker_code(automobile_maker_code);
	}

	/**
	* Sets the automobile_maker_name of this vehicle_ catalogue.
	*
	* @param automobile_maker_name the automobile_maker_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_maker_name(String automobile_maker_name) {
		_vehicle_Catalogue.setAutomobile_maker_name(automobile_maker_name);
	}

	/**
	* Sets the automobile_model_code of this vehicle_ catalogue.
	*
	* @param automobile_model_code the automobile_model_code of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_model_code(String automobile_model_code) {
		_vehicle_Catalogue.setAutomobile_model_code(automobile_model_code);
	}

	/**
	* Sets the automobile_model_name of this vehicle_ catalogue.
	*
	* @param automobile_model_name the automobile_model_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_model_name(String automobile_model_name) {
		_vehicle_Catalogue.setAutomobile_model_name(automobile_model_name);
	}

	/**
	* Sets the automobile_sub_type_name of this vehicle_ catalogue.
	*
	* @param automobile_sub_type_name the automobile_sub_type_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_sub_type_name(String automobile_sub_type_name) {
		_vehicle_Catalogue.setAutomobile_sub_type_name(automobile_sub_type_name);
	}

	/**
	* Sets the automobile_type_name of this vehicle_ catalogue.
	*
	* @param automobile_type_name the automobile_type_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_type_name(String automobile_type_name) {
		_vehicle_Catalogue.setAutomobile_type_name(automobile_type_name);
	}

	/**
	* Sets the automobile_usage_type_name of this vehicle_ catalogue.
	*
	* @param automobile_usage_type_name the automobile_usage_type_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_usage_type_name(String automobile_usage_type_name) {
		_vehicle_Catalogue.setAutomobile_usage_type_name(automobile_usage_type_name);
	}

	/**
	* Sets the automobile_version_code of this vehicle_ catalogue.
	*
	* @param automobile_version_code the automobile_version_code of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_version_code(String automobile_version_code) {
		_vehicle_Catalogue.setAutomobile_version_code(automobile_version_code);
	}

	/**
	* Sets the automobile_version_name of this vehicle_ catalogue.
	*
	* @param automobile_version_name the automobile_version_name of this vehicle_ catalogue
	*/
	@Override
	public void setAutomobile_version_name(String automobile_version_name) {
		_vehicle_Catalogue.setAutomobile_version_name(automobile_version_name);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vehicle_Catalogue.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vehicle_ catalogue.
	*
	* @param companyId the company ID of this vehicle_ catalogue
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vehicle_Catalogue.setCompanyId(companyId);
	}

	/**
	* Sets the country_name of this vehicle_ catalogue.
	*
	* @param country_name the country_name of this vehicle_ catalogue
	*/
	@Override
	public void setCountry_name(String country_name) {
		_vehicle_Catalogue.setCountry_name(country_name);
	}

	/**
	* Sets the create date of this vehicle_ catalogue.
	*
	* @param createDate the create date of this vehicle_ catalogue
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_vehicle_Catalogue.setCreateDate(createDate);
	}

	/**
	* Sets the default_flag of this vehicle_ catalogue.
	*
	* @param default_flag the default_flag of this vehicle_ catalogue
	*/
	@Override
	public void setDefault_flag(String default_flag) {
		_vehicle_Catalogue.setDefault_flag(default_flag);
	}

	/**
	* Sets the depreciation_flat of this vehicle_ catalogue.
	*
	* @param depreciation_flat the depreciation_flat of this vehicle_ catalogue
	*/
	@Override
	public void setDepreciation_flat(String depreciation_flat) {
		_vehicle_Catalogue.setDepreciation_flat(depreciation_flat);
	}

	/**
	* Sets the doors of this vehicle_ catalogue.
	*
	* @param doors the doors of this vehicle_ catalogue
	*/
	@Override
	public void setDoors(String doors) {
		_vehicle_Catalogue.setDoors(doors);
	}

	/**
	* Sets the enddate of this vehicle_ catalogue.
	*
	* @param enddate the enddate of this vehicle_ catalogue
	*/
	@Override
	public void setEnddate(String enddate) {
		_vehicle_Catalogue.setEnddate(enddate);
	}

	/**
	* Sets the engine_cc of this vehicle_ catalogue.
	*
	* @param engine_cc the engine_cc of this vehicle_ catalogue
	*/
	@Override
	public void setEngine_cc(String engine_cc) {
		_vehicle_Catalogue.setEngine_cc(engine_cc);
	}

	/**
	* Sets the engine_type of this vehicle_ catalogue.
	*
	* @param engine_type the engine_type of this vehicle_ catalogue
	*/
	@Override
	public void setEngine_type(String engine_type) {
		_vehicle_Catalogue.setEngine_type(engine_type);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vehicle_Catalogue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vehicle_Catalogue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vehicle_Catalogue.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the final_drive of this vehicle_ catalogue.
	*
	* @param final_drive the final_drive of this vehicle_ catalogue
	*/
	@Override
	public void setFinal_drive(String final_drive) {
		_vehicle_Catalogue.setFinal_drive(final_drive);
	}

	/**
	* Sets the group ID of this vehicle_ catalogue.
	*
	* @param groupId the group ID of this vehicle_ catalogue
	*/
	@Override
	public void setGroupId(long groupId) {
		_vehicle_Catalogue.setGroupId(groupId);
	}

	/**
	* Sets the lower_threshold of this vehicle_ catalogue.
	*
	* @param lower_threshold the lower_threshold of this vehicle_ catalogue
	*/
	@Override
	public void setLower_threshold(String lower_threshold) {
		_vehicle_Catalogue.setLower_threshold(lower_threshold);
	}

	/**
	* Sets the modified date of this vehicle_ catalogue.
	*
	* @param modifiedDate the modified date of this vehicle_ catalogue
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vehicle_Catalogue.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vehicle_Catalogue.setNew(n);
	}

	/**
	* Sets the no_of_axels of this vehicle_ catalogue.
	*
	* @param no_of_axels the no_of_axels of this vehicle_ catalogue
	*/
	@Override
	public void setNo_of_axels(String no_of_axels) {
		_vehicle_Catalogue.setNo_of_axels(no_of_axels);
	}

	/**
	* Sets the no_of_cylinder of this vehicle_ catalogue.
	*
	* @param no_of_cylinder the no_of_cylinder of this vehicle_ catalogue
	*/
	@Override
	public void setNo_of_cylinder(String no_of_cylinder) {
		_vehicle_Catalogue.setNo_of_cylinder(no_of_cylinder);
	}

	/**
	* Sets the no_of_gears of this vehicle_ catalogue.
	*
	* @param no_of_gears the no_of_gears of this vehicle_ catalogue
	*/
	@Override
	public void setNo_of_gears(String no_of_gears) {
		_vehicle_Catalogue.setNo_of_gears(no_of_gears);
	}

	/**
	* Sets the no_of_seats of this vehicle_ catalogue.
	*
	* @param no_of_seats the no_of_seats of this vehicle_ catalogue
	*/
	@Override
	public void setNo_of_seats(String no_of_seats) {
		_vehicle_Catalogue.setNo_of_seats(no_of_seats);
	}

	/**
	* Sets the order_sequence of this vehicle_ catalogue.
	*
	* @param order_sequence the order_sequence of this vehicle_ catalogue
	*/
	@Override
	public void setOrder_sequence(String order_sequence) {
		_vehicle_Catalogue.setOrder_sequence(order_sequence);
	}

	/**
	* Sets the power of this vehicle_ catalogue.
	*
	* @param power the power of this vehicle_ catalogue
	*/
	@Override
	public void setPower(String power) {
		_vehicle_Catalogue.setPower(power);
	}

	/**
	* Sets the primary key of this vehicle_ catalogue.
	*
	* @param primaryKey the primary key of this vehicle_ catalogue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vehicle_Catalogue.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vehicle_Catalogue.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rate_category of this vehicle_ catalogue.
	*
	* @param rate_category the rate_category of this vehicle_ catalogue
	*/
	@Override
	public void setRate_category(String rate_category) {
		_vehicle_Catalogue.setRate_category(rate_category);
	}

	/**
	* Sets the restricted of this vehicle_ catalogue.
	*
	* @param restricted the restricted of this vehicle_ catalogue
	*/
	@Override
	public void setRestricted(String restricted) {
		_vehicle_Catalogue.setRestricted(restricted);
	}

	/**
	* Sets the surface of this vehicle_ catalogue.
	*
	* @param surface the surface of this vehicle_ catalogue
	*/
	@Override
	public void setSurface(String surface) {
		_vehicle_Catalogue.setSurface(surface);
	}

	/**
	* Sets the transmission_type of this vehicle_ catalogue.
	*
	* @param transmission_type the transmission_type of this vehicle_ catalogue
	*/
	@Override
	public void setTransmission_type(String transmission_type) {
		_vehicle_Catalogue.setTransmission_type(transmission_type);
	}

	/**
	* Sets the upper_threshold of this vehicle_ catalogue.
	*
	* @param upper_threshold the upper_threshold of this vehicle_ catalogue
	*/
	@Override
	public void setUpper_threshold(String upper_threshold) {
		_vehicle_Catalogue.setUpper_threshold(upper_threshold);
	}

	/**
	* Sets the user ID of this vehicle_ catalogue.
	*
	* @param userId the user ID of this vehicle_ catalogue
	*/
	@Override
	public void setUserId(long userId) {
		_vehicle_Catalogue.setUserId(userId);
	}

	/**
	* Sets the user name of this vehicle_ catalogue.
	*
	* @param userName the user name of this vehicle_ catalogue
	*/
	@Override
	public void setUserName(String userName) {
		_vehicle_Catalogue.setUserName(userName);
	}

	/**
	* Sets the user uuid of this vehicle_ catalogue.
	*
	* @param userUuid the user uuid of this vehicle_ catalogue
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_vehicle_Catalogue.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this vehicle_ catalogue.
	*
	* @param uuid the uuid of this vehicle_ catalogue
	*/
	@Override
	public void setUuid(String uuid) {
		_vehicle_Catalogue.setUuid(uuid);
	}

	/**
	* Sets the value of this vehicle_ catalogue.
	*
	* @param value the value of this vehicle_ catalogue
	*/
	@Override
	public void setValue(String value) {
		_vehicle_Catalogue.setValue(value);
	}

	/**
	* Sets the vehicle_value of this vehicle_ catalogue.
	*
	* @param vehicle_value the vehicle_value of this vehicle_ catalogue
	*/
	@Override
	public void setVehicle_value(String vehicle_value) {
		_vehicle_Catalogue.setVehicle_value(vehicle_value);
	}

	/**
	* Sets the vehicle ID of this vehicle_ catalogue.
	*
	* @param vehicleId the vehicle ID of this vehicle_ catalogue
	*/
	@Override
	public void setVehicleId(long vehicleId) {
		_vehicle_Catalogue.setVehicleId(vehicleId);
	}

	/**
	* Sets the weight of this vehicle_ catalogue.
	*
	* @param weight the weight of this vehicle_ catalogue
	*/
	@Override
	public void setWeight(String weight) {
		_vehicle_Catalogue.setWeight(weight);
	}

	/**
	* Sets the width of this vehicle_ catalogue.
	*
	* @param width the width of this vehicle_ catalogue
	*/
	@Override
	public void setWidth(String width) {
		_vehicle_Catalogue.setWidth(width);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Vehicle_Catalogue> toCacheModel() {
		return _vehicle_Catalogue.toCacheModel();
	}

	@Override
	public Vehicle_Catalogue toEscapedModel() {
		return new Vehicle_CatalogueWrapper(_vehicle_Catalogue.toEscapedModel());
	}

	@Override
	public String toString() {
		return _vehicle_Catalogue.toString();
	}

	@Override
	public Vehicle_Catalogue toUnescapedModel() {
		return new Vehicle_CatalogueWrapper(_vehicle_Catalogue.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _vehicle_Catalogue.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vehicle_CatalogueWrapper)) {
			return false;
		}

		Vehicle_CatalogueWrapper vehicle_CatalogueWrapper = (Vehicle_CatalogueWrapper)obj;

		if (Objects.equals(_vehicle_Catalogue,
					vehicle_CatalogueWrapper._vehicle_Catalogue)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _vehicle_Catalogue.getStagedModelType();
	}

	@Override
	public Vehicle_Catalogue getWrappedModel() {
		return _vehicle_Catalogue;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vehicle_Catalogue.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vehicle_Catalogue.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vehicle_Catalogue.resetOriginalValues();
	}

	private final Vehicle_Catalogue _vehicle_Catalogue;
}