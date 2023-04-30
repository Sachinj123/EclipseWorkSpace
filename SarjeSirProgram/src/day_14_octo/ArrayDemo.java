package day_14_octo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The size of the Array:");
		int n = sc.nextInt();
		
		int [] ar = new int[n];
		
		System.out.println("Enter Array elements : ");
		for(int i=0;i<=ar.length-1;i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Array Output:"+Arrays.toString(ar));
		

	}

}
