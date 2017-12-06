/**
 * 
 *  This is a mess.
 *  I'll finish it later.
 *  
 *  
 */

import java.util.Scanner;

public class ElevatorControl {
    static int floor = 1, floors = 10, maxPeople = 10, tempPeople = 0;
    static int[] people;
    static int[] waiting;
    static boolean goingUp = true, quit = false;
    static String tempUp = "";
    static Scanner scan = new Scanner(System.in);
        
    public static void main(String args[]){
        //get initial input for floors
        System.out.println("How many floors are in the building?");
        try{
            floors = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
            System.out.println("It is assumed that there are 10 floors.");
        }
        
        //populate the elevator
        people = new int[maxPeople];
        for(int i = 0; i < people.length; i ++){
            people[i] = 0;
        }
        
        //input loop
        while(!quit){
            TakeInput();
        }
    }
    
    //the method to move the elevator
    public static void Move(){
        if(goingUp){
           floor ++; 
        }
        else{
            floor --;
        }
    }
    
    //get amount of people on elevator
    public static int PeopleOnboard(){
       int p = 0;
       for(int i : people){
           if(i != 0){
               p ++;
           }
        }
       return p;
    }
    
    //the method to take input
    public static void TakeInput(){
       //input
            System.out.println("How many people are entering the elevator?");
            try{
                tempPeople = scan.nextInt();
            }
            catch(Exception e){
                System.out.println("Invalid Input!");
            }
            if(tempPeople < 0){
                System.out.println("Invalid Input!");
                System.out.println("It is assumed that 0 people are entering.");
                tempPeople = 0;
            }
            else if(tempPeople + PeopleOnboard() > maxPeople){
                System.out.println("That Amount would Overload the Elevator!");
                System.out.println("Will fill to capacity.");
                tempPeople = maxPeople - PeopleOnboard();
            }
            System.out.println("Going Up or Down?");
            try{
                tempUp = scan.nextLine();
            }
            catch(Exception e){
                System.out.println("Invalid Input!");
            }
            if(tempUp.equalsIgnoreCase("Up")){
                if(floor >= floors){
                    System.out.println("Elevator is on max floor and cannot go up!");
                    goingUp = false;
                }
                else{
                    goingUp = true;
                }
            }
            else if(tempUp.equalsIgnoreCase("U")){
                if(floor >= floors){
                    System.out.println("Elevator is on max floor and cannot go up!");
                    goingUp = false;
                }
                else{
                    goingUp = true;
                }
            }
            else if(tempUp.equalsIgnoreCase("Down")){
                if(floor <= 1){
                    System.out.println("Elevator is on bottom floor and cannot go down!");
                    goingUp = true;
                }
                else{
                    goingUp = false;
                }
            }
            else if(tempUp.equalsIgnoreCase("D")){
                if(floor <= 1){
                    System.out.println("Elevator is on bottom floor and cannot go down!");
                    goingUp = true;
                }
                else{
                    goingUp = false;
                }
            }
            else if(tempUp.equalsIgnoreCase("Done")){
                quit = true;
            }
            else{
                System.out.println("Invalid Input!");
                if(goingUp && floor < floors){
                    System.out.println("It is assumed that the elevator is going up.");
                }
                else{
                    System.out.println("It is assumed that the elevator is going down.");
                    goingUp = false;
                }
            }
    }
}