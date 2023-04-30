// USE OS STATIC DATA MEMBER
// IN THIS FOR STATIC DATA MEMBER THE "GETTER AND SETTER" ARE ALSO STATIC .
// STATIC DATA MEMBERS ARE CALLED BY CLASS NAME
// INSTANCE MEMBERS ARE CALLED WITH THE NAME OF REFEREBCE NAME



class Test{
	private int num1;
	private int num2;
	private static int num3; // STATIC DATA MEMBER
	static{  
		// THIS IS STATIC INITIALIZER BLOCK 
		// IF ALL 3 DATA MEMBERS ARE STATIC THE WE CAN DECLARE IN SAME STATIC INITIALIZER BLOCK 
		// OR WE DECLARE IB DIFF DIFF STATIC INITIALIZER BLOCK 
		Test.num3=45;
	}
	public Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public static int getNum3() {
		return num3;
	}
	public static void setNum3(int num3) {
		Test.num3 = num3;
	}
	public void print() {
		System.out.println("NUM1 ->"+num1);
		System.out.println("NUM2 ->"+num2);
		System.out.println("NUM3 ->"+num3);
	
	}
	
}
public class Program11 {

	public static void main(String[] args) {
		Test t = new Test(10, 20);
		Test t1 = new Test(30,40);
		Test t2 = new Test(50,60);
		t.print();
		t1.print();
		t2.print();
   }

}
