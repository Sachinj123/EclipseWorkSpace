import java.util.Arrays;

public class SecondSmallestElementInArray {
	
	public static int getSecondSmallestElement(int []a,int total) {
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		// Arrays.sort(a); // YANE PN SAME 33 ANS YET AHE JAR AAPAN WITHOUT VARCHA LOGIC NA GHETA
		return a[1];//BECAUSE SECOND SMALLEST ELEMENT IS AT 2ND PLACE
	}

	public static void main(String[] args) {
		int []a = new int [] {67,71,19,82,55,33};
		
		System.out.println("SECOND SMALLEST ELEMENT IN ARRAY:"+getSecondSmallestElement(a, 6));

	}

}
