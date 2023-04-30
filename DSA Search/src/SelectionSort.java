import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int [] ar)
	{
		for (int i=0;i<ar.length-1;i++)
		{
			for (int j=i+1;j<ar.length;j++)
			{
				if (ar[i]>ar[j])
				{
					//If Condition True >> Swapping Takes places
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			// System.out.println(Arrays.toString(ar));
		}
	}

	public static void main(String[] args) {
		int [] ar = {75,15,30,59,61,91,87,37,45};
		System.out.println("Selection Sort");
		System.out.println("Before :" +Arrays.toString(ar));
		selectionSort(ar);;
		System.out.println("After :" +Arrays.toString(ar));
		

	}

}
