
public class EnterCharIsValidOrNot {

	public static void main(String[] args) {
		char ch ='b';
		
		if((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("The Entered Character is Alphabates");
		else
			System.out.println("The Entered Character is Not Alphabates");
			
		}

}
