
public class PrintArrayElementsAtOddPosition {

	public static void main(String[] args) {
		int [] ar = new int [] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Print Array Elements At Odd Position");
		for (int i = 1; i < ar.length; i=i+2) {
			System.out.print(ar[i]+" ");
		}

	}

}
