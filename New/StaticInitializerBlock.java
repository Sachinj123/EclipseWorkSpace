package com.cdac;

class Test1{
	
	private int num1;
	private int num2;
	private static int num3;
	
	public Test1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	static {
		//STATIC INITIALIZER BLOCK
		Test1.num3=500;
	}
	
	public void printRecord() {
		
		System.out.println("NUM1: "+this.num1);
		System.out.println("NUM1: "+this.num2);

		System.out.println("NUM1: "+Test1.num3);

	}
	
	
}

public class StaticInitializerBlock {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1(10, 20);
		Test1 t2 = new Test1 (15,25);
		Test1 t3 = new Test1(100, 200);
		
		t1.printRecord();
		t2.printRecord();
		t3.printRecord();
		

	}

}
