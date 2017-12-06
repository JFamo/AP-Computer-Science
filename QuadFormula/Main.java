import java.util.Scanner;
import java.lang.Math;
public class Main{
        public static void main(String args[] ){
        boolean run = true;
        while(run){
        Scanner pidgeon = new Scanner (System.in);
        System.out.println("Enter A");
        double a = pidgeon.nextDouble();
        System.out.println("Enter B");
        double b = pidgeon.nextDouble();
        System.out.println("Enter C");
        double c = pidgeon.nextDouble();
        double temp1 = Math.sqrt(b * b - 4 * a * c);
        double root1 = (-b +  temp1) / (2*a) ;
        double root2 = (-b -  temp1) / (2*a) ;
        System.out.println("Solutions : "+root1+" and "+root2);
            }
        }
    }