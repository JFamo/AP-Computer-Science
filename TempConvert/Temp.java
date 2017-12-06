import java.util.Scanner;

public class Temp {
    public static void main(String[] args)
    {
    boolean run = true;
    while(run){
    int inputz = 0;
    System.out.println("Please input a temperature in farenheight.");
    Scanner john = new Scanner (System.in);
    inputz = john.nextInt();
    inputz = (inputz-32)*5/9;
    System.out.println("Temperature in celcuis : " + inputz);
        }
    }
}
