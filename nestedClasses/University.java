package nestedClasses;

public class University {
    static class Department{
        private String depatmentName;
        private int numberOfFaculty;

        public Department(String d,int n){
            depatmentName=d;
            numberOfFaculty=n;
        }
        public void displayInfo(){
            System.out.println("Department Name : "+depatmentName);
            System.out.println("Number of Faculty : "+numberOfFaculty);
        }
    }
    public static void main(String[] args) {
        University.Department d1=new University.Department("Computer Science", 100);
        d1.displayInfo();
    }
    
}

// 2. Static Nested Class:
// Write a Java program to create an outer class called University with a 
// static nested class Department. The Department class should have a method
//  "displayInfo()" that prints the department name and the number of faculty 
//  members. Instantiate the Department class from the main method and call 
//  the "displayInfo()" method.