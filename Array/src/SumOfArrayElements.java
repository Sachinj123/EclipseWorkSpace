
public class SumOfArrayElements {

	public static void main(String[] args) {
		int [] ar = new int [] {9,1,7,3,8,4,2,6,5};
		int sum=0;
		
		// PRINT THE ORIGINAL ARRAY AND SUM
		System.out.println("THE ARRAY ELEMENTS:");
		for (int i = 0; i < ar.length; i++) {
			
			System.out.print(ar[i]+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.print("THE TOTAL SUM IS:"+sum);
		

	}

}
