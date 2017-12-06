public abstract class BankAccount {
    public BankAccount(){
        owner = null;
        balance = 0;
        interestRate = 0;
    }
    
    public BankAccount(String n, User o, double b, double i){
        name = n;
        owner = o;
        balance = b;
        interestRate = i;
    }
    
    public void deposit(double d){
        balance += d;
    }
    
    public void withdraw(double d){
        balance -= d;
    }
    
    public User getOwner(){
        return owner;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getInterest(){
        return interestRate;
    }
    
    public String getName(){
        return name;
    }
    
    public double applyInterest(){
        double interest = balance * (interestRate / 100);
        balance += interest;
        return interest;
    }
    
    //validate data
    public String validateData(){
        if(interestRate < 0){
            return "ERROR! Invalid Interest Rate!";
        }
        else{
            return null;
        }
    }
   
    private double interestRate;
    private double balance;
    private User owner;
    private String name;
}