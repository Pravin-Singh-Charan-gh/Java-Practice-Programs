package abstraction;

abstract class Instrument{
    abstract public void play();
    abstract public void tune();
}

class Glockenspiel extends Instrument{
    @Override
    public void play(){
        System.out.println("Playing Glockenspiel");
    }
    public void tune(){
        System.out.println("Tuning Glockenspiel");
    }
}
class Violin extends Instrument{
    @Override
    public void play(){
        System.out.println("Playing Violin");
    }
    public void tune(){
        System.out.println("Tuning Violin");
    }
}

public class Main9 {
    public static void main(String[] args) {
        Instrument g1=new Glockenspiel();
        g1.play();
        g1.tune();

        Instrument v1=new Violin();
        v1.play();
        v1.tune();
    }
    
}

// 9. Write a Java program to create an abstract class Instrument with abstract methods
//  play() and tune(). Create subclasses for Glockenspiel and Violin that extend the 
//  Instrument class and implement the respective methods to play and tune each instrument.