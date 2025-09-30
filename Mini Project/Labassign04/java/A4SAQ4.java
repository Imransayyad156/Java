package Labassign04.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class A4SAQ4 {
	    public static void main(String[] args) {
	       
	        JFrame frame = new JFrame("Language Selector");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350, 200);
	        frame.setLocationRelativeTo(null); 
	        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 20));
	        String[] languages = {"C", "C++", "Java", "Python", "SQL"};
	        JComboBox<String> languageBox = new JComboBox<>(languages);
	        JButton showButton = new JButton("Show");
	        JLabel resultLabel = new JLabel("Selected Language: ");
	        showButton.addActionListener(e -> {
	            String selectedLanguage = (String) languageBox.getSelectedItem();
	            resultLabel.setText("Selected Language: " + selectedLanguage);
	        });
	        panel.add(new JLabel("Choose Language:"));
	        panel.add(languageBox);
	        panel.add(showButton);
	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}
