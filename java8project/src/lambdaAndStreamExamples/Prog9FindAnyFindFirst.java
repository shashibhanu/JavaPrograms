package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Prog9FindAnyFindFirst {

	public static void main(String[] args) {
		
		//Program1 - Find First
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> firstEven = numbers.stream()
		    .filter(n -> n % 2 == 0)
		    .findFirst();
		System.out.println("find first even: "+firstEven.get());
		
		//Program 2 - Find Any
		
		List<List<Integer>> nestedList = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5, 6),
			    Arrays.asList(7, 8, 9)
			);
			List<Integer> flattenedList = nestedList.stream()
			    .flatMap(List::stream)
			    .collect(Collectors.toList());
			System.out.println("find any example: "+flattenedList);


	}

}
