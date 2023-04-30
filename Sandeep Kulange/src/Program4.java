package second;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER ARRAY ELEMENT");
		int [] ar = new int [5];
		int element = sc.nextInt();
		//int [] ar = {15,12,18,19,78,99};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2 !=0)
			{
				System.out.println("ODD ARRAY ELEMENT ->"+ar[i]);
				System.out.println(" ");
			}
		}

	}

}
