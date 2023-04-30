
public class DuplicateElement {

	public static void main(String[] args) {
		int [] ar = new int [] {45,18,63,7,97,45,18,10,7};
		// WE HAVE TO APPLY NESTED FOR LOOP
		// PRINT ORIGINAL ARRAY
		System.out.println("ORIGINAL ARRAY ELEMENT");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+"->");
		}
		System.out.println();
		System.out.println("DUPLICATE ELEMENT");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j] +"->" );
				}
				
			}
			//System.out.println("END");
		}

	}

}
