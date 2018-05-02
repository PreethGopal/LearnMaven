package LearnJavaPrograms;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows");
		
		int a = scan.nextInt();
		
		for(int i=0; i<a; i++) {
			
			int number = 1;
			
			System.out.printf("%"+(a-i)*2+ "s", ""  );
			
			for(int j=0 ; j<=i; j++) {
				
				System.out.printf("%4d", number);
				
				number= number* (i-j)/(j+1);
							
				
			}
				
			System.out.println();
			
		}
	}

}
