import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTester{
    public static void findLargestBalance(){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        double largestBalance = -100000;
        String largestName = "";
        
        while(!end){
            System.out.print("Enter another account owner or the word Exit to stop : ");
            String input = scan.next();
            if(input.toLowerCase().equals("exit")){
                end = true;
            }
            else{
                String clearbuffer = scan.nextLine();
                System.out.print("Enter the account balance : ");
                double amt = scan.nextDouble();
                accounts.add(new CheckingAccount(amt, input));
            }
        }
        
        for(BankAccount acc : accounts){
            if(acc.getBalance() > largestBalance){
                largestBalance = acc.getBalance();
                largestName = acc.getOwner();
            }
        }
        
        System.out.println("The largest account belongs to " + largestName + " with balance $" + largestBalance + ".");
    }
}