import java.util.*;
public class TeachingDave{
    public static void main(){
        Scanner reader = new Scanner(System.in);
        System.out.println("INPUT: ");
        int n = reader.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i <= n-1; i++)
        {
            arr[i] = reader.nextInt();
        }
        boolean sorted = false;
        int moo=0;
        while(!sorted){
            sorted=true;
            moo++;
            for(int i = 0; i <= arr.length-2; i++)
            {
                if(arr[i+1] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;                
                }
            }
            for(int i = arr.length-2; i >= 0; i--)
            {
                if(arr[i+1] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;                
                }
            }
            for(int i = 0; i <= arr.length-2; i++)
            {
                if(arr[i+1] < arr[i])
                {
                    sorted = false;
                }
            }            
        }
        System.out.println("OUTPUT: ");
        System.out.println(moo);
    }
}
