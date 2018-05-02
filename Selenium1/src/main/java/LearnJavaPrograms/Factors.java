package LearnJavaPrograms;

import java.util.Scanner;

public class Factors {

	public static void PrimeFactor() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Number to find Prime Factors ");

		int number=sc.nextInt();
		
		//System.out.println("Given Number is : " + number);
		
		System.out.print("Prime Factors are : " );
		
		        for (int i = 2; i <= number; i++) {
		 
		            while (number % i == 0) {
		            	
		                System.out.print(i + " ");
		                
		                number = number / i;
		            }
		        }
		 
		        if (number < 1)
		        	System.out.println(number);

		
	}
	public  void Factor1() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");
		
		int a = scan.nextInt();	
		
		System.out.format("Factors of %d\n", a);

		for(int i=1; i<=a; i++) {

			if(a%i==0) {
				
				System.out.print(i + " ");
			}

		}

	}
	public static void main(String[] args) {

		//Factors.Factor1();
		
		Factors fact= new Factors();
		fact.Factor1();
		
		PrimeFactor();

	}
}
