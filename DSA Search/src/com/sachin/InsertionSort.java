package com.sachin;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int [] ar) {
		for(int i=0;i<ar.length;i++)
		{
			for (int j=i+1;j>0;j--) {
				if (ar[j] > ar[j-1])
				{
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
				else {
					break ;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int [] ar = {12,57,98,5,6};
		System.out.println("Insertion Sort");
		System.out.println("BEFORE:"+Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("AFTER:"+Arrays.toString(ar));
		
	}	

}
