import java.util.ArrayList;
import java.util.Random;

public class Karta extends Koutaki{
private ArrayList <String> kartes_klefti;
private ArrayList <String> kartes_astunomou;

	
	public Karta(String onoma,ArrayList <String> kartesKlefti,ArrayList <String> kartesAstunomou) {
		super(onoma);
		this.kartes_klefti=kartesKlefti;
		this.kartes_astunomou=kartesAstunomou;
	}


	public ArrayList<String> getKartes_klefti() {
		return kartes_klefti;
	}


	public ArrayList<String> getKartes_astunomou() {
		return kartes_astunomou;
	}
	public int Epilogi_Kartas( Paiktis p)
	{
		int apotelesma=0;
		String epilegmeni_karta=null;
		if(p instanceof Kleftis)
		{
			int arithmosKartwn= kartes_klefti.size();
			
			Random rand = new Random();
			apotelesma = rand.nextInt(arithmosKartwn) + 1;
			
			epilegmeni_karta=kartes_klefti.get(apotelesma);
			
		}
	
		
		if(p instanceof Astinomikos)
		{
			int arithmosKartwn= kartes_astunomou.size();
			
			Random rand = new Random();
			apotelesma = rand.nextInt(arithmosKartwn) + 1;
			
			epilegmeni_karta= kartes_astunomou.get(apotelesma);
			
		}
		
		System.out.println(epilegmeni_karta);
		return apotelesma;
	}
	
	
	public void EktelesiKartas (int arithmos_kartas,Paiktis paiktis)
	{
		
	}
	
	
	public int getPoso() {
		return 0;
	}

	public int getXronos_anamonis() {
		return 0;
	}

	public int getZoes_ktiriou() {
		return 0;
	}
	
	public boolean diarkia_anamonis_ktiriou()
	{
		return false;
	}


	@Override
	public void epilogi_1or2or3() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void DecZwes() {
		// TODO Auto-generated method stub
		
	}
}
