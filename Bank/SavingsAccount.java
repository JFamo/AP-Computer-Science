public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(double amount, String nm, double rate){
        super(amount, nm);
        interestRate = rate;
    }
    
    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
    
    private double interestRate;
}