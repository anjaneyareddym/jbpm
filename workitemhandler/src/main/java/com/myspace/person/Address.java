package com.myspace.person;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String locationType;

	private java.lang.String door;

	private java.lang.String area;

	private java.lang.String landMark;

	public Address() {
	}

	public java.lang.String getLocationType() {
		return this.locationType;
	}

	public void setLocationType(java.lang.String locationType) {
		this.locationType = locationType;
	}

	public java.lang.String getDoor() {
		return this.door;
	}

	public void setDoor(java.lang.String door) {
		this.door = door;
	}

	public java.lang.String getArea() {
		return this.area;
	}

	public void setArea(java.lang.String area) {
		this.area = area;
	}

	public java.lang.String getLandMark() {
		return this.landMark;
	}

	public void setLandMark(java.lang.String landMark) {
		this.landMark = landMark;
	}

	public Address(java.lang.String locationType, java.lang.String door,
			java.lang.String area, java.lang.String landMark) {
		this.locationType = locationType;
		this.door = door;
		this.area = area;
		this.landMark = landMark;
	}

}