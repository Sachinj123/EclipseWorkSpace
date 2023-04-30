import java.util.Scanner;

class Account3{
	private int number;
	private String type;
	private double balance;
	
	
	public Account3() {
		// HERE WE ARE NOT PROVIDED HARDCODED VALUE 
	}
	
    public Account3(int number, String type, double balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
    Scanner sc = new Scanner(System.in);
    
    public void acceptRecord() {
    	System.out.println("Enter number");
    	this.number=sc.nextInt();
    	System.out.println("Enter type");
    	sc.nextLine();
    	this.type=sc.nextLine();
    	System.out.println("Enter balance");
    	this.balance = sc.nextDouble();
    }
    
    public void printRecord() {
    	System.out.println("ACCOUNT NUMBER->"+this.number);
    	System.out.println("ACCOUNT TYPE ->"+this.type);
    	System.out.println("ACCOUNT BALANCE ->"+this.balance);
    }
}
public class Program8 {
	
   public static void main(String[] args) {
	   Account3 acc = new Account3();
	   acc.acceptRecord();
	   acc.printRecord();
	}

}
