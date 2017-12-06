import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class BankGUI extends JDialog implements ItemListener{
    User selected;
    //Init Strings
    final static String ss1 = "Deposit";
    final static String ss2 = "Withdraw";
    final static String ss3 = "Display Balance";
    final static String ss4 = "Open Account";
    final static String ss5 = "Close Account";
    //Init TextFields
    JTextField deposit = new JTextField("Amount",8);
    JTextField withdrawal = new JTextField("Amount",8);
    JTextField accountName = new JTextField("Name",8);
    JTextField interestRate = new JTextField("Interest %",8);
    //Init Panels
    JPanel cards = new JPanel(new CardLayout());
    JPanel card1 = new JPanel();
    JPanel card2 = new JPanel();
    JPanel card3 = new JPanel();
    JPanel card4 = new JPanel();
    JPanel card5 = new JPanel();
    //Create Labels
    JLabel depositError = new JLabel("");
    JLabel withdrawalError = new JLabel("");
    JLabel displayBalance = new JLabel("0");
    //combo boxes
    JComboBox myAccounts;
    
    JDialog frame = new JDialog(this, "Famous Banking : Account", Dialog.ModalityType.DOCUMENT_MODAL);

    boolean out = false;

    public void guiinit() throws IOException, Exception{
        //gui stuff
        frame.setModal(true);
        frame.setSize(512,200);
        //buttons and listeners
        JButton createAccount = new JButton("Create");
        createAccount.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String inp1 = accountName.getText();
                    double inp2 = Double.parseDouble(interestRate.getText());
                    String accType = (String)accountTypes.getSelectedItem();
                    switch(accType){
                        case "Checking":
                        default:
                            CheckingAccount s = new CheckingAccount();
                        break;
                        case "Savings":
                            SavingsAccount s = new SavingsAccount();
                        break;
                    }
                    accs.accounts.add(s);
                    s.setOwner(inp1);
                    s.setBalance(inp2);
                    s.setUser(inp3);
                    byte[] tempUse = tempPass.digest(String.valueOf(inp4).getBytes());
                    s.setPass(tempUse);
                    tempPass.reset();
                    accountDisplay.setText(manager.displayData());
                    JOptionPane.showMessageDialog(frame,
                        "Account Created!");
                    addOwner.setText("Account Name");
                    addBalance.setText("Balance");
                    addUser.setText("Username");
                    addPass.setText("Password");
                }
            }
        );
        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int inp1 = Integer.parseInt(deposit.getText());
                    if(inp1 > 0){
                        selected.deposit(inp1);
                        depositError.setText("");
                        displayBalance.setText(""+selected.getBalance());                    }
                    else{
                        JOptionPane.showMessageDialog(frame,
                            "Invalid Deposit Amount!",
                            "Deposit error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        );
        JButton withdrawalButton = new JButton("Withdraw");
        withdrawalButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int inp1 = Integer.parseInt(withdrawal.getText());
                    if(inp1 > 0){
                        if(inp1 < selected.getBalance()){
                            selected.withdraw(inp1);
                            displayBalance.setText(""+selected.getBalance());
                        }
                        else{
                            selected.withdraw(selected.getBalance());
                            displayBalance.setText(""+selected.getBalance());
                            JOptionPane.showMessageDialog(frame,
                                "Tried to Withdraw more than Balance! Withdrew Whole Account Instead!",
                                "Withdrawal Error",
                                JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,
                            "Invalid Withdrawal Amount!",
                            "Withdrawal Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        );

        //Add Panels
        cards.add(card1,ss1);
        cards.add(card2,ss2);
        cards.add(card3,ss3);
        cards.add(card4,ss4);
        cards.add(card5,ss5);
        //Add Elements
        card1.add(deposit);
        card1.add(depositButton);
        card1.add(depositError);
        card2.add(withdrawal);
        card2.add(withdrawalButton);
        card2.add(withdrawalError);
        card3.add(displayBalance);

        //Assemble Card Layout
        JPanel comboBoxPane = new JPanel();
        String comboBoxItems[] = { ss1, ss2, ss3 };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        frame.add(comboBoxPane, BorderLayout.PAGE_START);
        frame.add(cards, BorderLayout.CENTER);

        //Frame Stuffs
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(false);
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }

    public void closeFrame() {
        frame.setVisible(false);
    }

    public void openFrame() {
        frame.setVisible(true);
    }

    public void setSelected(User in){
        selected = in;
        displayBalance.setText(""+selected.getBalance());
    }

    public double getBalance(){
        return selected.getBalance();
    }
}