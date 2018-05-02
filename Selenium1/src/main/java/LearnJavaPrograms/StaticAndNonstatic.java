package LearnJavaPrograms;

public class StaticAndNonstatic {

	public static void String1() {
		System.out.print("  hello");

	}

	public void String2() {
		for(int i=0; i<2;i++) {
			String1();
			System.out.print("  world");
		}
	}



	public static void main(String[] args) {
		
		StaticAndNonstatic obj= new StaticAndNonstatic();
		obj.String2();

	}
}
