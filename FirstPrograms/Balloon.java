/** Joshua Famous
 *  09/13/2017
 *  Summer Practice Program 4
 *  This balloon class will be a fake balloon that has air, volume, surface area, radius.
 */

public class Balloon {
    //vars
    double volume, surfaceArea, radius;
    
    //constructor
    public void Balloon(){
        volume = 0;
        surfaceArea = 0;
        radius = 0;
    }
    
    //add air
    public void addAir(double air){
        volume += air;
        //radius calculations
        radius = Math.pow( 3 * ( volume / ( 4 * 3.14 ) ) , 0.33333 );
        //surface area calculations
        surfaceArea = 4 * 3.14 * (Math.pow(radius, 2));
    }
    
    //accessors
    public double getVolume(){
        return volume;
    }
    
    public double getSurfaceArea(){
        return surfaceArea;
    }
    
    public double getRadius(){
        return radius;
    }
}