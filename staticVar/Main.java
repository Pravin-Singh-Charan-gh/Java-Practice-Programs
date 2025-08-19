import javax.swing.*;    
public class Main {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Click Here");  
    b.setBounds(500,100,95,300);  
    f.add(b);  
    f.setSize(400,4000);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}
