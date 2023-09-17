package trickyTopics;

//Java program to illustrate Constructor Chaining
//within same class Using this() keyword
class ConstructorChainingDemo
{
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	ConstructorChainingDemo()
	{
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	ConstructorChainingDemo(int x)
	{
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	ConstructorChainingDemo(int x, int y)
	{
		System.out.println(x * y);
	}

	public static void main(String args[])
	{
		// invokes default constructor first
		new ConstructorChainingDemo();
	}
}

/*
 * Rules of constructor chaining : 

The this() expression should always be the first line of the constructor.
There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
Constructor chaining can be achieved in any order.
 */

