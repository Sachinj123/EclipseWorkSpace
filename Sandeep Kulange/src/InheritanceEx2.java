package second;

class Family{
	private String ownername;
	private int ownerage;
	
	public Family() {
		
	}
	
	public Family(String ownername, int ownerage) {
		this.ownername = ownername;
		this.ownerage = ownerage;
	}
	/*
	public void acceptRecord() {
		System.out.println("Enter the Name of Owner:"+this.ownername);
		System.out.println("Enter the age of Owner:"+this.ownerage);
	}
	*/
	
	public void printRecod() {
		System.out.println("OWNER NAME->"+this.ownername);
		System.out.println("OWNER AGE->"+this.ownerage);
		
	}
	
	
}

class Boys extends Family{
	private int totalrooms;
	private int numberofstudents;
	
	public Boys() {
	
	}
	public Boys(String ownername, int ownerage, int totalrooms, int numberofstudents) {
		super(ownername, ownerage);
		this.totalrooms = totalrooms;
		this.numberofstudents = numberofstudents;
	}
	/*public void acceptRecord1() {
		System.out.println("Enter numbers of rooms:"+this.totalrooms);
		System.out.println("Enter no of Students:"+this.numberofstudents);
	}*/
	public void printRecord() {
		//super.acceptRecord();
		super.printRecod();
		System.out.println("No of Rooms:"+this.totalrooms);
		System.out.println("No of Students:"+this.numberofstudents);
	}
	
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		Boys b = new Boys("ANKUSH",45,10,60);
		
		b.printRecord();

	}

}
