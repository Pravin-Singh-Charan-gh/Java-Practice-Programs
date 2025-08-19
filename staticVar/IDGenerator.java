package staticVar;
public class IDGenerator{
    private static int nextID;

    public IDGenerator(int id){
        this.nextID=id;
    }
    public static int generateID(){
        int t=nextID;
        nextID++;   // Or return nextID++;
        return t;
    }

    public static void main(String args[]){
        IDGenerator idg=new IDGenerator(101);
        System.out.println("NextID : "+IDGenerator.generateID());
        System.out.println("NextID : "+IDGenerator.generateID());

        IDGenerator idg2=new IDGenerator(66);
        System.out.println("NextID : "+IDGenerator.generateID());
        System.out.println("NextID : "+idg.generateID());

    }
}



// 6. Static Method with Static Variable
// Write a Java program to create a class called "IDGenerator" with a static 
// variable 'nextID' and a static method "generateID()" that returns the next 
// ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.