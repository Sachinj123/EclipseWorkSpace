// MENU DRIVEN PROGRAM FOR GETTER AND SETTER METHOD

import java.util.Scanner;

class Account5{
	private int number;
	private String type;
	private double balance;
	public Account5() {
		
	}
	public Account5(int number, String type, double balance) {
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

public class Program10 {
	static Scanner sc = new Scanner (System.in);
	
	public static void acceptRecord(Account5 account) {
		System.out.println("Enter number: ");
		account.setNumber(sc.nextInt());
		System.out.println("Enter type");
		sc.nextLine();
		account.setType(sc.nextLine());
		System.out.println("Enter Balance");
		account.setBalance(sc.nextDouble());
		
	}
	
	public static void printRecord(Account5 account) {
		System.out.println("ACCOUNT NUMBER ->"+account.getNumber());
		System.out.println("ACCOUNT TYPE ->"+account.getType());
		System.out.println("ACCOUNT TYPE ->"+account.getBalance());
	}
	
	public static int menuList() {
		System.out.println("0.EXIT");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.println("3.Choice");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Account5 account = new Account5();
		while((choice = Program10.menuList())!=0) {
			switch(choice) {
			case 1:
				Program10.acceptRecord(account);
				break;
			case 2:
				Program10.printRecord(account);
				break;
			}
			
		}
		
		
	}

}
