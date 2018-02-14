
/**
 * Write a description of class x here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LessonTester
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String args[])
    {
        String s = "Four score and seven years ago.";
        System.out.println("1."+s.substring(3));
        System.out.println("2."+s.substring(5,12));
        System.out.println("3."+s.toLowerCase());
        System.out.println("4."+s.indexOf("score"));
        System.out.println("5."+s.substring(2,s.length()-5));
        s = " " + s + "hello ";
        s = s.trim();
        System.out.println("6."+s.indexOf("and"));
        System.out.println("7."+s.indexOf("seveny"));
    }
}
