package day_14_octo;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int a = sc.nextInt();
		while(a<10) {
			System.out.println(a);
			a++;
		}

	}

}
