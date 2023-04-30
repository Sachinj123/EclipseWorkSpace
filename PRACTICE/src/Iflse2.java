import java.util.Scanner;
public class Iflse2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		if (num1%2 == 0)
		{
			System.out.println("Not Weird");
		}
		else 
		{
			System.out.println("Weird");
		}
	}

}
