package constructor;

public class Car {
    private String make;
    private String model;
    private int year;

    // public Car(){
    //     this("Unknown","Unknown",2000);
    // }
    // public Car(String make){
    //     this(make,"Unknown",2000);
    // }
    // public Car(String make,String model){
    //     this(make,model,2000);
    // }
    public Car(String make,String model, int year){
        this.make=(make==null || make.isEmpty() ? "Unknown" : make);
        this.model=(model==null || model.isEmpty() ? "Unknown" : model);
        this.year=(year<=0 ? 2000 : year);
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public static void main(String[] args) {
        Car c1=new Car("Maruti Suzuki","Alto 800",2019);
        Car c2=new Car("Mahindra", "Thar 5 door", 2026);

        System.out.println("Car c1 details : ");
        System.out.println("Make : "+c1.getMake());
        System.out.println("Model : "+c1.getModel());
        System.out.println("Year : "+c1.getYear());

        System.out.println();
        System.out.println("Car c2 details : ");
        System.out.println("Make : "+c2.getMake());
        System.out.println("Model : "+c2.getModel());
        System.out.println("Year : "+c2.getYear());
    }
}


// 7. Constructor with Default Values
// Write a Java program to create a class called Car
//  with instance variables make, model, and year. Implement
//   a parameterized constructor that initializes these variables 
//   and assigns default values if not provided. Print the values
//    of the variables.