/** Joshua Famous
 *  Lesson 9 - Even or Odd?
 *  June 6, 2017
 *  This program will take input and return if the input is even or odd.
 */

import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String args[]){
        
        //variables
        Scanner scan = new Scanner(System.in);
        int input=0;
        
        //input
        System.out.println("Enter an integer : ");
        try{
            input = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        //calculations and output
        if( ( input % 2 ) == 0 ){   //if even
            System.out.println("The integer " + input + " is even.\n");
        }
        else{
            System.out.println("The integer " + input + " is odd.\n");
        }

    }
    
}