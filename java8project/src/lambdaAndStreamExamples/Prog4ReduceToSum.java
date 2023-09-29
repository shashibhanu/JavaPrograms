package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.List;

//Example 1: Sum of Numbers

public class Prog4ReduceToSum {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		                .reduce(0, (a, b) -> a + b);
		System.out.println(sum);

	}

}

//Example 2: Concatenating Strings

class ReduceExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "awesome");

        // Using reduce to concatenate strings
        String result = words.stream()
                            .reduce((a, b) -> a + " " + b)
                            .orElse("");

        System.out.println("Concatenated String: " + result); // Output: Concatenated String: Java is awesome
    }
}

//Example 3: Finding Maximum Number

class ReduceExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 7, 23, 4, 15);

        // Using reduce to find the maximum number
        int max = numbers.stream()
                        .reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("Maximum Number: " + max); // Output: Maximum Number: 23
    }
}

