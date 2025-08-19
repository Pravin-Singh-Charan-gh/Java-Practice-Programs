package encapsulation;

class Account{
    private String accountNumber;
    private String accountHolder;
    private int balance;

    public void setAccountNumber(String ac){
        accountNumber=ac;
    }
    public void setAccountHolder(String a){
        accountHolder=a;
    }
    public void setBalance(int b){
        balance=b;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccoutnHolder(){
        return accountHolder;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(int n){
        balance+=n;
    }
    public void withdraw(int n){
        if(n>balance){
            System.out.println("No enough balance.");
        }
        else{
            balance-=n;
            System.out.println("This is your "+n+"Rs");
        }
    }
}

public class Main12 {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.setAccountNumber("76ysud");
        a1.setAccountHolder("Kaku");
        a1.setBalance(5678);

        System.out.println("Account Number : "+a1.getAccountNumber());
        System.out.println("Account Holder : "+a1.getAccoutnHolder());
        System.out.println("Account Balance : "+a1.getBalance());

        a1.deposit(3939);
        System.out.println("Account Balance after depositng 3939 Rs : "+a1.getBalance());

        a1.withdraw(34567);
        a1.withdraw(893);
        System.out.println("Account Balance after withdrawing 893 Rs : "+a1.getBalance());


    }
    
}

// 12. Write a Java program to create a class called Account with private 
// instance variables accountNumber, accountHolder, and balance. Provide
//  public getter and setter methods to access and modify these variables.
//   Add a method called deposit() that takes an amount and increases the
//    balance by that amount, and a method called withdraw() that takes an 
//    amount and decreases the balance by that amount.