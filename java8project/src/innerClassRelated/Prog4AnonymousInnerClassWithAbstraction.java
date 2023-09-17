package innerClassRelated;
abstract class Outerclass2
{
	abstract public void show();
	
}
public class Prog4AnonymousInnerClassWithAbstraction {

	public static void main(String[] args) {
		//here while compiling anonymous inner class will be formed with AnonymousInnerClass$1.class
		//&1 will be formed as there in anonymous class
		//in case of inner class it will be in format of A$B.class
		Outerclass2 obj = new Outerclass2()
    		  {
    	  public void show()
    		{
    		  System.out.println("abstract method implemented");
    			System.out.println("in anonymous inner class show");
    		}
    		  };
      obj.show();

	}

}
