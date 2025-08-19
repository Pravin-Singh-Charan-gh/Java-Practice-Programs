package LibraryProject;

public class Book {
    private String title;
    private String author;
    private String isbn; 

    public Book(){
        this("Unknown","Unknown","Unknown");
    }

    public Book(String t){
        this(t,"Unknown","Unknown");
    }
    public Book(String t,String auth){
        this(t,auth,"Unknown");
    }

    public Book(String t,String auth,String i){
        this.title=t;
        this.author=auth;
        this.isbn=i;
    }

    public void setTitle(String t){
        title=t;
    }
    public void setAuthor(String auth){
        author=auth;
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
}