public class SavingsAccount extends BankAccount{
    public SavingsAccount(String n, User o, double b, double i, double maxwd){
        super(n,o,b,i);
        maxWithdrawal = maxwd;
    }
    
    public void withdraw(double d){
        if(d > maxWithdrawal){
            withdraw(maxWithdrawal);
        }
        else{
            withdraw(d);
        }
    }
    
    private double maxWithdrawal;
}