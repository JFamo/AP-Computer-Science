/**
 *  Joshua Famous
 *  Period 4
 *  11-7-2017
 *  This program will test the DistToLine class by reciving input and returning its static method, GetDist.
 */

import java.util.Scanner;

public class DistToLineTester {
    public static void main(String[] args){
        //vars
        Scanner scan = new Scanner(System.in);
        double x,y;
        
        //input
        System.out.println("Enter A of line:");
        DistToLine.A = scan.nextDouble();
        System.out.println("Enter B of line:");
        DistToLine.B = scan.nextDouble();
        System.out.println("Enter C of line:");
        DistToLine.C = scan.nextDouble();
        
        System.out.println("Enter x of Coordinate:");
        x = scan.nextDouble();
        System.out.println("Enter y of Coordinate:");
        y = scan.nextDouble();
        
        //output
        System.out.println("Distance :");
        System.out.println(DistToLine.getDist(x,y));
    }
}