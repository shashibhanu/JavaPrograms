package lambdaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog6SortingWithStream {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("banana", "apple", "cherry");
		List<String> sortedWords = words.stream()
		                               .sorted()
		                               .collect(Collectors.toList());
		System.out.println(sortedWords);


	}

}
