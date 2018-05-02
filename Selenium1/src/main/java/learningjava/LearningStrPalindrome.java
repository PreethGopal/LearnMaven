package learningjava;

import java.util.Scanner;

public class LearningStrPalindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String rev="";
		
		System.out.println("Enter the String:");
		
		Scanner scan  = new Scanner(System.in);
		
		String value =scan.nextLine();
		
		int length = value.length();
		
		for(int i=length-1;i>=0;i--)
			
		rev=rev+ value.charAt(i);
		
		if(value.equals(rev))
		{
			System.out.println(value +" is a Palindrome");		
		}
		else
		{
			System.out.println(value +" is a not Palindrome");		
	
		}
	
	}

}
