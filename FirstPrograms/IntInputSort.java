/**
 *  Joshua Famous
 *  10/12/2017
 *  Period 4
 *  This program will take user input and sort it into negatives, odds, and evens.
 * 
 */

import java.util.Scanner;

public class IntInputSort {
    public static void main(String args[]){
        
        //vars
        Scanner scan = new Scanner(System.in);
        int[] negatives = new int[0];
        int[] odds = new int[0];
        int[] evens = new int[0];
        
        //input and sorting
        for(int i = 1; i <= 10; i ++){
            
            System.out.println("Enter an Integer:");
            int temp = scan.nextInt();
            
            //this is negative
            if(temp < 0){
                int[] tempNegatives = new int[negatives.length + 1];
                for(int q = 0; q < negatives.length; q ++){
                    tempNegatives[q] = negatives[q];
                }
                tempNegatives[tempNegatives.length - 1] = temp;
                negatives = tempNegatives;
            }
            else{
            //this is even
            if(temp % 2 == 0){
                int[] tempEvens = new int[evens.length + 1];
                for(int q = 0; q < evens.length; q ++){
                    tempEvens[q] = evens[q];
                }
                tempEvens[tempEvens.length - 1] = temp;
                evens = tempEvens;
            }
            else{
            //this is odd
            if(temp % 2 == 1){
                int[] tempOdds = new int[odds.length + 1];
                for(int q = 0; q < odds.length; q ++){
                    tempOdds[q] = odds[q];
                }
                tempOdds[tempOdds.length - 1] = temp;
                odds = tempOdds;
            }
        }}
            
        }
        
        //output
        System.out.println("Negatives:");
        for(int num : negatives){
            System.out.println(num);
        }
        System.out.println("Evens:");
        for(int num : evens){
            System.out.println(num);
        }
        System.out.println("Odds:");
        for(int num : odds){
            System.out.println(num);
        }
        
    }
}