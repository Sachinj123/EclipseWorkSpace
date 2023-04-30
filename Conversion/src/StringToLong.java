
public class StringToLong {
	public static void main(String[] args) {
		// LONG TO STRING CONVERSION 
		//1. USE valueOf
		//2. USE ToString
		long Long = 147895;
		String str = String.valueOf(Long);
		//String str1 = Long.toString(str1);
		System.out.println("After Conversion Long To String :"+str);
	}

	public static void main1(String[] args) {
		//STRING TO LONG :- WE USE "parseLong"
		String str = "159";
		long LONG = Long.parseLong(str);
		System.out.println("AFTER CONVERSION STRING TO LONG:"+LONG);

	}

}
