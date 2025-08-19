package abstraction;

abstract class  Vehicle {
    abstract public void startEngine();    
    abstract public void stopEngine();    
}

class Car extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Starting car engine");
    }
    @Override
    public void stopEngine(){
        System.out.println("Stoping car engine");
    }
}
class Motorcycle extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Starting motorcycle engine");
    }
    @Override
    public void stopEngine(){
        System.out.println("Stoping motorcycle engine");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.startEngine();
        c1.stopEngine();

        Motorcycle m1=new Motorcycle();
        m1.startEngine();
        m1.stopEngine();
    }    
}

// 7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine() 
// and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement 
// the respective methods to start and stop the engines for each vehicle type.