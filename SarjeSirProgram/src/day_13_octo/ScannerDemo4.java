package day_13_octo;

import java.util.Scanner;

public class ScannerDemo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner("12 abc true");
		int i= sc.nextInt();
		String str2 = sc.next();
		boolean b = sc.nextBoolean();
		
		System.out.println(i +" "+str2+" "+b);

	}

}
