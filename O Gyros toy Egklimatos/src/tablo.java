
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;

public class tablo extends JPanel  {
 private ArrayList<Koutaki> tabloPaixnidiou = new ArrayList<Koutaki>();
 private String name;	
 private ArrayList<Paiktis> paiktes = new ArrayList<Paiktis>();

 
 public tablo (String name)
 {
	 this.name= name;
	/* setLayout(null);
	 
	 JPanel panel_1 = new JPanel();
	 panel_1.setBounds(0, 0, 406, 231);
	 add(panel_1);
	 panel_1.setLayout(null);
	 
	 JButton button = new JButton("\u039D\u0391\u0399");
	 button.setFont(new Font("Tahoma", Font.PLAIN, 17));
	 button.setBounds(100, 149, 77, 33);
	 panel_1.add(button);
	 
	 JButton button_1 = new JButton("\u039F\u03A7\u0399");
	 button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
	 button_1.setBounds(227, 149, 70, 33);
	 panel_1.add(button_1);
	 
	 JTextPane textPane = new JTextPane();
	 textPane.setFont(new Font("Tahoma", Font.BOLD, 17));
	 textPane.setText("\u039B\u0397\u03A3\u03A4\u03A5\u0395\u0399\u03A3;");
	 textPane.setBounds(140, 53, 95, 27);
	 panel_1.add(textPane);*/
 }
 
 public void addKoutaki(Koutaki e)
 {
	 tabloPaixnidiou.add(e);
 }
 
 
 public void addPlayer(Paiktis p)
 {
	 paiktes.add(p);
 }
 
 
 
 public ArrayList<Koutaki> getTabloPaixnidiou() {
	return tabloPaixnidiou;
}

public String getName() {
	return name;
}

public ArrayList<Paiktis> getPaiktes() {
	return paiktes;
}

public void kiriaRoi(int num)
 {
	
	
	  if(paiktes.get(num) instanceof  Kleftis)// ��  ������� ����� �������.
	  {
		 
		 //������� �� � ������� ����� ��� ������ 
         if((paiktes.get(num).getThesi()== 1 || paiktes.get(num).getThesi()== 2 || paiktes.get(num).getThesi()== 3|| paiktes.get(num).getThesi()== 4)
        		 && paiktes.get(num).getProigoumeniThesi()>=28      )
          {
        	 paiktes.get(num).Midenismos_Arithmos_listion();
        	 paiktes.get(num).Midenismos_Arithmos_listion();
        	  System.out.println("You save your money");
          }
		  
		  
		  boolean thiefisfree = true;
		  for(Paiktis p : paiktes)
		  {
			  if(p instanceof Astinomikos)
			  {
				  if(p.getThesi()== paiktes.get(num).getThesi() && paiktes.get(num).getTrexon_poso() != 0)//��������� ��� ���� �����
                   {//�� ���� ��� � ��������� ��� � ������� ���� ����� �������.
					  
					  paiktes.get(num).DecZoes();
					  p.IncPoso(paiktes.get(num).getTrexon_poso());//�� ���� ��� ������ �������� ���� �������� 
					  thiefisfree = false;
					  
					  p.pigeneAT(); //�������� ��� ���������� �����  � �������
					  paiktes.get(num).pigeneAT();//�������� ��� ���������� ����� ��� � ���������
					  
                   }
				  if(p.getThesi()== paiktes.get(num).getThesi() && paiktes.get(num).getTrexon_poso() == 0)//����� �����
				  {
					  p.DecZoes();
					  p.pigeneAT(); //�������� ��� ���������� ��� ���� �������� ���.
					  
				  }
			  }
			  
			  
		  }
		  
		  
		  if(thiefisfree==true)
		  {
			  
		     int trexwnKtirio=paiktes.get(num).getThesi();
		     
		     if (tabloPaixnidiou.get(trexwnKtirio) instanceof Afetiria )//��������� ��� � ������� ������ �� ��������
		      {
		    	  if(paiktes.get(num).getThesi()==16) //16 ����� �� ������� ��� ����������� ��������
		    	  {
		    		  //O ������� ������� ��� �� ��� ����� �� ����� ��� ���������
		    		  paiktes.get(num).Midenismos_Trexon_Poso();
		    	  }
		    	 
		    	if(paiktes.get(num).getThesi()==0)//0 ����� �� ������� ��� �������
		    	 {
		    		//O ������� ������ ���� ������ ��� ����������� �� ������� ���.
		    		paiktes.get(num).IncPoso(paiktes.get(num).getTrexon_poso());
		    		paiktes.get(num).Midenismos_Arithmos_listion();
		    		paiktes.get(num).Midenismos_Trexon_Poso();
		    	 }
		    	 
		    	 
		     }
		     
		     else if(tabloPaixnidiou.get(trexwnKtirio) instanceof Ktirio)
		      {
			     if(tabloPaixnidiou.get(trexwnKtirio).getZoes_ktiriou() != 0 && paiktes.get(num).getArithmos_listiwn()<3 )
		          {//��� ����  ����� � ��������� ��������
			    
			           int n = JOptionPane.showConfirmDialog(
			                 null,
			                 "���������?",
			                 "�������",
			                 JOptionPane.YES_NO_OPTION);// �� yes ����������� ��� 0,�� no ���� 1
                       if(n==0)
                        {
                	       tabloPaixnidiou.get(trexwnKtirio).DecZwes();
                	       int posoListias = tabloPaixnidiou.get(trexwnKtirio).getPoso();
                	       paiktes.get(num).IncTrexonPoso(posoListias);
                	       paiktes.get(num).IncArithmosListeiwn();
                	   
                        }
		       }
			     

		   }
		    
		    
		    
		 }  
	  
	  }//����� �� �� �� ����� �������
		
		
	  
	  
	  if(paiktes.get(num) instanceof Astinomikos )// �� � ������� ����� �����������
	  {
		  
		 int trexwnKtirio=paiktes.get(num).getThesi();
		     
		 if (tabloPaixnidiou.get(trexwnKtirio) instanceof Afetiria )//��������� ��� � ������� ������ �� ��������
		    {
		    	 
		   	  if(paiktes.get(num).getThesi()==0)//0 ����� �� ������� ��� �������
		    	 {
		    		//O ��������� ������ ���� ������ ��� ����� ��� ���.
		   		    paiktes.get(num).DecZoes();
		   		    //paiktes.get(num).pigeneAT();

		    	 }
		    	 
		    	 
		     }
		  
		  
		  
		 for(Paiktis p : paiktes)
		 {
			 if(p instanceof Kleftis)
			 {
				 if(p.getThesi()== paiktes.get(num).getThesi() && paiktes.get(num).getThesi()!=0)//������ ��� ������ �� ������ ��� ������
				 {
					 if(p.getTrexon_poso()!=0)//�� � ������ ���� ����� ������ ���� ����� �������
				      {
					    paiktes.get(num).IncPoso(p.getTrexon_poso());//������� �� ���� ��� ������
					    paiktes.get(num).pigeneAT();//O ���������� �������� ��� �� ��� ������ ��� ��������
					    p.DecZoes();//����� ��� ��� � �������
					    p.pigeneAT();//�������� ��� �� � �������
				      }
				       else //������ �� ���� ��� ������ ����� 0
				        {
					      paiktes.get(num).DecZoes();//� ������� ����� ��� ��� ����� ������ �� ����� ��� ����� ������� ��� ��� ���� ����� ������� 
				    	  paiktes.get(num).pigeneAT();//�������� ��� �������� ��� ,������ �� �� 
				        }
			    }
			 }
			 
			 
		 }
		  
		  
		  
		  
		  
		  
	  }//����� �� �� �� ����� �����������
		
		
	

	
	
	
	
	
	 
	 
 }
}
	
	 
