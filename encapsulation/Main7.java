package encapsulation;
import java.util.ArrayList;

class Student {
    private int student_id;
    private String student_name;
    private ArrayList<Double> grades;

    // Constructor to initialize grades
    public Student() {
        grades = new ArrayList<>();
    }

    public void setStudent_id(int id) {
        student_id = id;
    }

    public void setStudent_name(String name) {
        student_name = name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        // Optional: Add validation for the grade range
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            return;
        }
        grades.add(grade);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudent_id(33);
        s1.setStudent_name("Kaku");
        s1.addGrade(99);
        s1.addGrade(63);
        s1.addGrade(110); // This will trigger the validation message

        System.out.println("Student ID : " + s1.getStudent_id());
        System.out.println("Student Name : " + s1.getStudent_name());
        System.out.println("Student Grades : " + s1.getGrades());
    }
}
