package listAndSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class LearnHashmap {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		
		m.put(21, "TwentyOne");
		m.put(41, "FourtyOne");
		m.put(31, "ThirtyOne");
		
		System.out.println("Before sorting" + m);

		Map<Integer, String> n = new TreeMap<>(m);
		
		//System.out.println("After sorting"  +n);
		
		System.out.println("After sorting : ");
			
		for (java.util.Map.Entry<Integer, String>   s : n.entrySet()) {
					
			
			System.out.println(s.getKey()+ ":" + s.getValue());
			
		}
	}

}
