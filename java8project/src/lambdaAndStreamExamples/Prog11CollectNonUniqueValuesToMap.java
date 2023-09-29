package lambdaAndStreamExamples;
import java.util.*;
import java.util.stream.Collectors;
public class Prog11CollectNonUniqueValuesToMap {
	
	//groupingBy has 3 arguments (Function classifier(on which grouping will be classed),Supplier mapFactory (how you want map to be), Collector downstream (list,set.etc..))
	//Example: Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())
	//default downstream is List if not provided
	//last two argument optional
	

	    public static void main(String[] args) {
	        List<String> values = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");

	        // Collect unique values into a map with values as sets
	        Map<String, List<String>> nonUniqueValuesMap = values.stream()
	                .collect(Collectors.groupingBy(
	                        // Grouping by the values themselves
	                        value -> value,
	                        // Using a set to collect values with duplicates removed
	                        Collectors.toList()
	                        //Collectors.counting()
	                        //change it to Collectors.counting(), and return type as Long instead of List
	                        //and you will get count
	                ));

	        // Print the unique values map
	        nonUniqueValuesMap.forEach((key, value) -> {
	            System.out.println(key + " : " + value);
	        });
	    }


}
