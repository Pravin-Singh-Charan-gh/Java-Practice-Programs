package polymorphism;

class Shape4{
    public void draw(){
        System.out.println("Drwaing a shape");
    }
    public double calculateArea(){
        return 0.0;
    }
}
class Circle4 extends Shape4{
    private double radius;

   public Circle4(double var1) {
      this.radius = var1;
   }
   @Override
   public void draw(){
    System.out.println("Drwaing a shape");
   }
   @Override
   public double calculateArea() {
      return Math.PI * this.radius * this.radius;
   }
   public double getRadius(){
    return radius;
   }
}
class Cylinder extends Circle4{
    private double height;

    public Cylinder(double r,double h){
        super(r);
        height=h;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a cylinder");
    }
    @Override
   public double calculateArea() {
    double r=getRadius();
      return (2*Math.PI * r * r)+(2*Math.PI*r*height);
   }
}

public class Main12 {
    public static void main(String[] args) {
        Circle4 c1=new Circle4(8);
        c1.draw();
        System.out.println("Circle Area : "+c1.calculateArea());

        Cylinder c2=new Cylinder(44,50);
        c2.draw();
        System.out.println("Cylinder Area : "+c2.calculateArea());
    }
    
}

// 12. Write a Java program to create a base class Shape with methods draw()
//  and calculateArea(). Create two subclasses Circle and Cylinder. Override 
//  the draw() method in each subclass to draw the respective shape. In addition,
//   override the calculateArea() method in the Cylinder subclass to calculate 
//   and return the total surface area of the cylinder.