package encapsulation;

class House{
    private String address;
    private int numberOfRooms;
    private double area;

    public void setAddress(String a){
        address=a;
    }
    public void setNumberOfRooms(int r){
        numberOfRooms=r;
    }
    public void setArea(double d){
        area=d;
    }

    public String getAddress(){
        return address;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public double getArea(){
        return area;
    }

    public double calculatePrice(double rate){
        return area*rate;
    }
}

public class Main11 {
    public static void main(String[] args) {
        House h1=new House();
        h1.setAddress("Kakunagar");
        h1.setArea(1000);
        h1.setNumberOfRooms(90);

        System.out.println("Address : "+h1.getAddress());
        System.out.println("Area : "+h1.getArea());
        System.out.println("Number of Rooms : "+h1.getNumberOfRooms());
        System.out.println("Price of House : "+h1.calculatePrice(100000));
        
    }    
}

// 11. Write a Java program to create a class called House with private
//  instance variables address, numberOfRooms, and area. Provide public
//   getter and setter methods to access and modify these variables. Add 
//   a method called calculatePrice() that returns the price of the house
//    based on its area and a price per square meter.