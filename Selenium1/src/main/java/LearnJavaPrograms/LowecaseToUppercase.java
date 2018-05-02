package LearnJavaPrograms;

import java.util.Scanner;

public class LowecaseToUppercase {

	public static void main(String[] args) {
		
		System.out.println("Enter the value in lowercase/Uppercase");

		Scanner scan = new Scanner(System.in);		
		
		String lc = scan.next();
		
		System.out.println("Value in Uppercase/Lowercase :");
		
		for(int i=0; i<lc.length(); i++) {
			
			int ch = lc.charAt(i);
			
			if(ch>64&&ch<91) {
				ch = ch+32;
				System.out.print((char)ch);
			}
			
			else if(ch>96&&ch<123) {
				ch = ch-32;
				System.out.print((char)ch);
				
			}
			
			if(ch==32) {
				System.out.print("  ");
			}
		}
		
		System.out.println();
				
	}

}
