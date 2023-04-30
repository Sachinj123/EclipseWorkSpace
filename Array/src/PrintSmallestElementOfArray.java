

public class PrintSmallestElementOfArray {

	public static void main(String[] args) {
		int [] ar = new int [] {71,21,29,36,58,45,16};
		
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] < min)
				min = ar[i];
			}
		System.out.println("THE SMALLEST ELEMENT IN ARRAY:"+min);

	}

}
