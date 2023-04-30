

public class ArrayElementsInReverseOrder {

	public static void main(String[] args) {
		int [] ar = new int[] {14,89,78,43,59,79,5};
		
		//PRINT THE ORIGINAL ARRAY 
		System.out.println("ARRAY IN FORWARD DIRECTION:");
		for (int i = 0; i < ar.length; i++) {
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
