package inheritance;
class Shape1{   // as shape is created before.
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}
class Circle extends Shape1{
    private double radius;
    final double PI=3.14;
    public Circle(double r){
        radius=r;
    }
    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public double getArea(){
        return PI*Math.pow(radius, 2);
    }

}
public class Main8 {
    public static void main(String[] args) {
        Circle c1=new Circle(5.55);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
    }

}

// 8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the 
// area and perimeter of a circle.