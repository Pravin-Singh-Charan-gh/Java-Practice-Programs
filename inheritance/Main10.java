package inheritance;

class Employee{
    private String name,address;
    private int sellary;
    private String jobTitle;
    public Employee(String name, String address, int sellary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.sellary = sellary;
        this.jobTitle = jobTitle;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getSellary() {
        return sellary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double calculateBonuses(){
        return 0.0;
    }
    public String generatePerformanceReport(){
        return "No Report Available.";
    }
}
class Manager extends Employee{
    private int numberOfSunordinates;

    public Manager(String name, String address, int sellary, String jobTitle, int numberOfSunordinates) {
        super(name, address, sellary, jobTitle);
        this.numberOfSunordinates = numberOfSunordinates;
    }

    public int getNumberOfSunordinates() {
        return numberOfSunordinates;
    }
    @Override
    public double calculateBonuses(){
        return getSellary()*0.15;
    }
    @Override
    public String generatePerformanceReport(){
        return "Performance Report for Manager : "+getName()+" is managing excellent";
    }
    public void manageProjects(){
        System.out.println("Manager "+getName()+" is managing projects.");
    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String address, int sellary, String jobTitle, String programmingLanguage) {
        super(name, address, sellary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    @Override
    public double calculateBonuses(){
        return getSellary()*0.20;
    }
    @Override
    public String generatePerformanceReport(){
        return "Performance Report for Developer : "+getName()+" is developing excellent";
    }
    public void manageProjects(){
        System.out.println("Developer "+getName()+" is designing software.");
    }
    public void writeCode(){
        System.out.println("Wrting Code");
    }
}

class Programmer extends Developer{
    public Programmer(String name, String address, int sellary, String jobTitle, String programmingLanguage) {
        super(name, address, sellary, jobTitle,programmingLanguage);
    }

    @Override
    public double calculateBonuses(){
        return getSellary()*0.20;
    }
    @Override
    public String generatePerformanceReport(){
        return "Performance Report for Developer : "+getName()+" is programming excellent";
    }
    public void manageProjects(){
        System.out.println("Programmer "+getName()+" is wrting code.");
    }
    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
}


public class Main10 {
    public static void main(String[] args) {
        Employee e1=new Employee("Mohit", "Mumbai", 19289, "Salesman");
        Manager m1=new Manager("Mohan", "Gurgaon", 98938, "Manager", 10);
        Developer d1=new Developer("Prakash", "XYZ", 898767, "ABC", "Java");
        Programmer p1=new Programmer("Om", "Baglore", 374863,"Programmer", "Java");

                // Printing the manager's bonus
                System.out.println("Manager's Bonus: $" + m1.calculateBonuses());
                // Printing the developer's bonus
                System.out.println("Developer's Bonus: $" + d1.calculateBonuses());
                // Printing the programmer's bonus
                System.out.println("Programmer's Bonus: $" + p1.calculateBonuses());
        
                // Printing the manager's performance report
                System.out.println(m1.generatePerformanceReport());
                // Printing the developer's performance report
                System.out.println(d1.generatePerformanceReport());
                // Printing the programmer's performance report
                System.out.println(p1.generatePerformanceReport());
        
                // Manager managing a project
                m1.manageProjects();
                // Developer writing code
                d1.writeCode();
                // Programmer debugging code
                p1.debugCode();
}
}
// 10. Write a Java program that creates a class hierarchy for employees of a company. 
// The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
// Each subclass should have properties such as name, address, salary, and job title. 
// Implement methods for calculating bonuses, generating performance reports, and managing projects.