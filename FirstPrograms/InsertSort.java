import java.util.Scanner;

public class InsertSort {
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
        insert(values);
    }
    
    public static int[] insert(int[] values){
        for(int i = 1; i < values.length; i ++){
            int k = i - 1;
            int item = values[i];
            boolean stop = false;
            while(k >= 0 && !stop){
                if(item < values[k]){
                    values[k + 1] = values[k];
                    k--;
                    if(k == -1){
                        values[0] = item;
                    }
                }
                else{
                    values[k + 1] = item;
                    stop = true;
                }
            }
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