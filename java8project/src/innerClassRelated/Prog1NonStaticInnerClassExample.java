package innerClassRelated;
class A
{
	public void show()
	{
		System.out.println("in class A show");
	}
	
	//in case of inner class while compilation A$B.class will be formed as inner class
	//in case of anonymous inner class it will be in format of NonStaticInnerClassExample$1.class
	class B
	{
		public void show()
		{
			System.out.println("in class B show");
		}
	}
}
public class Prog1NonStaticInnerClassExample {

	public static void main(String[] args) {
      A obj = new A();
      obj.show();
      
      A.B obj2 = obj.new B();
      obj2.show();

	}

}
