package inheritance;

class Animal{
    // Animal(){
    //     System.out.println("in animal");
    // }
    public void makeSound(){
        System.out.println("I am a animal and I am making sound");
    }
}
class Cat extends Animal{
    // Cat(){
    //     System.out.println("in cat");
    // }
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.makeSound();
    }
}
// 1. Write a Java program to create a class called Animal with a method called 
// makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
