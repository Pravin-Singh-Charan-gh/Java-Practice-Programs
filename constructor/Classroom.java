package constructor;

import java.util.ArrayList;

public class Classroom {
    private String className;
    private String []students;

    public Classroom(String className,String []students){
        this.className=className;
        this.students=students;
    }

    public void printClass(){
        System.out.println("Class Name : "+className);
        System.out.println("Students : ");
        for(String st : students){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
        String students[]={"Pravin","Sheru","Chhotu","Manu"};
        Classroom c1=new Classroom("B.Tech 5th B", students);
        c1.printClass();
    }
}

// 9. Constructor with Array Initialization
// Write a Java program to create a class called Classroom with 
// instance variables className and students (an array of strings).
//  Implement a parameterized constructor that initializes these variables.
//   Print the values of the variables.