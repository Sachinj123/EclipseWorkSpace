
public class LeftRotate {

	public static void main(String[] args) {
		// ARRAY DECLARATION
		int [] ar1 = new int [] {5,9,71,50,45,18,97,59};
		int n=5;
		
		// PRINT ORIGINAL ARRAY
		try {
			System.out.println("ORIGINAL ARRAY");
			for(int i=0;i<ar1.length;i++)
			{
				System.out.print(ar1[i]+" ");
			}
			
			for(int i=0;i<n;i++)
			{
				int j,first;
				first = ar1[0];
				for( j=0;j<ar1.length-1;j++)
				{
					ar1[j] = ar1[j+1];
				}
				ar1[j] = first;
			}
			System.out.println();
			System.out.println("ARRAY AFTER LEFT ROTATION");
			for(int i=0;i<ar1.length;i++)
			{
				System.out.print(ar1[i]+" ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
