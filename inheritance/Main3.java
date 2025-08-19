package inheritance;

class Shape{
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    private double l,b;
    Rectangle(double i,double j){
        l=i;
        b=j;
    }
    @Override
    public double getArea(){
        return l*b;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(5.45, 4.33);
        System.out.println(r1.getArea());
    }
    
}

// 3. Write a Java program to create a class called Shape with a method called getArea(). 
// Create a subclass called Rectangle that overrides the getArea() method to calculate the
//  area of a rectangle.