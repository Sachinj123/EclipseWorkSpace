

public class ThirdLargestElementInArray {
	public static int getThirdElement(int[]a,int total)
	{
		for (int i = 0; i < total; i++) {
			
			for(int j=i+1;j<total;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		return a[total-3];
	}

	public static void main(String[] args) {
		int a[] = new int[] {1,2,9,7,5,3};
		int s[] = new int[] {97,12,73,64,28,10};
		
		System.out.println("Third Largest Element:"+getThirdElement(a, 6));
		System.out.println("Third Largest Element:"+getThirdElement(s, 6));

	}

}
