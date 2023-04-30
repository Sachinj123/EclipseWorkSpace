package com.cdac;



class staticTest{
	private static int num1;
	private static int num2;
	private static int num3;
	
	static {
		staticTest.num1=10;
		staticTest.num2=20;
		staticTest.num3=30;
	}
	
	public void printRecord() {
		System.out.println("NUM1: "+staticTest.num1);
		System.out.println("NUM2: "+staticTest.num2);
		System.out.println("NUM3: "+staticTest.num3);
	}
}
public class StaticInitializerBlock1 {

	public static void main(String[] args) {
		
		staticTest st = new staticTest();
		st.printRecord();

	}

}
