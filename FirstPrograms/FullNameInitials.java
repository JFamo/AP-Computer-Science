/**
    Joshua Famous
    09/07/2017
    Full Name to Initials
    This program will convert a user's full name into their initials.
**/

import java.util.Scanner;

public class FullNameInitials {
    public static void main(String args[]){
        
        //init vars
        String userInput = "";
        Scanner scan = new Scanner(System.in);
        int nameIndex;
        
        //input
        System.out.println("Enter Your Full Name:");
        try{
            userInput = scan.nextLine();
        }catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        //convert
        String[] nameParts = userInput.split(" ");
        
        for(String name:nameParts){
            System.out.print(name.charAt(0) + ".");
        }
        
        System.out.println("");
    }
}