import java.util.Arrays;
import java.util.Scanner;
public class RecBinarySearch {
	
public static int recBinarySearch (int [] ar,int key,int left,int right)
		{
	int index;
			if (right < left)
				return -1;
			
			int mid = (left+right)/2;
			if (key == ar[mid])
				return mid;
			if (key < ar[mid])
				 index = recBinarySearch (ar,left,mid-1,key);
			else
				 index = recBinarySearch (ar,mid+1,right,key);
			
			return index;
				
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner (System.in);
			int [] ar = {9,2,4,5,1,7,3,6,0};
			Arrays.sort(ar);
			System.out.println("Enter key Element to Search");
			int key = sc.nextInt();
			int   index = recBinarySearch (ar,0,ar.length-1,key);
			if ( index!=-1)
				System.out.println("Key element found at :" +index);
			else 
				System.out.println("Key element not found");

		}

	}


