package multithreading;

public class ThreadTest extends Thread {
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
		ThreadTest th = new ThreadTest();
		th.start();
		int i=1;
		while(true)
		{
			System.out.println("World");
			i++;
		}

	}

}
