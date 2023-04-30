package com.cdac;

import java.util.Scanner;

class Acc {
	Scanner sc = new Scanner(System.in);
	
	private int number;
	private String type;
	private double balance;
	
	public Acc(int number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	public void acceptRecord(){
		System.out.println("Enter Number:");
		number = sc.nextInt();
		
		System.out.println("Enter Type:");
		sc.nextLine();
		type = sc.nextLine();
		
		System.out.println("Enter Balance:");
		balance = sc.nextDouble();
	}
	
	public void printRecord() {
		System.out.println("NUMBER: "+this.number);
		System.out.println("TYPE: "+this.type);
		System.out.println("Balance: "+this.balance);
	}
	
}
	
public class Program {

	public static void main(String[] args) {
		
		Acc a = new Acc(0, null, 0);
		a.acceptRecord();
		a.printRecord();
		

	}

}
