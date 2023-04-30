package com.cdac;

class Account{
	private int number;
	private String type;
	private double balance;
	
	public Account() {
		//WITH THE USE OF "THIS" WE CAN ACHIEVE THE CONSTRUCTOR CHAINING
		this(1,"saving",1245.12);
	}

	public Account(int number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	public void print() {
		System.out.println("Account Number: "+this.number);
		System.out.println("Account Type: "+this.type);
		System.out.println("Account Balance: "+this.balance);
	}
	
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.print();

	}

}
