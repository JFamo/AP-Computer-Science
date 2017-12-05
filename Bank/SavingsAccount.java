public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(double amount, double rate){
        super(amount);
        interestRate = rate;
    }
    
    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
    
    private double interestRate;
}