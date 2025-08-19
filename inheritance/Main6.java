package inheritance;

class Animal{
    public void move(){
        System.out.println("Moving...");
    }
}
class Cheetah extends Animal{
    @Override
    public void move(){
        System.out.println("Running...");
    }
}
public class Main6 {
    public static void main(String[] args) {
        Cheetah c1=new Cheetah();
        c1.move();
    
    }
}


// 6. Write a Java program to create a class called Animal with a method named move(). 
// Create a subclass called Cheetah that overrides the move() method to run.