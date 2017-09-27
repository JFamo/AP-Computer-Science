import java.util.Scanner;

public class SeatsArraySwitch {
    public static void main(String args[]){
        //vars
        String[] chairs = new String[24];
        Scanner scan = new Scanner(System.in);
        int s1, s2;
        
        //loop
        for(int i = 0; i < chairs.length; i ++ ){
            
            //input
            System.out.println("Who's in chair " + (i+1) + " ? : ");
            chairs[i] = scan.nextLine();
            
        }
        
        output(chairs);
        
        //switch
        System.out.println("Now we're going to switch chairs!");
        System.out.println("What seat number (1-24) do you want to move from? :");
        s1 = scan.nextInt();
        System.out.println("What seat number (1-24) do you want to move to? :");
        s2 = scan.nextInt();
        
        String temp = chairs[s2-1];
        chairs[s2-1] = chairs[s1-1];
        chairs[s1-1] = temp;
        
        output(chairs);
    }
    
    public static void output(String[] chairs){
        //output
        for(int i = 0; i < chairs.length; i ++ ){
            
            System.out.println("Chair " + (i+1) + " : " + chairs[i]);
            
        }
    }
}