package innerClassRelated;
class X
{
	public void show()
	{
		System.out.println("in class X show");
	}
	
	static class Y
	{
		public void show()
		{
			System.out.println("in class Y show");
		}
	}
}
public class Prog2StaticInnerClassExample {

	public static void main(String[] args) {
      X obj = new X();
      obj.show();
      
      X.Y obj2 = new X.Y();
      obj2.show();

	}

}
