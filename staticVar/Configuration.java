package staticVar;

public class Configuration{
    private static String configValue;

    static{
        configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");
    }

    public String getconfigValue(){
        return configValue;
    }

    public static void main(String args[]){
        Configuration c=new Configuration();
        System.out.println(c.getconfigValue());
    }
}






// 5. Static Block for Initialization
// Write a Java program to create a class called Configuration with a static
//  block that initializes a static variable 'configValue' from a configuration
//   file (simulated with a default value). Print the value of 'configValue' in
//    the main method.