/**
 *  Joshua Famous
 *  Period 4
 *  11-7-2017
 *  This class will take the equation of a line as static variables, and using a static method with coordinate argument, return the distance from point to line.
 */


public class DistToLine {
    
    public static double getDist(double a, double b){
        double out = 0;
        out = Math.abs(A * a + B * b + C);
        out = out / Math.sqrt(A * A + B * B);
        return out;
    }
    
    public static double A, B, C;
}