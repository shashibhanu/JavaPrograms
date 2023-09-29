package javaTechieExamples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {
	
	//groupingBy has 3 arguments (Function classifier(on which grouping will be classed),Supplier mapFactory (how you want map to be), Collector downstream (list,set.etc..))
	//Example: Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())
	//default downstream is List if not provided
	//last two argument optional
	
	public static void main(String[] args) {
		
//    String input = "Helloh, Wworld!";
//    Map<String, Long> mp = Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
//            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//  //LinkedHashMap add to maintain the insertion order
// // Print the character count map
//    mp.forEach((key, count) -> {
//        System.out.println(key + " -> " + count);
//    });
//            
//            String firstNonRepeatElement = 
//             mp.entrySet()//it creates multiple entry object. each object has key and value
//            .stream()
//            .filter(entryObject->entryObject.getValue()==1)
//            .findFirst().get().getKey();
//    
//           System.out.println(firstNonRepeatElement); 
//           
           
           //ORRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
           
           /*String firstNonRepeatElement = Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
                   .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                   //LinkedHashMap add to maintain the insertion order
                   .entrySet()//it creates multiple entry object. each object has key and value
                   .stream()
                   .filter(entryObject->entryObject.getValue()==1)
                   .findFirst().get().getKey();
           
                  System.out.println(firstNonRepeatElement);*/
           
           //ORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
           String input = "Hello, World!";
           
           // Count the frequency of each character while maintaining insertion order
           Map<String, Long> charCountMap = Arrays.stream(input.replaceAll(" ", "").toLowerCase().split(""))
                   .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
           
           // Find the first non-repeating character
           Optional<Map.Entry<String, Long>> firstNonRepeatingChar = charCountMap.entrySet().stream()
                   .filter(entry -> entry.getValue() == 1)
                   //.map(Map.Entry::getKey)
                   .findFirst();
           
           // Print the first non-repeating character (if found)
           if (firstNonRepeatingChar.isPresent()) {
               System.out.println("First non-repeating character: " + firstNonRepeatingChar.get());
           } else {
               System.out.println("No non-repeating characters found.");
           }

	}
}
