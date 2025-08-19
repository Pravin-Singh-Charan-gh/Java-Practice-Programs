package encapsulation;

class Circle{
    private double radius;
    
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(4.5);

        System.out.println("Circle Radius : "+c1.getRadius());
        System.out.println("Circle Area : "+c1.calculateArea());
        System.out.println("Circle Parameter : "+c1.calculatePerimeter());
    }
}

// 5. Write a Java program to create a class called Circle with a private
//  instance variable radius. Provide public getter and setter methods to
//   access and modify the radius variable. However, provide two methods 
//   called calculateArea() and calculatePerimeter() that return the 
//   calculated area and perimeter based on the current radius value.