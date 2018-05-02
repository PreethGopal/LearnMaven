package LearnJavaPrograms;

import java.util.Scanner;

public class SumOfDiagonals {

	public static void main(String[] args) {
		//Get the row or column size from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row or column size of the N*N Matrix:");
		int n = sc.nextInt();
		int rowSize = n ;
		int columnSize =n;
		//Instantiate an array
		int[][] a = new int[rowSize][columnSize];

		for(int i =0;i<rowSize;i++)
		{
			for(int j=0;j<columnSize;j++)
			{
				System.out.println("Enter the number a["+i+"]["+j+"]");
				a[i][j] = sc.nextInt();
			}

		}
		sc.close();
		//object creation for the class
		SumOfDiagonals caller = new SumOfDiagonals();
		//calling the method to check whether left side is greater or right side is greater as the methods return sum.
		if(caller.leftDiagonal(rowSize, columnSize, a)>caller.rightDiagonal(rowSize, columnSize, a)){
			//if left side is greater then print left side elements of matrix
			caller.printLeft(rowSize, columnSize, a);
		}else{
			//if right side is greater then print right side elements of matrix
			caller.printRight(rowSize, columnSize, a);
		}

	}


	//Method to find the sum of left side of diagonal
	public int leftDiagonal(int rowSize, int columnSize, int[][] b){
		int sumOfLeft =0;
		for(int i =0;i<=rowSize-2;i++)
		{

			for(int j=0;j<=columnSize-2;j++)
			{
				sumOfLeft = b[i][j]+sumOfLeft ; 
			}
			columnSize--; //2 //1

		}
		return sumOfLeft;
	}
	//To print the left side of the diagonal
	public void printLeft(int rowSize, int columnSize, int[][] b){
		System.out.println("The sum of elements in left Diagonal is greater and the elements are:");
		for(int i =0;i<=rowSize-2;i++)
		{

			for(int j=0;j<=columnSize-2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			columnSize--; //2 //1

		}
	}
	//Method to find the sum of right side of diagonal
	public int rightDiagonal(int rowSize, int columnSize, int[][] c){
		int columnIterate = 1;
		int sumOfRight =0;
		for(int i =rowSize-1;i>=1;i--) //3 //2 //1
		{
			for(int j =columnSize-1;j>=columnIterate;j--)
			{
				sumOfRight = c[i][j]+sumOfRight ; 

			} 
			columnIterate++; //2 //3 

		}	
		return sumOfRight;
	}
	//To print the right side of the diagonal
	public void printRight(int rowSize, int columnSize, int[][] c){
		int columnIterate = 1;
		System.out.println("The sum of elements in right Diagonal is greater and the elements are:");
		for(int i =rowSize-1;i>=1;i--) //3 //2 //1
		{
			for(int j =columnSize-1;j>=columnIterate;j--)
			{
				System.out.print(c[i][j]+" "); 

			} 
			columnIterate++; //2 //3 

		}	
	}

}