
public class SecondLargestElementInArray {
	
	public static int getSecondElement(int[]a,int total) {
		for (int i = 0; i < total; i++)
		{
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
		return a[total-2];
	}

	public static void main(String[] args) {
		int []a = new int [] {90,80,70,60,50,40,30,20,10};
		int []s = new int [] {4,8,6,2,7,1,3};
		
		System.out.println("SECOND LARGEST ELEMENT:"+getSecondElement(a, 9));
		System.out.println("SECOND LARGEST ELEMENT:"+getSecondElement(s, 7));

	}

}
