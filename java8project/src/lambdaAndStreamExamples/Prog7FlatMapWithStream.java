package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog7FlatMapWithStream {

	public static void main(String[] args) {
		var listOfLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8)
			);

			List<Integer> flattenedList = listOfLists.stream()
			                                         .flatMap(List::stream)
			                                         .collect(Collectors.toList());
			System.out.println(flattenedList);


	}

}
