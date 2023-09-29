package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Prog6SortingWithStreamComparator {

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
		                               .sorted(Comparator.reverseOrder())
		                               .collect(Collectors.toList());
		System.out.println(sortedWordsDesc);


	}

}
