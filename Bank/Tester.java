public class Tester{
    public static void main(String args[]){
        SavingsAccount myAccount = new SavingsAccount(200,5);
        myAccount.deposit(132.14);
        myAccount.addInterest();
        System.out.println("The final balance is " + myAccount.getBalance());
        CheckingAccount c = new CheckingAccount(10);
        Check c1 = new Check(2,5);
        c.cashCheck(c1);
        System.out.println("The final balance is " + c.getBalance());
    }
}