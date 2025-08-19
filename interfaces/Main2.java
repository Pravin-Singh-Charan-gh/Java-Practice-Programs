package interfaces;

interface Animal{
    public void bark();
}
class Dog implements Animal{
    @Override
    public void bark(){
        System.out.println("Dog is barking");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
    }
    
}

// 2. Write a Java program to create a Animal interface with a method called bark()
//  that takes no arguments and returns void. Create a Dog class that implements 
//  Animal and overrides speak() to print "Dog is barking".