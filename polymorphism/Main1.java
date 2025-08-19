package polymorphism;

class Animal{
     public void sound(){
        System.out.println("Animal is making sound.");
    }
}
class Bird extends Animal{
    @Override
    public void sound(){
        System.out.println("turrr....");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("meow....");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.sound();
        Bird b1=new Bird();
        b1.sound();
        Cat c1=new Cat();
        c1.sound();
    }
    
}
// 1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
//  Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific 
//  sound for each animal.
