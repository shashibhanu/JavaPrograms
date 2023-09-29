package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ListMinMaxAverageSumExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the minimum
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                //or
        		//.mapToInt(x->x)
                .min()
                .orElse(0);

        // Calculate the maximum
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        // Calculate the average
        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::intValue)
                .average();

        // Calculate the sum
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Print the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));
        System.out.println("Sum: " + sum);
    }
}

