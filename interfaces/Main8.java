package interfaces;

interface Playable{
    public void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing Football.");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing Volleyball.");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing Basketball.");
    }
}

public class Main8 {
    public static void main(String[] args) {
        Playable f1=new Football();
        Playable v1=new Volleyball();
        Playable b1=new Basketball();

        f1.play();
        v1.play();
        b1.play();
    }
    
}


// 8. Write a Java program to create an interface Playable with a method play() 
// that takes no arguments and returns void. Create three classes Football, 
// Volleyball, and Basketball that implement the Playable interface and
//  override the play() method to play the respective sports.