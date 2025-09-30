package Swing;
import javax.swing.*;   
public class Sampleswing extends JFrame 
{ 
 JFrame f;   
 Sampleswing() 
 {   
  JButton b=new JButton("Click");  
 b.setBounds(130,100,100, 40);   
           add(b);  
 setSize(400,500);   
 setLayout(null);   
 setVisible(true);   
 }   
 public static void main(String[] args)  
 {   
  new Sampleswing();   
 }
}
