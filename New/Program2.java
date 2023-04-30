package com.cdac;
//THIS PROGRAM IS WITHOUT STATIC INITIALIZER BLOCK
//IF WE WANT TO TO USE SAME ELEMENTS IN ALL 3 OBJECTS WITHOUT STATIC INITIALIZER BLOCK
class Test{
	
	private int num1;
	private int num2;
	private int num3;
	
	public Test(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3=500;
	}
	
	public void printRecord() {
		
		System.out.println("NUMBER1: "+this.num1);
		System.out.println("NUMBER2: "+this.num2);
		System.out.println("NUMBER3: "+this.num3);
	}
	
	
}
public class Program2 {

	public static void main(String[] args) {
		
		Test test = new Test(10, 20);
		Test t1 = new Test(45, 18);
		Test t2 = new Test(90, 60);
		
		test.printRecord();
		t1.printRecord();
		t2.printRecord();
		

	}

}
