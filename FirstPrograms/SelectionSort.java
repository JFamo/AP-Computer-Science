import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        int[] values;
        String[] inp;
        boolean loop;
        
        //input
        System.out.println("Enter numbers seperated by spaces : ");
        inp = scan.nextLine().split(" ");
        values = new int[inp.length];
        for(int i = 0; i < inp.length; i ++){
            values[i] = Integer.parseInt(inp[i]);
        }
        
        //loop
        selection(values);
    }
    
    public static int[] selection(int[] values){
        for(int i = 0; i < values.length-1; i ++){
            //find the smallest remaining
            int min = values[i], mindex = i;
            for(int j = i; j < values.length; j++){
                if(values[j] < min){
                    mindex = j;
                    min = values[j];
                }
            }
            values[mindex] = values[i];
            values[i] = min;
            printArray(values);
        }
        return values;
    }
    
    public static void printArray(int[] values){
        for(int i = 0; i < values.length; i ++){
            System.out.print(values[i] + " ");
        }
        System.out.print("\n");
    }
}