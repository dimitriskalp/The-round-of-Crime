import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Screen_1 extends JFrame{
	public Screen_1() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 802, 515);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u03A0\u0391\u0399\u039E\u0395");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(321, 233, 156, 44);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u039A\u0391\u039D\u039F\u039D\u0395\u03A3");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_1.setBounds(321, 295, 156, 44);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0395\u039E\u039F\u0394\u039F\u03A3");
		btnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(321, 362, 157, 44);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setIcon(new ImageIcon(Screen_1.class.getResource("/images/\u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u03B3\u03B9\u03B1 netbeans.png")));
		lblNewLabel.setBounds(0, 0, 802, 511);
		panel.add(lblNewLabel);
		
		this.setVisible(true);   //κάνει το παράθυρο ορατό στην οθόνη
		this.setSize(815,550);  //διαστάσεις
		this.setTitle("My first Frame!"); //ονομασία
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //τερματισμός εφαρμογης, οταν πατάς το Χ στο παράθυρο
	}
}
