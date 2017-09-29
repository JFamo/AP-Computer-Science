/** Joshua Famous
 *  09/29/2017
 *  Period 4
 *  Fall Arrays - Program 2
 *  This program will take input for an array of 50 whole numbers, and return the lowest and highest.
**/

import java.util.Scanner;

public class NumbersArray {
    public static void main(String args[]){
        //vars
        int[] nums = new int[50];
        Scanner scan = new Scanner(System.in);
        int low = 0, high = 0, lowIndex = 0, highIndex = 0;
        
        //loop
        for(int i = 0; i < nums.length; i ++ ){
            //input
            System.out.println("Number " + (i+1) + " : ");
            nums[i] = scan.nextInt();
        }
        
        //update vars
        low = nums[0];
        
        output(nums);
        
        for(int i = 0; i < nums.length; i ++ ){
            if(nums[i] > high){
                high = nums[i];
                highIndex = i;
            }
            if(nums[i] < low){
                low = nums[i];
                lowIndex = i;
            }
        }
        
        System.out.println("Low number was " + low + " at index " + lowIndex);
        System.out.println("High number was " + high + " at index " + highIndex);
        System.out.println("---END---");
    }
    
    public static void output(int[] nums){
        //output
        for(int i = 0; i < nums.length; i ++ ){
            System.out.println((i) + " : " + nums[i]);
        }
    }
}