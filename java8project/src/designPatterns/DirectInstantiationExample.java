package designPatterns;

//Step 1: Create an interface for the product
interface Vehicle1 {
 void start();
 void accelerate();
 void brake();
}

//Step 2: Create concrete classes implementing the interface
class Car1 implements Vehicle1 {
 @Override
 public void start() {
     System.out.println("Car started");
 }

 @Override
 public void accelerate() {
     System.out.println("Car is accelerating");
 }

 @Override
 public void brake() {
     System.out.println("Car is braking");
 }
}

class Motorcycle1 implements Vehicle1 {
 @Override
 public void start() {
     System.out.println("Motorcycle started");
 }

 @Override
 public void accelerate() {
     System.out.println("Motorcycle is accelerating");
 }

 @Override
 public void brake() {
     System.out.println("Motorcycle is braking");
 }
}

//Client code that directly instantiates the Vehicle class
public class DirectInstantiationExample {
 public static void main(String[] args) {
     // Create objects directly
     Vehicle1 car1 = new Car1();
     Vehicle1 motorcycle1 = new Motorcycle1();

     // Call methods on each object
     car1.start();
     car1.accelerate();
     car1.brake();

     motorcycle1.start();
     motorcycle1.accelerate();
     motorcycle1.brake();
 }
}

