package com.string;

public class PunctuationCharactersInString {

	public static void main(String[] args) {
		String str = "www.sachin!jadhav@;.com";
		int count =0;
		
		for(int i=0;i< str.length();i++) 
		{
			if(str.charAt(i) !='@'|| str.charAt(i) !='!' || str.charAt(i) !=',' || str.charAt(i) !='.' )
			{
				count++;
			}
		}
		System.out.println("Total characters in String :"+count);
        int count1=0;
		for(int i=0;i< str.length();i++) 
		{
			if(str.charAt(i) =='@'|| str.charAt(i) =='!' || str.charAt(i) ==',' || str.charAt(i) =='.' )
			{
				count1++;
			}
		}
		System.out.println("Total Punctution in String :"+count1);
	}

}
