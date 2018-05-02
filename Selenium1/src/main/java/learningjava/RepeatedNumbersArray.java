package learningjava;

public class RepeatedNumbersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {13,15,67,88,65,67,13,13,99,67,65,13,87,13};
		
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i+1; j<a.length-1; j++)
			{
				if(a[i]==a[j] && (i!=j) )
				{
					System.out.println("Duplicate numbers are " + a[j]);
				}
			}
		}
		

	}

}
