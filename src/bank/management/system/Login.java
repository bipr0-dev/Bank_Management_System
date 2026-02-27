package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
                                             // ActionListener is an interface used for handling action events
    JButton login, signup, clear; // Declaring globally to access outside Login() constructor
    JTextField cardTextField;
    JPasswordField pinTextField; // JPasswordField doesnot show actual passwords typed
    Login(){
        
        setTitle("Automated Teller Maching");
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); // i can't put Image in JLabel, can only put ImageIcon 
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);// change the location of image inside the JFrame(we have to make layout null)
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40); // since we make default Layout null that's why we have to put setBounds 
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30); // parameters(x axis, y axis, length, height)
        add(cardno);
        
        cardTextField = new JTextField(); // For Box in front of card No:
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 18));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,150,30);  
        add(pin); 
        
        pinTextField = new JPasswordField(); // For Box in front of PIN:
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);// BACKGROUND COLOR
        login.setForeground(Color.WHITE);// FONT COLOR
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);// FONT COLOR
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);// FONT COLOR
        signup.addActionListener(this);
        add(signup);
        
         
        setSize(800,480);
        setVisible(true);
        setLocation(350, 200);
    }
    @Override // done to ovveride the abstract method actionPerformed in ActionListener interface
    public void actionPerformed(ActionEvent ae) // here ae is the object of ActionEvent class
    {
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == login){
            
        }
        else if (ae.getSource() == signup){
            setVisible(false);  //to close the login window after clicking signup
            new SignupOne().setVisible(true);  //to open SignupOne window after login window close
        }
        
    }

    public static void main(String args[]) {
        new Login();
    }
}
