package designPatterns;

//Step 1: Create an interface for the product
interface Vehicle {
 void start();
 void accelerate();
 void brake();
}

//Step 2: Create concrete classes implementing the interface
class Car implements Vehicle {
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

class Motorcycle implements Vehicle {
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

//Step 3: Create a Factory interface
interface VehicleFactory {
 Vehicle createVehicle();
}

//Step 4: Create concrete Factory classes implementing the Factory interface
class CarFactory implements VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Car();
 }
}

class MotorcycleFactory implements VehicleFactory {
 @Override
 public Vehicle createVehicle() {
     return new Motorcycle();
 }
}

//Step 5: Client code that uses the Factory to create objects
public class FactoryPatternExample {
 public static void main(String[] args) {
     // Create factories for each type of vehicle
     VehicleFactory carFactory = new CarFactory();
     VehicleFactory motorcycleFactory = new MotorcycleFactory();

     // Use factories to create objects
     Vehicle car = carFactory.createVehicle();
     Vehicle motorcycle = motorcycleFactory.createVehicle();

     // Call methods on each object
     car.start();
     car.accelerate();
     car.brake();

     motorcycle.start();
     motorcycle.accelerate();
     motorcycle.brake();
 }
}

/*
In the client code (FactoryPatternExample), 
we use the factories to create vehicle objects (car, motorcycle) 
without directly instantiating concrete vehicle classes. 
This provides flexibility and decouples the client from the concrete implementations.
The Factory Design Pattern allows you to add new types of vehicles and corresponding factories 
without modifying existing client code.
*/
