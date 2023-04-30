

class Account {
	private int number;
	private String type;
	private float balance;
	public Account() {
		
	}
	 
	public Account(int number, String type, float balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	

	@Override
	public String toString() {
		return "Account [number=" + number + ", type=" + type + ", balance=" + balance + "]";
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
public void printRecord() {
	System.out.printf("%-10d%-15s%-10.2f\n",this.number,this.type,this.balance);
		
	}
	
} 



public class Program1 {

	public static void main(String[] args) {
		Account account = new Account();
		
		
		account.setNumber(100);
		account.setType("Saving");
		account.setBalance(10000);
		
		//int number = account.getNumber();
		//System.out.println("NUMBER :"+number);
		
		//String type = account.getType();
		//System.out.println("TYPE :"+type);
		
		//float balance = account.getBalance();
		//System.out.println("BALANCE:"+balance);
		

	}

}
