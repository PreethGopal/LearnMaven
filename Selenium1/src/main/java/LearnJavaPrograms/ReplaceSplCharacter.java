package LearnJavaPrograms;

public class ReplaceSplCharacter {

	public static void main(String[] args) {

		String value = "{Java/\\*(Selenium)}";
		
		value = value.replaceAll("\\W", " ");		
		
		System.out.println(value);
	}

}
