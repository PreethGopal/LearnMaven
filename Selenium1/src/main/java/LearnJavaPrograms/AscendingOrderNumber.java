package LearnJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrderNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the input");
		
		String num=scan.next();
		
		scan.close();
		
		char[] ch = num.toCharArray();
		
		Arrays.sort(ch);
		
		System.out.println(ch);
		
		
	/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int a = scan.nextInt();
		
		int b=scan.nextInt();
		
		int cnt =0 ;
		
		
	for (int i = 0; cnt!=2; i++) {
			
			if(i==a||i==b) {
				
				System.out.println(i);
				
				cnt++;
			}
	
	}*/

	}
}
