import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class TurtTester{
    public static void main(String[] args){
        StandardPen p = new StandardPen();
        
        Emoji[] emojis = new Emoji[10];
        
        emojis[0] = new Emoji(0,0,Color.black,Color.blue,"happy");
        emojis[1] = new Emoji(300,300,Color.black,Color.red,"sad");
        emojis[2] = new Emoji(-300,300,Color.black,Color.green,"neutral");
        emojis[3] = new Emoji(-300,-300,Color.black,Color.magenta,"shocked");
        emojis[4] = new Emoji(300,-300,Color.black,Color.cyan,"smug");
        
        for(Emoji e : emojis){
            if(e != null){
                e.draw(p);
            }
        }
    }
}