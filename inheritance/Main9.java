package inheritance;

class Vehicle{
    private String make,model,fuelType;
    private int year;
}
class Truck extends Vehicle{

}
class Car extends Vehicle{
    
}
class Motorcycle extends Vehicle{
    
}

public class Main9 {
    
}


// 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, 
// with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make,
//  model, year, and fuel type. Implement methods for calculating fuel efficiency, distance 
//  traveled, and maximum speed.