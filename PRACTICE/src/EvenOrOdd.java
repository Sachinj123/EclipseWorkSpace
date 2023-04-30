import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to check");
		int number = sc.nextInt();
		
		if(number%2==0)
			System.out.println("The Entered number is EVEN");
		else
			System.out.println("The Entered number is ODD");
	}

}
