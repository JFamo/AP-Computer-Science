import TurtleGraphics.Pen;
import java.awt.Color;

public interface BodyPart{
    public double getWidth();
    public void setWidth(int w);
    public void draw(Pen p);
    public void setColor(Color c);
    public void stretchBy(double factor);
    public double getX();
    public double getY();
    public void move(double newX, double newY);
}