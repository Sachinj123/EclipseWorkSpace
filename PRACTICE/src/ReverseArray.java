
public class ReverseArray {

	public static void main(String[] args) {
		int [] ar = new int[] {10,20,30,40,50,60,70,80,90};
		
		// PRINT ORIGINAL ARRAY
		System.out.println("PRINT ORIGINAL ARRAY");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		// REVERSE ARRAY
		System.out.println("ARRAY IN REVERSE ORDER");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
