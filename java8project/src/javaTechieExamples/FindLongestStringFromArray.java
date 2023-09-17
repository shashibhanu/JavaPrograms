package javaTechieExamples;

import java.util.Arrays;

public class FindLongestStringFromArray {
	public static void main(String arg[]) {
	String[] strArray = {"Hi", "I", "am", "Shashi"};
	
	String longestString = Arrays.stream(strArray)
	.reduce((w1,w2)->w1.length()>w2.length()?w1:w2)
	.get();
	System.out.println(longestString);
	}
}
