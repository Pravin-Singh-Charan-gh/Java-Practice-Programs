package inheritance;

class Vehicle{
    public void drive(){
        System.out.println("Vehicle Driving ...");
    }
}
class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Repairing a car");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();
    }
}

// 2. Write a Java program to create a class called Vehicle with a method called drive().
//  Create a subclass called Car that overrides the drive() method to print "Repairing a car".