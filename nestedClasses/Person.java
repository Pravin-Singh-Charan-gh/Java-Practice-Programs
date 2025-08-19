package nestedClasses;

public class Person {
    class Address{
        private String city,state;

        Address(String c,String s){
            city=c;
            state=s;
        }
        void displayAddress() {
            System.out.println("City: " + city + ", State: " + state);
        }
    }
    public static void main(String[] args) {
        Person p1=new Person();
        Person.Address a1=p1.new Address("Banswara", "Rajasthan");
        a1.displayAddress();
    }

}

// 9. Inner Class with Constructor:
// Write a Java program to create an outer class called Person with an inner class Address.
//  The Address class should have a constructor that takes parameters city and state. 
//  Create an instance of Address from the Person class and print the address details.