package abstraction;

abstract class Employee{
    protected String name;
    protected int id;
    protected int baseSalary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.baseSalary = salary;
    }

    abstract public int calculateSalary();
    abstract public void  displayInfo();
}

class Manager extends Employee{
    private int bonus;

    public Manager(String name,int id,int salary,int bonus){
        super(name, id, salary);
        this.bonus=bonus;
    }
    @Override
    public int calculateSalary(){
        return baseSalary+bonus;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Base Salary : "+baseSalary);
    }
}
class Programmer extends Employee{
    private int bonus;
    private int overTimeHours;
    private int hourlyRate;

    public Programmer(String name, int id, int salary, int bonus, int overTimeHours, int hourlyRate) {
        super(name, id, salary);
        this.bonus = bonus;
        this.overTimeHours = overTimeHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public int calculateSalary(){
        return baseSalary+bonus;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Base Salary : "+baseSalary);
        System.out.println("Bonus : "+bonus);
        System.out.println("Over Time Hours : "+overTimeHours);
        System.out.println("Hourly Rate : "+hourlyRate);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Manager m1=new Manager("Mohan",2329 ,243423 , 23230);
        Programmer p1=new Programmer("Mohan",2329 ,243423 , 23230,5,3000);
        m1.displayInfo();
        p1.displayInfo();
    }
    
}


// 5. Write a Java program to create an abstract class Employee with abstract methods
//  calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that 
//  extend the Employee class and implement the respective methods to calculate salary 
//  and display information for each role.