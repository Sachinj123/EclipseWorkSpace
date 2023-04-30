
public class PrintArrayElementsAtEvenPosition {

	public static void main(String[] args) {
		int [] ar = new int [] {2,8,9,4,1,7,5,3,6};
		
		System.out.println("ARRAY ELEMENTS AT EVEN POSITION:");
		for (int i = 0; i < ar.length; i=i+2) {
			System.out.print(ar[i]+" ");
			
		}

	}

}
