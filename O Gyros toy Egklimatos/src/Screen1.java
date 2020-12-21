
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;



public class Screen1 extends JFrame{
 private JButton btnPaikse;
 private JButton btnKanones;
 private JButton btnEksodos;
 private tablo tablPaix;
 
	public Screen1(tablo t ) {
		tablPaix=t;
		
		setSize(new Dimension(875, 721));
		
		JButton btnPaikse = new JButton("\u03A0\u0391\u0399\u039E\u0395");
		btnPaikse.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPaikse.setForeground(Color.WHITE);
		btnPaikse.setBackground(new Color(255, 0, 0));
		btnPaikse.setActionCommand("PAIKSE");
		
		JButton btnKanones = new JButton("\u039A\u0391\u039D\u039F\u039D\u0395\u03A3");
		btnKanones.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnKanones.setBackground(Color.RED);
		btnKanones.setForeground(Color.WHITE);
		btnKanones.setActionCommand("KANONES");
		
		JButton btnEksodos = new JButton("\u0395\u039E\u039F\u0394\u039F\u03A3");
		btnEksodos.setForeground(Color.WHITE);
		btnEksodos.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEksodos.setBackground(Color.RED);
		btnEksodos.setActionCommand("EXODOS");
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Screen1.class.getResource("/images/\u03B1\u03C1\u03C7\u03B9\u03BA\u03AE.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(345)
					.addComponent(btnPaikse, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(345)
					.addComponent(btnKanones, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(345)
					.addComponent(btnEksodos, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblNewLabel)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(316)
					.addComponent(btnPaikse, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnKanones, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnEksodos, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 691, GroupLayout.PREFERRED_SIZE)
		);
		getContentPane().setLayout(groupLayout);
		
				
		ButtonListener listener = new ButtonListener();
		btnPaikse.addActionListener(listener);
		btnEksodos.addActionListener(listener);
		btnKanones.addActionListener(listener);
		
		this.setVisible(true);   //κάνει το παράθυρο ορατό στην οθόνη
		this.setSize(875,730);  //διαστάσεις
		this.setTitle("My first Frame!"); //ονομασία
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

	}	
	
	
		
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
			
			if (e.getActionCommand().equals("PAIKSE")) {
				     new Screen2(tablPaix);
				     setVisible(false);
			}
			
			if(e.getActionCommand().equals("KANONES"))
			{
			  JOptionPane.showMessageDialog(null, "Κανονες");
			}
			
			if(e.getActionCommand().equals("EXODOS"))
			{			
				System.exit(0);
			}
			
			}



			
			

		
		
	}
}
