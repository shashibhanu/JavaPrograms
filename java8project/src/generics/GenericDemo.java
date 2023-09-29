package generics;

public class GenericDemo {

	static <E> void show(E... param)
	//<E> is different than void which is a return type and can also be generic like T instead of void
	//<E> is for parameter in the method which is of generic kind of.
	//It tells the compiler that the method someGenericMethod(here show) is generic and can work with different data types.
	//whereas
	//T instead of void will be for return type, it doesn't have <>
	
	{
		for(E l:param)
		{
			System.out.println(l);
		}
	}
	public static void main(String[] args) {
		show("Hi","Go","Bye");
		show(1,2,3);

	}

}
