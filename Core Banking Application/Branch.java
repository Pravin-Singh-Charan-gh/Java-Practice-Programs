package p1;

public class Branch {
    private String branchName;
    private String ifscCode;
    private Integer numberOfCustomers;

    public Branch(String branchName, String ifscCode, Integer numberOfCustomers) {
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.numberOfCustomers = numberOfCustomers;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public Integer getNumberOfCustomers() {
        return numberOfCustomers;
    }
    public void setNumberOfCustomers(Integer numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }        
}
