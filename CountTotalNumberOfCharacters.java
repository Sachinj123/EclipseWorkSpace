package com.string;

import java.util.Scanner;

public class CountTotalNumberOfCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ')
			{
				count++;
			}
		}
		System.out.println("Total Characters in String :"+count);
	}

}
