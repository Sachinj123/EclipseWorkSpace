import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		System.out.println("Before Swap:->");
		System.out.println("The Num1:"+num1);
		
		System.out.println("The Num2:"+num2);
		System.out.println("After Swap:->");
		{
			int temp = num1;
			num1=num2;
			num2=temp;
		}
		System.out.println("The Num1:"+num1);
		
		System.out.println("The Num2:"+num2);

	}

}
