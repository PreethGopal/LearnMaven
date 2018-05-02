package LearnJavaPrograms;

import java.util.Scanner;

public class VowelsInAString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input : ");
		
		String str= scan.nextLine();
		
		System.out.print("Expected Output:" +Vowels(str)+ "\n");
		
				
	}

	public static int Vowels(String str) {
		
		int count =0;
		
		for(int i=0; i<str.length();i++) {
			
			Character ch = str.charAt(i);
			
			if(ch=='a' ||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				count++;
			}
			
		}
	return count;
	
	}
	

}
