/**
 *  Joshua Famous
 *  10/17/2017
 *  Period 4
 *  This program will use an enhanced for loop to find the mean, mode, standard deviation, median, and range of a set of integers using methods.
 */

import java.util.Arrays;
import java.util.Scanner;

public class EnhanchedForLoop {
    public static void main(String args[]){
       //vars
       Scanner scan = new Scanner(System.in);
       double mean, sum, median, range;
       int maxnum;
       
       //input
       System.out.println("How many integers do you have? :");
       int createLength = scan.nextInt();
       int[] numbers = new int[createLength];
       for(int q = 0; q < numbers.length; q ++){
           System.out.print("Integer : ");
           numbers[q] = scan.nextInt();
       }
       
        mean = getMean(numbers);
        maxnum = getMode(numbers);
        sum = getStdDev(numbers, mean);
        median = getMedian(numbers);
        range = getRange(numbers);
       
       //loop
       for(int num : numbers){
           System.out.print(num + " | ");
       }
       
       //output
       System.out.println("\nMean : " + mean);
       System.out.println("Median : " + median);
       System.out.println("Mode : " + maxnum);
       System.out.println("Std. Dev : " + sum);
       System.out.println("Range : " + range);
       
    }
    
    public static double getRange(int[] numbers){
       //range
       int low = 0, high = 0, lowIndex = 0, highIndex = 0;
       low = numbers[0];
       for(int i = 0; i < numbers.length; i ++ ){
            if(numbers[i] > high){
                high = numbers[i];
                highIndex = i;
            }
            if(numbers[i] < low){
                low = numbers[i];
                lowIndex = i;
            }
        }
       double range = numbers[highIndex] - numbers[lowIndex];
       return range;
    }
    
    public static double getMedian(int[] numbers){
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
    
    public static double getStdDev(int[] numbers, double mean){
       //standard deviation
       double sum = 0;
       for(int num : numbers){
           sum += Math.pow((num-mean),2);
       }
       sum = sum / (numbers.length - 1);
       sum = Math.pow(sum, 0.5);
       return sum;
    }
    
    public static int getMode(int[] numbers){
       //mode
       int maxoccurences = 0;
       int maxnum = numbers[0];
       for(int num : numbers){
           int occurences = 0;
           for(int num2 : numbers){
               if(num2 == num){
                   occurences++;
                }
           }
           if(occurences > maxoccurences){
               maxnum = num;
               maxoccurences = occurences;
            }
       }
       return maxnum;
    }
    
    public static double getMean(int[] numbers){
       //mean
       double mean = 0;
       for(int num : numbers){
           mean += num;
       }
       mean = mean / numbers.length;
       return mean;
    }
}