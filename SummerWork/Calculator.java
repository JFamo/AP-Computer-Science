/** Joshua Famous
 *  Lesson 10 - Calculator
 *  June 6, 2017
 *  This program will perform various mathematical operations.
 */

import java.util.Scanner;

public class Calculator {
    
    public static void main(String args[]){
        
        //variables
        Scanner scan = new Scanner(System.in);
        String input = "";
        double operand1 = 0, operand2 = 0;
        
        //input
        
        System.out.println("Mae your arithmetic selection from the choices below : \n");
        
        System.out.println("[Addition]");
        System.out.println("[Subtraction]");
        System.out.println("[Multiplication]");
        System.out.println("[Division]\n");
        
        System.out.print("Enter one of the types listed above : ");
        
        try{
            input = scan.next();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        System.out.print("\nEnter first operand : ");
        try{
            operand1 = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        System.out.print("\nEnter second operand : ");
        try{
            operand2 = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        switch(input){
            
            case "Addition":
            case "addition":
                System.out.println(operand1 + " plus " + operand2 + " = " + (operand1 + operand2));
                break;
            case "Subtraction":
            case "subtraction":
                System.out.println(operand1 + " minus " + operand2 + " = " + (operand1 - operand2));
                break;
            case "Multiplication":
            case "multiplication":
                System.out.println(operand1 + " times " + operand2 + " = " + (operand1 * operand2));
                break;
            case "Division":
            case "division":
                System.out.println(operand1 + " divided by " + operand2 + " = " + (operand1 / operand2));
                break;
            default:
                System.out.println("Hey dummy, type a correct selection, Addition, Subtraction, Multiplication or Division!");
                break;
            
        }

    }
    
}