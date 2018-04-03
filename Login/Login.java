import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import com.healthmarketscience.jackcess.*;
import java.io.File;
import java.io.IOException;
import java.lang.*;

public class Login {
    
    GUI_project gui;
    
    Table table;
    //frame
    //JFrame frame = new JFrame("User Login");
    //panels
    //JPanel p = new JPanel();
    //labels
    //JLabel labelUser = new JLabel("UserName:");
    //JLabel labelPass = new JLabel("Password:");
    //texts
    //JTextField userField = new JTextField(10);
    //JTextField passField = new JTextField(10);
    //buttons
    //JButton loginbut = new JButton("Login");
    
    public Login(){
        try {
            table = DatabaseBuilder.open(new File("login1.accdb")).getTable("logins");
        } catch (IOException e) {
            e.printStackTrace();
        }
        gui = new GUI_project();
        setupListeners();
    }
    
    public void setupListeners(){
        /**frame.setSize(1024,128);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        p.add(labelUser);
        p.add(userField);
        p.add(labelPass);
        p.add(passField);
        p.add(loginbut);
        frame.add(p);**/
        
        gui.button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String user = gui.textfield2.getText().trim();
                    String pass = gui.textfield3.getText().trim();
                    
                    Cursor cursor = CursorBuilder.createCursor(table);
                    boolean foundUser = cursor.findFirstRow(Collections.singletonMap("username", user));
                    boolean foundPass = cursor.findFirstRow(Collections.singletonMap("password", pass));
                    if (foundUser && foundPass) {
                        JOptionPane.showMessageDialog(gui,"Login Successful!");
                    } else {
                        JOptionPane.showMessageDialog(gui,"User Not Found!","Login Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(gui,"Login Exception!","Login Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    public static void main(String[] args) {
        new Login();
    }
}