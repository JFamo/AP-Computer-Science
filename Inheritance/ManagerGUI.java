import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.security.MessageDigest;
import java.security.DigestException;
import java.math.BigInteger;

public class ManagerGUI extends JFrame implements ItemListener{
    //Init Strings
    final static String ss1 = "Display Accounts";
    final static String ss2 = "Edit Account";
    final static String ss3 = "Add Account";
    final static String ss4 = "Access Account";
    final static String ss5 = "Add User";
    //Init TextFields
    JTextField user = new JTextField("Username",8);
    JPasswordField pass = new JPasswordField(8);
    JTextField editOwner = new JTextField("Account Name",10);
    JTextField editBalance = new JTextField("Balance",8);
    JTextField addOwner = new JTextField("Account Name",10);
    JTextField addBalance = new JTextField("Balance",8);
    JTextField addUser = new JTextField("Username",8);
    JTextField addPass = new JTextField("Password",8);
    JTextField newUserFirst = new JTextField("First Name",10);
    JTextField newUserLast = new JTextField("Last Name",10);
    JTextField newUserUsername = new JTextField("Username",8);
    JTextField newUserPassword = new JTextField("Password",8);
    //combo boxes
    String[] accTypeStrings = {"Checking", "Savings"};
    JComboBox accountTypes = new JComboBox(accTypeStrings);
    //Init Panels
    JPanel cards = new JPanel(new CardLayout());
    JPanel card1 = new JPanel();
    JPanel card2 = new JPanel();
    JPanel card3 = new JPanel();
    JPanel card4 = new JPanel();
    JPanel card5 = new JPanel();
    //Init Maths
    double ans1 = 0,ans2 = 0;
    //Create Labels
    JLabel accountDisplay = new JLabel("Null");

    JList accountList = new JList(Accounts.accounts.toArray());

    public void guiinit() throws IOException, Exception{
        //stuffs
        MessageDigest tempPass = MessageDigest.getInstance("SHA");
        BankGUI bankgui = new BankGUI();
        bankgui.guiinit();

        //gui stuff
        JFrame frame = new JFrame("Famous Banking");
        frame.setSize(512,200);

        //buttons and listeners
        JButton login = new JButton("Login");
        login.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String inp1 = user.getText();
                    String inp2 = pass.getText();
                    byte[] tempUse = tempPass.digest(String.valueOf(inp2).getBytes());
                    tempPass.reset();
                    User selected = null;
                    for(BankAccount s : Accounts.accounts){
                        if((s.getOwner().username).equals(inp1) && Arrays.equals(s.getOwner().password,tempUse)){
                            selected = s.getOwner();
                        }
                    }

                    boolean cont = false;
                    if(selected != null){
                        cont = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,
                            "Incorrect Username or Password!",
                            "Login error",
                            JOptionPane.ERROR_MESSAGE);
                    }

                    if(cont){
                        bankgui.setSelected(selected);
                        try{
                            bankgui.openFrame();
                        }
                        catch(Exception a){
                            System.err.println("Caught IOException: " + a.getMessage());
                        }
                    }
                }
            }
        );
        JButton createUser = new JButton("Create");
        createUser.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String inpFirst = newUserFirst.getText();
                    String inpLast = newUserLast.getText();
                    String inpUser = newUserUsername.getText();
                    String inpPass = newUserPassword.getText();
                    User u = new User(Users.ids, inpFirst, inpLast);
                    u.setUsername(inpUser);
                    try{
                        u.setPassword(inpPass);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(frame,
                            "Invalid Password!",
                            "Registration error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                    Users.ids ++;
                    Users.users.add(u);
                    JOptionPane.showMessageDialog(frame,
                        "User Account Created!");
                    newUserFirst.setText("First Name");
                    newUserLast.setText("Last Name");
                    newUserUsername.setText("Username");
                    newUserPassword.setText("Password");
                }
            }
        );
        JButton update = new JButton("Update");
        update.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String inp1 = editOwner.getText();
                    int inp2 = Integer.parseInt(editBalance.getText());

                }
            }
        );

        //Add Panels
        cards.add(card1,ss1);
        cards.add(card2,ss2);
        cards.add(card3,ss3);
        cards.add(card4,ss4);
        cards.add(card4,ss4);
        cards.add(card5,ss5);
        //Add Elements
        card1.add(accountDisplay);
        card2.add(accountList);
        card2.add(editOwner);
        card2.add(editBalance);
        card2.add(update);
        card3.add(addOwner);
        card3.add(addBalance);
        card3.add(addBalance);
        card3.add(addUser);
        card3.add(addPass);
        card3.add(accountTypes);
        card4.add(user);
        card4.add(pass);
        card4.add(login);
        card5.add(newUserFirst);
        card5.add(newUserLast);
        card5.add(newUserUsername);
        card5.add(newUserPassword);
        card5.add(createUser);
        //Assemble Card Layout
        JPanel comboBoxPane = new JPanel();
        String comboBoxItems[] = { ss1, ss2, ss3, ss4, ss5 };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        frame.add(comboBoxPane, BorderLayout.PAGE_START);
        frame.add(cards, BorderLayout.CENTER);

        //Frame Stuffs
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
        //accountDisplay.setText(manager.displayData());
        user.setText("Username");
        pass.setText("Password");
    }
    

}