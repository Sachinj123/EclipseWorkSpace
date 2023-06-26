package com.string;

import java.util.Scanner;

public class DuplicateCharactersInString {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str =sc.next();
		
		char [] string = str.toCharArray();
		
		for( int i=0;i<str.length();i++) {
			int count=0;
			
			for(int j=i+1;i<str.length();i++) {
				if(string[i] == string[j] ) {
					count++;
					string[j] ='0';
				}
			}
			if(count >1 && string[i] !='0') {
				System.out.println(string[i]);
			}
		}

	}

}
