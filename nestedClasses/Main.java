package nestedClasses;

interface Greeting{
    public void sayHello();
}
public class Main {
    public static void main(String[] args) {
        class A implements Greeting{
            public void sayHello(){
                System.out.println("Listen carefully. I am saying Hello.");
            }
        }
        A a1=new A();
        a1.sayHello();


        // OR    Creating anonymous class   (As per question)

        Greeting g1=new Greeting() {
            public void sayHello(){
                System.out.println("Listen carefully. I am saying Hello. in anonymous class");
            }
        };
        g1.sayHello();
    }
}

// 4. Anonymous Class Exercise:
// Write a Java program to create an interface called Greeting with a method sayHello(). 
// In the main method, create an anonymous class that implements the Greeting interface 
// and override the sayHello() method to print "Hello, World!". Call the sayHello() method.
