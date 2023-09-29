package javaTechieExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
	//method 3 is best and simple
	
    public static void main(String[] args) {
        String input = "Helloh, Wworld!";
        List<String> characterCount = Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()//it creates multiple entry object. each object has key and value
                .stream()
                .filter(entryObject->entryObject.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
      System.out.println(characterCount);
      
      //ORRRRRRRRRRRRR
      
        Map<String, Long> characterCount2 = Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,     // Key is the same as in the original map
                        Map.Entry::getValue    // Value is the count from the original map
                ));
      System.out.println(characterCount2);
      
      
        //ORRRRRRRR
      
      
        Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .forEach(x->System.out.println(x.getKey() + ": " + x.getValue() + " times"));
        


    }    
}

