
public class StringToFloat {
	public static void main(String[] args) {
		float f1=40.5f;
		String str = String.valueOf(f1);
		String str1 = Float.toString(f1);
		
		System.out.println("AFTER CONVERSION FLOAT TO STRING ->:"+str);
		System.out.println("AFTER CONVERSION FLOAT TO STRING ->:"+str1);
	}

	public static void main1(String[] args) {
		// CONVERSION OF STRING TO FLOAT
		// USE OF Float.parseFloat
		String str = "967";
		Float f1 = Float.parseFloat(str);
		System.out.println("AFTER CONVERSION STRING TO FLOAT:"+f1);

	}

}
