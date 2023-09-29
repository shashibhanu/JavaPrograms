package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Prog6SortingWithoutStreamCollections {
	
	public static void main(String[] args) {		
		//Ascending
		List<String> words2 = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(words2,(a,b)->a.compareTo(b));
		System.out.println(words2);
		
		//Descending
		List<String> words = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(words,(a,b)->b.compareTo(a));
		System.out.println(words);
		
		//Ascending
		List<String> words3 = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(words3);
		System.out.println(words3);
		
		//Descending
		List<String> words4 = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(words4,Collections.reverseOrder());
		System.out.println(words4);
		
		//Ascending
		List<Integer> words5 = Arrays.asList(5,1,3,8,4);
        Collections.sort(words5,(a,b)->a-b);
		System.out.println(words5);
		
		//Descending
		List<Integer> words6 = Arrays.asList(5,1,3,8,4);
        Collections.sort(words6,(a,b)->b-a);
		System.out.println(words6);


	}


}
