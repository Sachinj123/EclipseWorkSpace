package second;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter num1:");
			int num1 = sc.nextInt();
			System.out.println("Enter num2:");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			System.out.println("RESULT:"+result);
		}catch (Exception e) {
			System.out.println("Exception SuperClass");
			e.printStackTrace();
		} 
		
		
		// HE PN AAPAN USE KARU SHAKTO EXCEPTION CHYA JAGEVAR
		/*catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			e.printStackTrace();
		}*/
		

	}
	

}
