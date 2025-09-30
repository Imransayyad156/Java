package Labassign04.java;
import javax.swing.*;
import java.awt.*;
public class A4SAQ1 {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Login Page");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350, 200);
	        frame.setLocationRelativeTo(null); 
	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(10, 10, 10, 10);
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.EAST;
	        panel.add(new JLabel("Username:"), gbc);
	        gbc.gridx = 1;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.WEST;
	        JTextField usernameField = new JTextField(15);
	        panel.add(usernameField, gbc);
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        gbc.anchor = GridBagConstraints.EAST;
	        panel.add(new JLabel("Password:"), gbc);
	        gbc.gridx = 1;
	        gbc.gridy = 1;
	        gbc.anchor = GridBagConstraints.WEST;
	        JPasswordField passwordField = new JPasswordField(15);
	        panel.add(passwordField, gbc);
	        gbc.gridx = 1;
	        gbc.gridy = 2;
	        gbc.anchor = GridBagConstraints.CENTER;
	        JButton loginButton = new JButton("Login");
	        panel.add(loginButton, gbc);
	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}
