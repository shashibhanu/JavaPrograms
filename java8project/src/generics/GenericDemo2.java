package generics;
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericDemo2 {

    public static void main(String[] args) {
    	
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer Value: " + intBox.getValue());
        
        // Creating a Box for String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());


       
    }

}




