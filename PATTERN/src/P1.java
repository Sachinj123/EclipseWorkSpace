import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want to print this pattern");
		int rows = sc.nextInt();
		System.out.println("Here is your Pattern");
		// LOGIC FOR PRINTING FOR UPPER TRIANGLE
		for(int i=rows;i>=1;i--)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
			
		}
		// LOGIC FOR PRINTING FOR LOWER TRIANGLE
		for(int i=2;i<rows;i++) 
		{
			for (int j=i;j<=rows;j++) 
			{
				System.out.print(i+" ");
				
			}
			System.out.println(" ");
		}
		
	}

}
