import java.util.Scanner;

public class DabClass{
    public static void main(String args[]){
        //vars
        MyNewInterface ob = new Dab();
        Scanner scan = new Scanner(System.in);
        
        while(true){
        
        //input
        System.out.println("Use method 1 or 2?");
        int useMethod = scan.nextInt();
        
        //method calls
        switch(useMethod){
            case 1:
                ob.method1();
            break;
            case 2:
                ob.method2();
            break;
            default:
                System.out.println("Invalid selection!");
            break;
        }
        
    }
    }
    public void method1(){
        System.out.println("welcome to method 1 *dab*");
    }
    public void method2(){
        System.out.println("welcome to method 2 *dab*"); 
    }
}
