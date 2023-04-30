import java.util.Arrays;

public class PrintArrayElements {

	public static void main(String[] args) {
		int [] ar = new int [] {99,88,77,11,22,33};
		
		System.out.println("ARRAY ELEMENTS:");
		for (int i = 0; i < ar.length; i++) {
		System.out.print(ar[i]+" ");
	}
		System.out.println();
		System.out.print(Arrays.toString(ar));
			
		

	}

}
