package day_14_octo;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num=sc.nextInt();
		do {
			System.out.println(num);
			num++;
			
		}while(num<10);

	}

}
