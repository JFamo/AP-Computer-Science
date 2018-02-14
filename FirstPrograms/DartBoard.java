import java.util.Scanner;

public class DartBoard {
    //vars
    static Scanner scan = new Scanner(System.in);
    static int darts;
    static String color;
    static double a1, a2, a3;
    static double areaSum;
    
    //main method
    public static void main(String args[]){
        input();
        calculateAreas();
        System.out.println("Probability of throwing " + darts + " darts that all hit " + color + " is : " + throwDarts());
    }
    
    //input method
    public static void input(){
        System.out.println("Enter the number of darts you're throwing :");
        try{
            darts = scan.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Input!");
        }
        System.out.println("Enter the color you're trying to hit (black, red, or yellow):");
        try{
            color = scan.next();
        }catch(Exception e){
            System.out.println("Invalid Input!");
        }
    }
    
    //calclate areas method
    public static void calculateAreas(){
        a1 = Math.PI * (1);
        a2 = Math.PI * (4);
        a3 = Math.PI * (9);
        areaSum = a1 + a2 + a3;
    }
    
    //throw darts method
    public static double throwDarts(){
        double ret = 1;
        double prob = 0;
        switch(color.toLowerCase()){
            case "black":
                prob = (a1 / areaSum);
                break;
            case "yellow":
                prob = (a3 / areaSum);
                break;
            case "red":
                prob = (a2 / areaSum);
                break;
            case "default":
                prob = 0;
                break;
        }
        for(int i = 0; i < darts; i ++){
            ret = ret * prob;
        }
        return ret;
    }
}