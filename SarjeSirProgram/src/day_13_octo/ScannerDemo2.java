package day_13_octo;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : " );
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		
		int num3 = num1+num2;
		System.out.println("Sum of"+ num1 +" and "+ num2 +" is: "+num3);
		System.out.println("Sum : "+num3);

	}

}
