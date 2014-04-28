package com.yahram.controller;

public class Countries {
	private String countryCode;
	private String countryName;
	
	public Countries(){
		super();
	}
	
	public Countries(String countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Countries [countryCode=" + countryCode + ", countryName="
				+ countryName + "]";
	}
	
	

}
