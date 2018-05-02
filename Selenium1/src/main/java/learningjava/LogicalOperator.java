package learningjava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		a--;
		b--;
		
		
	      System.out.println("a && b = " + (a<b && b<a));
	      System.out.println("a || b = " + (a<b||b<a) );
	      System.out.println("!(a && b) = " + !(a<b && b<a));
	      
	      System.out.println("++a = " + a--);
	      System.out.println("++b = " + b--);
	      	      
	}

}
