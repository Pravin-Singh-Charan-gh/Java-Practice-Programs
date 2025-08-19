package abstraction;

abstract class Animal{
    abstract public void eat();
    abstract public void sleep();
}
class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lion is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Lion is sleeping");
    }
}
class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("Tiger is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Tiger is sleeping");
    }
}
class Deer extends Animal{
    @Override
    public void eat(){
        System.out.println("Deer is eating grass");
    }
    @Override
    public void sleep(){
        System.out.println("Deer is sleeping");
    }
}
public class Main4 {
    public static void main(String[] args) {
        Lion l1=new Lion();
        Tiger t1=new Tiger();
        Deer d1=new Deer();

        l1.eat();
        l1.sleep();

        t1.eat();
        t1.sleep();


        d1.eat();
        d1.sleep();

    }
    
}


// 4. Write a Java program to create an abstract class Animal with abstract methods eat() and
//  sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement
//   the eat() and sleep() methods differently based on their specific behavior.