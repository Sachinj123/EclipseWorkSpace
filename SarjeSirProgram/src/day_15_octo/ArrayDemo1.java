package day_15_octo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3};
		
		int [] ar1 = {4,5,6};
		
		int [] ar2 = {7,8,9};
		
		int arr [][] = new int [3][];
		arr[0]=ar;
		arr[1]=ar1;
		arr[2]=ar2;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
