package com.app.bean;

import java.io.Serializable;

public class Customer implements Serializable {
    
	private String firstName;
	private String lastName;
	private String email;
	private boolean status;
	
	public Customer() {
		
	}
	public Customer(String fn, String ln, String el, boolean sts) {
		firstName=fn;
		lastName = ln;
		email = el;
		status = sts;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
