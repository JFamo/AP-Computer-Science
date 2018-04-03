abstract public class BankAccount{
    
    public BankAccount(double amt, String nm){
        balance = amt;
        owner = nm;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void deposit(double d){
        balance += d;
    }
    
    public void withdraw(double d){
        balance -= d;
    }
    
    public void setOwner(String s){
        owner = s;
    }
    
    private double balance;
    private String owner;
}