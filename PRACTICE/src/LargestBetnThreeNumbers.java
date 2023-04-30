import java.util.Scanner;

public class LargestBetnThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		System.out.println("Enter num3");
		int num3 = sc.nextInt();
		
		if( num1>num2 && num1>num3)
			System.out.println("The Greatest Number is :"+num1);
		
		else if(  num2>num3)
			System.out.println("The Greatest Number is :"+num2);
		
		else( num3>num1 && num3>num2)  
		
		     System.out.println("The Greatest Number is :"+num3);
			
		
			
     }

}
