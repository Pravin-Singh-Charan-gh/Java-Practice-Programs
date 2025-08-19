package nestedClasses;

public class MathUtil {
    static class Calculator{
        static int add(int a,int b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(7,3));

        // OR

        int sum = MathUtil.Calculator.add(12, 14);
        System.out.println("Sum: " + sum);
    }
}


// 6. Static Nested Class and Static Methods:
// Write a Java program to create an outer class called 'MathUtil' with a static
//  nested class Calculator. The Calculator class should have a static method 
//  add(int a, int b) that returns the sum of a and b. Call the add() method from 
//  the main method.