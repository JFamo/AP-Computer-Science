/** Joshua Famous   
 *  09/12/2017
 *  Program 3 Review
 *  This program will remove the asterisks from an inputted number and print the output.
 */

import java.util.Scanner;

public class NoComma {
    public static void main(String args[]){
        
        //vars
        String inp;
        Scanner scan = new Scanner(System.in);
        
        //input
        System.out.println("Enter a number : ");
        inp = scan.nextLine();
        
        //output
        for(int i = 0; i < inp.length(); i ++ ){
            if(!(inp.charAt(i) == '*')){
               System.out.print(inp.charAt(i)); 
            }
        }
        
        System.out.println("");
    }
}