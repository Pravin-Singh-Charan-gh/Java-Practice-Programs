package LibraryProject;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book>books;

    public Library(){
        books=new ArrayList<Book>();
    }

    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);
    }

    public int size(){
        return books.size();
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

}
