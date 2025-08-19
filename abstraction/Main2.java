package abstraction;

abstract class Shape{
    abstract public double calculateArea();
    abstract public double calculatePerimeter();
}
class Circle extends Shape{
    final private double PI=3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return PI*radius*radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2*PI*radius;
    }
}
class Triangle extends Shape{
    private double side1,side2,side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea(){
        double s=calculatePerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double calculatePerimeter(){
        return side1+side2+side3;
    }
    
    
}
public class Main2 {
    public static void main(String[] args) {
        Circle c1=new Circle(9.55);
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimeter());

        Triangle t1=new Triangle(2.3,5.6,4.3 );   // triangle should be a valid triangle
        System.out.println(t1.calculateArea());
        System.out.println(t1.calculatePerimeter());
    }
}

// 2. Write a Java program to create an abstract class Shape with abstract methods 
// calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle 
// that extend the Shape class and implement the respective methods to calculate the
//  area and perimeter of each shape.