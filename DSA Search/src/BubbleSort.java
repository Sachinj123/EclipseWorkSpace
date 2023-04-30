import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
	
	public static void bubbleSort(int [] ar)
	{
		// i will used for only for counting passes of iteration
		for (int i=0;i<ar.length-1;i++)
		{
			// whole operation is depends on j 
			for (int j=0;j<ar.length-1;j++)
			{
				if (ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		// System.out.println(Arrays.toString(ar));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = {23,47,39,58,19,65,79,83,95};
		System.out.println("Bubble Sort");
		System.out.println("Before :"+Arrays.toString(ar));
		bubbleSort(ar);;
		System.out.println("After :"+Arrays.toString(ar));
		
		}

}
