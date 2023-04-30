package day_14_octo;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg = 0;
		System.out.println("Enter Array Size:");
		int n = sc.nextInt();
		
		int [] ar = new int [n];
		
		System.out.println("Enter Array Elements:");
		for(int i=0;i<=ar.length-1;i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("The Sum of Array elements is :");
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println(sum);
		
		System.out.println("The AVG of Array elements is :");
		for(int i=0;i<ar.length;i++) {
			avg=sum/ar.length;
		}
		System.out.println(avg);

	}

}
