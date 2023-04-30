package second;

import java.util.Scanner;

public class Throw1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter num1:");
			int num1 = sc.nextInt();
			System.out.println("Enter num2:");
			int num2 = sc.nextInt();
			
			if(num2==0)
			{
				throw new ArithmeticException("Divide by Zero Exception");
			}
			else
			{
				int result = num1/num2;
				System.out.println("RESULT:"+result);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
