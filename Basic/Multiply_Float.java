package Basic;
// Java Program to Multiply two Floating-Point Numbers

// package Basic;
import java.util.Scanner;

class Multiply_Float{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 floats to multiply : ");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        float f=f1*f2;
        System.out.println(f1+" * "+f2+ " = "+f);
    }
}