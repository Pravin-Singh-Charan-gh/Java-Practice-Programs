package interfaces;

interface Shape{
    public double getArea();
}
class Rectangle implements Shape{
    private double length,breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double getArea(){
        return length*breadth;
    }
}
class Circle implements Shape{
    private double radius;
    
    public Circle(double r){
        radius=r;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class Triangle implements Shape{
    private double s1,s2,s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public double getArea(){
        double s=(s1+s2+s3)/2;
        return Math.sqrt(s*(s-1)*(s-s2)*(s-s3));
    }    
}

public class Main1 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3.3, 4.4);
        Circle c1=new Circle(3);
        Triangle t1=new Triangle(3.3, 4.4,7);

        System.out.println("Rectangle Area : "+r1.getArea());
        System.out.println("Circle Area : "+c1.getArea());
        System.out.println("Trianglt Area : "+t1.getArea());
    }
    
}

// 1. Write a Java program to create an interface Shape with the getArea() method.
//  Create three classes Rectangle, Circle, and Triangle that implement the Shape 
//  interface. Implement the getArea() method for each of the three classes.
