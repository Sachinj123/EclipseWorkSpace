import java.util.Scanner;

public class AlphabateOrConsonant {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter Character To Search");
		//String character = sc.next();
		char ch='s';
		if(ch=='a'|| ch == 'e'|| ch=='i'|| ch=='o'|| ch=='u' )
			System.out.println("THIS IS VOWEL");
		else
			System.out.println("THIS IS CONSONANT");

	}

}
