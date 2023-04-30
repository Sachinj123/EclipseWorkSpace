package day_15_octo;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int [] a = {14,12,15};
		int [] b= {14,12,15};
		int [] c = {14,12,15};
		
		int [] [] arr = new int [3][];
		
		arr [0] = a;
		arr [1] =b;
		arr [2] =c;
		
		System.out.println("The Array Output is: ");
		for(int ar[] : arr) {
			for (int e: ar) {
				
				System.out.print(e+" ");
				
			}
			System.out.println();
		}

	}

}
