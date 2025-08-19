package polymorphism;

class Shape3{
    public void draw(){
        System.out.println("Drwaing a shape.");
    }
    public double calculateArea(){
        return 0.0;
    }
}
class Circle3 extends Shape3{
    private double radius ;
    public Circle3(double r){
        radius=r;
    }
    @Override
    public void draw(){
        System.out.println("Drwaing a circle.");
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Square extends Shape3{
    private double side;

    public Square(double s){
        side=s;
    }
    @Override
    public void draw(){
        System.out.println("Drwaing a Square.");
    }
    @Override
    public double calculateArea(){
        return side*side;
    }
}
class Triangle3 extends Shape3{
    private double side1;
    private double side2;
    private double side3;
 
    public Triangle3(double var1, double var3, double var5) {
       this.side1 = var1;
       this.side2 = var3;
       this.side3 = var5;
    }
    @Override
    public void draw(){
        System.out.println("Drwaing a Triangle.");
    }
    @Override
    public double calculateArea() {
       double var1 = (this.side1 + this.side2 + this.side3) / 2.0;
       return Math.sqrt(var1 * (var1 - this.side1) * (var1 - this.side2) * (var1 - this.side3));
    }
}

public class Main8 {
    public static void main(String[] args) {
        Shape3 s1=new Shape3();
        Circle3 c1=new Circle3(5.5);
        Square sq=new Square(4.4);
        Triangle3 t1=new Triangle3(3.3, 4.4, 5.5);

        performAction(s1);
        performAction(c1);
        performAction(sq);
        performAction(t1);
    }
    
    public static void performAction(Shape3 s){
        s.draw();
        System.out.println("Area : "+s.calculateArea());
    }
}

// 8. Write a Java program to create a base class Shape with methods draw() 
// and calculateArea(). Create three subclasses: Circle, Square, and Triangle. 
// Override the draw() method in each subclass to draw the respective shape, 
// and override the calculateArea() method to calculate and return the area
//  of each shape.