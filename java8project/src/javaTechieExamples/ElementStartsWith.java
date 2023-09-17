package javaTechieExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartsWith {

	public static void main(String[] args) {
int[] number = {4,3,52,55,33};
		
		List<String> l = Arrays.stream(number)
				.boxed()
				.map(s->s+"")
				.filter(x->x.startsWith("3"))
				.collect(Collectors.toList());
		System.out.println(l);

	}

}
