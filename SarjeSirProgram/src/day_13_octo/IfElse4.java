package day_13_octo;

import java.util.Scanner;

public class IfElse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks =sc.nextInt();
		
		if(marks >= 90 && marks<=100)
			System.out.println("Grade A");
		else if (marks >=75 && marks<=90)
			System.out.println("Grade B");
		else if(marks>=60 && marks<=75)
			System.out.println("Grade C");
		else if(marks>=40 && marks<=60)
			System.out.println("Grade D");
		else
			System.out.println("Fail");

	}

}
