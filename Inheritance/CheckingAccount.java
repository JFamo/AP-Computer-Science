public class CheckingAccount extends BankAccount{
    public CheckingAccount(String n, User o, double b, double i){
        super(n,o,b,i);
    }
    
    public void cashCheck(int checkNumber){
        withdraw(Checks.checks.get(checkNumber));
    }
    
    public boolean writeCheck(int checkNumber, double amount){
        if(Checks.checks.get(checkNumber) == null){
            Checks.checks.put(checkNumber, amount);
            return true;
        }
        else{
            return false;
        }
    }
}