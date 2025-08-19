package polymorphism;

class Sports{
    public void play(){
        System.out.println("Playing");
    }
}
class Football extends Sports{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
}
class Basketball extends Sports{
    @Override 
    public void play(){
        System.out.println("Playing basketball");
    }
}
class Rugby extends Sports{
    @Override
    public void play(){
        System.out.println("Plaing Rugby");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Football f1=new Football();
        f1.play();

        Basketball b1=new Basketball();
        b1.play();

        Rugby r1=new Rugby();
        r1.play();
    }    
}

// 5. Write a Java program to create a base class Sports with a method called play().
//  Create three subclasses: Football, Basketball, and Rugby. Override the play()
//   method in each subclass to play a specific statement for each sport.