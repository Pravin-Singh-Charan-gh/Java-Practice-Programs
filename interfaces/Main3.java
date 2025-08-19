package interfaces;

interface Flyable{
    public void fly_obj();
}
class Spacecraft implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft is flying");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Airplane is flying");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Helicopter is flying");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Spacecraft moonLander=new Spacecraft();
        Airplane airIndia=new Airplane();
        Helicopter h=new Helicopter();

        moonLander.fly_obj();
        airIndia.fly_obj();
        h.fly_obj();

        
        //       OR

        Flyable flyingObjects[]={new Spacecraft(),new Airplane(),new Helicopter()};

        for(Flyable f:flyingObjects){
            f.fly_obj();
        }
    }
    
}

// 3. Write a Java program to create an interface Flyable with a method called fly_obj(). 
// Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable 
// interface. Implement the fly_obj() method for each of the three classes.