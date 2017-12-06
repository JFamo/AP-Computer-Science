import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.security.MessageDigest;
import java.security.DigestException;
import java.math.BigInteger;

public class User{
    public User(int i, String first, String last){
        id = i;
        firstName = first;
        lastName = last;
        accounts = 0;
    }
    
    public void addAccount(){
        accounts++;
    }
    
    public void setUsername(String use){
        username = use;
    }
    
    public void setPassword(String pass) throws Exception{
        MessageDigest tempPass = MessageDigest.getInstance("SHA");
        password = tempPass.digest(String.valueOf(pass).getBytes());
    }
    
    public int id;
    public String firstName;
    public String lastName;
    public String username;
    public byte[] password;
    public int accounts;
    public ArrayList<BankAccount> myAccounts = new ArrayList<BankAccount>();
}