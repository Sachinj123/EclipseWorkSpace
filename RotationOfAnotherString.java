package com.string;

import java.util.Scanner;

public class RotationOfAnotherString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String:");
		String str1 = sc.next();
		
		System.out.println("Enter Second String:");
		String str2 = sc.next();
		
		if(str1.length() != str2.length()) {
			System.out.println("Both Strings are not Rotation:");
		}
		else {
			str1 = str1.concat(str2);
			if(str1.indexOf(str2) !=-1) {
				System.out.println("Second String is Rotation of First String ");
			}
			else
			{
				System.out.println("Second String is not Rotation of First String ");
				
			}
		}
		
		

	}

}
