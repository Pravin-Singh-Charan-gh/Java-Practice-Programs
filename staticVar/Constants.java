package staticVar;

public class Constants{
    private final static double PI=3.14159;

    public static double areaCircle(double radius){
        return PI*radius*radius;
    }
    public static void main(String args[]){
        double r=5.434;
        System.out.println("Area of Circle with radius "+r+" : "+areaCircle(r));
    }
}


// 4. Static Final Variables
// Write a Java program to create a class called Constants with a static 
// final variable 'PI' initialized to 3.14159. Create a method to calculate
//  the area of a circle given its radius, using the 'PI' constant. Demonstrate 
//  the method in the main method.