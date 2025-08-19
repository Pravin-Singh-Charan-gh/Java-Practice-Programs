package polymorphism;

class Employee{
    private double salary;
    public Employee(double s){
        salary=s;
    }
    public double calculateSalary(){
        return 0.0;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(double salary,double bonus){
        super(salary);
        this.bonus=bonus;
    }
    public double calculateSalary(){
        return getSalary()+bonus;
    }
}
class Programmer extends Employee{
    private double bonus;
    public Programmer(double salary,double bonus){
        super(salary);
        this.bonus=bonus;
    }
    public double calculateSalary(){
        return getSalary()+bonus;
    }
} 

public class Main4 {
    public static void main(String[] args) {
        Manager m1=new Manager(100000,1000);
        System.out.println("Manager Salary : "+m1.calculateSalary());
        Programmer p1=new Programmer(100000,1000);
        System.out.println("Programmer Salary : "+p1.calculateSalary());
    }    
}

// 4. Write a Java program to create a class Employee with a method called calculateSalary(). 
// Create two subclasses Manager and Programmer. In each subclass, override the 
// calculateSalary() method to calculate and return the salary based on their 
// specific roles.

