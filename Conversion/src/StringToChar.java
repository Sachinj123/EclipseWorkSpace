
public class StringToChar {
	public static void main(String[] args) {
		// CHAR TO STRING
		Character CH = 'S';
		String str = String.valueOf(CH);
		String str1 = Character.toString(CH);
		
		System.out.println("AFTER CONVERSION OF CHARACTER TO STRING:"+str);
		System.out.println("AFTER CONVERSION OF CHARACTER TO STRING:"+str1);
		
		
	}

	public static void main1(String[] args) {
		// string to char
		String str = "NANDED";
		System.out.println("CHAR AT:"+str.charAt(0));
		System.out.println("CHAR AT:"+str.charAt(2));
		System.out.println("CHAR AT:"+str.charAt(5));
		System.out.println("CHAR AT:"+str.charAt(4));

	}

}
