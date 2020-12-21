import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Stratopedo extends Koutaki{

	public Stratopedo(String onoma) {
		super(onoma);
	}
	
	public void epilogi_1or2or3() {
		Random rand = new Random();
		int apotelesma = rand.nextInt(3) + 1;
		//System.out.println(apotelesma);
		
	    if(apotelesma == 1 ) {
			 JOptionPane.showMessageDialog(null,"Κέρδισες 1.000.000 $");
		}
		else if(apotelesma ==2 ) {
			JOptionPane.showMessageDialog(null,"Έχασες μια ζωή");
		}
		else if(apotelesma ==3 ) {
			JOptionPane.showMessageDialog(null,"Συνεχίζεις το παιχνίδι");
		}
	    
	}

	@Override
	public int getPoso() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getXronos_anamonis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getZoes_ktiriou() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean diarkia_anamonis_ktiriou() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> getKartes_klefti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getKartes_astunomou() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Epilogi_Kartas(Paiktis p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void DecZwes() {
		// TODO Auto-generated method stub
		
	}

}
