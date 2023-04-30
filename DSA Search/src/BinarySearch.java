import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int [] ar,int key)
	{
		int left=0,right=ar.length-1,mid;
		while (left<=right)
		{
			mid = (left+right)/2;
			if (key==ar[mid])
				return mid;
			if (key < ar[mid])
				right = mid -1;
			else 
				left = mid +1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = {88,44,55,99,77,66,33,22,11};
		Arrays.sort(ar);
		
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		int index = binarySearch(ar,key);
		if (index !=-1)
			System.out.println("Key found at index:"+index);
		else
			System.out.println("Key not found");
		

	}

}
