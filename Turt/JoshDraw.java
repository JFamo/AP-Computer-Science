import TurtleGraphics.StandardPen;
import java.awt.Color;

public class JoshDraw {
 
    public static void Circle(StandardPen pen, double radius){
        pen.up();
        pen.turn(270);
        pen.move(radius);
        pen.down();
        //draw
        for(int t = 0; t < 360; t ++){
            pen.turn(1); 
            pen.move(2 * Math.PI * radius / 360);
        }
    }
    
}