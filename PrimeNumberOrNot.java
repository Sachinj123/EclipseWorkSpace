package com.string;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Check Prime Or Not:");
		int num1 = sc.nextInt();
		
		Boolean flag = false;
		for( int i=2;i<num1/2;i++) {
			if(num1 % i ==0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num1+ " is a prime number");
		}
		else {
			System.out.println(num1+ " is not a prime number");
		}

	}

}
