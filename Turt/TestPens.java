import TurtleGraphics.StandardPen;
import TurtleGraphics.WigglePen;
import TurtleGraphics.RainbowPen;
import TurtleGraphics.Pen;

public class TestPens {
    public static void main(String[] args){
      //vars
      StandardPen p1 = new StandardPen();
      WigglePen p2 = new WigglePen();
      RainbowPen p3 = new RainbowPen();
      
      //draw
      DrawSquare(p1);
      DrawSquare(p2);
      DrawSquare(p3);
    }
    
    private static void DrawSquare(Pen pen){
        for(int i = 0; i < 4; i ++){
            pen.move(50);
            pen.turn(90);
        }
    }
}