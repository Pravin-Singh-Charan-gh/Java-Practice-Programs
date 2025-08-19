package encapsulation;

class Movie{
    private String title,director,duration;

    public void setTitle(String t){
        title=t;
    }

    public void setDirector(String d){
        director=d;
    }

    public void setDuration(String d){
        duration=d;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public String getDuration(){
        return duration;
    }

    public String getMovieDetails(){
        return "Movie Details :\nTitle : "+title+"\nDirector : "+director+"\nDuration : "+duration;
    }
}

public class Main13 {
    public static void main(String[] args) {
        Movie m1=new Movie();
        m1.setTitle("Sholey");
        m1.setDirector("Director Name");
        m1.setDuration("03:00");

        System.out.println(m1.getMovieDetails());;
    }
    
}

// 13. Write a Java program to create a class called Movie with private instance
//  variables title, director, and duration. Provide public getter and setter
//   methods to access and modify these variables. Add a method called getMovieDetails() 
//   that returns a formatted string containing the movie details.