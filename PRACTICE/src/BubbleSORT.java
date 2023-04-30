import java.util.Arrays;

public class BubbleSORT {
	public static void bubbleSort(int [] ar)
	{
		for(int i=0;i<ar.length-1;i++)
		// outer for loop is only for performing Number of iterations(25/15/5)
		{
			// for (int j=0;j<ar.length-1;j++)
			
			// when we using ABOVE for loop we are performing 25 iterations
			
			for (int j=0;j<ar.length-1-i;j++) 
				
			// when we use  ABOVE FOR Loop we are performing 15 iterations
			{
				if ( ar[j] > ar[j+1])
				{
					int temp =  ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					}
				}
		}
	}
	

	public static void main(String[] args) {
		int [] ar = {90,12,78,33,41,92,5,29,57,69,};
		System.out.println("BUBBLE SORT");
		System.out.println("BEFORE :" +Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("AFTER :" +Arrays.toString(ar));
		

	}

}
