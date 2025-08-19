package oops;
import java.util.ArrayList;

class Book{
    private String title, author,isbn;
    private ArrayList<Book>books;

    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        books=new ArrayList<>();
    }   
    public void setTitle(String t){
        title=t;
    }
    public void setAuthor(String a){
        author=a;
    }
    public void setISBN(String i){
        isbn=i;
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return isbn;
    }

    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Book b1=new Book("abc", "sdos", "9292");
        Book b2=new Book("xyz", "sdos", "9292");
        Book b3=new Book("pqr", "sdos", "9292");
        Book b4=new Book("ijk", "sdos", "9292");

        b1.addBook(b2);
        b1.addBook(b3);
        b1.addBook(b4);

        ArrayList<Book> arr=b1.getBooks();
        for(Book b:arr){
           System.out.println(b.getTitle());
        }
    }    
}

// 5. Write a Java program to create a class called "Book" with attributes for title,
//  author, and ISBN, and methods to add and remove books from a collection.
