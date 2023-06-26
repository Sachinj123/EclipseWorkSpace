package com.cdac.entity;

import java.time.LocalDate;

public class User {
	
	private String UserName;
	private String UserAddress;
	
	private LocalDate dateofbirth;
	private int AccountNo;
	
	private Gender gender;
	private AccountType accountType;
	
	public static enum Gender{
		MALE,FEMALE,OTHER;
	}
	
	public static enum AccountType{
		CURRENT,SAVINGS,LOAN,STUDENTS;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	
}
