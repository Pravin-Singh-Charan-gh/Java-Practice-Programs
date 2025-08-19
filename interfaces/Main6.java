package interfaces;
import java.awt.*;
import javax.swing.*;

interface Drawable{
    public void draw();
}
class Circle2 implements Drawable{
    public void draw(){
      JFrame frame =new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400,400);
      frame.setVisible(true);

      JPanel panel=new JPanel(){
          @Override
          protected void paintComponent(Graphics g){
              super.paintComponent(g);
              g.setColor(Color.RED);
              g.fillOval(100,100,200,200);
          }
      };
      frame.add(panel);
    }
}

class Rectangle3 implements Drawable{
    public void draw(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel panel=new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.PINK);
                g.fillRect(100, 100, 200, 250);
            }
        };
        frame.add(panel);
    }
}

class Triangle2 implements Drawable{
    public void draw(){
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel panel=new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.YELLOW);
                int xPoints[]={100,200,300};
                int yPoints[]={100,200,100};
                g.fillPolygon(xPoints, yPoints, 3);
            }
        };
        frame.add(panel);
    }
}



public class Main6 {
    public static void main(String[] args) {
        Circle2 c1=new Circle2();
        c1.draw();

        Rectangle3 r1=new Rectangle3();
        r1.draw();

        Triangle2 t1=new Triangle2();
        t1.draw();
    }
    
}

// 6. Write a Java program to create an interface Drawable with a method draw()
//  that takes no arguments and returns void. Create three classes Circle, 
//  Rectangle, and Triangle that implement the Drawable interface and override 
//  the draw() method to draw their respective shapes.