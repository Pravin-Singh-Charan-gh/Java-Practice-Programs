package nestedClasses;

public class School {
    static class Student{
        private String name;
        private String grade;
        public Student(String n,String g){
            name=n;
            grade=g;
        }
        public void displayStudentInfo(){
            System.out.println("Name : "+name);
            System.out.println("Grade : "+grade);
        }
    }
    public static void main(String[] args) {
        Student s1 = new School.Student("Gurukul", "A++");

        // OR

        School.Student s2= new School.Student("Gurukul", "A++");

        s2.displayStudentInfo();

    }
}

// 10. Static Nested Class and Non-static Methods:
// Write a Java program to create an outer class called School with a static
//  nested class Student. The Student class should have a non-static method 
//  displayStudentInfo() that prints the student's name and grade. Instantiate 
//  the Student class from the main method and call the displayStudentInfo() method.