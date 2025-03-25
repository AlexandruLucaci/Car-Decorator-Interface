package proiectmasina;

public class IncarcatorWireless extends Configurare{

	public IncarcatorWireless(Masina masinaConfigurata) {
		super(masinaConfigurata);
		
	}
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere()+",Incarcator Wireless";
		
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret()+ 50 ;
	}
}
