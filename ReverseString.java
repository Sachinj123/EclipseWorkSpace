package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str1 = sc.next();
		
		String reverse=" ";
		for( int i=str1.length()-1;i>=0;i--) {
			reverse = reverse+ str1.charAt(i);
		}
		
		System.out.println("Before Reversed:"+str1);
		System.out.println("After Reversed:"+reverse);

	}

}
