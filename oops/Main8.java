package oops;

class TrafficLight{
    private String color;
    private int duration;

    public TrafficLight(String s,int d){
        color=s;
        duration=d;
    }
    public void changeColor(String s){
        color=s;
    }
    public void changeDuration(int d){
        duration=d;
    }   
    public boolean isRed(){
        return color.equals("red");
    }
    public int getDuration(){
        return duration;
    }
    public boolean isGreen(){
        return color.equals("green");
    }
}

public class Main8 {
    public static void main(String[] args) {
        TrafficLight tl=new TrafficLight("red", 78);
        System.err.println(tl.isGreen());
        
    }    
}

// 8. Write a Java program to create class called "TrafficLight" with attributes 
// for color and duration, and methods to change the color and check for red or green.

