// V.V.IMP PROGRAMM 
public class P6 {

	public static void main(String[] args) {
		pattern6(5);
		

	}
	static void pattern6(int n) {
		System.out.println("THIS IS YOUR PATTERN");
		//System.out.println(" ");
		for(int row=0;row < 2*n;row++)
		{
			// THIS IS THE FORMULA FOR CALCULATING PER COLUMNS IN ROWS
			
			int totalColsInRow = row > n ? 2*n-row : row;
			// THIS IS THE FORMULA FOR CALCULATING THE NUMBER SPACES BEFORE STAR
			
			int noOfSpaces = n-totalColsInRow;
			
			for(int s=0;s<noOfSpaces;s++)
			{
				System.out.print(" ");
			}
			for(int col=0;col < totalColsInRow;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
