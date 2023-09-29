package trickyTopics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorForInteger {
	public static void main(String[] args) {
		// Comparator used for own logic of sorting
		//for ex, sort below array list by last digit
		//we cant use collections.sort()
		
		Comparator<Integer> com = new Comparator<Integer>()
				{
			public int compare(Integer n1, Integer n2)
			{
				if(n1%10>n2%10)
					return 1;
				else
					return -1;
			}
				};
		
		List<Integer> l1 = Arrays.asList(35,42,57,63,91);
		//Collections.sort(l1,com);
		l1.sort(com);
		System.out.println(l1);
		
        // Sorting in reverse order based on the last digit
        l1.sort(com.reversed());
        System.out.println(l1);

	}

}
