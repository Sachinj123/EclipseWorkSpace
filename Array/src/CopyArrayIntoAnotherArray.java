import java.util.Iterator;

// here we have to use 3 For Loops
//1 for printing original Array
// 2nd for copying array into another array
// 3rd for printing 2nd array
public class CopyArrayIntoAnotherArray {

	public static void main(String[] args) {
		int [] ar1 = new int[] {45,18,10,7,39,79,29,92};
		int [] ar2 = new int[ar1.length];
		
		for (int i = 0; i < ar1.length; i++) {
			ar2[i]=ar1[i];
			
		}
		
		// PRINTING ORIGINAL ARRAY
		System.out.println("ORINAL ARRAY:");
	   for (int i = 0; i < ar1.length; i++) {
		   
		   System.out.print(ar1[i]+" ");
		
	       }
	   System.out.println();
	   System.out.println("NEW DUPLICATE ARRAY:");
	   for (int i = 0; i < ar2.length; i++) {
		   System.out.print(ar2[i]+" ");
		
	}
	   

	}

}
 