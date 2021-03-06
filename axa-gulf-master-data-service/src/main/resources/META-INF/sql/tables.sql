create table glf_Vehicle_Catalogue (
	uuid_ VARCHAR(75) null,
	vehicleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	automobile_cat_code VARCHAR(75) null,
	automobile_maker_code VARCHAR(75) null,
	automobile_maker_name VARCHAR(75) null,
	automobile_model_code VARCHAR(75) null,
	automobile_model_name VARCHAR(75) null,
	automobile_version_code VARCHAR(75) null,
	automobile_version_name VARCHAR(75) null,
	automobile_sub_type_name VARCHAR(75) null,
	automobile_usage_type_name VARCHAR(75) null,
	automobile_body_type_name VARCHAR(75) null,
	automobile_body_type_desc VARCHAR(75) null,
	automobile_fuel_type_name VARCHAR(75) null,
	automobile_type_name VARCHAR(75) null,
	power VARCHAR(75) null,
	width VARCHAR(75) null,
	surface VARCHAR(75) null,
	weight VARCHAR(75) null,
	vehicle_value VARCHAR(75) null,
	engine_cc VARCHAR(75) null,
	rate_category VARCHAR(75) null,
	doors VARCHAR(75) null,
	allowed VARCHAR(75) null,
	no_of_cylinder VARCHAR(75) null,
	restricted VARCHAR(75) null,
	no_of_seats VARCHAR(75) null,
	engine_type VARCHAR(75) null,
	transmission_type VARCHAR(75) null,
	no_of_gears VARCHAR(75) null,
	final_drive VARCHAR(75) null,
	no_of_axels VARCHAR(75) null,
	lower_threshold VARCHAR(75) null,
	upper_threshold VARCHAR(75) null,
	depreciation_flat VARCHAR(75) null,
	value VARCHAR(75) null,
	_1st_yr_dep_per VARCHAR(75) null,
	_2nd_yr_dep_per VARCHAR(75) null,
	_3rd_yr_dep_per VARCHAR(75) null,
	_4th_yr_dep_per VARCHAR(75) null,
	_5th_yr_dep_per VARCHAR(75) null,
	_6th_yr_dep_per VARCHAR(75) null,
	_7th_yr_dep_per VARCHAR(75) null,
	_8th_yr_dep_per VARCHAR(75) null,
	_9th_yr_dep_per VARCHAR(75) null,
	_10th_yr_dep_per VARCHAR(75) null,
	_11th_yr_dep_per VARCHAR(75) null,
	_12th_yr_dep_per VARCHAR(75) null,
	_13th_yr_dep_per VARCHAR(75) null,
	_14th_yr_dep_per VARCHAR(75) null,
	_1st_yr_dep_val VARCHAR(75) null,
	_2nd_yr_dep_val VARCHAR(75) null,
	_3rd_yr_dep_val VARCHAR(75) null,
	_4th_yr_dep_val VARCHAR(75) null,
	_5th_yr_dep_val VARCHAR(75) null,
	_6th_yr_dep_val VARCHAR(75) null,
	_7th_yr_dep_val VARCHAR(75) null,
	_8th_yr_dep_val VARCHAR(75) null,
	_9th_yr_dep_val VARCHAR(75) null,
	_10th_yr_dep_val VARCHAR(75) null,
	_11th_yr_dep_val VARCHAR(75) null,
	_12th_yr_dep_val VARCHAR(75) null,
	_13th_yr_dep_val VARCHAR(75) null,
	_14th_yr_dep_val VARCHAR(75) null,
	_1st_yr_flat_val VARCHAR(75) null,
	_2nd_yr_flat_val VARCHAR(75) null,
	_3rd_yr_flat_val VARCHAR(75) null,
	_4th_yr_flat_val VARCHAR(75) null,
	_5th_yr_flat_val VARCHAR(75) null,
	_6th_yr_flat_val VARCHAR(75) null,
	_7th_yr_flat_val VARCHAR(75) null,
	_8th_yr_flat_val VARCHAR(75) null,
	_9th_yr_flat_val VARCHAR(75) null,
	_10th_yr_flat_val VARCHAR(75) null,
	_11th_yr_flat_val VARCHAR(75) null,
	_12th_yr_flat_val VARCHAR(75) null,
	_13th_yr_flat_val VARCHAR(75) null,
	_14th_yr_flat_val VARCHAR(75) null,
	default_flag VARCHAR(75) null,
	country_name VARCHAR(75) null,
	enddate VARCHAR(75) null,
	order_sequence VARCHAR(75) null
);