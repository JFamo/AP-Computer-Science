/**
 *  Joshua Famous   
 *  3-8-2018
 *  This program will display a solution to the tower of hanoi problem using recursion.
 */

import java.util.Scanner;

public class Hanoi{
    
    //vars
    public static int numRings;
    public static int[] ringPegs;
    
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        
        //input
        System.out.println("Enter number of pegs : ");
        numRings = scan.nextInt();
        ringPegs = new int[numRings];
        
        //start
        populateRingNums();
        displayPegs();
        placePeg(numRings, 1, 3, 2);
    }
    
    //this recursive method will move the pins around into a solution
    public static void placePeg(int ring, int i, int j, int k){
        if(ring > 0){
            placePeg(ring-1, i, k, j);
            System.out.println("Move ring " + ring + " from " + i + " to "  + j);
            ringPegs[ring-1] = j;
            displayPegs();
            placePeg(ring-1, k, j, i);
        }
    }
    
    //this method will place every ring on peg 1
    public static void populateRingNums(){
        for(int i = 0; i < numRings; i ++){
            ringPegs[i] = 1;
        }
    }
    
    //this method will print to the screen the graphical representation of the rings
    public static void displayPegs(){
        for(int i = 0; i < numRings; i ++){
            if(ringPegs[i] == 1){
                System.out.print("---");
                for(int q = 0; q <= i; q ++){
                    System.out.print("O");
                }
                for(int r = 0; r <= numRings - i; r ++){
                    System.out.print("-");
                }
                System.out.print("---");
            }
            else{
                System.out.print("---------");
            }
            if(ringPegs[i] == 2){
                System.out.print("---");
                for(int q = 0; q <= i; q ++){
                    System.out.print("O");
                }
                for(int r = 0; r <= numRings - i; r ++){
                    System.out.print("-");
                }
                System.out.print("---");
            }
            else{
                System.out.print("---------");
            }
            if(ringPegs[i] == 3){
                System.out.print("---");
                for(int q = 0; q <= i; q ++){
                    System.out.print("O");
                }
                for(int r = 0; r <= numRings - i; r ++){
                    System.out.print("-");
                }
                System.out.print("---");
            }
            else{
                System.out.print("---------");
            }
            System.out.print("\n");
        }
    }
    
    //this method would drop pegs to the lowest space (not used because of the way I used iteration)
    public static int getSpacesAbove(int pegCheck, int thisRing){
        int spacesAbove = ringPegs.length-1;
        for(int i = 0; i < ringPegs.length; i ++){
            if(ringPegs[i] == pegCheck && i != thisRing){
                spacesAbove --;
            }
        }
        return spacesAbove;
    }
}