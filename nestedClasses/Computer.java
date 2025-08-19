package nestedClasses;

class Computer{
    class Processor{
        private String brand;
        private String speed;

        public Processor(String s,String i){
            brand=s;
            speed=i;
        }

        void displayDetails(){
            System.out.println("Brand : "+brand);
            System.out.println("Spped : "+speed);
        }
    }
    public void showProcessor(){
        Processor p1=new Processor("Intel", "3.5 GHz");
        p1.displayDetails();
    }

    public static void main(String args[]){
        Computer c1=new Computer();
        c1.showProcessor();
    }
}


// 1. Inner Class:
// Write a Java program to create an outer class 
// called Computer with 
// an inner class Processor. The Processor class should 
// have a method 
// "displayDetails()" that prints the details of the 
// processor (e.g., 
// brand and speed). Create an instance of Processor 
// from the Computer
//  class and call the "displayDetails()" method.