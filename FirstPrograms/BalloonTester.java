/** Joshua Famous
 *  09/13/2017
 *  Summer Practice Program 4
 *  This tester class will construct and add air to a fake balloon.
 */

public class BalloonTester {
    public static void main(String args[]){
        
        Balloon balloony = new Balloon();
        
        balloony.addAir(100);
        
        System.out.println("Volume : "+balloony.getVolume());
        System.out.println("Surface Area : "+balloony.getSurfaceArea());
        System.out.println("Radius : "+balloony.getRadius());
        
        balloony.addAir(100);
        
        System.out.println("Volume : "+balloony.getVolume());
        System.out.println("Surface Area : "+balloony.getSurfaceArea());
        System.out.println("Radius : "+balloony.getRadius());
        
    }
}