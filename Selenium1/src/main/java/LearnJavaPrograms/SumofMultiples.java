package LearnJavaPrograms;

import java.util.Scanner;

public class SumofMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum of the multiples of 3 and 5 is: " + getSum());

	}

	private static double getSum() {
		double sum = 0;
		for (int i = 0; i < 20; i++) {
			
		    if (i % 3 == 0 || i % 5 == 0) {
		    	System.out.print(i);
		        sum += i;
		    }
		}
		return sum;
		}
		
	}


