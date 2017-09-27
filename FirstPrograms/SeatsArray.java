import java.util.Scanner;

public class SeatsArray {
    public static void main(String args[]){
        //vars
        String[] chairs = new String[24];
        Scanner scan = new Scanner(System.in);
        
        //loop
        for(int i = 0; i < chairs.length; i ++ ){
            
            //input
            System.out.println("Who's in chair " + (i+1) + " ? : ");
            chairs[i] = scan.nextLine();
            
        }
        
        //output
        for(int i = 0; i < chairs.length; i ++ ){
            
            System.out.println("Chair " + (i+1) + " : " + chairs[i]);
            
        }
    }
}