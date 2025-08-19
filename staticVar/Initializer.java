package staticVar;

public class Initializer {
    private static int initialValue;

    public Initializer(int a){
        this.initialValue=a;
    }
    static{
        initialValue=1000;
    }
    public static int getInitialValue() {
        // TODO Auto-generated method stub
        return initialValue;
    }

    public static void main(String[] args) {
        System.out.println("Value of initialValue before creating instance of Initializer : "+Initializer.getInitialValue());
        Initializer i=new Initializer(11);
        System.out.println("Value of initialValue after creating instance of Initializer : "+Initializer.getInitialValue());
    }

}

// 3. Static Block
// Write a Java program to create a class called "Initializer"
//  with a static block that initializes a static variable 'initialValue'
//   to 1000. Print the value of 'initialValue' before and after creating 
//   an instance of "Initializer".