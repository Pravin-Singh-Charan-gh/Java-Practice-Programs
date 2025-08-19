package interfaces;

interface Resizable{
    public void resizeWidth(int width);
    public void resizeHeight(int height);
}
class Rectangle2 implements Resizable{
    private double width,height;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Rectangle2 r1=new Rectangle2(34,23 );
        r1.resizeWidth(78);
        r1.resizeWidth(87);
        r1.printSize();
    }
    
}


// 5. Write a Java program to create an interface Resizable with methods resizeWidth(int width)
//  and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle 
//  that implements the Resizable interface and implements the resize methods.