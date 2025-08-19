package encapsulation;

class Product{
    private String productName, productCode;
    private int price;

    public void setProductName(String s){
        productName=s;
    }

    public void setProductCode(String s){
        productCode=s;
    }

    public void setPrice(int s){
        price=s;
    }

    public String getProductName(){
        return productName;
    }

    public String getProductCode(){
        return productCode;
    }

    public int getPrice(){
        return price;
    }
    public double applyDiscount(double percentage){
        return price-(price*(percentage/100));
    }
}

public class Main14 {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.setProductName("Kaku");
        p1.setProductCode("y39232hb");
        p1.setPrice(150);

        System.out.println("Product Name : "+p1.getProductName());
        System.out.println("Product Code : "+p1.getProductCode());
        System.out.println("Product Price : "+p1.getPrice());

        System.out.println("Product price after 15% discount : "+p1.applyDiscount(15));

    }
    
}

// 14. Write a Java program to create a class called Product with private 
// instance variables productName, productCode, and price. Provide public 
// getter and setter methods to access and modify these variables. Add a 
// method called applyDiscount() that takes a percentage and reduces the 
// price by that percentage.