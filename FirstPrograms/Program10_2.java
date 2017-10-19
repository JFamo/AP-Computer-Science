/**
 *  Joshua Famous
 *  10/19/2017
 *  Period 4
 *  Program 10-2
 *  This program will find the average of a decimal array and return all numbers above the average;
 */

import java.util.Arrays;
import java.util.Scanner;

public class Program10_2 {
    public static void main(String args[]){
       //vars
       Scanner scan = new Scanner(System.in);
       double[] nums = new double[10];
       
       //input
       for(int q = 0; q < nums.length; q ++){
           System.out.print("Enter a number : ");
           nums[q] = scan.nextDouble();
       }
       
       //average
       double mean = getMean(nums);
       System.out.println("The average is : " + mean);
       
       //nums above average
       System.out.println("Numbers > Average : ");
       for(double num : nums){
           if(num > mean){
               System.out.print(num + " ");
            }
       }
       
    }
    
    public static double getMean(double[] numbers){
       //mean
       double mean = 0;
       for(double num : numbers){
           mean += num;
       }
       mean = mean / numbers.length;
       return mean;
    }
}