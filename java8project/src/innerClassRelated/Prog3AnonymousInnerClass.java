package innerClassRelated;
class Outerclass
{
	public void show()
	{
		System.out.println("in outer class show");
	}
	
}
public class Prog3AnonymousInnerClass {

	public static void main(String[] args) {
		//here while compiling anonymous inner class will be formed with AnonymousInnerClass$1.class
		//&1 will be formed as there in anonymous class
		//in case of inner class it will be in format of A$B.class
      Outerclass obj = new Outerclass()
    		  {
    	  public void show()
    		{
    			System.out.println("in anonymous inner class show");
    		}
    		  };
      obj.show();

	}

}
