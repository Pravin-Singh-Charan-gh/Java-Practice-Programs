package inheritance;

class Person{
    private String firstName,lastName;
    public Person(String f,String l){
        firstName=f;
        lastName=l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
}
class Employee extends Person{
    private int employeeID;
    private String jobTitle;
    public Employee(String f,String l,int id,String jobTitle){
        super( f, l);
        employeeID=id;
        this.jobTitle=jobTitle;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    @Override
    public String getLastName(){
        return "Last Name : "+super.getLastName() +" ,\nJob Title : "+ jobTitle;
    }
}
public class Main7 {
    public static void main(String[] args) {
        Employee e1=new Employee("ABC", "XYZ", 2343, "BOSS");
        System.out.println(e1.getLastName());
    }
}


// 7. Write a Java program to create a class known as Person with methods called getFirstName() 
// and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId()
//  and overrides the getLastName() method to include the employee's job title.