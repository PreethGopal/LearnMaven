package LearnJavaPrograms;

import java.util.Scanner;

public class NumOfDaysInAMonth {

	public static void main(String[] strings) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int numofDaysInAMonth = 0;
		
		String monthName = "Unknown";		
		
		System.out.print("Enter the month");
		
		int month = scan.nextInt();
		
		System.out.print("Enter the year");
		
		int year = scan.nextInt();
		
		switch(month) {
		
		case 1:			
			monthName="January";
			numofDaysInAMonth = 31;
			break;
			
		case 2:
			monthName="February";
			if((year%400==0 )||(year%4==0)||(year%100!=0)) {
			numofDaysInAMonth = 29;
			}
			else {
				numofDaysInAMonth=28;
			}
			break;
			
		case 3:
			monthName="March";
			numofDaysInAMonth = 31;
			break;
			
		case 4:
			monthName="April";
			numofDaysInAMonth = 30;
			break;
			
		case 5:
			monthName="May";
			numofDaysInAMonth = 31;
			break;	
			
		case 6:
			monthName="June";
			numofDaysInAMonth = 30;
			break;
			
		case 7:
			monthName="July";
			numofDaysInAMonth = 31;
			break;
			
		case 8:
			monthName="August";
			numofDaysInAMonth = 31;
			break;
		
		case 9:
			monthName="September";
			numofDaysInAMonth = 30;
			break;
			
		case 10:
			monthName="October";
			numofDaysInAMonth = 31;
			break;
			
		case 11:
			monthName="November";
			numofDaysInAMonth = 30;
			break;
			
		case 12:
			monthName="December";
			numofDaysInAMonth = 31;
			break;
				
		}
		
		System.out.print(monthName+" " + year + " has " + numofDaysInAMonth + " days\n");
				
			
		}
	}


