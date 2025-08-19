package encapsulation;

class Employee{
    private int employee_id;
    private String employee_name;
    private int employee_salary;

    public void setEmployee_id(int id){
        employee_id=id;
    }
    public void setEmployee_name(String name){
        employee_name=name;
    }
    public int getEmployee_id(){
        return employee_id;
    }
    public String getEmployee_name(){
        return employee_name;
    }
    public void setEmployee_salary(int salary){
        employee_salary=salary;
    }
    public int getEmployee_salary(){
        return employee_salary;
    }

    public String getFormattedSalary(){
        return employee_salary+" Rs";
    }
}


public class Main4 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmployee_id(233);
        e1.setEmployee_name("Kaku");
        e1.setEmployee_salary(4747);

        System.out.println("Employee ID : "+e1.getEmployee_id());
        System.out.println("Employee Name : "+e1.getEmployee_name());
        System.out.println("Employee Salary : "+e1.getEmployee_salary());
        
    }
}

// 4. Write a Java program to create a class called Employee with private 
// instance variables employee_id, employee_name, and employee_salary.
//  Provide public getter and setter methods to access and modify the 
//  id and name variables, but provide a getter method for the salary 
//  variable that returns a formatted string.