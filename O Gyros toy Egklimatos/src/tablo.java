
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
	
	
	  if(paiktes.get(num) instanceof  Kleftis)// αν  παίκτης είναι κλέφτης.
	  {
		 
		 //Έλεγχος αν ο κλέφτης περνά την Φαβέλα 
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
				  if(p.getThesi()== paiktes.get(num).getThesi() && paiktes.get(num).getTrexon_poso() != 0)//Περίπτωση που έχει λεφτά
                   {//να μπεί και η περίπτωση που ο κλέφτης έχει κάρτα ασυλίας.
					  
					  paiktes.get(num).DecZoes();
					  p.IncPoso(paiktes.get(num).getTrexon_poso());//Το ποσό του κλέφτη πηγαίνει στον αστυνόμο 
					  thiefisfree = false;
					  
					  p.pigeneAT(); //πηγαινει στο αστυνομικο τμήμα  ο κλεφτης
					  paiktes.get(num).pigeneAT();//πηγαινει στο αστυνομικο τμημα και ο αστυνομος
					  
                   }
				  if(p.getThesi()== paiktes.get(num).getThesi() && paiktes.get(num).getTrexon_poso() == 0)//χωρίς λεφτά
				  {
					  p.DecZoes();
					  p.pigeneAT(); //πήγαινει τον αστυνομικό στο στην αφετηρία του.
					  
				  }
			  }
			  
			  
		  }
		  
		  
		  if(thiefisfree==true)
		  {
			  
		     int trexwnKtirio=paiktes.get(num).getThesi();
		     
		     if (tabloPaixnidiou.get(trexwnKtirio) instanceof Afetiria )//Περιπτωση που ο κλεφτης φτανει σε αφετηρια
		      {
		    	  if(paiktes.get(num).getThesi()==16) //16 ειναι το νουμερο του αστυνομικου τμηματος
		    	  {
		    		  //O κλεφτης πεφετει στο ΑΤ και χάνει τα λεφτά που κουβαλάει
		    		  paiktes.get(num).Midenismos_Trexon_Poso();
		    	  }
		    	 
		    	if(paiktes.get(num).getThesi()==0)//0 ειναι το νουμερο της φαβελας
		    	 {
		    		//O κλεφτης φτάνει στην φαβέλα και εξασφαλίζει τα χρήματα του.
		    		paiktes.get(num).IncPoso(paiktes.get(num).getTrexon_poso());
		    		paiktes.get(num).Midenismos_Arithmos_listion();
		    		paiktes.get(num).Midenismos_Trexon_Poso();
		    	 }
		    	 
		    	 
		     }
		     
		     else if(tabloPaixnidiou.get(trexwnKtirio) instanceof Ktirio)
		      {
			     if(tabloPaixnidiou.get(trexwnKtirio).getZoes_ktiriou() != 0 && paiktes.get(num).getArithmos_listiwn()<3 )
		          {//δεν εχει  γινει η περίπτωση τράπεζας
			    
			           int n = JOptionPane.showConfirmDialog(
			                 null,
			                 "Ληστεύεις?",
			                 "Ερώτηση",
			                 JOptionPane.YES_NO_OPTION);// το yes αντιστοιχει στο 0,το no στπο 1
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
	  
	  }//τελος με το αν είναι κλέφτης
		
		
	  
	  
	  if(paiktes.get(num) instanceof Astinomikos )// αν ο παίκτης είναι αστυνομικός
	  {
		  
		 int trexwnKtirio=paiktes.get(num).getThesi();
		     
		 if (tabloPaixnidiou.get(trexwnKtirio) instanceof Afetiria )//Περιπτωση που ο κλεφτης φτανει σε αφετηρια
		    {
		    	 
		   	  if(paiktes.get(num).getThesi()==0)//0 ειναι το νουμερο της φαβελας
		    	 {
		    		//O αστυνομος φτάνει στην φαβέλα και χάνει μια ζωή.
		   		    paiktes.get(num).DecZoes();
		   		    //paiktes.get(num).pigeneAT();

		    	 }
		    	 
		    	 
		     }
		  
		  
		  
		 for(Paiktis p : paiktes)
		 {
			 if(p instanceof Kleftis)
			 {
				 if(p.getThesi()== paiktes.get(num).getThesi() && paiktes.get(num).getThesi()!=0)//δηλαδη δεν πεφτει με κλεφτη στη φαβελα
				 {
					 if(p.getTrexon_poso()!=0)//αν ο κλέφτη έχει λεφτά δηλαδή έχει κάνει ληστεία
				      {
					    paiktes.get(num).IncPoso(p.getTrexon_poso());//παίρνει το ποσό του κλέφτη
					    paiktes.get(num).pigeneAT();//O αστυνομικό πηγαίνει στο ΑΤ τον κλέφτη που συνέλαβε
					    p.DecZoes();//χάνει μία ζωή ο κλέφτης
					    p.pigeneAT();//πηγαίνει στο ΑΤ ο κλέφτης
				      }
				       else //δηλαδή το ποσό του κλέφτη ειναι 0
				        {
					      paiktes.get(num).DecZoes();//ο κλέφτης χάνει μια ζωή καθως πέφτει σε κουτι που είναι κλέφτης και δεν έχει κανει ληστεια 
				    	  paiktes.get(num).pigeneAT();//πηγαίνει στη αφετηρία του ,δηλαδή το ΑΤ 
				        }
			    }
			 }
			 
			 
		 }
		  
		  
		  
		  
		  
		  
	  }//τέλος με το αν είναι αστυνομικός
		
		
	

	
	
	
	
	
	 
	 
 }
}
	
	 
