package nestedClasses;
public class Car{
    public void startEngine(){
        class Engine{
            public void run(){
                System.out.println("Engine is running");
            }
        }
        Engine e1=new Engine();
        e1.run();
    }
    public static void main(String args[]){
        // new Car().startEngine();

        // OR 

        Car c1=new Car();
        c1.startEngine();
    }
}
// 3. Local Class:
// Write a Java program to create a class called Car with a method
//  startEngine(). Inside this method, define a local class Engine that 
//  has a method run(). The run() method should print "Engine is running". 
//  Instantiate and call the run() method from within the startEngine() method.{}
