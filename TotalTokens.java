package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TotalTokens {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		//sc.nextLine();
		String str = sc.nextLine();
		
		StringTokenizer stk = new StringTokenizer(str);
		System.out.println("Total Counts:"+stk.countTokens());

	}

}
