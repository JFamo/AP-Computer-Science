import TurtleGraphics.StandardPen;
import java.awt.Color;

public class DrawSquare{
    public static void main(String args[]){
        //vars
        StandardPen pen = new StandardPen();
        
        //prep
        pen.up();
        pen.move(25);
        pen.turn(90); pen.move(25);
        pen.down();
        
        //draw
        pen.turn(90); pen.move(50);
        pen.turn(90); pen.move(50);
        pen.turn(90); pen.move(50);
        pen.turn(90); pen.move(50);
    }
}