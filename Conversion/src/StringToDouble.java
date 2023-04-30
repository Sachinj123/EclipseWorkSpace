
public class StringToDouble {
	public static void main(String[] args) {
		// CONVERSION OF DOUBLE TO STRING
		Double d1= 45.23;
		String str = String.valueOf(d1);
		String str1 = Double.toString(d1);
		
		System.out.println("AFTER CONVERSION DOUBLE TO STRING ->:"+str);
		System.out.println("AFTER CONVERSION DOUBLE TO STRING ->:"+str1);
	}

	public static void main1(String[] args) {
		// STRING TO DOUBLE 
		String str = "1739";
		Double d1 = Double.parseDouble(str);
		System.out.println("AFTER CONVERSION STRING TO DOUBLE ->:"+d1);

	}

}
