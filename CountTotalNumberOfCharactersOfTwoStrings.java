package com.string;

import java.util.Scanner;

public class CountTotalNumberOfCharactersOfTwoStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1 = sc.next();
		int count1 =0;
		
		System.out.println("Enter Second String:");
		String str2 = sc.next();
		int count2 =0;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i ) !=' ') {
				count1++;
			}
		}
		System.out.println("First String Length: "+count1);
		
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i ) !=' ') {
				count2++;
			}
		}
		
		System.out.println("Second String Length: "+count2);
		
		if(count1 > count2) {
			System.out.println("First String is Largest");
		}
		
		else {
			System.out.println("Second String Largest");
		}

	}

}
