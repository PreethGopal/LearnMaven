package learningjava;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a = scan.nextInt();
		
		System.out.println("Enter the value for b");
		int b = scan.nextInt();
		
		a=a*b;  //a=6
		b=a/b;  //b=2
		a=a/b;  //a=3
		
		System.out.println("After swapping");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}

}
