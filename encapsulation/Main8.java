package encapsulation;

class Book{
    private String title,author;
    private double price;

    public void setTitle(String t){
        title=t;
    }
    public void setAuthor(String a){
        author=a;
    }
    public void setPrice(double n){
        price=n;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public double applyDiscount(double percentage){
        return price-(price*(percentage/100));
    }
}

public class Main8 {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.setTitle("Namak ka Daroga");
        b1.setAuthor("Premchand");
        b1.setPrice(200);

        System.out.println("Book Title : "+b1.getTitle());
        System.out.println("Author Name : "+b1.getAuthor());
        System.out.println("Book Price : "+b1.getPrice());
        System.out.println("Book Price after 15% discount : "+b1.applyDiscount(15));

    }
    
}

// 8. Write a Java program to create a class called “Book” with private 
// instance variables title, author, and price. Provide public getter
//  and setter methods to access and modify these variables. Add a method
//   called applyDiscount() that takes a percentage as a parameter and 
//   reduces the price by that percentage.