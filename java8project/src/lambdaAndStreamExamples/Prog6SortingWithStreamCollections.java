package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Prog6SortingWithStreamCollections {

	public static void main(String[] args) {
		
		//Ascending
		List<String> words = Arrays.asList("banana", "apple", "cherry");
		List<String> sortedWords = words.stream()
		                               .sorted()
		                               .collect(Collectors.toList());
		System.out.println(sortedWords);
		
		//Descending
		List<String> words2 = Arrays.asList("banana", "apple", "cherry");
		List<String> sortedWordsDesc = words2.stream()
		                               .sorted(Collections.reverseOrder())
		                               .collect(Collectors.toList());
		System.out.println(sortedWordsDesc);


	}
}
