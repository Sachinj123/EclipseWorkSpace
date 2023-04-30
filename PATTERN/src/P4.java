
// V.V.IMP PATTERN
public class P4 {

	public static void main(String[] args) {
		pattern4(5);

	}
	
	static void pattern4(int n) {
		System.out.println("THIS IS YOUR PATTERN");
		System.out.println(" ");
		for(int row=0;row<2*n;row++)
		{
			int totalColsInRow= row>n ? 2*n-row:row;
			for(int col=0;col<totalColsInRow;col++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
