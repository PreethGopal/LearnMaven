package LearnJavaPrograms;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		System.out.print("Please enter a Number to print pattern: ");  
		
		int numb = input.nextInt();  
		
		input.close();
		
		if (numb%2 != 0) {
			
			for (int topRow = 1; topRow <= numb; topRow++) {
				
				if (topRow%2!=0) {
					
					for (int i = topRow; i <= numb; i++) {
						
						System.out.print(" ");
					}
					for (int i = 1; i <= topRow; i++) {
						
						System.out.print(i +" ");
					}
					System.out.println();
				}
			}
			for (int bottomRow = numb-2; bottomRow >= 1; bottomRow--) {
				if (bottomRow%2!=0) {
					for (int i = bottomRow; i <= numb; i++) {
						System.out.print(" ");
					}
					for (int i = 1; i <= bottomRow; i++) {
						System.out.print(i +" ");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("Enter an Odd number to print the pattern...");
		}
		

	}

}
