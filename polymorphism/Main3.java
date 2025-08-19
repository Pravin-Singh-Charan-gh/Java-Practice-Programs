package polymorphism;

class Shape{
    public double calculateArea(){
        return 0.0;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double r){
        radius=r;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double length,breadth;
    public Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    @Override
    public double calculateArea(){
        return length*breadth;
    }
}

class Triangle extends Shape{
    private double side1,side2,side3;

    public Triangle(double s1,double s2,double s3){
        side1=s1;
        side2=s2;
        side3=s3;
    }
    @Override
    public double calculateArea(){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}


public class Main3 {
    public static void main(String[] args) {
        Circle c1=new Circle(4.4);
        System.out.println("Circle Area : "+c1.calculateArea());

        Rectangle r1=new Rectangle(3.3,4.5);
        System.out.println("Rectangle Area : "+r1.calculateArea());

        Triangle t1=new Triangle(3.3,4.5,3.9);
        System.out.println("Triangle  Area : "+t1.calculateArea());
    }
}

// 3. Write a Java program to create a base class Shape with a method called calculateArea().
//  Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
//   method in each subclass to calculate and return the shape's area.