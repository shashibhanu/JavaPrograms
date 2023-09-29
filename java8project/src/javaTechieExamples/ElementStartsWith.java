package javaTechieExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartsWith {

	public static void main(String[] args) {
		
		//You are directly using primitive array thats why boxed is required use object Integer and remove boxed
int[] number = {4,3,52,55,33};
		
		List<Integer> l = Arrays.stream(number)
				.boxed()
				//.map(s->s+"")  convert to string to use startsWith method
				.map(s->s.toString())
				.filter(x->x.startsWith("3")) 
				//.map(x->Integer.parseInt(x))
				.map(Integer::parseInt) //convert back to Integer
				.collect(Collectors.toList());
		System.out.println(l);
		
		//Another example to use List.of method
		List<Integer> l2 = List.of(1,2,3,4);
		l2.forEach(System.out::println);

	}

}
