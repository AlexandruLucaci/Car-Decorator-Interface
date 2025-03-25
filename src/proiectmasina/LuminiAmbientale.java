package proiectmasina;

public class LuminiAmbientale extends Configurare {

	public LuminiAmbientale(Masina masinaConfigurata) {
		super(masinaConfigurata);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere()+",Lumini Ambientale";
		
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret()+ 250 ;
	}
}