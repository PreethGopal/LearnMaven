package learningjava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the year" );
		
		int year = scan.nextInt();
	
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		{
			System.out.printf("%d is a leap year", year);
		}
		else
		{
			System.out.printf("%d is not a leap year", year);

		}
		
	}

}
