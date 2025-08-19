package abstraction;

abstract class Shape3D{
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D{
    final private double PI=3.14;
    private double radius ;

    public Sphere(double radius) {
        this.radius = radius;
    }  
    @Override
    public double calculateVolume(){
        return (4/3)*PI*radius*radius*radius;
    }
    @Override
    public double calculateSurfaceArea(){
        return 4*PI*radius*radius;
    }

    
}
class Cube extends Shape3D{
    private double side ;

    public Cube(double side) {
        this.side = side;
    }  
    @Override
    public double calculateVolume(){
        return side*side*side;
    }
    @Override
    public double calculateSurfaceArea(){
        return 6*side;
    }
}


public class Main6 {
    public static void main(String[] args) {
        Sphere s1=new Sphere(5.55);
        Cube c1=new Cube(7.55);

        System.out.println("Spehere Volume : "+s1.calculateVolume());
        System.out.println("Spehere Surface Area : "+s1.calculateSurfaceArea());
        System.out.println("Cube Volueme : "+c1.calculateVolume());
        System.out.println("Cube Surface Area : "+c1.calculateSurfaceArea());
    }
}

// 6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() 
// and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and 
// implement the respective methods to calculate the volume and surface area of each shape.