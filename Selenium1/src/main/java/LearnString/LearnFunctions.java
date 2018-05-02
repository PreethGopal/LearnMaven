package LearnString;

import java.util.Scanner;

public class LearnFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		String s= scan.nextLine();
		
		System.out.println(s.length());
		
		for(int i=0; i<s.length(); i++) {
			
				if(s.charAt(i)=='a')
				{
				
					cnt++;
					
				}
			}
		System.out.println(cnt);
			
		

}
}