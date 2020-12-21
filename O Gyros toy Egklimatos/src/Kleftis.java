public class Kleftis extends Paiktis{
private int trexon_poso;
private int arithmos_listiwn;
	
 
 public Kleftis(String name, int thesi, int poso, int zoes,int proigoumeniThesi, int trexon_poso,int arithmos_listwn) {
	super(name, thesi, poso, zoes,proigoumeniThesi);	
    this.arithmos_listiwn=arithmos_listiwn;
    this.trexon_poso=trexon_poso;
 }

public void printInfo()
{
	super.printInfo();
}
 
public int getTrexon_poso() {
	return trexon_poso;
}


public int getArithmos_listiwn() {
	return arithmos_listiwn;
}

public void IncTrexonPoso(int poso_listias)
 {
	 trexon_poso= trexon_poso+poso_listias;
 }
	
 public void IncArithmosListeiwn()
 {
	 arithmos_listiwn = arithmos_listiwn +1; 
 }

 public void Midenismos_Trexon_Poso()
 {
	 trexon_poso=0;
 }

 public void Midenismos_Arithmos_listion()
 {
	 arithmos_listiwn=0;
 }









}
