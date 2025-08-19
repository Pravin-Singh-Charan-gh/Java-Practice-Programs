package Basic;

public class Two {
    int a,b;
    Two(){
        a=b=10;
    }
    Two(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
