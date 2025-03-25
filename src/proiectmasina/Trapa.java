package proiectmasina;

public class Trapa extends Configurare {
	
	public Trapa(Masina masinaConfigurata) {
		super(masinaConfigurata);
		
	}
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere()+",Trapa";
		
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret()+ 100 ;
	}
}
