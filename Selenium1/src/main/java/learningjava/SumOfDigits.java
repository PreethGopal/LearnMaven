package learningjava;

public class SumOfDigits {
	
		// TODO Auto-generated method stub
public static void main (String Args[])
{
	int inputNumber = 432;
	int number=inputNumber;
	int sumOfDigits = 0, remainder = 0,quotient=0;
	while (inputNumber !=0) {
		
        quotient= inputNumber/10;
		remainder= inputNumber%10;
        inputNumber= quotient;
        sumOfDigits = sumOfDigits + remainder;
		//inputNumber = inputNumber/10;
	}
	System.out.println("Sum of Digits in " + number + " is " +sumOfDigits);
}

}
