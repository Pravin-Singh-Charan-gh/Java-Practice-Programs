package encapsulation;

class Person{
    private String name;
    private int age;
    private String country;

    public Person(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setCountry(String country){
        this.country=country;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person p1=new Person("Pravin", 21, "India");
        Person p2=new Person("Sheru", 12, "India");
        // Person p3=new Person();
        // p3.setName("Ramlal");
        // p3.setAge(58);
        // p3.setCountry("XYZ");

        System.out.println("Person p1 Name : "+p1.getName());
        System.out.println("Person p1 Age : "+p1.getAge());
        System.out.println("Person p1 Country : "+p1.getCountry());

        System.out.println("Person p2 Name : "+p2.getName());
        System.out.println("Person p2 Age : "+p2.getAge());
        System.out.println("Person p2 Country : "+p2.getCountry());

        // System.out.println("Person p3 Name : "+p3.getName());
        // System.out.println("Person p3 Age : "+p3.getAge());
        // System.out.println("Person p3 Country : "+p3.getCountry());
    }
    
}

// 1. Write a Java program to create a class called Person with private instance
//  variables name, age. and country. Provide public getter and setter methods 
//  to access and modify these variables.
