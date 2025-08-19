package AccountProject;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber,double balance){
        if(accountNumber==null || accountNumber.isEmpty()){
            System.out.println("Account Number cannot be empty or null");
            return;
        }
        if(balance<0){
            System.out.println("Balance cannot be negative.");
            return;
        }
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAcNum(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Account a1=new Account("888888888", 999999999);
        Account a2=new Account(null,99);

        System.out.println(a1.getAcNum() + " "+a1.getBalance());
        System.out.println(a2.getAcNum() + " "+a2.getBalance());
    }
}

// 6. Constructor with Validation
// Write a Java program to create a class called Account with instance
//  variables accountNumber and balance. Implement a parameterized constructor 
//  that initializes these variables with validation:

// accountNumber should be non-null and non-empty.
// balance should be non-negative.
// Print an error message if the validation fails.
