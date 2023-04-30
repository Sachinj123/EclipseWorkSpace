// HERE WE CANT TERMINATE FINALLY BLOCK FORCEFULLY

package second;

import java.util.Scanner;

public class Finally1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Inside Try");
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
			System.out.println("Inside Catch");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Inside Finally");
			sc.close();
		}

	}

}
