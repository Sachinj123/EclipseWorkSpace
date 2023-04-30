
public class CopyArrayElement {

	public static void main(String[] args) {
		int [] ar1 = new int[] {14,19,87,23,41,65};
		int [] ar2 = new int[ar1.length];
		
		// COPY ARRAY ELEMENT 
		for(int i=0;i<ar1.length;i++)
		{
			ar2[i]=ar1[i];
		}
		
		//PRINT ORIGINAL ARRAY
		System.out.println("PRINT ORIGINAL ARRAY");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		// PRINT DUPLICATE ARRAY
		System.out.println("PRINT DUPLICATE ARRAY");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		

	}

}
