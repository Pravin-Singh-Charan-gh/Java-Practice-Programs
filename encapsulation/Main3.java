package encapsulation;

class Rectangle{
    private double length,width;

    public void setLength(double l){
        length=l;
    }
    public void setWidth(double w){
        width=w;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setLength(33.3);
        r1.setWidth(44.4);;

        System.out.println("Length : "+r1.getLength());
        System.out.println("Width : "+r1.getWidth());
        
    }
}

// 3. Write a Java program to create a class called Rectangle with private 
// instance variables length and width. Provide public getter and setter 
// methods to access and modify these variables.