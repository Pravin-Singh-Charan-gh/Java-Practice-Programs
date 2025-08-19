package nestedClasses;

public class House {
    public void calculateArea(){
        class Room{
            int a,b;
            public Room(int a,int b){
                this.a=a;
                this.b=b;
            }
            public int getArea(){
                return a*b;
            }
        }
        Room r1=new Room(2,7);
        System.out.println(r1.getArea());
    }
    public static void main(String[] args) {
        House h1=new House();
        h1.calculateArea();
    }
}

// 7. Local Class Accessing Local Variables:
// Write a Java program to create a class called House with a method calculateArea(). 
// Inside this method, define a local class Room with a method getArea() that calculates
//  and returns the area of the room (length * width). Instantiate the Room class and call
//   the getArea() method from within calculateArea().