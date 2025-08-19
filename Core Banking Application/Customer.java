package p1;

public class Customer {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fatherName;
    private String mobileNumber;
    private String email;
    private Integer age;
    private String address;
    private Integer pinCode;
    private Boolean isMarried;

    public Customer(String firstName, String middleName, String lastName, String fatherName, String mobileNumber,
            String email, Integer age, String address, Integer pinCode, Boolean isMarried) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.age = age;
        this.address = address;
        this.pinCode = pinCode;
        this.isMarried = isMarried;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getPinCode() {
        return pinCode;
    }
    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }
    public Boolean getIsMarried() {
        return isMarried;
    }
    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }
}
