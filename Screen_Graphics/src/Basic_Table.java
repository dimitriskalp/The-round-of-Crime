import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Basic_Table extends JFrame{
	public Basic_Table() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 732, 495);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("\u039C\u0395\u039D\u039F\u03A5");
		button.setFont(new Font("Calibri", Font.BOLD, 15));
		button.setBackground(new Color(255, 0, 0));
		button.setBounds(0, 0, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("\u0392\u0391\u0398\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		button_1.setBackground(new Color(255, 0, 0));
		button_1.setFont(new Font("Calibri", Font.BOLD, 12));
		button_1.setBounds(520, 461, 106, 34);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u03A1\u0399\u039E\u0395");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(255, 0, 0));
		button_2.setBounds(154, 200, 83, 16);
		panel.add(button_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Basic_Table.class.getResource("/images/\u03C4\u03B5\u03BB\u03B9\u03BA\u03B7.jpg")));
		lblNewLabel.setBounds(0, 0, 626, 496);
		panel.add(lblNewLabel);
		
		this.setVisible(true);   //κάνει το παράθυρο ορατό στην οθόνη
		this.setSize(640,533);  //διαστάσεις
		this.setTitle("My first Frame!"); //ονομασία
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //τερματισμός εφαρμογης, οταν πατάς το Χ στο παράθυρο
	}
	
	

}
