package day_13_octo;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Character:");
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'u' || ch == 'o' ) {
			System.out.println("The Entered Character is Vowel ");
		}
		else {
			System.out.println("The Entered Character is Consonent");
		}

	}

}
