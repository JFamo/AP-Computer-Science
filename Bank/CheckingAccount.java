public class CheckingAccount extends BankAccount{
    
    public CheckingAccount(double amount){
        super(amount);
    }
    
    public void cashCheck(Check c){
        withdraw(c.amount);
    }
    
}