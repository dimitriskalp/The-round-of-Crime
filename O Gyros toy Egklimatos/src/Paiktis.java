
public abstract class Paiktis {

private String name;
private int thesi;
private int proigoumeniThesi;
private int zoes;
private int poso;


public Paiktis(String name,int thesi,int poso,int zoes,int proigoumeniThesi)
{
	this.name=name;
	this.thesi=thesi;
	this.poso=poso;
	this.zoes=zoes;
}


public String getName() {
	return name;
}


public int getProigoumeniThesi() {
	return proigoumeniThesi;
}


public int getThesi() {
	return thesi;
}



public int getZoes() {
	return zoes;
}


public int getPoso() {
	return poso;
}
	
public void  DecZoes()
{
	zoes= zoes-1;
}

public void IncPoso(int p)
{
	poso=poso + p;
}

public void EnimerosiThesis(int zari)
{
  thesi=(thesi+zari) % 32;	
}


public void pigeneAT()
{
	thesi=16;
}

public void printInfo()
{
	
	System.out.println("the name of player is:" +getName());
}

public void EnimrosiProigoumeniThesi()
{
	proigoumeniThesi=thesi;	
}

// abstrac μέθοδοι

abstract public int getTrexon_poso();
abstract public int getArithmos_listiwn();
abstract public void IncTrexonPoso(int posoListias);
abstract public void IncArithmosListeiwn();
abstract public void Midenismos_Trexon_Poso();
abstract public void Midenismos_Arithmos_listion();


public void IncTrexonPoso() {
	// TODO Auto-generated method stub
	
}





}
