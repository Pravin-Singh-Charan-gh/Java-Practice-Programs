package constructor;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(double x,double y){
        this.x=(int) x;
        this.y=(int) y;
    }

    public void printPoint(){
        System.out.println("x : "+x+", y : "+y);
    }

    public static void main(String[] args) {
        Point p1=new Point(7,6);
        Point p2=new Point(4.77,6.45);

        p1.printPoint();
        p2.printPoint();
    }
}


// 8. Overloading Constructors with Different Data Types
// Write a Java program to create a class called Point with instance variables x
//  and y. Implement overloaded constructors:

// One constructor takes int parameters.
// Another constructor takes double parameters.
// Print the values of the variables for each constructor.
