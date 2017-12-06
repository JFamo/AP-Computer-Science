import java.awt.*; 
import javax.swing.*; 
public class MakeUI {
    public static void MakeUI(String Args[]){
    JFrame will = new JFrame("ProgramFace"); 
    JLabel textLabel = new JLabel("This is a window",SwingConstants.CENTER);
    will.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    textLabel.setPreferredSize(new Dimension(100, 100)); 
    will.getContentPane().add(textLabel, BorderLayout.CENTER);
    JTextField trevor = new JTextField("Don't type here",20);
    will.getContentPane().add(trevor);
    
    will.setLocationRelativeTo(null); 
    will.pack(); 
    will.setVisible(true);        
}   
}