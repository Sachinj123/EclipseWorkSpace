import java.util.Arrays;

public class SelectionSORT {
	
	public static void selectionSORT(int [] ar)
	{
		for (int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
			   if (ar[i] > ar[j])
			   {
				   int temp = ar[i];
				   ar[i] = ar[j];
				   ar[j] = temp;
				   
			   }
			}
		}
	}

	public static void main(String[] args) {
		int [] ar = {99,88,77,66,55,44,33,22,11,0};
		System.out.println("SLECTION SORT");
		System.out.println("BEFORE:" +Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("AFTER:" +Arrays.toString(ar));
		

	}

}
