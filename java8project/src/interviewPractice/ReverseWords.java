  package interviewPractice;

import java.util.*;
import java.util.stream.*;
class ReverseWords {

    public static void main(String[] args) {
        String sent = "Hello World Shashi Bhanu";
        
        System.out.println("reversed sent is: "+         
        Arrays
        .stream(sent.split(" "))
        .map(s-> new StringBuilder(s).reverse())
        .collect(Collectors.joining(" "))
        );
    }
}
