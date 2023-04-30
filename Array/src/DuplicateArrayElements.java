
public class DuplicateArrayElements {

	public static void main(String[] args) {
		int [] ar = new int[] {45,12,18,45,96,74,12,7,18};
		
		//PRINT DUPLICATE ARRAY ELEMENTS 
		System.out.println("DUPLICATE ELEMENTS FROM ARRAY :");
		for (int i = 0; i < ar.length; i++) {
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+" ");
				}
			}
			
		}
		

	}

}
