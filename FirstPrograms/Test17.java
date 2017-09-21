//Jim is making us test this

public class Test17{
    public static void main(String args[]){
        System.out.println(sol(10));
    }
    public static int sol(int lim){
        int s = 0;
        for(int outer=1; outer<=lim; outer++){
            for(int inner=outer; inner<=lim; inner++){
                s++;
            }
        }
        return s;
    }
}