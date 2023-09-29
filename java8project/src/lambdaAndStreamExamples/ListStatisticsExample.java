package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ListStatisticsExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate statistics using IntSummaryStatistics
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        // Print the results
        System.out.println("Minimum: " + stats.getMin());
        System.out.println("Maximum: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Count: " + stats.getCount());
    }
}

