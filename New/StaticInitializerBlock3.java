package com.cdac1;

import java.util.Scanner;

class StaticTest1{
	
	private int num1;
	private int num2;
	private static int num3;
	
	//STATIC INITIALIZER BLOCK FOR NUM3
	static {
		StaticTest1.num3=0;
	}

	public StaticTest1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public StaticTest1() {
		// TODO Auto-generated constructor stub
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static int getNum3() {
		return num3;
	}

	public static void setNum3(int num3) {
		StaticTest1.num3 = num3;
	}
	
	
	
}
public class StaticInitializerBlock3 {

	Scanner sc = new Scanner(System.in);
	 public void acceptRecord(StaticTest1 st) {
			
			System.out.println("Enter Num1: ");
			st.setNum1(sc.nextInt());
			
			System.out.println("Enter Num2: ");
			st.setNum2(sc.nextInt());
			
			System.out.println("Enter Num3: ");
	        st.setNum3(sc.nextInt());
			
		}
	     public void printRecord(StaticTest1 st) {
	    	 
	    	 System.out.println("Num1: "+st.getNum1());
	    	 System.out.println("Num2: "+st.getNum2());
	    	 System.out.println("Num3: "+st.getNum3());
	     }
	
	public static void main(String[] args) {
	StaticTest1 st = new StaticTest1();
	
	StaticInitializerBlock3 stb = new StaticInitializerBlock3();
	stb.acceptRecord(st);
	stb.printRecord(st);
	}
	
}
