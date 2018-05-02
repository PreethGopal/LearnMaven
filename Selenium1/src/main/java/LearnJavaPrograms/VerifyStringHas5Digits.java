package LearnJavaPrograms;

import java.util.Scanner;

public class VerifyStringHas5Digits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String");

		String a = scan.nextLine();

		if(a.length()==5) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}
	}
}


