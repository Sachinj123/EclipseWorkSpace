package day_13_octo;

public class IfElse3 {

	public static void main(String[] args) {
		int i=7;
		if(i>10) {
			if(i>15) {
				i++;
			}
			else {
				i--;
			}
		}
		else {
			if(i<5)
				i++;
			else
				i--;
		}
		System.out.println(i);
	}


}
