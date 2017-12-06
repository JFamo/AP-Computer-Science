/** Joshua Famous
 *  Lesson 10 - Weight on Other Planets
 *  June 6, 2017
 *  This program will calculate the user's weight on various mythical planets.
 */

import java.util.Scanner;

public class WeightOnOtherPlanets {
    
    public static void main(String args[]){
        
        //variables
        Scanner scan = new Scanner(System.in);
        int input = 0;
        double weight = 0;
        
        //input
        
        System.out.println("Select a planet from below by entering its index number : \n");
        
        System.out.println("[1] Voltar");
        System.out.println("[2] Krypton");
        System.out.println("[3] Fertos");
        System.out.println("[4] Servontos");
        
        System.out.print("Index : ");
        
        try{
            input = scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        System.out.print("\nEnter your weight on earth : ");
        try{
            weight = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Invalid Input!");
        }
        
        switch(input){
            
            case 1:
                System.out.println("Your weight on Voltar would be " + (weight * 0.091));
                break;
            case 2:
                System.out.println("Your weight on Krypton would be " + (weight * 0.720));
                break;
            case 3:
                System.out.println("Your weight on Fertos would be " + (weight * 0.865));
                break;
            case 4:
                System.out.println("Your weight on Servontos would be " + (weight * 4.612));
                break;
            default:
                System.out.println("Invalid planet selection!");
                break;
            
        }

    }
    
}