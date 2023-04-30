import java.util.Scanner;

public class IntToDouble {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// DOUBLE TO INT
		System.out.println("Enter Double To Convert into Integer");
		double d1 = sc.nextDouble();
		int num1 =(int) d1;
		System.out.println("AFTER CONVERSION DOUBLE TO INT :"+num1);
		
		/*double d1 = 12.5;
		int num1=(int) d1;
		*/
	}

	public static void main1(String[] args) {
		//INT -> float -> double -> long
		//int num1 = 14;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number to convert into Double");
		int number = sc.nextInt();
		Double d1 = (double) number;
		System.out.println("AFTER CONVERSION INT TO DOUBLE:"+d1);
		

	}

}
