package abstraction;

abstract class GeometricShape{
    abstract public double area();
    abstract public double perimeter();
}
class  Triangle2 extends GeometricShape{          // as other triangle class exists in this package
    private double s1,s2,s3;
    public Triangle2(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public double area(){
        double s=perimeter()/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    @Override
    public double perimeter(){
        return s1+s2+s3;
    }
}
class Square extends GeometricShape{
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    public double area(){
        return side*side;
    }
    @Override
    public double perimeter(){
        return side*4;
    }   
}

public class Main12 {
    public static void main(String[] args) {
        GeometricShape triangle=new Triangle2(4.4,3,5);
        GeometricShape square=new Square(12.2);

        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        System.out.println(square.area());
        System.out.println(square.perimeter());
    }
}

// 12. Write a Java program to create an abstract class GeometricShape with abstract
//  methods area() and perimeter(). Create subclasses Triangle and Square that extend
//   the GeometricShape class and implement the respective methods to calculate the
//    area and perimeter of each shape.