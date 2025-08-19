package polymorphism;

class Animal2{
    public void move(){
        System.out.println("Animal is moving.....");
    }
    public void makeSound(){
        System.out.println("Animal making sound......");
    }
}

class Bird2 extends Animal2{
    @Override
    public void move(){
        System.out.println("Bird is flying......");
    }
    @Override
    public void makeSound(){
        System.out.println("Chi....");
    }
}

class Panthera extends Animal2{
    @Override
    public void move(){
        System.out.println("Panthera is running......");
    }
    @Override
    public void makeSound(){
        System.out.println("Yowling");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Animal2 b1=new Bird2();
        Animal2 p1=new Panthera();

        performAction(b1);
        performAction(p1);
    }
    public static void performAction(Animal2 a){
        a.move();
        a.makeSound();
    }
}

// 7. Write a Java program to create a base class Animal with methods move() 
// and makeSound(). Create two subclasses Bird and Panthera. Override the move()
//  method in each subclass to describe how each animal moves. Also, override the 
//  makeSound() method in each subclass to make a specific sound for each animal.

