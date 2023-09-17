package innerClassRelated;

public class LazyInnerClassSingleton {
	
	private static class SingletonHelper 
	{
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
	}
	
	public static LazyInnerClassSingleton getInstance()
	{
		return SingletonHelper.instance;
	}

}
