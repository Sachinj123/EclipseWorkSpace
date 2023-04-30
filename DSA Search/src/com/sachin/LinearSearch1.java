package com.sachin;

import java.util.Scanner;

public class LinearSearch1 {
	
	public static int linearSearch(int [] ar,int Key) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key Element to Search Into Array");
		int Key1 = sc.nextInt();
		
		if(Key1 == ar[i]) 
		{
			return i;
			
		}
	
		
	}
	
	public static void main(String[] args) {
		int [] ar =  {10,20,30,40,50,60};
		
		int index = linearSearch(ar, 10);
		
		System.out.println("The key is at"+index);
		
	}

}
