/** Joshua Famous
 *  09/29/2017
 *  Period 4
 *  Fall Arrays - Program 1
 *  This program will take all the students in the class, and print all those names which begin with a certain letter.
**/

import java.util.Scanner;

public class SeatsArrayFindName {
    public static void main(String args[]){
        //vars
        String[] chairs = new String[24];
        Scanner scan = new Scanner(System.in);
        int num = 0;
        char find;
        
        //loop
        for(int i = 0; i < chairs.length; i ++ ){
            //input
            System.out.println("Who's in chair " + (i+1) + " ? : ");
            chairs[i] = scan.nextLine();
        }
        
        output(chairs);
        
        //switch
        System.out.println("Now we're going to find people with similar names!");
        System.out.println("What first letter of a name? :");
        find = scan.next().charAt(0);
        
        for(int i = 0; i < chairs.length; i ++ ){
            if(chairs[i].length() > 0){
                if((chairs[i].charAt(0)) == (find)){
                    
                    System.out.println("Chair " + (i+1) + " : " + chairs[i]);
                    num++;
                    
                }
            }
        }
        
        System.out.println("There were " + num + " students found!");
    }
    
    public static void output(String[] chairs){
        //output
        for(int i = 0; i < chairs.length; i ++ ){
            System.out.println("Chair " + (i+1) + " : " + chairs[i]);
        }
    }
}