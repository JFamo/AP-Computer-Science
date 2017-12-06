/** Joshua Famous
 *  Lesson 7 - Going in Circles
 *  June 4, 2017
 *  This program will take input and calculate the radius of a circle given area.
 */

import java.util.Scanner;

public class GoingInCircles {
    
    public static void main(String args[]){
        
        //variables
        Scanner scan = new Scanner(System.in);
        double area = 0, radius = 0;
        
        //input
        System.out.println("Enter the area of a circle : ");
        try{
            area = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        //output
        radius = Math.sqrt(area / Math.PI);
        System.out.println("The radius of that circle is : " + radius);
    }
    
}