package learningjava;

import java.util.Scanner;

public class TableOfCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter matrix:");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < column; j++) 
			{
				array[i][j] = s.nextInt();
				System.out.print(" ");
			}
		}
		System.out.println("The above matrix is ");
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < column; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");

		}


	}

}
