/**
 *  Joshua Famous
 *  10/19/2017
 *  Period 4
 *  Program 10-3
 *  This program will find the median of a decimal array;
 */

import java.util.Arrays;
import java.util.Scanner;

public class Program10_3 {
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
       double median = getMedian(nums);
       System.out.println("The median is : " + median);
    }
    
    public static double getMedian(double[] numbers){
       //median
       Arrays.sort(numbers);
       double median;
       if(numbers.length % 2 == 0){
           int indexMedian = (int)(numbers.length / 2 - 1);
           median = (numbers[indexMedian] + numbers[indexMedian])/2;
       }
       else{
           int indexMedian = (int)(numbers.length / 2);
           median = numbers[indexMedian];
       }
       return median;
    }
}