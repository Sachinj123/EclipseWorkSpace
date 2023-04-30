// import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// STEP 1:- DECLARE ARRAY ELEMENTS 
		// STEP 2:- COPY ARRAY ELEMENTS INTO ANOTHER ARRAY
		// STEP 3:- PRINT BOTH ARRAYS
		
		int [] ar1 = new int [] {15,25,78,98,23,5,69};
		int [] ar2 = new int[ar1.length];
		
		for(int i=0;i<ar1.length;i++)
		{
			ar2[i]=ar1[i];
		}

		// PRINT ORIGINAL ARRAY
		System.out.println("ORIGINAL ARRAY");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+"->");
		}
		System.out.println();
		
		System.out.println("DUPLICATE ARRAY");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.print(ar2[i]+"->");
		}
		
}
}

