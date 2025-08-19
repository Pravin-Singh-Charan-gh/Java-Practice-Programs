package abstraction;

abstract class BankAccount{
    private String ac;
    private double balance;

    public BankAccount(String ac,double amount){
        this.ac=ac;
        this.balance=amount;
        System.out.println("Account Created Successfly. AC :"+ac+", Balance : "+balance);
    }

    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);
    public String getAccountNumber(){
        return ac;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        balance=amount;
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(String ac,double amount){
        super(ac, amount);
    }
    @Override
    public void deposit(double amount){
        setBalance(getBalance()+amount);        
    }
    @Override
    public void withdraw(double amount){
        double bal=getBalance();
        if(amount > bal){
            System.out.println("No enough amount");
        }
        else{
            bal-=amount;
            setBalance(bal);
            System.out.println("This is "+amount+"Rs.");
        }
    }
}
class CurrentAccount extends BankAccount{
    public CurrentAccount(String ac,double amount){
        super(ac, amount);
    }
    @Override
    public void deposit(double amount){
        double bal=getBalance();
        bal+=amount;
        setBalance(bal);        
    }
    @Override
    public void withdraw(double amount){
        double bal=getBalance();
        if(amount > bal){
            System.out.println("No enough amount");
        }
        else{
            bal-=amount;
            setBalance(bal);
            System.out.println("This is "+amount+"Rs.");
        }
    }
}
public class Main3 {
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount("845455094", 785.40);
        s1.deposit(89890);
        s1.withdraw(897865);
        s1.withdraw(879);

        CurrentAccount c1=new CurrentAccount("845455094", 785.40);
        c1.deposit(89890);
        c1.withdraw(897865);
        c1.withdraw(879);
    }
}

// 3. Write a Java program to create an abstract class BankAccount with abstract methods
//  deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that 
//  extend the BankAccount class and implement the respective methods to handle deposits 
//  and withdrawals for each account type.