/** Joshua Famous
 *  Lesson 4 - Cheating on Your Arithmetic Assignment
 *  June 3, 2017
 *  This program will print the output of various arithmetic expressions.
 */

public class ArithmeticAssignment {
    
    public static void main(String args[]){
        
        String expression1 = "79 + 3 * (4 + 82 - 68) - 7 + 19";
        String expression2 = "(179 + 21 + 10) / 7 + 181";
        String expression3 = "10389 * 56 * 11 + 2246";
        
        int expression1result = 79 + 3 * (4 + 82 - 68) - 7 + 19;
        int expression2result = (179 + 21 + 10) / 7 + 181;
        int expression3result = 10389 * 56 * 11 + 2246;
        
        System.out.println(expression1 + " = " + expression1result + "\n");
        System.out.println(expression2 + " = " + expression2result + "\n");
        System.out.println(expression3 + " = " + expression3result + "\n");
        
    }
    
}