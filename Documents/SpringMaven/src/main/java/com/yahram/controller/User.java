package com.yahram.controller;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L; 
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Integer mobile;
	private String address;
	private String pc;
	private String country;
	public User(String firstName, String lastName, String email,
			String password, Integer mobile, String address, String pc,
			String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.pc = pc;
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", address=" + address + ", pc=" + pc + ", country="
				+ country + "]";
	}
	
	

}
