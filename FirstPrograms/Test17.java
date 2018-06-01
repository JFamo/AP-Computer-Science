//Jim is making us test this

public class Test17{
    public static void main(String args[]){
        String s = "abcd123efgh456";
        String sp[] = s.split("\\D+");
        for(int i = 0; i < sp.length; i ++){
            System.out.println(sp[i]);
        }
        System.out.println(sp.length + sp[1]);
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