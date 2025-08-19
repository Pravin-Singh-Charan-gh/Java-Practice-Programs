package abstraction;

abstract class Shape2D {
    abstract public void draw();
    abstract public void resize();    
}
class Rectangle extends Shape2D{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle.....");
    }
    @Override
    public void resize(){
        System.out.println("Resizing Rectangle.....");
    }
}
class Circle extends Shape2D{
    @Override
    public void draw(){
        System.out.println("Drawing Circle.....");
    }
    @Override
    public void resize(){
        System.out.println("Resizing Circle.....");
    }
}
public class Main10 {
    public static void main(String[] args) {
        Shape2D rectangle=new Rectangle();
        Shape2D circle=new Circle();

        rectangle.draw();
        rectangle.resize();

        circle.draw();
        circle.resize();
    }
}

// 10. Write a Java program to create an abstract class Shape2D with abstract methods draw() 
// and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and 
// implement the respective methods to draw and resize each shape.