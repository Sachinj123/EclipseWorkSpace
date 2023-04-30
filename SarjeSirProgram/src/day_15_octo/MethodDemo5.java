package day_15_octo;

public class MethodDemo5 {

	
	public static boolean isEven(int num) {
		return num%2==0;
	}
	public static void main(String[] args) {
		
		boolean b = isEven(45);
		if(b) {
			System.out.println("the number is even ");
		}
		else {
			System.out.println("the number is odd");
		}

	}

}
