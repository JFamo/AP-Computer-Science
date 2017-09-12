import java.util.Scanner;

public class NoComma {
    public static void main(String args[]){
        
        //vars
        String inp;
        Scanner scan = new Scanner(System.in);
        
        //input
        inp = scan.nextLine();
        
        //output
        for(int i = 0; i < inp.length(); i ++ ){
            if(!(inp.charAt(i) == ',')){
               System.out.print(inp.charAt(i)); 
            }
        }
    }
}