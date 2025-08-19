package inheritance;

class BankAccount{
    private int ac;
    private int balance;
    
    public BankAccount(int ac,int balance) {
        this.ac=ac;
        this.balance = balance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println(amount+" Rs diposited.");
        System.out.println("Total Balance : "+balance);
    }
    public void withdraw(int amount){
        if(amount>balance){
           System.out.println("No enough balance");
           return;
        }
        balance-=amount;
        System.out.println("This is your "+amount+" Rs.");
        System.out.println("Total Balance : "+balance);
    }
    public int getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(int ac,int amount){
        super(ac,amount);
    }
    @Override
    public void withdraw(int amount){
        int balance=getBalance();   // if the variable is private in parent class it can beredifined in the child class
        if( balance-amount < 100){
            System.out.println("Cannot withdraw this amount. Try amount than "+(balance-100));
        }
        else{
            super.withdraw(amount);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount(34543,10000);
        s1.deposit(999);
        s1.withdraw(1000);
        s1.withdraw(100000);
    }
}


// 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//  Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals 
//  if the account balance falls below one hundred.