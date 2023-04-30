import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		while (num<10) {
			System.out.println(num);
			num++;
		}
		

	}

}
