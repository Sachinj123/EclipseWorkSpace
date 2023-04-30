// USE OF "THIS" KEYWORD with ACCEPTRECORD AND PRINTRECORD METHOD



import java.util.Scanner;
class Account1{
	
	private int number;
	private String type;
	private float balance;
	
	public void acceptRecord() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		this.number=sc.nextInt();
		System.out.println("Enter type");
		sc.nextLine();
		this.type = sc.nextLine();
		System.out.println("Enter balance");
		this.balance= sc.nextFloat();
	}
	
	public void printRecord() {
		System.out.println("ACCOUNT NUMBER ->"+this.number);
		System.out.println("ACCOUNT TYPE ->"+this.type);
		System.out.println("ACCOUNT BALANCE->"+this.balance);
	}
}
public class Program6 {
	
	public static void main(String[] args) {
		Account1 acc = new Account1();
		acc.acceptRecord();
		acc.printRecord();
		
	}

}
