package staticVar;

public class Counter {
    private static int count;
    public Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
           Counter c=new Counter();
        }

        System.out.println(Counter.getCount());
    }
}

// 1. Static Variables:
// Write a Java program to create a class called "Counter" with a 
// static variable count. Implement a constructor that increments 
// count every time an object is created. Print the value of count 
// after creating several objects.