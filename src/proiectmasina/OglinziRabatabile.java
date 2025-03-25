package proiectmasina;

public class OglinziRabatabile extends Configurare{

	public OglinziRabatabile(Masina masinaConfigurata) {
		super(masinaConfigurata);
		
	}
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere()+", Oglinzi Rabatabile";
		
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret()+ 150 ;
	}
}
