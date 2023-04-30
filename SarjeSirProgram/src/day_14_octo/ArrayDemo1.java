package day_14_octo;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size:");
		int n = sc.nextInt();
		
		int [] ar = new int [n];
		
		//HERE WE PROVIDE THE ARRAY ELEMENTS:
		System.out.println("Enter Array Elements:");
		for(int i=0;i<ar.length-1;i++) {
			ar[i] = sc.nextInt();
		}
		
		//HERE WE PRINT THE ARRAY ELEMENTS:
		System.out.println("Array Elements Are:");
		for(int a:ar) {
			System.out.println(a);
		}
		

	}

}
