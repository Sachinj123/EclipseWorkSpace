import java.util.Date;

class Box<T>{
	private T num1;

	public T getNum1() {
		return num1;
	}

	public void setNum1(T num1) {
		this.num1 = num1;
	}
	
}

public class Generics {

	public static void main(String[] args) {
		Box<Date> box = new Box<Date>();
		box.setNum1(new Date());
		Date date = box.getNum1();
		System.out.println(date);

	}

}
