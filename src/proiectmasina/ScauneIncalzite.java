package proiectmasina;

public class ScauneIncalzite extends Configurare {

	public ScauneIncalzite(Masina masinaConfigurata) {
		super(masinaConfigurata);
	}
	
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere()+", Incalzire Prin Scaune";
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret()+ 500;
	}
}