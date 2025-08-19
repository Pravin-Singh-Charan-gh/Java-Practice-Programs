package encapsulation;

class Car{
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public void setCompany_name(String s){
        company_name=s;
    }

    public void setModel_name(String s){
        model_name=s;
    }

    public void setYear(int s){
        year=s;
    }

    public String getCompany_name(){
        return company_name;
    }

    public String getModel_name(){
        return model_name;
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.setCompany_name("Maruti-Suzuki");
        c1.setModel_name("Swift");
        c1.setYear(2024);

        System.out.println("Car Company Name : "+c1.getCompany_name());
        System.out.println("Car Model Name : "+c1.getModel_name());
        System.out.println("Car Year : "+c1.getYear());
        System.out.println("Car Mieage : "+c1.getMileage());
    }
    
}

// 6. Write a Java program to create a class called Car with private instance variables
//  company_name, model_name, year, and mileage. Provide public getter and setter methods 
//  to access and modify the company_name, model_name, and year variables. However, only
//   provide a getter method for the mileage variable.

