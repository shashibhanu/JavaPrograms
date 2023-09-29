package lambdaAndStreamExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
	
	/*
     * Since the count() method returns a long, 
     * it makes sense for the getCountOfCharacter method to also return a long to maintain consistency
     * and allow for handling large counts, 
     * especially when working with large strings or streams. 
     * Using long for the return type ensures that the method can handle a wide range of counts without overflowing.
     */
    
    /*
     * The mapToObj(c -> (char) c) operation in the getCountOfCharacter method is used to convert 
     * an IntStream of character codes back into a stream of char objects.
     */
	
	/*
char is a primitive data type in Java.
Character is the corresponding wrapper class for char.
When we use mapToObj(c -> (char) c), we are converting int values (character codes) to Character objects. 
This conversion allows us to work with a Stream<Character> instead of a Stream<Integer>.
	 */
	
	/*why String.chars() Returns IntStream
Compatibility: When Java was originally designed, it used a 16-bit char type to represent characters because it was based on the Unicode standard, which initially had a 16-bit encoding (UCS-2). However, as Unicode expanded to include more characters, a 16-bit encoding became insufficient.
Backward Compatibility: To maintain backward compatibility with existing code, Java kept the char type as a 16-bit entity while introducing methods like String.chars() to work with code points beyond the char's range
	 */
	
    public static void main(String[] args) {
        String input = "Hello, World!";

        // Remove spaces and convert to lower case (optional)
        input = input.replaceAll(" ", "").toLowerCase();

        Map<Character, Long> characterCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        //Important: instead c -> c , we can also write Function.identity()

        // Print the character occurrences
        characterCount.forEach((character, count) -> {
            System.out.println("'" + character + "': " + count + " times");
        });
        
         // Example: Find the count of a specific character 'o'
        // v.v.i.
        char targetCharacter = ',';
        long countOfTargetCharacter = getCountOfCharacter(input, targetCharacter);
        System.out.println("Count of '" + targetCharacter + "': " + countOfTargetCharacter);
    }

    // Function to find the count of a specific character in a string
    private static long getCountOfCharacter(String input, char targetCharacter) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == targetCharacter)
                .count();
    }
    
}

