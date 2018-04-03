public class CheckingAccount extends BankAccount{
    
    public CheckingAccount(double amount, String nm){
        super(amount, nm);
    }
    
    public void cashCheck(Check c){
        withdraw(c.amount);
    }
    
}