

public class ReverseArray1 {

	public static void main(String[] args) {
		int [] ar = new int [] {15,62,87,45,57,45,18};
		// Print Original Array 
		System.out.println("ORIGINAL ARRAY");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("ARRAY IN REVERSE ORDER");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	
	}

}
