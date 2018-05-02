package listAndSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "saratha";

		System.out.println(removeDuplicates(str));

	}

	public static String removeDuplicates(String str) {

		Set<Character> set = new HashSet<>();

		StringBuffer bf= new StringBuffer();

		for(int i=0; i<str.length();i++) {

			Character c= str.charAt(i);
			
			if(!set.contains(c)) {
				
				set.add(c);
				
				bf.append(c);
				
			}

		}

		return bf.toString();
	}

}
