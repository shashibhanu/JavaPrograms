package trickyTopics;

//Example to illustrate Accessing
//the Static method(s) of the class.
import java.io.*;
/*
 * Instance method vs Static method

Instance method can access the instance methods and instance variables directly.
Instance method can access static variables and static methods directly.
Static methods can access the static variables and static methods directly.
Static methods can’t access instance methods and instance variables directly. 
They must use reference to object. And static method can’t use this keyword as there is no instance for ‘this’ to refer to.
 */
class StaticDemo {

	public static String staticvar = "Static Variable";
	public String nonstaticvar = "Non Static Variable";

	public static void staticMethod()
	{
	    	System.out.println("in static method");
	}
	
		public void nonStaticMethod()
	{
	    	System.out.println("in non static method");
	    	staticMethod();
	    	staticvar = "new static var";
	}
}

class StaticDemoMain {
	public static void main(String[] args)
	{
		StaticDemo.staticMethod();
		//StaticDemo.nonStaticMethod();
		System.out.println(StaticDemo.staticvar);
		//System.out.println(StaticDemo.nonstaticvar);


		StaticDemo obj = new StaticDemo();
		obj.staticMethod();
		obj.nonStaticMethod();
		System.out.println(obj.staticvar);
		System.out.println(obj.nonstaticvar);
	}
}

