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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.axa.glf.masterdata.service.http.Vehicle_CatalogueServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.axa.glf.masterdata.service.http.Vehicle_CatalogueServiceSoap
 * @generated
 */
@ProviderType
public class Vehicle_CatalogueSoap implements Serializable {
	public static Vehicle_CatalogueSoap toSoapModel(Vehicle_Catalogue model) {
		Vehicle_CatalogueSoap soapModel = new Vehicle_CatalogueSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setVehicleId(model.getVehicleId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAutomobile_cat_code(model.getAutomobile_cat_code());
		soapModel.setAutomobile_maker_code(model.getAutomobile_maker_code());
		soapModel.setAutomobile_maker_name(model.getAutomobile_maker_name());
		soapModel.setAutomobile_model_code(model.getAutomobile_model_code());
		soapModel.setAutomobile_model_name(model.getAutomobile_model_name());
		soapModel.setAutomobile_version_code(model.getAutomobile_version_code());
		soapModel.setAutomobile_version_name(model.getAutomobile_version_name());
		soapModel.setAutomobile_sub_type_name(model.getAutomobile_sub_type_name());
		soapModel.setAutomobile_usage_type_name(model.getAutomobile_usage_type_name());
		soapModel.setAutomobile_body_type_name(model.getAutomobile_body_type_name());
		soapModel.setAutomobile_body_type_desc(model.getAutomobile_body_type_desc());
		soapModel.setAutomobile_fuel_type_name(model.getAutomobile_fuel_type_name());
		soapModel.setAutomobile_type_name(model.getAutomobile_type_name());
		soapModel.setPower(model.getPower());
		soapModel.setWidth(model.getWidth());
		soapModel.setSurface(model.getSurface());
		soapModel.setWeight(model.getWeight());
		soapModel.setVehicle_value(model.getVehicle_value());
		soapModel.setEngine_cc(model.getEngine_cc());
		soapModel.setRate_category(model.getRate_category());
		soapModel.setDoors(model.getDoors());
		soapModel.setAllowed(model.getAllowed());
		soapModel.setNo_of_cylinder(model.getNo_of_cylinder());
		soapModel.setRestricted(model.getRestricted());
		soapModel.setNo_of_seats(model.getNo_of_seats());
		soapModel.setEngine_type(model.getEngine_type());
		soapModel.setTransmission_type(model.getTransmission_type());
		soapModel.setNo_of_gears(model.getNo_of_gears());
		soapModel.setFinal_drive(model.getFinal_drive());
		soapModel.setNo_of_axels(model.getNo_of_axels());
		soapModel.setLower_threshold(model.getLower_threshold());
		soapModel.setUpper_threshold(model.getUpper_threshold());
		soapModel.setDepreciation_flat(model.getDepreciation_flat());
		soapModel.setValue(model.getValue());
		soapModel.set_1st_yr_dep_per(model.get_1st_yr_dep_per());
		soapModel.set_2nd_yr_dep_per(model.get_2nd_yr_dep_per());
		soapModel.set_3rd_yr_dep_per(model.get_3rd_yr_dep_per());
		soapModel.set_4th_yr_dep_per(model.get_4th_yr_dep_per());
		soapModel.set_5th_yr_dep_per(model.get_5th_yr_dep_per());
		soapModel.set_6th_yr_dep_per(model.get_6th_yr_dep_per());
		soapModel.set_7th_yr_dep_per(model.get_7th_yr_dep_per());
		soapModel.set_8th_yr_dep_per(model.get_8th_yr_dep_per());
		soapModel.set_9th_yr_dep_per(model.get_9th_yr_dep_per());
		soapModel.set_10th_yr_dep_per(model.get_10th_yr_dep_per());
		soapModel.set_11th_yr_dep_per(model.get_11th_yr_dep_per());
		soapModel.set_12th_yr_dep_per(model.get_12th_yr_dep_per());
		soapModel.set_13th_yr_dep_per(model.get_13th_yr_dep_per());
		soapModel.set_14th_yr_dep_per(model.get_14th_yr_dep_per());
		soapModel.set_1st_yr_dep_val(model.get_1st_yr_dep_val());
		soapModel.set_2nd_yr_dep_val(model.get_2nd_yr_dep_val());
		soapModel.set_3rd_yr_dep_val(model.get_3rd_yr_dep_val());
		soapModel.set_4th_yr_dep_val(model.get_4th_yr_dep_val());
		soapModel.set_5th_yr_dep_val(model.get_5th_yr_dep_val());
		soapModel.set_6th_yr_dep_val(model.get_6th_yr_dep_val());
		soapModel.set_7th_yr_dep_val(model.get_7th_yr_dep_val());
		soapModel.set_8th_yr_dep_val(model.get_8th_yr_dep_val());
		soapModel.set_9th_yr_dep_val(model.get_9th_yr_dep_val());
		soapModel.set_10th_yr_dep_val(model.get_10th_yr_dep_val());
		soapModel.set_11th_yr_dep_val(model.get_11th_yr_dep_val());
		soapModel.set_12th_yr_dep_val(model.get_12th_yr_dep_val());
		soapModel.set_13th_yr_dep_val(model.get_13th_yr_dep_val());
		soapModel.set_14th_yr_dep_val(model.get_14th_yr_dep_val());
		soapModel.set_1st_yr_flat_val(model.get_1st_yr_flat_val());
		soapModel.set_2nd_yr_flat_val(model.get_2nd_yr_flat_val());
		soapModel.set_3rd_yr_flat_val(model.get_3rd_yr_flat_val());
		soapModel.set_4th_yr_flat_val(model.get_4th_yr_flat_val());
		soapModel.set_5th_yr_flat_val(model.get_5th_yr_flat_val());
		soapModel.set_6th_yr_flat_val(model.get_6th_yr_flat_val());
		soapModel.set_7th_yr_flat_val(model.get_7th_yr_flat_val());
		soapModel.set_8th_yr_flat_val(model.get_8th_yr_flat_val());
		soapModel.set_9th_yr_flat_val(model.get_9th_yr_flat_val());
		soapModel.set_10th_yr_flat_val(model.get_10th_yr_flat_val());
		soapModel.set_11th_yr_flat_val(model.get_11th_yr_flat_val());
		soapModel.set_12th_yr_flat_val(model.get_12th_yr_flat_val());
		soapModel.set_13th_yr_flat_val(model.get_13th_yr_flat_val());
		soapModel.set_14th_yr_flat_val(model.get_14th_yr_flat_val());
		soapModel.setDefault_flag(model.getDefault_flag());
		soapModel.setCountry_name(model.getCountry_name());
		soapModel.setEnddate(model.getEnddate());
		soapModel.setOrder_sequence(model.getOrder_sequence());

		return soapModel;
	}

	public static Vehicle_CatalogueSoap[] toSoapModels(
		Vehicle_Catalogue[] models) {
		Vehicle_CatalogueSoap[] soapModels = new Vehicle_CatalogueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Vehicle_CatalogueSoap[][] toSoapModels(
		Vehicle_Catalogue[][] models) {
		Vehicle_CatalogueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Vehicle_CatalogueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Vehicle_CatalogueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Vehicle_CatalogueSoap[] toSoapModels(
		List<Vehicle_Catalogue> models) {
		List<Vehicle_CatalogueSoap> soapModels = new ArrayList<Vehicle_CatalogueSoap>(models.size());

		for (Vehicle_Catalogue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Vehicle_CatalogueSoap[soapModels.size()]);
	}

	public Vehicle_CatalogueSoap() {
	}

	public long getPrimaryKey() {
		return _vehicleId;
	}

	public void setPrimaryKey(long pk) {
		setVehicleId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getVehicleId() {
		return _vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		_vehicleId = vehicleId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getAutomobile_cat_code() {
		return _automobile_cat_code;
	}

	public void setAutomobile_cat_code(String automobile_cat_code) {
		_automobile_cat_code = automobile_cat_code;
	}

	public String getAutomobile_maker_code() {
		return _automobile_maker_code;
	}

	public void setAutomobile_maker_code(String automobile_maker_code) {
		_automobile_maker_code = automobile_maker_code;
	}

	public String getAutomobile_maker_name() {
		return _automobile_maker_name;
	}

	public void setAutomobile_maker_name(String automobile_maker_name) {
		_automobile_maker_name = automobile_maker_name;
	}

	public String getAutomobile_model_code() {
		return _automobile_model_code;
	}

	public void setAutomobile_model_code(String automobile_model_code) {
		_automobile_model_code = automobile_model_code;
	}

	public String getAutomobile_model_name() {
		return _automobile_model_name;
	}

	public void setAutomobile_model_name(String automobile_model_name) {
		_automobile_model_name = automobile_model_name;
	}

	public String getAutomobile_version_code() {
		return _automobile_version_code;
	}

	public void setAutomobile_version_code(String automobile_version_code) {
		_automobile_version_code = automobile_version_code;
	}

	public String getAutomobile_version_name() {
		return _automobile_version_name;
	}

	public void setAutomobile_version_name(String automobile_version_name) {
		_automobile_version_name = automobile_version_name;
	}

	public String getAutomobile_sub_type_name() {
		return _automobile_sub_type_name;
	}

	public void setAutomobile_sub_type_name(String automobile_sub_type_name) {
		_automobile_sub_type_name = automobile_sub_type_name;
	}

	public String getAutomobile_usage_type_name() {
		return _automobile_usage_type_name;
	}

	public void setAutomobile_usage_type_name(String automobile_usage_type_name) {
		_automobile_usage_type_name = automobile_usage_type_name;
	}

	public String getAutomobile_body_type_name() {
		return _automobile_body_type_name;
	}

	public void setAutomobile_body_type_name(String automobile_body_type_name) {
		_automobile_body_type_name = automobile_body_type_name;
	}

	public String getAutomobile_body_type_desc() {
		return _automobile_body_type_desc;
	}

	public void setAutomobile_body_type_desc(String automobile_body_type_desc) {
		_automobile_body_type_desc = automobile_body_type_desc;
	}

	public String getAutomobile_fuel_type_name() {
		return _automobile_fuel_type_name;
	}

	public void setAutomobile_fuel_type_name(String automobile_fuel_type_name) {
		_automobile_fuel_type_name = automobile_fuel_type_name;
	}

	public String getAutomobile_type_name() {
		return _automobile_type_name;
	}

	public void setAutomobile_type_name(String automobile_type_name) {
		_automobile_type_name = automobile_type_name;
	}

	public String getPower() {
		return _power;
	}

	public void setPower(String power) {
		_power = power;
	}

	public String getWidth() {
		return _width;
	}

	public void setWidth(String width) {
		_width = width;
	}

	public String getSurface() {
		return _surface;
	}

	public void setSurface(String surface) {
		_surface = surface;
	}

	public String getWeight() {
		return _weight;
	}

	public void setWeight(String weight) {
		_weight = weight;
	}

	public String getVehicle_value() {
		return _vehicle_value;
	}

	public void setVehicle_value(String vehicle_value) {
		_vehicle_value = vehicle_value;
	}

	public String getEngine_cc() {
		return _engine_cc;
	}

	public void setEngine_cc(String engine_cc) {
		_engine_cc = engine_cc;
	}

	public String getRate_category() {
		return _rate_category;
	}

	public void setRate_category(String rate_category) {
		_rate_category = rate_category;
	}

	public String getDoors() {
		return _doors;
	}

	public void setDoors(String doors) {
		_doors = doors;
	}

	public String getAllowed() {
		return _allowed;
	}

	public void setAllowed(String allowed) {
		_allowed = allowed;
	}

	public String getNo_of_cylinder() {
		return _no_of_cylinder;
	}

	public void setNo_of_cylinder(String no_of_cylinder) {
		_no_of_cylinder = no_of_cylinder;
	}

	public String getRestricted() {
		return _restricted;
	}

	public void setRestricted(String restricted) {
		_restricted = restricted;
	}

	public String getNo_of_seats() {
		return _no_of_seats;
	}

	public void setNo_of_seats(String no_of_seats) {
		_no_of_seats = no_of_seats;
	}

	public String getEngine_type() {
		return _engine_type;
	}

	public void setEngine_type(String engine_type) {
		_engine_type = engine_type;
	}

	public String getTransmission_type() {
		return _transmission_type;
	}

	public void setTransmission_type(String transmission_type) {
		_transmission_type = transmission_type;
	}

	public String getNo_of_gears() {
		return _no_of_gears;
	}

	public void setNo_of_gears(String no_of_gears) {
		_no_of_gears = no_of_gears;
	}

	public String getFinal_drive() {
		return _final_drive;
	}

	public void setFinal_drive(String final_drive) {
		_final_drive = final_drive;
	}

	public String getNo_of_axels() {
		return _no_of_axels;
	}

	public void setNo_of_axels(String no_of_axels) {
		_no_of_axels = no_of_axels;
	}

	public String getLower_threshold() {
		return _lower_threshold;
	}

	public void setLower_threshold(String lower_threshold) {
		_lower_threshold = lower_threshold;
	}

	public String getUpper_threshold() {
		return _upper_threshold;
	}

	public void setUpper_threshold(String upper_threshold) {
		_upper_threshold = upper_threshold;
	}

	public String getDepreciation_flat() {
		return _depreciation_flat;
	}

	public void setDepreciation_flat(String depreciation_flat) {
		_depreciation_flat = depreciation_flat;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	public String get_1st_yr_dep_per() {
		return __1st_yr_dep_per;
	}

	public void set_1st_yr_dep_per(String _1st_yr_dep_per) {
		__1st_yr_dep_per = _1st_yr_dep_per;
	}

	public String get_2nd_yr_dep_per() {
		return __2nd_yr_dep_per;
	}

	public void set_2nd_yr_dep_per(String _2nd_yr_dep_per) {
		__2nd_yr_dep_per = _2nd_yr_dep_per;
	}

	public String get_3rd_yr_dep_per() {
		return __3rd_yr_dep_per;
	}

	public void set_3rd_yr_dep_per(String _3rd_yr_dep_per) {
		__3rd_yr_dep_per = _3rd_yr_dep_per;
	}

	public String get_4th_yr_dep_per() {
		return __4th_yr_dep_per;
	}

	public void set_4th_yr_dep_per(String _4th_yr_dep_per) {
		__4th_yr_dep_per = _4th_yr_dep_per;
	}

	public String get_5th_yr_dep_per() {
		return __5th_yr_dep_per;
	}

	public void set_5th_yr_dep_per(String _5th_yr_dep_per) {
		__5th_yr_dep_per = _5th_yr_dep_per;
	}

	public String get_6th_yr_dep_per() {
		return __6th_yr_dep_per;
	}

	public void set_6th_yr_dep_per(String _6th_yr_dep_per) {
		__6th_yr_dep_per = _6th_yr_dep_per;
	}

	public String get_7th_yr_dep_per() {
		return __7th_yr_dep_per;
	}

	public void set_7th_yr_dep_per(String _7th_yr_dep_per) {
		__7th_yr_dep_per = _7th_yr_dep_per;
	}

	public String get_8th_yr_dep_per() {
		return __8th_yr_dep_per;
	}

	public void set_8th_yr_dep_per(String _8th_yr_dep_per) {
		__8th_yr_dep_per = _8th_yr_dep_per;
	}

	public String get_9th_yr_dep_per() {
		return __9th_yr_dep_per;
	}

	public void set_9th_yr_dep_per(String _9th_yr_dep_per) {
		__9th_yr_dep_per = _9th_yr_dep_per;
	}

	public String get_10th_yr_dep_per() {
		return __10th_yr_dep_per;
	}

	public void set_10th_yr_dep_per(String _10th_yr_dep_per) {
		__10th_yr_dep_per = _10th_yr_dep_per;
	}

	public String get_11th_yr_dep_per() {
		return __11th_yr_dep_per;
	}

	public void set_11th_yr_dep_per(String _11th_yr_dep_per) {
		__11th_yr_dep_per = _11th_yr_dep_per;
	}

	public String get_12th_yr_dep_per() {
		return __12th_yr_dep_per;
	}

	public void set_12th_yr_dep_per(String _12th_yr_dep_per) {
		__12th_yr_dep_per = _12th_yr_dep_per;
	}

	public String get_13th_yr_dep_per() {
		return __13th_yr_dep_per;
	}

	public void set_13th_yr_dep_per(String _13th_yr_dep_per) {
		__13th_yr_dep_per = _13th_yr_dep_per;
	}

	public String get_14th_yr_dep_per() {
		return __14th_yr_dep_per;
	}

	public void set_14th_yr_dep_per(String _14th_yr_dep_per) {
		__14th_yr_dep_per = _14th_yr_dep_per;
	}

	public String get_1st_yr_dep_val() {
		return __1st_yr_dep_val;
	}

	public void set_1st_yr_dep_val(String _1st_yr_dep_val) {
		__1st_yr_dep_val = _1st_yr_dep_val;
	}

	public String get_2nd_yr_dep_val() {
		return __2nd_yr_dep_val;
	}

	public void set_2nd_yr_dep_val(String _2nd_yr_dep_val) {
		__2nd_yr_dep_val = _2nd_yr_dep_val;
	}

	public String get_3rd_yr_dep_val() {
		return __3rd_yr_dep_val;
	}

	public void set_3rd_yr_dep_val(String _3rd_yr_dep_val) {
		__3rd_yr_dep_val = _3rd_yr_dep_val;
	}

	public String get_4th_yr_dep_val() {
		return __4th_yr_dep_val;
	}

	public void set_4th_yr_dep_val(String _4th_yr_dep_val) {
		__4th_yr_dep_val = _4th_yr_dep_val;
	}

	public String get_5th_yr_dep_val() {
		return __5th_yr_dep_val;
	}

	public void set_5th_yr_dep_val(String _5th_yr_dep_val) {
		__5th_yr_dep_val = _5th_yr_dep_val;
	}

	public String get_6th_yr_dep_val() {
		return __6th_yr_dep_val;
	}

	public void set_6th_yr_dep_val(String _6th_yr_dep_val) {
		__6th_yr_dep_val = _6th_yr_dep_val;
	}

	public String get_7th_yr_dep_val() {
		return __7th_yr_dep_val;
	}

	public void set_7th_yr_dep_val(String _7th_yr_dep_val) {
		__7th_yr_dep_val = _7th_yr_dep_val;
	}

	public String get_8th_yr_dep_val() {
		return __8th_yr_dep_val;
	}

	public void set_8th_yr_dep_val(String _8th_yr_dep_val) {
		__8th_yr_dep_val = _8th_yr_dep_val;
	}

	public String get_9th_yr_dep_val() {
		return __9th_yr_dep_val;
	}

	public void set_9th_yr_dep_val(String _9th_yr_dep_val) {
		__9th_yr_dep_val = _9th_yr_dep_val;
	}

	public String get_10th_yr_dep_val() {
		return __10th_yr_dep_val;
	}

	public void set_10th_yr_dep_val(String _10th_yr_dep_val) {
		__10th_yr_dep_val = _10th_yr_dep_val;
	}

	public String get_11th_yr_dep_val() {
		return __11th_yr_dep_val;
	}

	public void set_11th_yr_dep_val(String _11th_yr_dep_val) {
		__11th_yr_dep_val = _11th_yr_dep_val;
	}

	public String get_12th_yr_dep_val() {
		return __12th_yr_dep_val;
	}

	public void set_12th_yr_dep_val(String _12th_yr_dep_val) {
		__12th_yr_dep_val = _12th_yr_dep_val;
	}

	public String get_13th_yr_dep_val() {
		return __13th_yr_dep_val;
	}

	public void set_13th_yr_dep_val(String _13th_yr_dep_val) {
		__13th_yr_dep_val = _13th_yr_dep_val;
	}

	public String get_14th_yr_dep_val() {
		return __14th_yr_dep_val;
	}

	public void set_14th_yr_dep_val(String _14th_yr_dep_val) {
		__14th_yr_dep_val = _14th_yr_dep_val;
	}

	public String get_1st_yr_flat_val() {
		return __1st_yr_flat_val;
	}

	public void set_1st_yr_flat_val(String _1st_yr_flat_val) {
		__1st_yr_flat_val = _1st_yr_flat_val;
	}

	public String get_2nd_yr_flat_val() {
		return __2nd_yr_flat_val;
	}

	public void set_2nd_yr_flat_val(String _2nd_yr_flat_val) {
		__2nd_yr_flat_val = _2nd_yr_flat_val;
	}

	public String get_3rd_yr_flat_val() {
		return __3rd_yr_flat_val;
	}

	public void set_3rd_yr_flat_val(String _3rd_yr_flat_val) {
		__3rd_yr_flat_val = _3rd_yr_flat_val;
	}

	public String get_4th_yr_flat_val() {
		return __4th_yr_flat_val;
	}

	public void set_4th_yr_flat_val(String _4th_yr_flat_val) {
		__4th_yr_flat_val = _4th_yr_flat_val;
	}

	public String get_5th_yr_flat_val() {
		return __5th_yr_flat_val;
	}

	public void set_5th_yr_flat_val(String _5th_yr_flat_val) {
		__5th_yr_flat_val = _5th_yr_flat_val;
	}

	public String get_6th_yr_flat_val() {
		return __6th_yr_flat_val;
	}

	public void set_6th_yr_flat_val(String _6th_yr_flat_val) {
		__6th_yr_flat_val = _6th_yr_flat_val;
	}

	public String get_7th_yr_flat_val() {
		return __7th_yr_flat_val;
	}

	public void set_7th_yr_flat_val(String _7th_yr_flat_val) {
		__7th_yr_flat_val = _7th_yr_flat_val;
	}

	public String get_8th_yr_flat_val() {
		return __8th_yr_flat_val;
	}

	public void set_8th_yr_flat_val(String _8th_yr_flat_val) {
		__8th_yr_flat_val = _8th_yr_flat_val;
	}

	public String get_9th_yr_flat_val() {
		return __9th_yr_flat_val;
	}

	public void set_9th_yr_flat_val(String _9th_yr_flat_val) {
		__9th_yr_flat_val = _9th_yr_flat_val;
	}

	public String get_10th_yr_flat_val() {
		return __10th_yr_flat_val;
	}

	public void set_10th_yr_flat_val(String _10th_yr_flat_val) {
		__10th_yr_flat_val = _10th_yr_flat_val;
	}

	public String get_11th_yr_flat_val() {
		return __11th_yr_flat_val;
	}

	public void set_11th_yr_flat_val(String _11th_yr_flat_val) {
		__11th_yr_flat_val = _11th_yr_flat_val;
	}

	public String get_12th_yr_flat_val() {
		return __12th_yr_flat_val;
	}

	public void set_12th_yr_flat_val(String _12th_yr_flat_val) {
		__12th_yr_flat_val = _12th_yr_flat_val;
	}

	public String get_13th_yr_flat_val() {
		return __13th_yr_flat_val;
	}

	public void set_13th_yr_flat_val(String _13th_yr_flat_val) {
		__13th_yr_flat_val = _13th_yr_flat_val;
	}

	public String get_14th_yr_flat_val() {
		return __14th_yr_flat_val;
	}

	public void set_14th_yr_flat_val(String _14th_yr_flat_val) {
		__14th_yr_flat_val = _14th_yr_flat_val;
	}

	public String getDefault_flag() {
		return _default_flag;
	}

	public void setDefault_flag(String default_flag) {
		_default_flag = default_flag;
	}

	public String getCountry_name() {
		return _country_name;
	}

	public void setCountry_name(String country_name) {
		_country_name = country_name;
	}

	public String getEnddate() {
		return _enddate;
	}

	public void setEnddate(String enddate) {
		_enddate = enddate;
	}

	public String getOrder_sequence() {
		return _order_sequence;
	}

	public void setOrder_sequence(String order_sequence) {
		_order_sequence = order_sequence;
	}

	private String _uuid;
	private long _vehicleId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _automobile_cat_code;
	private String _automobile_maker_code;
	private String _automobile_maker_name;
	private String _automobile_model_code;
	private String _automobile_model_name;
	private String _automobile_version_code;
	private String _automobile_version_name;
	private String _automobile_sub_type_name;
	private String _automobile_usage_type_name;
	private String _automobile_body_type_name;
	private String _automobile_body_type_desc;
	private String _automobile_fuel_type_name;
	private String _automobile_type_name;
	private String _power;
	private String _width;
	private String _surface;
	private String _weight;
	private String _vehicle_value;
	private String _engine_cc;
	private String _rate_category;
	private String _doors;
	private String _allowed;
	private String _no_of_cylinder;
	private String _restricted;
	private String _no_of_seats;
	private String _engine_type;
	private String _transmission_type;
	private String _no_of_gears;
	private String _final_drive;
	private String _no_of_axels;
	private String _lower_threshold;
	private String _upper_threshold;
	private String _depreciation_flat;
	private String _value;
	private String __1st_yr_dep_per;
	private String __2nd_yr_dep_per;
	private String __3rd_yr_dep_per;
	private String __4th_yr_dep_per;
	private String __5th_yr_dep_per;
	private String __6th_yr_dep_per;
	private String __7th_yr_dep_per;
	private String __8th_yr_dep_per;
	private String __9th_yr_dep_per;
	private String __10th_yr_dep_per;
	private String __11th_yr_dep_per;
	private String __12th_yr_dep_per;
	private String __13th_yr_dep_per;
	private String __14th_yr_dep_per;
	private String __1st_yr_dep_val;
	private String __2nd_yr_dep_val;
	private String __3rd_yr_dep_val;
	private String __4th_yr_dep_val;
	private String __5th_yr_dep_val;
	private String __6th_yr_dep_val;
	private String __7th_yr_dep_val;
	private String __8th_yr_dep_val;
	private String __9th_yr_dep_val;
	private String __10th_yr_dep_val;
	private String __11th_yr_dep_val;
	private String __12th_yr_dep_val;
	private String __13th_yr_dep_val;
	private String __14th_yr_dep_val;
	private String __1st_yr_flat_val;
	private String __2nd_yr_flat_val;
	private String __3rd_yr_flat_val;
	private String __4th_yr_flat_val;
	private String __5th_yr_flat_val;
	private String __6th_yr_flat_val;
	private String __7th_yr_flat_val;
	private String __8th_yr_flat_val;
	private String __9th_yr_flat_val;
	private String __10th_yr_flat_val;
	private String __11th_yr_flat_val;
	private String __12th_yr_flat_val;
	private String __13th_yr_flat_val;
	private String __14th_yr_flat_val;
	private String _default_flag;
	private String _country_name;
	private String _enddate;
	private String _order_sequence;
}