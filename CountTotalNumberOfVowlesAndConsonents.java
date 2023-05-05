package com.string;

import java.util.Scanner;

public class CountTotalNumberOfVowlesAndConsonents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		
		String str = sc.next();
		
		int vCount=0,cCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) =='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vCount++;
			}
		}
		System.out.println("Total Vowles in String:"+vCount);
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >='a' && str.charAt(i) <='z') {
				cCount++;
			}
		}
		System.out.println("Total Consonent in String:"+cCount);

	}

}
