package staticVar;

public class BankAccount{
    private String accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(String ac,double balance){
        this.accountNumber=ac;
        this.balance=balance;
    }

    public static void setBankName(String bank){
        bankName=bank;
    }
    public static void setInterestRate(double ir){
        interestRate=ir;
    }
    public static String getBankName(){
        return bankName;
    }
    public static double getInterestRate(){
        return interestRate;
    }
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    public static void main(String args[]){
        BankAccount.setBankName("National Bank");
        BankAccount.setInterestRate(3.5);

        // Create BankAccount objects
        BankAccount account1 = new BankAccount("123456789", 1000.00);
        BankAccount account2 = new BankAccount("987654321", 2000.00);

        // Print details of each BankAccount object
        account1.printDetails();
        System.out.println();
        account2.printDetails();
    }

}





// 8. Static Members in Different Contexts
// Write a Java program to create a class called "BankAccount" with 
// instance variables 'accountNumber' and balance, and static variables
//  'bankName' and 'interestRate'. Provide static methods to get and set 
//  the static variables. Create several 'BankAccount' objects and print 
//  their details along with the static variables.