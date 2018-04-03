/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	public JMenuBar menuBar;
	public JButton button2;
	public JButton button3;
	public JLabel label1;
	public JLabel label5;
	public JLabel label6;
	public JTextField textfield2;
	public JTextField textfield3;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(500,400);
		//menu generate method
		//generateMenu();
		//this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(51,102,255));


		button2 = new JButton();
		button2.setBounds(88,185,90,35);
		button2.setBackground(new Color(51,0,204));
		button2.setForeground(new Color(255,255,255));
		button2.setEnabled(true);
		button2.setFont(new Font("sansserif",0,12));
		button2.setText("Login");
		button2.setVisible(true);
		
		button3 = new JButton();
		button3.setBounds(88,225,90,35);
		button3.setBackground(new Color(51,0,204));
		button3.setForeground(new Color(255,255,255));
		button3.setEnabled(true);
		button3.setFont(new Font("sansserif",0,12));
		button3.setText("Register");
		button3.setVisible(true);

		label1 = new JLabel();
		label1.setBounds(120,25,300,44);
		label1.setBackground(new Color(153,51,0));
		label1.setForeground(new Color(255,255,255));
		label1.setEnabled(true);
		label1.setFont(new Font("SansSerif",0,30));
		label1.setText("Jimbo's Attendance");
		label1.setVisible(true);

		label5 = new JLabel();
		label5.setBounds(260,100,200,35);
		label5.setBackground(new Color(214,217,223));
		label5.setForeground(new Color(255,255,255));
		label5.setEnabled(true);
		label5.setFont(new Font("SansSerif",0,14));
		label5.setText("by Joshua Famous");
		label5.setVisible(true);

		label6 = new JLabel();
		label6.setBounds(260,135,200,35);
		label6.setBackground(new Color(214,217,223));
		label6.setForeground(new Color(255,255,255));
		label6.setEnabled(true);
		label6.setFont(new Font("SansSerif",0,14));
		label6.setText("and Asher Hamrick, 2018");
		label6.setVisible(true);

		textfield2 = new JTextField();
		textfield2.setBounds(61,102,145,35);
		textfield2.setBackground(new Color(255,255,255));
		textfield2.setForeground(new Color(0,0,0));
		textfield2.setEnabled(true);
		textfield2.setFont(new Font("sansserif",0,12));
		textfield2.setText("Username");
		textfield2.setVisible(true);

		textfield3 = new JTextField();
		textfield3.setBounds(61,141,145,35);
		textfield3.setBackground(new Color(255,255,255));
		textfield3.setForeground(new Color(0,0,0));
		textfield3.setEnabled(true);
		textfield3.setFont(new Font("sansserif",0,12));
		textfield3.setText("Password");
		textfield3.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(label1);
		contentPane.add(label5);
		contentPane.add(label6);
		contentPane.add(textfield2);
		contentPane.add(textfield3);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//method for generate menu
	/**public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}**/



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}