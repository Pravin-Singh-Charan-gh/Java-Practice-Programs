package polymorphism;

class Vehicle{
    private int speed=0;

    public void speedUp(int n){
        speed+=n;
    }
    public int getSpeed(){
        return speed;
    }
}
class Car extends Vehicle{
    public void speedUp(int n){
        super.speedUp(n);
        System.out.println("Speed Increased by "+n+" km/hr");
    }
}
class Bicycle extends Vehicle{
    public void speedUp(int n){
        super.speedUp(n);
        System.out.println("Speed Increased by "+n+" km/hr");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Car c1=new Car();
        Bicycle b1=new Bicycle();
        
        System.out.println("Initial Car speed : "+c1.getSpeed()+" km/hr");
        System.out.println("Initial Bicycle speed : "+b1.getSpeed()+" km/hr");

        c1.speedUp(20);
        b1.speedUp(10);

        System.out.println("After speedUp Car speed : "+c1.getSpeed()+" km/hr");
        System.out.println("After speedUp Bicycle speed : "+b1.getSpeed()+" km/hr");
    }
    
}

// 2. Write a Java program to create a class Vehicle with a method called speedUp().
//  Create two subclasses Car and Bicycle. Override the speedUp() method in each
//   subclass to increase the vehicle's speed differently.