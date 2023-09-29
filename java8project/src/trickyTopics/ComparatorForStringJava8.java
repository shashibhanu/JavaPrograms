package trickyTopics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorForStringJava8 {
    public static void main(String[] args) {

        Comparator<String> com = Comparator.comparingInt(s -> s.charAt(s.length() - 1));

        List<String> l1 = Arrays.asList("apple", "banana", "oranges", "choco", "kiwi");
        l1.sort(com);
        System.out.println(l1);
    }
}

