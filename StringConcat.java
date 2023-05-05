package com.cdac.thread;

public class StringConcat {

	public static void main(String[] args) {
		
		String str1 = "Sachin";
		String str2 = "Jadhav";
		
		String str3 = str1.concat(" "+str2);
		System.out.println(str3);
		
		String str4 = str1+" "+str2;
		System.out.println(str4);
		
		StringBuilder str5 = new StringBuilder("Sachin");
		StringBuilder str6= new StringBuilder("Jadhav");
		StringBuilder str7 = str5.append(" "+str6);
		System.out.println(str7);
		
		
 
	}

}
