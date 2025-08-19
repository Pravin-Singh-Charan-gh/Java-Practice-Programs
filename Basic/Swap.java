// Java Program to Swap Two Numbers

 package Basic;

import java.util.Scanner;

public class Swap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter two numbers to swap : ");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("Before swaping : a = "+a+", and b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping : a = "+a+", and b = "+b);
        sc.close();
    }
}