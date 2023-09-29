package trickyTopics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorForIntegerJava8 {
	public static void main(String[] args) {
		
        Comparator<Integer> com = Comparator.comparingInt(n -> n % 10);

        List<Integer> l1 = Arrays.asList(35, 42, 57, 63, 91);
        l1.sort(com);
        System.out.println(l1);
        
        // Sorting in reverse order based on the last digit
        l1.sort(com.reversed());
        System.out.println(l1);

	}

}
