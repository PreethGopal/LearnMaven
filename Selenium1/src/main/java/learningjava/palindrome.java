package learningjava;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, reversedInteger= 0,remainder,originalInteger;
		
		System.out.println("Enter a value to check the whether it is palindrome or not");
		Scanner scan = new Scanner(System.in);

		num = scan.nextInt();
		originalInteger=num;
		while(num!=0)
		{
		 remainder=num%10;
		 reversedInteger = (reversedInteger*10) + remainder;
		 num=num/10;
		}
		if (originalInteger==reversedInteger)
		System.out.println(originalInteger +" is a palindome. ");
		else
		System.out.println(originalInteger +" is not a palindome. ");
		
	}

}
