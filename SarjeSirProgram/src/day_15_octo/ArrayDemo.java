package day_15_octo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		char [] ar = new char[] {'a','e','i','o','u'};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		for(char a : ar) {
			System.out.print(a+" ");
		}

	}

}
