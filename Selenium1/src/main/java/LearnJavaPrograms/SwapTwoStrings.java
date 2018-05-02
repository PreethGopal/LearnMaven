package LearnJavaPrograms;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first value ");
		String a=scan.nextLine();
						
		System.out.println("Enter the second value ");
		String b=scan.nextLine();
		
		int len = a.length();
		a = a + b;
		b = a.substring(0, len);
		a = a.substring(len);
		
		System.out.println("After swapping");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}

}



