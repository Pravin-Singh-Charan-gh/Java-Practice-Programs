package nestedClasses;

abstract class Animal{
    abstract public void makeSound();
}

public class Main1 {
    public static void main(String[] args) {
        Animal cat=new Animal() {
            @Override
            public void makeSound(){
                System.out.println("Meow ");
            }
        };
        cat.makeSound();
    }
}

// 8. Anonymous Class Implementing Abstract Class:
// Write a Java program to create an abstract class called Animal with an abstract 
// method makeSound(). In the main method, create an anonymous class that extends 
// Animal and override the makeSound() method to print "Meow" for a cat. Call the 
// makeSound() method.