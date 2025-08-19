package encapsulation;

class BankAccount{
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String ac){
        accountNumber=ac;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double b){
        balance=b;
    }
    public double getBalance(){
        return balance;
    }
}

public class Main2 {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setAccountNumber("7939hfjs");
        b1.setBalance(98320.2);

        System.out.println("Account Number : "+b1.getAccountNumber());
        System.out.println("Balance : "+b1.getBalance());
    }
}

// 2. Write a Java program to create a class called BankAccount with private
//  instance variables accountNumber and balance. Provide public getter and 
//  setter methods to access and modify these variables.