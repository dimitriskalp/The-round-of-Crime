import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Table extends JFrame{
	private Pawn pawn;             // Περιέχει την εικόνα του ταμπλό και το πιόνι
	private tablo t;
	private JTextField textField;
	private JButton buttonzari;
	private JButton buttonmenu;
	private JButton buttonbathm;
	private int number=0;
	private int thesi=0;
	private int thesi1=16;
	private ArrayList <Paiktis> paiktes;
	private  tablo tablPaix;
	private int x1=113,y1=548,x2=700,y2=130;
	
	
	public Table(ArrayList <Paiktis> p,tablo t) {
		tablPaix=t;
		paiktes=p;
		
		
	  //  getContentPane().setLayout(null);
		pawn=new Pawn();
		this.setContentPane(pawn);
		
		
		JButton buttonmenu = new JButton("\u039C\u0395\u039D\u039F\u03A5");
		buttonmenu.setForeground(Color.WHITE);
		buttonmenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		buttonmenu.setBackground(Color.RED);
		buttonmenu.setBounds(10, 11, 98, 43);
		getContentPane().add(buttonmenu);
		buttonmenu.setActionCommand("MENU");
		
		JButton buttonzari = new JButton("\u03A1\u0399\u039E\u0395");
		buttonzari.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonzari.setBackground(Color.GREEN);
		buttonzari.setBounds(226, 280, 89, 23);
		getContentPane().add(buttonzari);
		buttonzari.setActionCommand("ZARI");
		
		JButton buttonbathm = new JButton("\u0392\u0391\u0398\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		buttonbathm.setForeground(Color.WHITE);
		buttonbathm.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonbathm.setBackground(Color.RED);
		buttonbathm.setBounds(711, 637, 138, 43);
		getContentPane().add(buttonbathm);
		buttonbathm.setActionCommand("BATHMOLOGIA");
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBackground(new Color(128, 0, 0));
		textField.setBounds(305, 320, 42, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		ButtonListener listener = new ButtonListener();
		buttonmenu.addActionListener(listener);
		buttonzari.addActionListener(listener);
		buttonbathm.addActionListener(listener);
		
		
		this.setVisible(true);   //κάνει το παράθυρο ορατό στην οθόνη
		this.setSize(875,730);  //διαστάσεις
		this.setTitle("My first Frame!"); //ονομασία
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
	}
	
	class Pawn extends JLabel{
		
		public void paint(Graphics g){
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setIcon(new ImageIcon(Table.class.getResource("/images/\u03A4\u03B1\u03BC\u03C0\u03BB\u03CC.jpg")));
			lblNewLabel.setBounds(0, 0, 867, 694);
			getContentPane().add(lblNewLabel);
			
			super.paint(g);
			
			g.setColor(Color.RED);
			g.fillOval(x1, y1, 30, 30);
			g.setColor(Color.BLUE);
			g.fillOval(x2, y2, 30, 30);
		}
		
		public void setXYCoordinates(int dice,int number) {		//Ενημερώνει τις συντεταγμένες x και y
			int Corner1=7;
			int Corner2=16;
			int Corner3=23;
			int Corner4=32;
			if (number==0){
				if(thesi<Corner1) {
					if(dice<=Corner1-thesi) {
						x1=x1;
						y1=y1-(dice*60);
					}
					else {
						int moveY=Corner1-thesi;
						int moveX=dice-moveY;
						y1=y1-(moveY*60);
						x1=x1+(moveX*65);
					}
				}
				else if(thesi<Corner2)
				{
					if (dice<=Corner2-thesi) {
						y1=y1;
						x1=x1+(dice*65);
					}
					else {
						int moveX=Corner2-thesi;
						int moveY=dice-moveX;
						y1=y1+(moveY*60);
						x1=x1+(moveX*65);
						
					}
				}
				else if(thesi<Corner3) {
					
						if (dice<=Corner3-thesi) {
							y1=y1+(dice*60);
							x1=x1;
						}
						else {
							int moveY=Corner3-thesi;
							int moveX=dice-moveY;
							y1=y1+(moveY*60);
							x1=x1-(moveX*65);
							
						}
					
				}
				else {
					if (dice<=Corner4-thesi) {
						y1=y1;
						x1=x1-(dice*65);
					}
					else
					{
						int moveX=Corner4-thesi;
						int moveY=dice-moveX;
						x1=x1-(moveX*65);
						y1=y1-(moveY*60);
					}
				}
			    
			}
			if (number==1){
				if(thesi1<Corner1) {
					if(dice<=Corner1-thesi1) {
						x2=x2;
						y2=y2-(dice*60);
					}
					else {
						int moveY=Corner1-thesi1;
						int moveX=dice-moveY;
						y2=y2-(moveY*60);
						x2=x2+(moveX*65);
					}
				}
				else if(thesi1<Corner2)
				{
					if (dice<=Corner2-thesi1) {
						y2=y2;
						x2=x2+(dice*65);
					}
					else {
						int moveX=Corner2-thesi1;
						int moveY=dice-moveX;
						y2=y2+(moveY*60);
						x2=x2+(moveX*65);
						
					}
				}
				else if(thesi1<Corner3){
					 
						if (dice<=Corner3-thesi1) {
							y2=y2+(dice*60);
							x2=x2;
						}
						else {
							int moveY=Corner3-thesi1;
							int moveX=dice-moveY;
							y2=y2+(moveY*60);
							x2=x2-(moveX*65);
							
						}
				}
				else {
					if (dice<=Corner4-thesi1) {
						y2=y2;
						x2=x2-(dice*65);
					}
					else
					{
						int moveX=Corner4-thesi1;
						int moveY=dice-moveX;
						x2=x2-(moveX*65);
						y2=y2-(moveY*60);
					}
				}
				
			}
		
		}
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
			if(e.getActionCommand().equals("ZARI"))
			{
				 Random rand = new Random();
				 int dice = rand.nextInt(5) + 1;
				 
				 textField.setText(""+dice); 
				 pawn.setXYCoordinates(dice,number);
				 
				
				 pawn.repaint();
				 tablPaix.getPaiktes().get(number).EnimrosiProigoumeniThesi();// παρνει την προηγούμενη θέση του ζαριού
				 tablPaix.getPaiktes().get(number).EnimerosiThesis(dice);
				 tablPaix.kiriaRoi(number);
				 
				 if(number==0) {
					 thesi=(thesi +dice)%32;
					 if (thesi1==thesi)
					 {
						 x2=700;
						 y2=130;
						 x1=698;
						 y1=128;
						 thesi1=16;
						 thesi=16;
					 }
 
					 
					 
				 }
				 if(number==1) {
					 thesi1=(thesi1 +dice)%32;
					 if (thesi1==thesi)
					 {
						 x2=700;
						 y2=130;
						 x1=698;
						 y1=128;
						 thesi1=16;
						 thesi=16;
					 }
				 }
				 number=((number+1)%2);
					
				 
                 
				 				 
				 
				 
				 
			}
	
			
			
		
		}
	}
	
	
}