package developersInterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashmapByValue {
	public static void main(String[] args) {
        // Your HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 2);
        map.put("C", 8);
        map.put("D", 1);

        // Sorting the HashMap by values in ascending order
        Map<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue()) // Sort by values in ascending order
            //.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new // Maintain the insertion order
            ));

        // Print the sorted map
        System.out.println(sortedMap);
	}

}
