package learningjava;

public class SumOfDigits {
	
		// TODO Auto-generated method stub
public static void main (String Args[])
{
	int inputNumber = 432;
	int sumOfDigits = 0, remainder = 0;
	while (inputNumber !=0) {
		sumOfDigits = sumOfDigits + remainder;
//		quotient= inputNumber/10;
//		inputNumber= quotient;
		inputNumber = inputNumber/10;
	}
	System.out.println("Sum of Digits in" +inputNumber + "is" +sumOfDigits);
}

}
