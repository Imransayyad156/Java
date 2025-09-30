package Swing;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
	public class sampleJPanal extends JFrame  
	{ 
		private JButton b, b1, b2; 
	     private JLabel l; 
	     public sampleJPanal() 
	     {
	          l = new JLabel("Panel Label");  
	         b = new JButton("button1"); 
	         b1 = new JButton("button2"); 
	         b2 = new JButton("button3"); 
	          JPanel p = new JPanel(); 
	          p.add(b); 
	          p.add(b1); 
	          p.add(b2); 
	          p.add(l); 
	          p.setBackground(Color.yellow); 
	          add(p); 
	          setSize(100, 200); 
	          show(); 
	     } 
	 public static void main(String[] args) 
	     { 
		 sampleJPanal p = new sampleJPanal(); 
	     }
	 }
