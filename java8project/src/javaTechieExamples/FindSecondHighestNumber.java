package javaTechieExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		int[] number = {4,3,5,1,3,6,8,9,2};
		
		Integer secondHighElement = Arrays
				.stream(number)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondHighElement);

	}
/*
Stream of Primitives: The Arrays.stream(int[] array) method creates an IntStream, 
which is a specialized stream for primitive int values.

The boxed() method is used to convert the int elements from the primitive array number 
into their corresponding Integer wrapper objects
 */
	
	/*
The boxed() method is not required on the reduce operation because the reduce operation itself works with primitive values (int in this case), and it doesn't require boxing to operate on objects.

Here's the difference:

Stream Operations (e.g., sorted, skip, findFirst): These operations work with stream elements as objects. When you use methods like sorted, you are comparing and manipulating objects, so the stream elements need to be boxed (converted to their corresponding wrapper objects) to work with these operations.

Reduce Operation: The reduce operation combines elements of a stream into a single result. It's designed to work directly with primitive values (e.g., int, long, double) and doesn't require boxing because it operates at a lower level, working directly with the values themselves.
	 */
}
