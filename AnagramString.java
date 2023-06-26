package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		//String str1 = "sachin";
		//String str2 = "nihcas";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String:");
		String str1 = sc.next();
		
		System.out.println("Enter Second String:");
		String str2 = sc.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("Both Strings are not Anagrams:");
		}
		else {
			char [] string1 = str1.toCharArray();
			char [] string2 = str1.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)) {
				System.out.println("Both Strings are Anagrams:");
			}
			else {

				System.out.println("Both Strings are not Anagrams:");
			}
		}

	}

}
