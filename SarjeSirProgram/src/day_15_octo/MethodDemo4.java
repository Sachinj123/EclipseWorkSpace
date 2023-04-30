package day_15_octo;

public class MethodDemo4 {

	
	public static void add(int i,int j) {
		System.out.println(i+j);
	}
	
   public static int sum(int i,int j) {
	   int k =i+j;
	   return k;
   }
	public static void main(String[] args) {
		add(45, 18);
		int result = sum(29, 45);
		System.out.println("RESULT: "+result);

	}

}
