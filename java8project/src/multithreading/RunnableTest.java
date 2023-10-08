package multithreading;

public class RunnableTest implements Runnable {

	public void run() //run is a inbuilt method of thread class, which gets called by th.start();
	{
		int i=1;
		while(true)
		{
			System.out.println("Hello");
			i++;
		}
	}

	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		Thread th = new Thread(rt);
		th.start();
		int i=1;
		while(true)
		{
			System.out.println("World");
			i++;
		}

	}

}
