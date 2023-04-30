package com.cdac;

import java.util.Scanner;

class Account1{
	
	Scanner sc = new Scanner(System.in);
	private int number;
	private String type;
	private double balance;
	
	public Account1(int number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void AcceptRecord(Account1 acc){
		System.out.println("Enter Number: ");
		acc.setNumber(sc.nextInt());
		
		System.out.println("Enter Type: ");
		sc.nextLine();
		acc.setType(sc.nextLine());
		
		System.out.println("Enter Balance: ");
		acc.setBalance(sc.nextDouble());
		
	}
	
	public void printRecord(Account1 acc) {
		System.out.println("Account Number: "+acc.getNumber());
		System.out.println("Account Type:"+acc.getType());
		System.out.println("Account Balanace: "+acc.getBalance());
	}
}

public class ProgramGetterandSetter {

	public static void main(String[] args) {
	   Account1 acc = new Account1(0, null, 0);
	   acc.AcceptRecord(acc);
	   acc.printRecord(acc);

	}

}
