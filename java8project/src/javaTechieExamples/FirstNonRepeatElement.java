package javaTechieExamples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {
	public static void main(String[] args) {
    String input = "Helloh, Wworld!";
    String firstNonRepeatElement = Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
            //LinkedHashMap add to maintain the insertion order
            .entrySet()//it creates multiple entry object. each object has key and value
            .stream()
            .filter(entryObject->entryObject.getValue()==1)
            .findFirst().get().getKey();
    
           System.out.println(firstNonRepeatElement); 

	}
}
