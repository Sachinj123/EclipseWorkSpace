// TO SORT ARRAY IN ASCENDING ORDER WE HAVE TO USE SELECTION SORT LOGIC 

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		int [] ar = new int [] {1,5,9,7,3,8,4,2,6};
		
		System.out.println("THE UNSORTED ARRAY:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		
		for (int i = 0; i < ar.length; i++) {
			
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i] > ar[j]) 
				{
					
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
				
			}
			
		}
		System.out.println("THE SORTED ARRAY IN ASCENDING ORDER:");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
			
		}
		
		

	}

}
