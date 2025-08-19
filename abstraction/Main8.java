package abstraction;

abstract class Person{
    abstract public void eat();
    abstract public void exercise();
}
class Athlete extends Person{
    @Override
    public void eat(){
        System.out.println("Eating healthy food");
    }
    @Override
    public void exercise(){
        System.out.println("Exercising regularly");
    }
}
class LazyPerson extends Person{
    @Override
    public void eat(){
        System.out.println("Eating junk food");
    }
    @Override
    public void exercise(){
        System.out.println("Not Exercising regularly");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Athlete virat=new Athlete();
        virat.eat();
        virat.exercise();

        LazyPerson lallu=new LazyPerson();
        virat.eat();
        virat.exercise();
    }
    
}

// 8. Write a Java program to create an abstract class Person with abstract methods 
// eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the 
// Person class and implement the respective methods to describe how each person eats
//  and exercises.