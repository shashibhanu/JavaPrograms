package trickyTopics;

//Superclass
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass
class Dog extends Animal {
 void sound() {
     super.sound(); // Call the sound() method from the superclass
     System.out.println("Dog barks");
 }
}

public class SuperKeywordExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     myDog.sound();
 }
}

