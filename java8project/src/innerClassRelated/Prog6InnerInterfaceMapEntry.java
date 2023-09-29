package innerClassRelated;

import java.util.HashMap;
import java.util.Map;

public class Prog6InnerInterfaceMapEntry {

	public static void main(String[] args) {
		Map<String, Integer> wordCountMap = new HashMap<>();
		wordCountMap.put("apple", 3);
		wordCountMap.put("banana", 2);
		wordCountMap.put("cherry", 4);

		// Iterate over the map's entries using entrySet()
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
		    String word = entry.getKey();
		    int count = entry.getValue();
		    System.out.println(word + ": " + count);
		}

	}

}
