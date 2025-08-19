package p1;

public class Account {
    private String acNumber;
    private String BranchName;
    private String ifscCode;
    private String accountType;
    private Customer customer;
    private Integer balance;
    
    public Account(String acNumber, String branchName, String ifscCode, String accountType, Customer customer,
            Integer balance) {
        this.acNumber = acNumber;
        BranchName = branchName;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
        this.customer = customer;
        this.balance = balance;
    }

    public String getAcNumber() {
        return acNumber;
    }
    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }
    public String getBranchName() {
        return BranchName;
    }
    public void setBranchName(String branchName) {
        BranchName = branchName;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

}
