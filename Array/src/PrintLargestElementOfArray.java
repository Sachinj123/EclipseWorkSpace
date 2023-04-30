
public class PrintLargestElementOfArray {

	public static void main(String[] args) {
		
		int [] ar  = new int [] {12,19,73,82,46,51,37,92,5};
		
		int max = ar[0];
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i] > max)
				 max = ar[i];
			
		}
		System.out.println("THE LAGREST ELEMENTS IS:"+max);

	}

}
