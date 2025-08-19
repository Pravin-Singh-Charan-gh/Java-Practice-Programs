package encapsulation;

class Desktop{
    private String brand;
    private String processor;
    private int ramSize;

    public void setBrand(String b){
        brand=b;
    }
    public void setProcessor(String p){
        processor=p;
    }
    public void setRamSize(int r){
        ramSize=r;
    }
    public String getBrand(){
        return brand;
    }
    public String getProcessor(){
        return processor;
    }
    public int getRamSize(){
        return ramSize;
    }

    public void upgradeRam(int n){
        ramSize+=n;
    }
}

public class Main10 {
    public static void main(String[] args) {
        Desktop d1=new Desktop();
        d1.setBrand("HP");
        d1.setProcessor("Intel i5");
        d1.setRamSize(512);

        System.out.println("Brand : "+d1.getBrand());
        System.out.println("Processor : "+d1.getProcessor());
        System.out.println("Ram Size : "+d1.getRamSize());

        d1.upgradeRam(512);
        System.out.println("Ram Size after upgrade: "+d1.getRamSize());


    }
    
}

// 10. Write a Java program to create a class called Desktop with private 
// instance variables brand, processor, and ramSize. Provide public getter
//  and setter methods to access and modify these variables. Add a method 
//  called upgradeRam() that takes an integer value and increases the ramSize
//   by that value.