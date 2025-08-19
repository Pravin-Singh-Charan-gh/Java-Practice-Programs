package inheritance;

class Employee{
    private int salary;
    
    public Employee(int salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println("Employee is working.");
    }
    public int getSalary(){
        return salary;
    }
}
class HRManager extends Employee{
    public HRManager(int s){
        super(s);
    }
    @Override
    public void work(){
        System.out.println("HR is working.");
    }
    public Employee addEmployee(int salary){
        Employee e=new Employee(salary);
        return e;
    }
}
public class Main4 {
    public static void main(String[] args) {
    HRManager hr=new HRManager(1000000);
    Employee e1=hr.addEmployee(10000);
    System.out.println(e1.getSalary());
    e1.work();
    }
}

// 4. Write a Java program to create a class called Employee with methods called work() 
// and getSalary(). Create a subclass called HRManager that overrides the work() method
//  and adds a new method called addEmployee().