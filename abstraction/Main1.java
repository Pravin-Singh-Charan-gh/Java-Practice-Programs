package abstraction;

abstract class  Animal{
    abstract public void sound();
}
class Lion extends Animal{
    @Override
    public void sound(){
        System.out.println("Roaring....");
    }
}
class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Growling....");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Lion l1=new Lion();
        Tiger t1=new Tiger();
        l1.sound();
        t1.sound();
    }
}
// 1. Write a Java program to create an abstract class Animal with an abstract method called sound().
//  Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to
//   make a specific sound for each animal.
