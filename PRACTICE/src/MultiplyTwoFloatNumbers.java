import java.util.Scanner;

public class MultiplyTwoFloatNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Num1");
		float num1 = sc.nextFloat();
		System.out.println("Enter Num2");
		float num2 = sc.nextFloat();
		float num3 = num1*num2;
		System.out.println("Multiplication of two Float values :"+num3);

	}

}
