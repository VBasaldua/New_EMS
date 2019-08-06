package com.collabera.retailtester;

public class Address {
	private int doorNumber;
	private String street;
	
	private String city;
	private String state;
	private int zip;
	private int apartment;
	
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getApartment() {
		return apartment;
	}
	public void setApartment(int apartment) {
		this.apartment = apartment;
	}
	@Override
	public String toString() {
		return  "Address [doorNumber=" + doorNumber + ", street=" + street + ", state=" + state + ", zip=" + zip
				+ ", apartment=" + apartment + "]";
	}

}
