package second;


class Test{
	private static int num1;
	private static int num2;
	private static int num3;
	
	static {
		Test.num1=45;
		Test.num2=18;
		Test.num3=72;
	}
	public void print() {
		System.out.println("NUM1 ->"+Test.num1);
		System.out.println("NUM2 ->"+Test.num2);
		System.out.println("NUM3 ->"+Test.num3);
	}
	
}

public class Program12 {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		

	}

}
