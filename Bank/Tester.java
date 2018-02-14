public class Tester{
    public static void main(String args[]){
        //create a checking account
        CheckingAccount acc = new CheckingAccount(100);
        //create a new check with number 10105 and amount $25
        Check myCheck1 = new Check(10105,25);
        //cash the check
        acc.cashCheck(myCheck1);
        //print the result
        System.out.println("The final balance is " + acc.getBalance());
    }
}