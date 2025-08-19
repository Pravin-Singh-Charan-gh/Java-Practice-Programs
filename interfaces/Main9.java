package interfaces;

interface Searchable{
    public boolean search(String keyword);
}
class Document implements Searchable{
    private String content;
    public Document(String content){
        this.content=content;
    }
    public boolean search(String keyword){
        return content.contains(keyword);
    }
}
class WebPage implements Searchable{
    private String url,htmlContent;
    public WebPage(String url,String htmlContent){
        this.url=url;
        this.htmlContent=htmlContent;
    }
    public boolean search(String keyword){
        return htmlContent.contains(keyword);      
    }
}
public class Main9 {
    public static void main(String[] args) {
        Document document = new Document("This is a sample document.");

        boolean documentContainsKeyword = document.search("sample");
        
        System.out.println("Document contains keyword 'sample': " + documentContainsKeyword);
        
        WebPage webPage = new WebPage("https://www.google.com", "This is a sample webpage.");
        
        boolean webPageContainsKeyword = webPage.search("webpage");
        
        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
        
    }
    
}

// 9. Write a Java program to create an interface Searchable with a 
// method search(String keyword) that searches for a given keyword 
// in a text document. Create two classes Document and WebPage that
//  implement the Searchable interface and provide their own implementations 
//  of the search() method.