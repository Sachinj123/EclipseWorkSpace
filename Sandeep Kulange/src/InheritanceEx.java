package second;

class Person{
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public void printRecord() {
		System.out.println("Age of Person:"+this.age);
		System.out.println("Age of Name:"+this.name);
	}
	
	
}

class Employee1 extends Person{
	private int empid;
	private float salary;
	
	
	public Employee1(int age, String name, int empid, float salary) {
		super(age, name);
		this.empid = empid;
		this.salary = salary;
	}


	public void printRecord() {
		super.printRecord();
		System.out.println("Employee ID:"+this.empid);
		System.out.println("Employee Salary:"+this.salary);
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Employee1 emp = new Employee1(25, "SACHIN", 45, 50000);
		emp.printRecord();
		

	}

}
