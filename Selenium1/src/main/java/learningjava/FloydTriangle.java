package learningjava;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, n, num=1;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the No.of rows");
		
		n = scan.nextInt();
		
		System.out.println("Floyd's triangle:");
		
		for(a=1; a<=n;a++)
		{
			for (b=1; b<=a;b++)
			{
				System.out.print(num+ "  ");
				num++;
			}
			System.out.println();
		}

	}


}
