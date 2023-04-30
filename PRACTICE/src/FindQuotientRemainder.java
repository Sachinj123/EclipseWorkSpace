import java.util.Scanner;

public class FindQuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// For Finding Ouotient use '%'
	// For Finding Remainder use '/'
		System.out.println("Enter dividend");
		int dividend = sc.nextInt();
		System.out.println("Enter divisor ");
		int divisor = sc.nextInt();
		
		 int remainder = dividend%divisor;
		 int Quotient = dividend/divisor;
		 
		 System.out.println("The Remainder is:"+remainder);
		 System.out.println("The Quetient is :"+Quotient);

	}

}
