package javaTechieExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
Stream<Integer>      vsssssssssssssssss            IntStream in java.util.stream
 */
//FIRST TWO PROGRAMS ARE OF TYPE Stream<Integer> AND LAST TWO PROGRAM OF TYPE IntStream
public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtering even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        // Doubling each number
        List<Integer> doubledNumbers = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println("Doubled numbers: " + doubledNumbers);

        // Sum of all numbers
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of all numbers: " + sum);
        
        IntStream.rangeClosed(1, 10)
        .skip(1)
        .limit(8)
        .forEach(System.out::println);
    }
}
