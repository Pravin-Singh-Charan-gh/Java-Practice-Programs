package polymorphism;

class Shape2{
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
}
class Circle2 extends Shape2{
    private double radius ;
    public Circle2(double r){
        radius=r;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle2 extends Shape2{
    private double length;
   private double breadth;

   public Rectangle2(double var1, double var3) {
      this.length = var1;
      this.breadth = var3;
   }
   @Override
   public double getArea() {
      return this.length * this.breadth;
   } 
   @Override
   public double getPerimeter(){
    return 2*(length + breadth);
   }
}
class Triangle2 extends Shape2 {
    private double side1;
    private double side2;
    private double side3;
 
    public Triangle2(double var1, double var3, double var5) {
       this.side1 = var1;
       this.side2 = var3;
       this.side3 = var5;
    }
    @Override
    public double getArea() {
       double var1 = (this.side1 + this.side2 + this.side3) / 2.0;
       return Math.sqrt(var1 * (var1 - this.side1) * (var1 - this.side2) * (var1 - this.side3));
    }
    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }
 }
 

public class Main6 {
    public static void main(String[] args) {
        Shape2 s1=new Shape2();
        Circle2 c1=new Circle2(4.4);
        Rectangle2 r1=new Rectangle2(2.2,3.3);
        Triangle2 t1=new Triangle2(3,4,5);

        System.out.println("Shape Area : "+s1.getArea());      
        System.out.println("Shape Perimeter : "+s1.getPerimeter());  

        System.out.println("Circle Area : "+c1.getArea());      
        System.out.println("Circle Perimeter : "+c1.getPerimeter());  

        System.out.println("Rectangle Area : "+r1.getArea());      
        System.out.println("Rectangle Perimeter : "+r1.getPerimeter());  

        System.out.println("Triangle Area : "+t1.getArea());      
        System.out.println("Triangle Perimeter : "+t1.getPerimeter());  
    }
    
}

// 6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
//  Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and 
//  getPerimeter() methods in each subclass to calculate and return the area and perimeter 
//  of the respective shapes.

