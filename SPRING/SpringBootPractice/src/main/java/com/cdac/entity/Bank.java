package com.cdac.entity;

import java.util.List;

public class Bank {
	
	private String Name;
	private String Address;
	private int IFSC_Code;
	
	private List<User> user;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getIFSC_Code() {
		return IFSC_Code;
	}

	public void setIFSC_Code(int iFSC_Code) {
		IFSC_Code = iFSC_Code;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
	
	

}
