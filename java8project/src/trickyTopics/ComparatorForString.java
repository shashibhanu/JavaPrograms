package trickyTopics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorForString {
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>()
        		{
        	public int compare(String s1,String s2)
        	{
        		if(s1.length()>s2.length())
        			return 1;
        		else
        			return -1;
        	}
        		};

        List<String> l1 = Arrays.asList("apple", "banana", "oranges", "choco", "kiwi");
        l1.sort(com);
        System.out.println(l1);
    }
}

