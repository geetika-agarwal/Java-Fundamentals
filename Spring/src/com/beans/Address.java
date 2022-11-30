package com.beans;

public class Address {
	String buildingName, areaName, cityName;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}

}
