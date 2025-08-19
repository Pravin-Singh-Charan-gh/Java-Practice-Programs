package polymorphism;

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String ac,double d){
        accountNumber=ac;
        balance=d;
    }
    public void deposit(int n){
        balance+=n;
    }
    public void withdraw(int n){
        balance-=n;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(String s,double d){
        super(s, d);
    }
    @Override
    public void deposit(int n){
        super.deposit(n);
    }
    @Override
    public void withdraw(int n){
        if(n>getBalance()-100)
        {
            System.out.println("No enough balance");
        }
        else{
            super.withdraw(n);
            System.out.println("This is "+n+" Rs");
        }
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(String s,double d){
        super(s, d);
    }
    @Override
    public void deposit(int n){
        super.deposit(n);
    }
    @Override
    public void withdraw(int n){
        if(n>getBalance())
        {
            System.out.println("No enough balance");
        }
        else{
            super.withdraw(n);
            System.out.println("This is "+n+" Rs");
        }
    }
}



public class Main9 {
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount("ueuh4", 11111);
        CheckingAccount c1=new CheckingAccount("iie3",288);

        withdrawMoney(s1, 78);
        withdrawMoney(c1, 78);
    }
    public static void withdrawMoney(BankAccount b,int n){
        b.withdraw(n);
    }
    
}

// 9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
//  Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each
//   subclass to impose different withdrawal limits and fees.

