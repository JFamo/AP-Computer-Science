import TurtleGraphics.Pen;
import java.awt.Color;

public class Eye implements BodyPart{
    private double xPos, yPos;
    private double radius;
    private int width = 1;
    private Color myColor = Color.black;
    private Color eyeColor = Color.blue;
    
    public Eye(){
        xPos = 0;
        yPos = 0;
        radius = 1;
    }
    
    public Eye(double xLoc, double yLoc, double r){
        xPos = xLoc;
        yPos = yLoc;
        radius = r;
    }
    
    public double area(){
        return Math.PI * radius * radius;
    }
    
    public void setColor(Color c){
        myColor = c;
    }
    
    public void setEyeColor(Color c){
        eyeColor = c;
    }
    
    public void setWidth(int w){
        width = w;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void draw(Pen p){
        p.home();
        p.setColor(myColor);
        p.setWidth(width);
        double side = 2.0 * Math.PI * (radius*2) / 120;
        p.up();
        p.move(xPos + (radius*2), yPos);
        p.setDirection(90);
        p.down();
        for(int i = 0; i < 120; i ++){
            p.move(side);
            p.turn(3);
        }
        p.home();
        p.setColor(eyeColor);
        double innerside = 2.0 * Math.PI * (radius*0.75) / 120;
        p.up();
        p.move(xPos + (radius*0.75), yPos);
        p.setDirection(90);
        p.down();
        for(int i = 0; i < 120; i ++){
            p.move(innerside);
            p.turn(3);
        }
    }
    
    public double getX(){
        return xPos;
    }
    
    public double getY(){
        return yPos;
    }
    
    public void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
    }
    
    public void stretchBy(double factor){
        radius *= factor;
    }
    
}