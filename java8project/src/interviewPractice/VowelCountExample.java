package interviewPractice;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelCountExample {
    public static void main(String[] args) {
        String inputString = "This is a sample string";

        // Convert the input string to lowercase for case-insensitive counting
        String lowerCaseInput = inputString.toLowerCase();

        // Define the set of vowels
        String vowels = "aeiou";

        // Count the total vowels using Java 8 streams
        long vowelCount = lowerCaseInput.chars()
                .filter(ch -> vowels.indexOf(ch) != -1)
                .count();

        // Display the total vowel count
        System.out.println("Total vowel count: " + vowelCount);
        
        // Count each vowels using Java 8 streams
//        Map<Character,Long> mp = lowerCaseInput.chars()
//                .filter(ch -> vowels.indexOf(ch) != -1)
//                //.filter(ch -> ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
//        // Display the total vowel count
//        System.out.println("Total vowel count: " + mp);
    }
}

