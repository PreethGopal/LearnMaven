package learningjava;

import java.util.Scanner;

public class LearningUserInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for a");
		int a = scan.nextInt();

		System.out.println("Enter the value for b");
		int b = scan.nextInt();

		//System.out.print(a);
		for (int i=a; i<=b;i++)
		{		
			if(i%3==0 && i%5==0) 
			{
				System.out.print("FIZZBUZZ");
				System.out.print("\t");
			}
			else if( i%3==0)
			{
				System.out.print(" FIZZ ");
				System.out.print("\t");
			}
			else if (i%5==0)
			{
				System.out.print(" BUZZ ");
				System.out.print("\t");
			}
			else 
			{
				System.out.print(i);
				System.out.print("\t");
			}

		}





	}

}


