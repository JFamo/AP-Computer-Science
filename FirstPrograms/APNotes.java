import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class APNotes {
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        List<String> text = new ArrayList<String>();
        
        //input
        System.out.print("Import source text : \n");
        String[] arr = (scan.nextLine().split("(?<=[a-z])\\.\\s+"));
        text = Arrays.asList(arr);
        
        //output
        for(String s : arr){
            System.out.println(s);
        }
    }
}