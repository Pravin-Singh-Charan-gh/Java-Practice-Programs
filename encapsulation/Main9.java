package encapsulation;

class Smartphone{
    private String brand,model;
    private int storageCapacity;

    public void setBrand(String b){
        brand=b;
    }
    public void setModel(String m){
        model=m;
    }
    public void setStorageCapacity(int n){
        storageCapacity=n;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getStorageCapacity(){
        return storageCapacity;
    }
    public void increaseStorage(int n){
        storageCapacity+=n;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.setBrand("Samsung");
        sp.setModel("Galaxy M35");
        sp.setStorageCapacity(128);

        System.out.println("Brand : "+sp.getBrand());
        System.out.println("Model : "+sp.getModel());
        System.out.println("Storage Capacity : "+sp.getStorageCapacity());

        sp.increaseStorage(128);
        System.out.println("Storage Capacity after update : "+sp.getStorageCapacity());
    }
}

// 9. Write a Java program to create a class called Smartphone with private
//  instance variables brand, model, and storageCapacity. Provide public
//   getter and setter methods to access and modify these variables. Add 
//   a method called increaseStorage() that takes an integer value and 
//   increases the storageCapacity by that value.