
public class DuplicateElementInArray {

	public static void main(String[] args) {
		int [] ar1 = new int [] {12,18,45,63,12,96,45};
		for(int i=0;i<ar1.length-1;i++)
		{
			for(int j=i+1;j<ar1.length;j++)
			{
				if(ar1[i] == ar1[j])
				{
					System.out.print(ar1[j]+" ");
				}
				//System.out.println("END");
			}
		}
		

	}

}
