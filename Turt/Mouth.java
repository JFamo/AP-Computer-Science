import TurtleGraphics.Pen;
import java.awt.Color;

public class Mouth implements BodyPart{
    private double xPos, yPos;
    private double radius;
    private int width = 1;
    private Color myColor = Color.black;
    private String emotion = "happy";
    
    public Mouth(){
        xPos = 0;
        yPos = 0;
        radius = 1;
    }
    
    public Mouth(double xLoc, double yLoc, double r){
        xPos = xLoc;
        yPos = yLoc;
        radius = r;
    }
    
    public void setEmotion(String e){
        emotion = e;
    }
    
    public String getEmotion(){
        return emotion;
    }
    
    public double area(){
        return Math.PI * radius * radius;
    }
    
    public void setColor(Color c){
        myColor = c;
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
        if(emotion.equalsIgnoreCase("happy")){
            double side = Math.PI * radius / 120;
            p.up();
            p.move(xPos + radius, yPos);
            p.setDirection(180);
            p.down();
            p.move(2*radius);
            p.setDirection(270);
            for(int i = 0; i < 120; i ++){
                p.move(side);
                p.turn(1.5);
            }
        }
        if(emotion.equalsIgnoreCase("neutral")){
            p.up();
            p.move(xPos + radius, yPos);
            p.setDirection(180);
            p.down();
            p.move(2*radius);
        }
        if(emotion.equalsIgnoreCase("sad")){
            double side = Math.PI * radius / 120;
            p.up();
            p.move(xPos + radius, yPos);
            p.setDirection(90);
            p.down();
            for(int i = 0; i < 120; i ++){
                p.move(side);
                p.turn(1.5);
            }
        }
        if(emotion.equalsIgnoreCase("shocked")){
            double side = Math.PI * radius / 120;
            p.up();
            p.move(xPos + radius, yPos);
            p.setDirection(90);
            p.down();
            for(int i = 0; i < 120; i ++){
                p.move(side);
                p.turn(3);
            }
        }
        if(emotion.equalsIgnoreCase("smug")){
            p.up();
            p.move(xPos - radius, yPos - 15);
            p.setDirection(12);
            p.down();
            p.move(1.5*radius);
            p.setDirection(40);
            p.move(0.5*radius);
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