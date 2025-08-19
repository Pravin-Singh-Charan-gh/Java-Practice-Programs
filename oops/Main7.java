package oops;
import java.util.ArrayList;

class Bank{
    private ArrayList<Account>arr;
    public Bank(){
        arr=new ArrayList<>();
    }
    public void addAccount(Account a){
        arr.add(a);
    }
    public void removeAccount(Account a){
        arr.remove(a);
    }
    public void deposit(Account a,int n){
        a.deposit(n);
    }
    public void withdraw(Account a,int n){
        a.withdraw(n);
    }
}
class Account{
    private String accountNumber;
    private double balance;

    public Account(String s,double b){
        accountNumber=s;
        balance=b;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(int n){
        balance+=n;
        System.out.println(n+" Rs deposited");
    }
    public void withdraw(int n){
        if(n>balance){
            System.out.println("No enough balance");
            return;
        }
        balance-=n;
        System.out.println(n+" Rs withdrawn");

    }
}

public class Main7 {
    public static void main(String[] args) {
        Bank b=new Bank();
        Account a1=new Account("789",37393);
        Account a2=new Account("3774",373773);
        Account a3=new Account("7482",9484);

        b.addAccount(a1);
        b.addAccount(a2);
        b.addAccount(a3);

        a1.deposit(234);
        a2.withdraw(383);

    }    
}

// 7. Write a Java program to create a class called "Bank" with a collection 
// of accounts and methods to add and remove accounts, and to deposit and 
// withdraw money. Also define a class called "Account" to maintain account
//  details of a particular customer.