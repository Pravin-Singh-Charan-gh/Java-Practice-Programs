package abstraction;

abstract class Bird{
    abstract public void fly();
    abstract public void makeSound();
}
class Sparrow extends Bird{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying.");
    }
    @Override
    public void makeSound(){
        System.out.println("sssssss.....");
    }
}
class Hawk extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle is flying over the clouds");
    }
    @Override
    public void makeSound(){
        System.out.println("kee-eeeee-arr!");
    }
}
public class Main11 {
    public static void main(String[] args) {
        Bird sparrow=new Sparrow();
        Bird hawk=new Hawk();

        sparrow.fly();
        sparrow.makeSound();

        hawk.fly();
        hawk.makeSound();
    }    
}

// 11. Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). 
// Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to 
// describe how each bird flies and makes a sound.