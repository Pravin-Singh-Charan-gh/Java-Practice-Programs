package LibraryProject;

public class Main {
    public static void main(String[] args) {
        Library l=new Library();
        Book b1=new Book("Namak ka Daroga","Premchand","83hbf8484");
        Book b2=new Book("ABC","123","fjdfdfsd");
        Book b3=new Book("XYZ","PQR","83hbf8484");
        Book b4=new Book("PQR","XYZ","ajdaslk");     

        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);

        System.out.println("Books In Libraray : ");
        for(Book b:l.getBooks()){
            System.out.println("Title : "+b.getTitle());
            System.out.println("Author : "+b.getAuthor());
            System.out.println("ISBN : "+b.getISBN());
            System.out.println();
        }

        l.removeBook(b3);
        System.out.println("Library After removing Book b3 :");
        for(Book b:l.getBooks()){
            System.out.println("Title : "+b.getTitle());
            System.out.println("Author : "+b.getAuthor());
            System.out.println("ISBN : "+b.getISBN());
            System.out.println();
        }

        System.out.println("Size of Library : "+l.size()y);

    }
}

// 5. Write a Java program to create a class called 
// "Book" with attributes for title, author, and ISBN,
//  and methods to add and remove books from a collection.
