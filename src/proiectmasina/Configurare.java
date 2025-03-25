package proiectmasina;

public  abstract class Configurare implements Masina  {
	protected Masina masinaConfigurata;
	public Configurare(Masina masinaConfigurata)
	{
		this.masinaConfigurata=masinaConfigurata;
	}
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere();
		
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret();
	}
	
}
