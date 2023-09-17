package javaTechieExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence2 {
	
    public static void main(String[] args) {
        String input = "Helloh, Wworld!";

        Map<String, Long> characterCount = Arrays.stream(input.replaceAll(" ","").toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        //Important: instead c -> c , we can also write Function.identity()

        // Print the character occurrences
        characterCount.forEach((k, v) -> {
            System.out.println("'" + k + "': " + v + " times");
        });
    }    
}

