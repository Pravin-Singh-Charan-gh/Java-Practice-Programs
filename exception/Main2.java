package exception;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        try{
            if(n%2==1)
              throw new ArithmeticException("Number is odd");
            System.out.println(n);
        }
        catch(ArithmeticException e){
            System.out.println("Error : "+e);
        }


        // OR
        n=sc.nextInt();
        tryNumber(n);
    }
    public static void tryNumber(int n){
        checkEven(n);
        System.out.println(n+" is even.");
    }
    public static void checkEven(int n){
        if(n%2==1)
        throw new IllegalArgumentException("Number is odd.");
    }
    
}

// 2. Write a Java program to create a method that takes an integer as a parameter
// and throws an exception if the number is odd.