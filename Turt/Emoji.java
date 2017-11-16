import TurtleGraphics.Pen;
import java.awt.Color;

public class Emoji {
    private int xPos, yPos;
    private int stretchFactor = 1;
    private Color myColor = Color.black;
    private Color eyeColor = Color.blue;
    private String emotion = "neutral";
    
    public Emoji(int xLoc, int yLoc, Color c1, Color c2, String e){
        xPos = xLoc;
        yPos = yLoc;
        myColor = c1;
        eyeColor = c2;
        emotion = e;
    }
    
    public void draw(Pen p){
        Shape s0 = new Circle(xPos,yPos, 100);
        Eye s1 = new Eye(xPos-50, yPos, 20);
        Eye s2 = new Eye(xPos+50, yPos, 20);
        Mouth s3 = new Mouth(xPos, yPos-50, 20);
        s1.setEyeColor(eyeColor);
        s2.setEyeColor(eyeColor);
        s1.setColor(myColor);
        s2.setColor(myColor);
        s3.setEmotion(emotion);
        s3.setColor(myColor);
        s0.setColor(myColor);
        s1.draw(p);
        s2.draw(p);
        s3.draw(p);
        s0.draw(p);
    }
    
}