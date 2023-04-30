import java.util.Scanner;
public class LinearSearch {
	public static  int linearSearch (int [] ar,int key) {
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = {88,77,66,55,44,33,22,11};
		System.out.println("Enter Key to Search");
		int key = sc.nextInt();
		int index = linearSearch(ar,key);
		if (index!=-1)
			System.out.println("Key found at index :"+index);
		else 
			System.out.println("Key is not found");
		

	}

}
