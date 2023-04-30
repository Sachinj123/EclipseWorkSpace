
public class LeftRotateOfArrayElement {
	// HERE WE HAVE TO DECLARE 3 FOR LOOP
	// 1ST IS WITH I AND AR.LENGHT
	// 2ND IS WITH N 
	// 3RD IS WITH AGAIN WITH I AND AR.LENGTH

	public static void main(String[] args) {
		
		int [] ar = new int [] {12,98,45,18,69,45,59};
		int n=4;
		
		// PRINT ORIGINAL ARRAY 
		System.out.println("PRINT ORIGINAL ARRAY ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		// FOR LOOP USING "N"
		for(int i=0;i<n;i++)
		{
			int j;
			int first = ar[0];
			for( j=0;j<ar.length-1;j++)
			{
				ar[j]=ar[j+1];
			}
			
			ar[j]=first;
		}
		System.out.println();
		
		System.out.println("ARRAY AFTER ROTATION");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		


	}

}
