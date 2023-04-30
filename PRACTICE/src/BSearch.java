import java.util.Arrays;
import java.util.Scanner;

public class BSearch {
	
	public static int binarySearch(int [] ar,int key)
	{
		int left=0,right=ar.length-1,mid;
		while(left<=right)
		{
			mid = (left+right)/2;
			if (key == ar[mid])
				return mid;
			if (key < ar[mid])
				right = mid-1;
			else
				left = mid+1;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = {2,51,43,69,81,24,75,60,0,99,77};
		Arrays.sort(ar);
		System.out.println("Enter key Element to Search:");
		int key = sc.nextInt();
		int index = binarySearch(ar,key);
		if(index!=-1)
			System.out.println("The Key Element is Found at:" +index);
		else
			System.out.println("The Key Element is not Found ");
		
		
		System.out.println("SORTED BINARY SEARCH");
		System.out.println(Arrays.toString(ar));
		

	}

}
