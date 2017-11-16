import java.util.Scanner;


public class PercentError {
    public static void main(String args[]){
        
        //vars
        Scanner scan = new Scanner(System.in);
        double[] valuesD = new double[0];
        
        //input
        System.out.println("Enter data, seperated by spaces : ");
        
        String[] values = scan.nextLine().split(" ");
        
        //convert
        for(String s : values){
            double[] newArray = new double[valuesD.length + 1];
            double[] n = new double[valuesD.length + 1];
        }
        
    }
}