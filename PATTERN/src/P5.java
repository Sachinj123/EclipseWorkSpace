
public class P5 {

	public static void main(String[] args) {
		pattern5(5);
		

	}
	static void pattern5(int n) {
		System.out.println("THIS IS YOUR PATTERN");
		System.out.println(" ");
		for (int row=0;row<2*n;row++)
		{
			int totalColsInRow = row>n ? 2*n-row : row;
			for(int col=0;col<totalColsInRow;col++)
			{
				System.out.print(row+" ");
			}
			System.out.println(" ");
		}
	}

}
