
public class P3 {

	public static void main(String[] args) {
		pattern3(5);

	}
	static void pattern3(int n) {
		System.out.println("THIS IS YOUR PATTERN");
		System.out.println(" ");
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
