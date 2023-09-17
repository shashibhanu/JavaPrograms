package threeCursors;

import java.util.*;

public class CursorsDifference {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();
		System.out.println(e.getClass().getName()); //anonymous inner class
		System.out.println(itr.getClass().getName());//inner class
		System.out.println(ltr.getClass().getName());//inner class
		

	}

}
