package learningjava;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1, 2, 3, 4, 5};
		int sum, loop;

		sum = 0;

		for(loop = 4; loop >= 0; loop--) {
			sum = sum + array[loop];      
		}

		System.out.printf("Sum of array is %d.", sum); 
	}

}
