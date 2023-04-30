// USE -> CONSTRUCTOR CALLING 

class Account2{
	private int number;
	private String type;
	private double balance;
	//PARAMETERLESS CONSTRUCTOR 
	
	public Account2() {
		// THIS IS KNOWN AS CONSTRUCTOR CHAINING 
		// HERE WE PROVDE HARDCODED VALUE
		//CONSTRUCTOR CALLING HAPPENS WITH THE USE OF "THIS KEYWORD"
		this (1537,"Saving",12457.23);
	}
	// PARAMETERIZED CONSTRUCTOR CALLING
	
	public Account2(int number, String type, double balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	public void printRecord() {
		System.out.println("ACCOUNT NUMBER ->"+this.number);
		System.out.println("ACCONT TYPE->"+this.type);
		System.out.println("ACCOUNT BALANCE ->"+this.balance);
	}
}
public class Program7 {
	
	public static void main(String[] args) {
	  Account2 acc = new Account2();
	  acc.printRecord();
		

	}

}
