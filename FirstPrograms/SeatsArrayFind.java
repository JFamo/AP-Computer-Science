import java.util.Scanner;

public class SeatsArrayFind {
    public static void main(String args[]){
        //vars
        String[] chairs = new String[24];
        Scanner scan = new Scanner(System.in);
        String find;
        
        //loop
        for(int i = 0; i < chairs.length; i ++ ){
            //input
            System.out.println("Who's in chair " + (i+1) + " ? : ");
            chairs[i] = scan.nextLine();
        }
        
        output(chairs);
        
        //switch
        System.out.println("Now we're going to find someone!");
        System.out.println("Whomst do you want to find? :");
        find = scan.nextLine();
        
        for(int i = 0; i < chairs.length; i ++ ){
            if(chairs[i].equals(find)){
                
                System.out.println("Found them!");
                System.out.println("Chair " + (i+1) + " : " + chairs[i]);
                
            }
        }
    }
    
    public static void output(String[] chairs){
        //output
        for(int i = 0; i < chairs.length; i ++ ){
            System.out.println("Chair " + (i+1) + " : " + chairs[i]);
        }
    }
}