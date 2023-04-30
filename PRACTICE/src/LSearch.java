import java.util.Arrays;
import java.util.Scanner;

public class LSearch {
	public static int linearSearch(int [] ar,int key)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if (ar[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = {46,23,87,12,59,61,72,5,92};
		System.out.println("Enter key element to search ");
		int key = sc.nextInt();
		int index = linearSearch(ar,key);
		if (index!=-1)
			System.out.println("the Key Element found at:" +index);
		else
			System.out.println("the Key Element is not found");
		
		//System.out.println("LINEAR SEARCH");
		//Arrays.sort(ar);
		//System.out.println(Arrays.toString(ar));
		
		}

}
