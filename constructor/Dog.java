package constructor;

public class Dog {
    private String name;
    private String color;

    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        Dog d=new Dog("Sheru","Black & White");
        System.out.println("Dog's Name : "+d.getName());
        System.out.println("Dog's Color : "+d.getColor());

    }
}


// 2. Parameterized Constructor:
// Write a Java program to create a class called Dog with instance variables name 
// and color. Implement a parameterized constructor that takes name and color as 
// parameters and initializes the instance variables. Print the values of the variables.