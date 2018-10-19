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

package com.axa.glf.masterdata.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.axa.glf.masterdata.model.Vehicle_Catalogue;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Vehicle_Catalogue in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Vehicle_Catalogue
 * @generated
 */
@ProviderType
public class Vehicle_CatalogueCacheModel implements CacheModel<Vehicle_Catalogue>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vehicle_CatalogueCacheModel)) {
			return false;
		}

		Vehicle_CatalogueCacheModel vehicle_CatalogueCacheModel = (Vehicle_CatalogueCacheModel)obj;

		if (vehicleId == vehicle_CatalogueCacheModel.vehicleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vehicleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(177);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", vehicleId=");
		sb.append(vehicleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", automobile_cat_code=");
		sb.append(automobile_cat_code);
		sb.append(", automobile_maker_code=");
		sb.append(automobile_maker_code);
		sb.append(", automobile_maker_name=");
		sb.append(automobile_maker_name);
		sb.append(", automobile_model_code=");
		sb.append(automobile_model_code);
		sb.append(", automobile_model_name=");
		sb.append(automobile_model_name);
		sb.append(", automobile_version_code=");
		sb.append(automobile_version_code);
		sb.append(", automobile_version_name=");
		sb.append(automobile_version_name);
		sb.append(", automobile_sub_type_name=");
		sb.append(automobile_sub_type_name);
		sb.append(", automobile_usage_type_name=");
		sb.append(automobile_usage_type_name);
		sb.append(", automobile_body_type_name=");
		sb.append(automobile_body_type_name);
		sb.append(", automobile_body_type_desc=");
		sb.append(automobile_body_type_desc);
		sb.append(", automobile_fuel_type_name=");
		sb.append(automobile_fuel_type_name);
		sb.append(", automobile_type_name=");
		sb.append(automobile_type_name);
		sb.append(", power=");
		sb.append(power);
		sb.append(", width=");
		sb.append(width);
		sb.append(", surface=");
		sb.append(surface);
		sb.append(", weight=");
		sb.append(weight);
		sb.append(", vehicle_value=");
		sb.append(vehicle_value);
		sb.append(", engine_cc=");
		sb.append(engine_cc);
		sb.append(", rate_category=");
		sb.append(rate_category);
		sb.append(", doors=");
		sb.append(doors);
		sb.append(", allowed=");
		sb.append(allowed);
		sb.append(", no_of_cylinder=");
		sb.append(no_of_cylinder);
		sb.append(", restricted=");
		sb.append(restricted);
		sb.append(", no_of_seats=");
		sb.append(no_of_seats);
		sb.append(", engine_type=");
		sb.append(engine_type);
		sb.append(", transmission_type=");
		sb.append(transmission_type);
		sb.append(", no_of_gears=");
		sb.append(no_of_gears);
		sb.append(", final_drive=");
		sb.append(final_drive);
		sb.append(", no_of_axels=");
		sb.append(no_of_axels);
		sb.append(", lower_threshold=");
		sb.append(lower_threshold);
		sb.append(", upper_threshold=");
		sb.append(upper_threshold);
		sb.append(", depreciation_flat=");
		sb.append(depreciation_flat);
		sb.append(", value=");
		sb.append(value);
		sb.append(", _1st_yr_dep_per=");
		sb.append(_1st_yr_dep_per);
		sb.append(", _2nd_yr_dep_per=");
		sb.append(_2nd_yr_dep_per);
		sb.append(", _3rd_yr_dep_per=");
		sb.append(_3rd_yr_dep_per);
		sb.append(", _4th_yr_dep_per=");
		sb.append(_4th_yr_dep_per);
		sb.append(", _5th_yr_dep_per=");
		sb.append(_5th_yr_dep_per);
		sb.append(", _6th_yr_dep_per=");
		sb.append(_6th_yr_dep_per);
		sb.append(", _7th_yr_dep_per=");
		sb.append(_7th_yr_dep_per);
		sb.append(", _8th_yr_dep_per=");
		sb.append(_8th_yr_dep_per);
		sb.append(", _9th_yr_dep_per=");
		sb.append(_9th_yr_dep_per);
		sb.append(", _10th_yr_dep_per=");
		sb.append(_10th_yr_dep_per);
		sb.append(", _11th_yr_dep_per=");
		sb.append(_11th_yr_dep_per);
		sb.append(", _12th_yr_dep_per=");
		sb.append(_12th_yr_dep_per);
		sb.append(", _13th_yr_dep_per=");
		sb.append(_13th_yr_dep_per);
		sb.append(", _14th_yr_dep_per=");
		sb.append(_14th_yr_dep_per);
		sb.append(", _1st_yr_dep_val=");
		sb.append(_1st_yr_dep_val);
		sb.append(", _2nd_yr_dep_val=");
		sb.append(_2nd_yr_dep_val);
		sb.append(", _3rd_yr_dep_val=");
		sb.append(_3rd_yr_dep_val);
		sb.append(", _4th_yr_dep_val=");
		sb.append(_4th_yr_dep_val);
		sb.append(", _5th_yr_dep_val=");
		sb.append(_5th_yr_dep_val);
		sb.append(", _6th_yr_dep_val=");
		sb.append(_6th_yr_dep_val);
		sb.append(", _7th_yr_dep_val=");
		sb.append(_7th_yr_dep_val);
		sb.append(", _8th_yr_dep_val=");
		sb.append(_8th_yr_dep_val);
		sb.append(", _9th_yr_dep_val=");
		sb.append(_9th_yr_dep_val);
		sb.append(", _10th_yr_dep_val=");
		sb.append(_10th_yr_dep_val);
		sb.append(", _11th_yr_dep_val=");
		sb.append(_11th_yr_dep_val);
		sb.append(", _12th_yr_dep_val=");
		sb.append(_12th_yr_dep_val);
		sb.append(", _13th_yr_dep_val=");
		sb.append(_13th_yr_dep_val);
		sb.append(", _14th_yr_dep_val=");
		sb.append(_14th_yr_dep_val);
		sb.append(", _1st_yr_flat_val=");
		sb.append(_1st_yr_flat_val);
		sb.append(", _2nd_yr_flat_val=");
		sb.append(_2nd_yr_flat_val);
		sb.append(", _3rd_yr_flat_val=");
		sb.append(_3rd_yr_flat_val);
		sb.append(", _4th_yr_flat_val=");
		sb.append(_4th_yr_flat_val);
		sb.append(", _5th_yr_flat_val=");
		sb.append(_5th_yr_flat_val);
		sb.append(", _6th_yr_flat_val=");
		sb.append(_6th_yr_flat_val);
		sb.append(", _7th_yr_flat_val=");
		sb.append(_7th_yr_flat_val);
		sb.append(", _8th_yr_flat_val=");
		sb.append(_8th_yr_flat_val);
		sb.append(", _9th_yr_flat_val=");
		sb.append(_9th_yr_flat_val);
		sb.append(", _10th_yr_flat_val=");
		sb.append(_10th_yr_flat_val);
		sb.append(", _11th_yr_flat_val=");
		sb.append(_11th_yr_flat_val);
		sb.append(", _12th_yr_flat_val=");
		sb.append(_12th_yr_flat_val);
		sb.append(", _13th_yr_flat_val=");
		sb.append(_13th_yr_flat_val);
		sb.append(", _14th_yr_flat_val=");
		sb.append(_14th_yr_flat_val);
		sb.append(", default_flag=");
		sb.append(default_flag);
		sb.append(", country_name=");
		sb.append(country_name);
		sb.append(", enddate=");
		sb.append(enddate);
		sb.append(", order_sequence=");
		sb.append(order_sequence);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Vehicle_Catalogue toEntityModel() {
		Vehicle_CatalogueImpl vehicle_CatalogueImpl = new Vehicle_CatalogueImpl();

		if (uuid == null) {
			vehicle_CatalogueImpl.setUuid("");
		}
		else {
			vehicle_CatalogueImpl.setUuid(uuid);
		}

		vehicle_CatalogueImpl.setVehicleId(vehicleId);
		vehicle_CatalogueImpl.setGroupId(groupId);
		vehicle_CatalogueImpl.setCompanyId(companyId);
		vehicle_CatalogueImpl.setUserId(userId);

		if (userName == null) {
			vehicle_CatalogueImpl.setUserName("");
		}
		else {
			vehicle_CatalogueImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			vehicle_CatalogueImpl.setCreateDate(null);
		}
		else {
			vehicle_CatalogueImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vehicle_CatalogueImpl.setModifiedDate(null);
		}
		else {
			vehicle_CatalogueImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (automobile_cat_code == null) {
			vehicle_CatalogueImpl.setAutomobile_cat_code("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_cat_code(automobile_cat_code);
		}

		if (automobile_maker_code == null) {
			vehicle_CatalogueImpl.setAutomobile_maker_code("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_maker_code(automobile_maker_code);
		}

		if (automobile_maker_name == null) {
			vehicle_CatalogueImpl.setAutomobile_maker_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_maker_name(automobile_maker_name);
		}

		if (automobile_model_code == null) {
			vehicle_CatalogueImpl.setAutomobile_model_code("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_model_code(automobile_model_code);
		}

		if (automobile_model_name == null) {
			vehicle_CatalogueImpl.setAutomobile_model_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_model_name(automobile_model_name);
		}

		if (automobile_version_code == null) {
			vehicle_CatalogueImpl.setAutomobile_version_code("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_version_code(automobile_version_code);
		}

		if (automobile_version_name == null) {
			vehicle_CatalogueImpl.setAutomobile_version_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_version_name(automobile_version_name);
		}

		if (automobile_sub_type_name == null) {
			vehicle_CatalogueImpl.setAutomobile_sub_type_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_sub_type_name(automobile_sub_type_name);
		}

		if (automobile_usage_type_name == null) {
			vehicle_CatalogueImpl.setAutomobile_usage_type_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_usage_type_name(automobile_usage_type_name);
		}

		if (automobile_body_type_name == null) {
			vehicle_CatalogueImpl.setAutomobile_body_type_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_body_type_name(automobile_body_type_name);
		}

		if (automobile_body_type_desc == null) {
			vehicle_CatalogueImpl.setAutomobile_body_type_desc("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_body_type_desc(automobile_body_type_desc);
		}

		if (automobile_fuel_type_name == null) {
			vehicle_CatalogueImpl.setAutomobile_fuel_type_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_fuel_type_name(automobile_fuel_type_name);
		}

		if (automobile_type_name == null) {
			vehicle_CatalogueImpl.setAutomobile_type_name("");
		}
		else {
			vehicle_CatalogueImpl.setAutomobile_type_name(automobile_type_name);
		}

		if (power == null) {
			vehicle_CatalogueImpl.setPower("");
		}
		else {
			vehicle_CatalogueImpl.setPower(power);
		}

		if (width == null) {
			vehicle_CatalogueImpl.setWidth("");
		}
		else {
			vehicle_CatalogueImpl.setWidth(width);
		}

		if (surface == null) {
			vehicle_CatalogueImpl.setSurface("");
		}
		else {
			vehicle_CatalogueImpl.setSurface(surface);
		}

		if (weight == null) {
			vehicle_CatalogueImpl.setWeight("");
		}
		else {
			vehicle_CatalogueImpl.setWeight(weight);
		}

		if (vehicle_value == null) {
			vehicle_CatalogueImpl.setVehicle_value("");
		}
		else {
			vehicle_CatalogueImpl.setVehicle_value(vehicle_value);
		}

		if (engine_cc == null) {
			vehicle_CatalogueImpl.setEngine_cc("");
		}
		else {
			vehicle_CatalogueImpl.setEngine_cc(engine_cc);
		}

		if (rate_category == null) {
			vehicle_CatalogueImpl.setRate_category("");
		}
		else {
			vehicle_CatalogueImpl.setRate_category(rate_category);
		}

		if (doors == null) {
			vehicle_CatalogueImpl.setDoors("");
		}
		else {
			vehicle_CatalogueImpl.setDoors(doors);
		}

		if (allowed == null) {
			vehicle_CatalogueImpl.setAllowed("");
		}
		else {
			vehicle_CatalogueImpl.setAllowed(allowed);
		}

		if (no_of_cylinder == null) {
			vehicle_CatalogueImpl.setNo_of_cylinder("");
		}
		else {
			vehicle_CatalogueImpl.setNo_of_cylinder(no_of_cylinder);
		}

		if (restricted == null) {
			vehicle_CatalogueImpl.setRestricted("");
		}
		else {
			vehicle_CatalogueImpl.setRestricted(restricted);
		}

		if (no_of_seats == null) {
			vehicle_CatalogueImpl.setNo_of_seats("");
		}
		else {
			vehicle_CatalogueImpl.setNo_of_seats(no_of_seats);
		}

		if (engine_type == null) {
			vehicle_CatalogueImpl.setEngine_type("");
		}
		else {
			vehicle_CatalogueImpl.setEngine_type(engine_type);
		}

		if (transmission_type == null) {
			vehicle_CatalogueImpl.setTransmission_type("");
		}
		else {
			vehicle_CatalogueImpl.setTransmission_type(transmission_type);
		}

		if (no_of_gears == null) {
			vehicle_CatalogueImpl.setNo_of_gears("");
		}
		else {
			vehicle_CatalogueImpl.setNo_of_gears(no_of_gears);
		}

		if (final_drive == null) {
			vehicle_CatalogueImpl.setFinal_drive("");
		}
		else {
			vehicle_CatalogueImpl.setFinal_drive(final_drive);
		}

		if (no_of_axels == null) {
			vehicle_CatalogueImpl.setNo_of_axels("");
		}
		else {
			vehicle_CatalogueImpl.setNo_of_axels(no_of_axels);
		}

		if (lower_threshold == null) {
			vehicle_CatalogueImpl.setLower_threshold("");
		}
		else {
			vehicle_CatalogueImpl.setLower_threshold(lower_threshold);
		}

		if (upper_threshold == null) {
			vehicle_CatalogueImpl.setUpper_threshold("");
		}
		else {
			vehicle_CatalogueImpl.setUpper_threshold(upper_threshold);
		}

		if (depreciation_flat == null) {
			vehicle_CatalogueImpl.setDepreciation_flat("");
		}
		else {
			vehicle_CatalogueImpl.setDepreciation_flat(depreciation_flat);
		}

		if (value == null) {
			vehicle_CatalogueImpl.setValue("");
		}
		else {
			vehicle_CatalogueImpl.setValue(value);
		}

		if (_1st_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_1st_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_1st_yr_dep_per(_1st_yr_dep_per);
		}

		if (_2nd_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_2nd_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_2nd_yr_dep_per(_2nd_yr_dep_per);
		}

		if (_3rd_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_3rd_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_3rd_yr_dep_per(_3rd_yr_dep_per);
		}

		if (_4th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_4th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_4th_yr_dep_per(_4th_yr_dep_per);
		}

		if (_5th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_5th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_5th_yr_dep_per(_5th_yr_dep_per);
		}

		if (_6th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_6th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_6th_yr_dep_per(_6th_yr_dep_per);
		}

		if (_7th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_7th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_7th_yr_dep_per(_7th_yr_dep_per);
		}

		if (_8th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_8th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_8th_yr_dep_per(_8th_yr_dep_per);
		}

		if (_9th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_9th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_9th_yr_dep_per(_9th_yr_dep_per);
		}

		if (_10th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_10th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_10th_yr_dep_per(_10th_yr_dep_per);
		}

		if (_11th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_11th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_11th_yr_dep_per(_11th_yr_dep_per);
		}

		if (_12th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_12th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_12th_yr_dep_per(_12th_yr_dep_per);
		}

		if (_13th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_13th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_13th_yr_dep_per(_13th_yr_dep_per);
		}

		if (_14th_yr_dep_per == null) {
			vehicle_CatalogueImpl.set_14th_yr_dep_per("");
		}
		else {
			vehicle_CatalogueImpl.set_14th_yr_dep_per(_14th_yr_dep_per);
		}

		if (_1st_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_1st_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_1st_yr_dep_val(_1st_yr_dep_val);
		}

		if (_2nd_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_2nd_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_2nd_yr_dep_val(_2nd_yr_dep_val);
		}

		if (_3rd_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_3rd_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_3rd_yr_dep_val(_3rd_yr_dep_val);
		}

		if (_4th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_4th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_4th_yr_dep_val(_4th_yr_dep_val);
		}

		if (_5th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_5th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_5th_yr_dep_val(_5th_yr_dep_val);
		}

		if (_6th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_6th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_6th_yr_dep_val(_6th_yr_dep_val);
		}

		if (_7th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_7th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_7th_yr_dep_val(_7th_yr_dep_val);
		}

		if (_8th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_8th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_8th_yr_dep_val(_8th_yr_dep_val);
		}

		if (_9th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_9th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_9th_yr_dep_val(_9th_yr_dep_val);
		}

		if (_10th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_10th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_10th_yr_dep_val(_10th_yr_dep_val);
		}

		if (_11th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_11th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_11th_yr_dep_val(_11th_yr_dep_val);
		}

		if (_12th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_12th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_12th_yr_dep_val(_12th_yr_dep_val);
		}

		if (_13th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_13th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_13th_yr_dep_val(_13th_yr_dep_val);
		}

		if (_14th_yr_dep_val == null) {
			vehicle_CatalogueImpl.set_14th_yr_dep_val("");
		}
		else {
			vehicle_CatalogueImpl.set_14th_yr_dep_val(_14th_yr_dep_val);
		}

		if (_1st_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_1st_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_1st_yr_flat_val(_1st_yr_flat_val);
		}

		if (_2nd_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_2nd_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_2nd_yr_flat_val(_2nd_yr_flat_val);
		}

		if (_3rd_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_3rd_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_3rd_yr_flat_val(_3rd_yr_flat_val);
		}

		if (_4th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_4th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_4th_yr_flat_val(_4th_yr_flat_val);
		}

		if (_5th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_5th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_5th_yr_flat_val(_5th_yr_flat_val);
		}

		if (_6th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_6th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_6th_yr_flat_val(_6th_yr_flat_val);
		}

		if (_7th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_7th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_7th_yr_flat_val(_7th_yr_flat_val);
		}

		if (_8th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_8th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_8th_yr_flat_val(_8th_yr_flat_val);
		}

		if (_9th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_9th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_9th_yr_flat_val(_9th_yr_flat_val);
		}

		if (_10th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_10th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_10th_yr_flat_val(_10th_yr_flat_val);
		}

		if (_11th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_11th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_11th_yr_flat_val(_11th_yr_flat_val);
		}

		if (_12th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_12th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_12th_yr_flat_val(_12th_yr_flat_val);
		}

		if (_13th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_13th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_13th_yr_flat_val(_13th_yr_flat_val);
		}

		if (_14th_yr_flat_val == null) {
			vehicle_CatalogueImpl.set_14th_yr_flat_val("");
		}
		else {
			vehicle_CatalogueImpl.set_14th_yr_flat_val(_14th_yr_flat_val);
		}

		if (default_flag == null) {
			vehicle_CatalogueImpl.setDefault_flag("");
		}
		else {
			vehicle_CatalogueImpl.setDefault_flag(default_flag);
		}

		if (country_name == null) {
			vehicle_CatalogueImpl.setCountry_name("");
		}
		else {
			vehicle_CatalogueImpl.setCountry_name(country_name);
		}

		if (enddate == null) {
			vehicle_CatalogueImpl.setEnddate("");
		}
		else {
			vehicle_CatalogueImpl.setEnddate(enddate);
		}

		if (order_sequence == null) {
			vehicle_CatalogueImpl.setOrder_sequence("");
		}
		else {
			vehicle_CatalogueImpl.setOrder_sequence(order_sequence);
		}

		vehicle_CatalogueImpl.resetOriginalValues();

		return vehicle_CatalogueImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		vehicleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		automobile_cat_code = objectInput.readUTF();
		automobile_maker_code = objectInput.readUTF();
		automobile_maker_name = objectInput.readUTF();
		automobile_model_code = objectInput.readUTF();
		automobile_model_name = objectInput.readUTF();
		automobile_version_code = objectInput.readUTF();
		automobile_version_name = objectInput.readUTF();
		automobile_sub_type_name = objectInput.readUTF();
		automobile_usage_type_name = objectInput.readUTF();
		automobile_body_type_name = objectInput.readUTF();
		automobile_body_type_desc = objectInput.readUTF();
		automobile_fuel_type_name = objectInput.readUTF();
		automobile_type_name = objectInput.readUTF();
		power = objectInput.readUTF();
		width = objectInput.readUTF();
		surface = objectInput.readUTF();
		weight = objectInput.readUTF();
		vehicle_value = objectInput.readUTF();
		engine_cc = objectInput.readUTF();
		rate_category = objectInput.readUTF();
		doors = objectInput.readUTF();
		allowed = objectInput.readUTF();
		no_of_cylinder = objectInput.readUTF();
		restricted = objectInput.readUTF();
		no_of_seats = objectInput.readUTF();
		engine_type = objectInput.readUTF();
		transmission_type = objectInput.readUTF();
		no_of_gears = objectInput.readUTF();
		final_drive = objectInput.readUTF();
		no_of_axels = objectInput.readUTF();
		lower_threshold = objectInput.readUTF();
		upper_threshold = objectInput.readUTF();
		depreciation_flat = objectInput.readUTF();
		value = objectInput.readUTF();
		_1st_yr_dep_per = objectInput.readUTF();
		_2nd_yr_dep_per = objectInput.readUTF();
		_3rd_yr_dep_per = objectInput.readUTF();
		_4th_yr_dep_per = objectInput.readUTF();
		_5th_yr_dep_per = objectInput.readUTF();
		_6th_yr_dep_per = objectInput.readUTF();
		_7th_yr_dep_per = objectInput.readUTF();
		_8th_yr_dep_per = objectInput.readUTF();
		_9th_yr_dep_per = objectInput.readUTF();
		_10th_yr_dep_per = objectInput.readUTF();
		_11th_yr_dep_per = objectInput.readUTF();
		_12th_yr_dep_per = objectInput.readUTF();
		_13th_yr_dep_per = objectInput.readUTF();
		_14th_yr_dep_per = objectInput.readUTF();
		_1st_yr_dep_val = objectInput.readUTF();
		_2nd_yr_dep_val = objectInput.readUTF();
		_3rd_yr_dep_val = objectInput.readUTF();
		_4th_yr_dep_val = objectInput.readUTF();
		_5th_yr_dep_val = objectInput.readUTF();
		_6th_yr_dep_val = objectInput.readUTF();
		_7th_yr_dep_val = objectInput.readUTF();
		_8th_yr_dep_val = objectInput.readUTF();
		_9th_yr_dep_val = objectInput.readUTF();
		_10th_yr_dep_val = objectInput.readUTF();
		_11th_yr_dep_val = objectInput.readUTF();
		_12th_yr_dep_val = objectInput.readUTF();
		_13th_yr_dep_val = objectInput.readUTF();
		_14th_yr_dep_val = objectInput.readUTF();
		_1st_yr_flat_val = objectInput.readUTF();
		_2nd_yr_flat_val = objectInput.readUTF();
		_3rd_yr_flat_val = objectInput.readUTF();
		_4th_yr_flat_val = objectInput.readUTF();
		_5th_yr_flat_val = objectInput.readUTF();
		_6th_yr_flat_val = objectInput.readUTF();
		_7th_yr_flat_val = objectInput.readUTF();
		_8th_yr_flat_val = objectInput.readUTF();
		_9th_yr_flat_val = objectInput.readUTF();
		_10th_yr_flat_val = objectInput.readUTF();
		_11th_yr_flat_val = objectInput.readUTF();
		_12th_yr_flat_val = objectInput.readUTF();
		_13th_yr_flat_val = objectInput.readUTF();
		_14th_yr_flat_val = objectInput.readUTF();
		default_flag = objectInput.readUTF();
		country_name = objectInput.readUTF();
		enddate = objectInput.readUTF();
		order_sequence = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(vehicleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (automobile_cat_code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_cat_code);
		}

		if (automobile_maker_code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_maker_code);
		}

		if (automobile_maker_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_maker_name);
		}

		if (automobile_model_code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_model_code);
		}

		if (automobile_model_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_model_name);
		}

		if (automobile_version_code == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_version_code);
		}

		if (automobile_version_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_version_name);
		}

		if (automobile_sub_type_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_sub_type_name);
		}

		if (automobile_usage_type_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_usage_type_name);
		}

		if (automobile_body_type_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_body_type_name);
		}

		if (automobile_body_type_desc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_body_type_desc);
		}

		if (automobile_fuel_type_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_fuel_type_name);
		}

		if (automobile_type_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(automobile_type_name);
		}

		if (power == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(power);
		}

		if (width == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(width);
		}

		if (surface == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surface);
		}

		if (weight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(weight);
		}

		if (vehicle_value == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vehicle_value);
		}

		if (engine_cc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(engine_cc);
		}

		if (rate_category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rate_category);
		}

		if (doors == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(doors);
		}

		if (allowed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(allowed);
		}

		if (no_of_cylinder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(no_of_cylinder);
		}

		if (restricted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(restricted);
		}

		if (no_of_seats == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(no_of_seats);
		}

		if (engine_type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(engine_type);
		}

		if (transmission_type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transmission_type);
		}

		if (no_of_gears == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(no_of_gears);
		}

		if (final_drive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(final_drive);
		}

		if (no_of_axels == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(no_of_axels);
		}

		if (lower_threshold == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lower_threshold);
		}

		if (upper_threshold == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(upper_threshold);
		}

		if (depreciation_flat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(depreciation_flat);
		}

		if (value == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(value);
		}

		if (_1st_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_1st_yr_dep_per);
		}

		if (_2nd_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_2nd_yr_dep_per);
		}

		if (_3rd_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_3rd_yr_dep_per);
		}

		if (_4th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_4th_yr_dep_per);
		}

		if (_5th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_5th_yr_dep_per);
		}

		if (_6th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_6th_yr_dep_per);
		}

		if (_7th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_7th_yr_dep_per);
		}

		if (_8th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_8th_yr_dep_per);
		}

		if (_9th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_9th_yr_dep_per);
		}

		if (_10th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_10th_yr_dep_per);
		}

		if (_11th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_11th_yr_dep_per);
		}

		if (_12th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_12th_yr_dep_per);
		}

		if (_13th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_13th_yr_dep_per);
		}

		if (_14th_yr_dep_per == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_14th_yr_dep_per);
		}

		if (_1st_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_1st_yr_dep_val);
		}

		if (_2nd_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_2nd_yr_dep_val);
		}

		if (_3rd_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_3rd_yr_dep_val);
		}

		if (_4th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_4th_yr_dep_val);
		}

		if (_5th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_5th_yr_dep_val);
		}

		if (_6th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_6th_yr_dep_val);
		}

		if (_7th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_7th_yr_dep_val);
		}

		if (_8th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_8th_yr_dep_val);
		}

		if (_9th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_9th_yr_dep_val);
		}

		if (_10th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_10th_yr_dep_val);
		}

		if (_11th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_11th_yr_dep_val);
		}

		if (_12th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_12th_yr_dep_val);
		}

		if (_13th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_13th_yr_dep_val);
		}

		if (_14th_yr_dep_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_14th_yr_dep_val);
		}

		if (_1st_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_1st_yr_flat_val);
		}

		if (_2nd_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_2nd_yr_flat_val);
		}

		if (_3rd_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_3rd_yr_flat_val);
		}

		if (_4th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_4th_yr_flat_val);
		}

		if (_5th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_5th_yr_flat_val);
		}

		if (_6th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_6th_yr_flat_val);
		}

		if (_7th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_7th_yr_flat_val);
		}

		if (_8th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_8th_yr_flat_val);
		}

		if (_9th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_9th_yr_flat_val);
		}

		if (_10th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_10th_yr_flat_val);
		}

		if (_11th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_11th_yr_flat_val);
		}

		if (_12th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_12th_yr_flat_val);
		}

		if (_13th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_13th_yr_flat_val);
		}

		if (_14th_yr_flat_val == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(_14th_yr_flat_val);
		}

		if (default_flag == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(default_flag);
		}

		if (country_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country_name);
		}

		if (enddate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(enddate);
		}

		if (order_sequence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(order_sequence);
		}
	}

	public String uuid;
	public long vehicleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String automobile_cat_code;
	public String automobile_maker_code;
	public String automobile_maker_name;
	public String automobile_model_code;
	public String automobile_model_name;
	public String automobile_version_code;
	public String automobile_version_name;
	public String automobile_sub_type_name;
	public String automobile_usage_type_name;
	public String automobile_body_type_name;
	public String automobile_body_type_desc;
	public String automobile_fuel_type_name;
	public String automobile_type_name;
	public String power;
	public String width;
	public String surface;
	public String weight;
	public String vehicle_value;
	public String engine_cc;
	public String rate_category;
	public String doors;
	public String allowed;
	public String no_of_cylinder;
	public String restricted;
	public String no_of_seats;
	public String engine_type;
	public String transmission_type;
	public String no_of_gears;
	public String final_drive;
	public String no_of_axels;
	public String lower_threshold;
	public String upper_threshold;
	public String depreciation_flat;
	public String value;
	public String _1st_yr_dep_per;
	public String _2nd_yr_dep_per;
	public String _3rd_yr_dep_per;
	public String _4th_yr_dep_per;
	public String _5th_yr_dep_per;
	public String _6th_yr_dep_per;
	public String _7th_yr_dep_per;
	public String _8th_yr_dep_per;
	public String _9th_yr_dep_per;
	public String _10th_yr_dep_per;
	public String _11th_yr_dep_per;
	public String _12th_yr_dep_per;
	public String _13th_yr_dep_per;
	public String _14th_yr_dep_per;
	public String _1st_yr_dep_val;
	public String _2nd_yr_dep_val;
	public String _3rd_yr_dep_val;
	public String _4th_yr_dep_val;
	public String _5th_yr_dep_val;
	public String _6th_yr_dep_val;
	public String _7th_yr_dep_val;
	public String _8th_yr_dep_val;
	public String _9th_yr_dep_val;
	public String _10th_yr_dep_val;
	public String _11th_yr_dep_val;
	public String _12th_yr_dep_val;
	public String _13th_yr_dep_val;
	public String _14th_yr_dep_val;
	public String _1st_yr_flat_val;
	public String _2nd_yr_flat_val;
	public String _3rd_yr_flat_val;
	public String _4th_yr_flat_val;
	public String _5th_yr_flat_val;
	public String _6th_yr_flat_val;
	public String _7th_yr_flat_val;
	public String _8th_yr_flat_val;
	public String _9th_yr_flat_val;
	public String _10th_yr_flat_val;
	public String _11th_yr_flat_val;
	public String _12th_yr_flat_val;
	public String _13th_yr_flat_val;
	public String _14th_yr_flat_val;
	public String default_flag;
	public String country_name;
	public String enddate;
	public String order_sequence;
}