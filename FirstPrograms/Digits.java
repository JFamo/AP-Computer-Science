import java.util.List;
import java.util.ArrayList;

public class Digits
{
    public ArrayList<Integer> digitList;
    
    public static void main(String args[]){
        Digits d = new Digits(123456789);
        for(int i : d.digitList){
            System.out.println(i);
        }
        System.out.println(d.isStrictlyIncreasing());
    }

    /**
     * Constructor for objects of class Digits
     */
    public Digits(int num)
    {
        String numString = "" + num;
        digitList = new ArrayList<Integer>();
        for(int i = 0; i < numString.length(); i ++){
            digitList.add(Integer.parseInt(numString.substring(i, i + 1)));
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isStrictlyIncreasing()
    {
        int previous = -1;
        for(int i : digitList){
            if(i > previous){
                previous = i;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
