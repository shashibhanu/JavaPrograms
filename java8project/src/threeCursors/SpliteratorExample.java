package threeCursors;

import java.util.*;
import java.util.stream.Stream;

public class SpliteratorExample {

	public static void main(String args[])
    {
  
        // Create an object of array list
        ArrayList<Integer> list = new ArrayList<>();
  
        // Add elements to the array list
        list.add(101);
        list.add(201);
        list.add(301);
        list.add(401);
        list.add(501);
  
        // create a stream on the list
        Stream<Integer> str = list.stream();
  
        // Get Spliterator object on stream
        Spliterator<Integer> splitr = str.spliterator();
  
        // Get size of the list
        // encountered by the
        // forEachRemaining method
        System.out.println("Estimate size: "
                           + splitr.estimateSize());
  
        // Print getExactSizeIfKnown
        // returns exact size if finite
        // or return -1
        System.out.println("Exact size: "
                           + splitr.getExactSizeIfKnown());
  
        // Check if the Spliterator has all
        // the characteristics
        System.out.println("Boolean Result: "
                           + splitr.hasCharacteristics(
                                 splitr.characteristics()));
  
        System.out.println("Elements of ArrayList :");
  
        // print elements using forEachRemaining
        splitr.forEachRemaining(
            (n) -> System.out.println(n));
  
        // Obtaining another Stream to the array list.
        Stream<Integer> str1 = list.stream();
  
        splitr = str1.spliterator();
  
        // Obtain spliterator using     trySplit() method
        Spliterator<Integer> splitr2 = splitr.trySplit();
  
        // If splitr can be partitioned use splitr2 first.
        if (splitr2 != null) {
  
            System.out.println("Output from splitr2: ");
            splitr2.forEachRemaining(
                (n) -> System.out.println(n));
        }
  
        // Now, use the splitr
        System.out.println("Output from splitr1: ");
        splitr.forEachRemaining(
            (n) -> System.out.println(n));
    }
}
