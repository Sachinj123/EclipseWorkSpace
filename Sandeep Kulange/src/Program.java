package second;



class Employee{
	private String name;
	private int empid;
	private String department;
	private double salary;
	
	public Employee(String name, int empid, String department, double salary) {
		this.name = name;
		this.empid = empid;
		this.department = department;
		this.salary = salary;
	}
	
	
	
@Override
	public String toString() {
		return String.format("%-15s%-5d%-15s%-5d",this.name,this.empid,this.department,this.salary);
}

public void printRecord() {
	System.out.printf("%-15s%-5d%-15s%-5d",this.name,this.empid,this.department,this.salary);
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee("SACHIN",45,"DATA ENGG",55000.25);
		String str = emp.toString();
		System.out.println(str);
	}
		

	}

}
