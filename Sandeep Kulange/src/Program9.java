import java.util.Scanner;

// USE OF GETTER AND SETTER 

class Account4{
	private int number;
	private String type;
	private double balance;
	
	public Account4() {
	}

	public Account4(int number, String type, double balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
public class Program9 {
	static Scanner sc = new Scanner (System.in);
	public static void acceptRecord(Account4 account) {
		
		System.out.println("Enter number");
		account.setNumber(sc.nextInt());
		System.out.println("Enter type");
		sc.nextLine();
		account.setType(sc.nextLine());
		System.out.println("Enter balance ");
		account.setBalance(sc.nextDouble());
	}
	
	public static void printRecord(Account4 account) {
		System.out.println("ACCOUT NUMBER ->"+account.getNumber());
		System.out.println("ACCOUNT TYPE->"+account.getType());
		System.out.println("ACCOUNT BALANCE ->"+account.getBalance());
	}

	public static void main(String[] args) {
		
		Account4 account = new Account4();
		Program9.acceptRecord(account);
		Program9.printRecord(account);
		
	}

}
