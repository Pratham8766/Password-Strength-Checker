import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class check extends JFrame implements ActionListener{
	public JTextField password_textfield;
	public JButton button;
	public JLabel heading,password_label;

	public check(){
		heading = new JLabel();
		heading.setText("PASSWORD STRENGTH CHECKER");
        heading.setFont(new Font("Serif", Font.PLAIN, 31));
		heading.setBounds(60,2,500,150);
		heading.setForeground(new Color(120, 90, 40));
		add(heading);

		password_label = new JLabel();
		password_label.setText("Enter Password: ");
		password_label.setFont(new Font("Serif", Font.PLAIN, 14));
		password_label.setBounds(30,125,100,30);
		add(password_label);

		password_textfield = new JTextField();
		password_textfield.setBounds(140,125,320,35);
		add(password_textfield);

		button = new JButton("Check Strength");
		button.setBounds(190,180,150, 40);
		add(button);

		setSize(600,300); 
		setTitle("Password Strength Checker");
		setLayout(null);  
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		try {
			String ValueOfString = password_textfield.getText();
			JOptionPane.showMessageDialog(this, "PASSWORD STRENGTH: "+CheckStrength.getPasswordLevel(ValueOfString));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Please enter the password in the given field!");
		}
		
	}
	public static void main(String[] args) {
		new check();
	}
}