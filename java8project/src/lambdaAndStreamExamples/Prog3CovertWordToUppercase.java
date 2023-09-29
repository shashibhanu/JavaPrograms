package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog3CovertWordToUppercase {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world", "java");
		List<String> uppercaseWords = words.stream()
		                                   .map(String::toUpperCase)
		                                   .collect(Collectors.toList());
       System.out.println(uppercaseWords);

	}

}
