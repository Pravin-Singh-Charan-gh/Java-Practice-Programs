package constructor;

public class Student {
    private int studentId;
    private String studentName;
    private String grade;

    public Student(){
        this(0,"Unknown","Unknown");
    }
    public Student(int id,String name, String g){
        this.studentId=id;
        this.studentName=name;
        this.grade=g;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(101,"Pravin Singh Charan","A++");

        System.out.println("Student s1 : Id = "+s1.studentId+", Name = "+s1.studentName+", Grade = "+s1.grade);
        System.out.println("Student s2 : Id = "+s2.studentId+", Name = "+s2.studentName+", Grade = "+s2.grade);
    }

}




// 4. Chaining Constructors
// Write a Java program to create a class called Student with instance
//  variables studentId, studentName, and grade. Implement a default 
//  constructor and a parameterized constructor that takes all three instance
//   variables. Use constructor chaining to initialize the variables. Print the
//    values of the variables.
