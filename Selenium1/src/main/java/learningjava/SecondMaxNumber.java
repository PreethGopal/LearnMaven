package learningjava;

public class SecondMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {20, 340,21,879,92,21,474,83647,-200};
		int largest = a[0];
		int secondLargest = a[0];
		
		for(int i=0; i<a.length;i++)
		{
		System.out.println("numbers are " + a[i]);
		}
		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];

			} else if (a[i] > secondLargest) {
				secondLargest = a[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

}
}
	
	