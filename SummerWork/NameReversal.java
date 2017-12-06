/** Joshua Famous
 *  Lesson 11 - Name Reversal
 *  June 6, 2017
 *  This program will take input for a name and return it reversed.
 */

import java.util.Scanner;

public class NameReversal {
    
    public static void main(String args[]){
        
        //variables
        Scanner scan = new Scanner(System.in);
        String name = "";
        
        //input
        System.out.println("Enter your name : ");
        try{
            name = scan.nextLine();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        System.out.println("");
        
        for(int i = name.length()-1; i >= 0; i--){
            
            System.out.print(name.substring(i, i+1).toLowerCase());
            
        }

    }
    
}