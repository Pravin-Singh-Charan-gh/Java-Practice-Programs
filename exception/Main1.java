package exception;
import java.util.Scanner;

import nestedClasses.School;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for dividing : ");
        int a=sc.nextInt(),b=sc.nextInt();

        try{
            int result=divide(a,b);
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    public static int divide(int a,int b){
        if(b==0)
          throw new ArithmeticException("Cannot a divide a number by 0");
        return a/b;
        
    }
}

// 1. Write a Java program that throws an exception and catch it using a try-catch block.
