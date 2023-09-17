package lambdaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog2FilterEvenNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumbers = numbers.stream()
		                                     .filter(n -> n % 2 == 0)
		                                     .collect(Collectors.toList());
        System.out.println(evenNumbers);
        
        //or
        numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

	}

}
