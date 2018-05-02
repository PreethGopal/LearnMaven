package learningjava;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = s.nextInt();

		
		System.out.println("Enter second number: ");
		int secondNumber = s.nextInt();		
		
		System.out.println("Enter Add");
		String arithm=s.next();
		int sum;
		//switch(arithm)
		{
		//case "Add":
		{
			sum=firstNumber+secondNumber;
			System.out.println("Addition is  " + sum);
			//break;
		}
		//default:
		{
			System.out.println("Invalid data");
		}
		}

	}
}
