import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String args[]){
        
        //init vars
        char userInput;
        int operand1, operand2;
        Scanner scan = new Scanner(System.in);
        
        //input
        System.out.println("Choose an Operation:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        userInput = scan.next().charAt(0);
      
        System.out.println("");
        System.out.println("Enter Operand 1:");
        operand1 = scan.nextInt();
        System.out.println("Enter Operand 2:");
        operand2 = scan.nextInt();
        
        //convert
        if(userInput >= 97){
            userInput -= 32;
        }
        
        //switch
        switch(userInput){
            case 'A':
                System.out.println(operand1 + " plus " + operand2 + " = " + (operand1+operand2));
                break;
            case 'S':
                System.out.println(operand1 + " minus " + operand2 + " = " + (operand1-operand2));
                break;    
            case 'M':
                System.out.println(operand1 + " times " + operand2 + " = " + (operand1*operand2));
                break;
            case 'D':
                System.out.println(operand1 + " divided by " + operand2 + " = " + (operand1/operand2));
                break;
            default:
                System.out.println("Invalid Input!");
            
        }
    }
}