package second;

import java.util.Scanner;

public class Saket {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Salary:");
		float sal = sc.nextFloat();
		
		System.out.println("Enter Name:");
		sc.nextLine();
		String str = sc.nextLine();
		
		System.out.println("AGE:"+age);
		System.out.println("SALARY:"+sal);
		System.out.println("Name:"+str);
		
		

	}

}
