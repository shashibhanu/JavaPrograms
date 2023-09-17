package threeCursors;

import java.util.*;

public class EnumeratorDemo {

	public static void main(String[] args)
    {
        Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            int i = (Integer)e.nextElement();
            System.out.print(i + " ");
        }
    }
}