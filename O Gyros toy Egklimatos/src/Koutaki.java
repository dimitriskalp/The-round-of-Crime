import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public abstract class Koutaki {
	
	private String onoma;

	public Koutaki(String onoma) {
		this.onoma = onoma;
	}

	public String getOnoma() {
		return onoma;
	}
	
  abstract public void DecZwes();
  abstract	public int getPoso();
  abstract	public int getXronos_anamonis();
  abstract public int getZoes_ktiriou();
  abstract public boolean diarkia_anamonis_ktiriou();
  abstract public ArrayList<String> getKartes_klefti();
  abstract public ArrayList<String> getKartes_astunomou();
  abstract public int Epilogi_Kartas( Paiktis p);
  abstract public void epilogi_1or2or3();
	
}
