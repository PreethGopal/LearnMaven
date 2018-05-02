package Map;

import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class Learnmapping {

	public static void main(String[] args) {

		String value = "will i succeed in interview?";

		char[] ch = value.toCharArray();

		Map<Character,Integer> map = new TreeMap<>();

		for (char c : ch) {

			if(map.containsKey(c)) {

				map.put(c,map.get(c)+1);

			}

			else {

				map.put(c, 1);
			}

		}

		System.out.println(map.entrySet());


	}

}
