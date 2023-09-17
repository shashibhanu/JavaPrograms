package innerClassRelated;
@FunctionalInterface
interface Outerclass3
{
	abstract public void show();
	
}
public class Prog5AnonymousInnerClassLambdaDemo {

	public static void main(String[] args) {
		Outerclass3 obj = () ->
    		{
    		  System.out.println("abstract method implemented");
    			System.out.println("in anonymous inner class show");
    			System.out.println("anonymous inner class converted to lambda expression");
    			//lambda function can be written in both main and non method as object can be created in both main and non main method
    		};
      obj.show();

	}

}
