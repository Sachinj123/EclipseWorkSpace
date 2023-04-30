import java.util.Scanner;

// USE SCANNER CLASS
//find the AREA and CIRCUMFERENCE of CIRCLE

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double pi=3.145;
		double radius,area,circumference;
		
		System.out.println("Enter the value of radius");
		 radius = sc.nextDouble();
		 
		 area = (pi*(radius*radius));
		 circumference = (2*pi*radius);
		 
		 System.out.println("AREA OF CIRCLE ->"+area);
		 System.out.println("CIRCUMFERENCE OF CIRCLE ->"+circumference);
		
		
		
	}

}
