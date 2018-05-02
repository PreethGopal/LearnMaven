package LearnJavaPrograms;

public class Child extends Main
{


	/*// This method overrides show() of Parent
	@Override
	void show() { System.out.println("Child's show()");
	}*/

	void test() {
		System.out.println("test method()");
	}

	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Main obj1 = new Main();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Main obj2 = new Child();
		obj2.show();
		
		
		Child obj3 = new Child();
		obj3.test();
		obj3.show();
	} 


}