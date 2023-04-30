package com.sachin;

import java.util.Arrays;

public class SelectionSort1 {
	
	public static void selectionSort(int [] ar)
	{
		for (int i=0;i<ar.length-1;i++)
		{
			for (int j=i+1;j<ar.length;j++)
			{
				if (ar[i]>ar[j])
				{
					//If Condition True >> Swapping Takes places
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			// System.out.println(Arrays.toString(ar));
		}
	}

	public static void main(String[] args) {
		int [] ar = {9,5,4,7,1,6,8,2,3};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2 ==0) {
				sum = sum+ar[i];
			}
		}
		System.out.println("Selection Sort");
		System.out.println("Before :" +Arrays.toString(ar));
		selectionSort(ar);;
		System.out.println("After :" +Arrays.toString(ar));
		System.out.println("Sum of All Even Number :" +sum);
		

	}


}
