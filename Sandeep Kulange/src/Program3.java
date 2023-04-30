package second;

import java.util.Scanner;

class Test1{
	private int num1;
	private int num2;
	private static int num3;
	static{
		// HERE IF CANT INITIALISE THE THE VALUE OF NUM3 THE PROGRAMM GIVES US ERROR
		Test1.num3=0;
	}
	public Test1() {
		// PARAMETERLESS CONSTRUCTOR 
	}
	public Test1(int num1, int num2) {
		// PARAMETERESED CONSTRUCTOR
		this.num1 = num1;
		this.num2 = num2;
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
		Test1.num3 = num3;
	}
	
}

public class Program3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(Test1 test) {
		System.out.println("Enter num1");
		test.setNum1(sc.nextInt());
		System.out.println("Enter num2");
		test.setNum2(sc.nextInt());
		System.out.println("Enter num3");
		Test1.setNum3(sc.nextInt());
		
	}
	
	public static void printRecord(Test1 test) {
		System.out.println("NUM1 ->"+test.getNum1());
		System.out.println("NUM2 ->"+test.getNum2());
		System.out.println("NUM3 ->"+Test1.getNum3());
		
	}

	public static void main(String[] args) {
		Test1 test = new Test1();
		Program3.acceptRecord(test);
		Program3.printRecord(test);
		

	}

}
