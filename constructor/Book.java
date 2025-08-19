package constructor;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(){
        this.title="Unknown";
        this.author="Unknown";
        this.price=0;
    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.price=100;
    }
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Namank ka Daroga","Premchand");
        Book b3=new Book("Godan","Premchand",150);

        System.out.println("Book b1 Details : Title = "+b1.getTitle()+", Author = "+b1.getAuthor()+", Price = "+b1.getPrice());
        System.out.println("Book b2 Details : Title = "+b2.getTitle()+", Author = "+b2.getAuthor()+", Price = "+b2.getPrice());
        System.out.println("Book b3 Details : Title = "+b3.getTitle()+", Author = "+b3.getAuthor()+", Price = "+b3.getPrice());
    }
}


// Constructor Overloading
// Write a Java program to create a class called "Book" with instance variables
//  title, author, and price. Implement a default constructor and two parameterized
//   constructors:
// One constructor takes title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.