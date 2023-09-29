package trickyTopics;

//copy constructor used for deep copy/cloning/ create protype of an object, 
// as it not only copy object, it copies their properties as well.

public class CopyConstructorExample {
    private int myField;

    // Regular constructor
    public CopyConstructorExample(int myField) {
        this.myField = myField;
    }

    // Copy constructor
    public CopyConstructorExample(CopyConstructorExample org) {
        this.myField = org.myField;
    }

    // Getter and setter methods
    public int getMyField() {
        return myField;
    }

    public void setMyField(int myField) {
        this.myField = myField;
    }

    public static void main(String[] args) {
        // Creating an object using the regular constructor
        CopyConstructorExample obj1 = new CopyConstructorExample(10);

        // Creating a new object using the copy constructor
        CopyConstructorExample obj2 = new CopyConstructorExample(obj1);

        // Modifying the new object
        obj2.setMyField(20);

        // Output: 10 20
        System.out.println(obj1.getMyField() + " " + obj2.getMyField());
    }
}
