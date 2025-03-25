package proiectmasina;

public class SistemAudio extends Configurare{
	
	public SistemAudio(Masina masinaConfigurata) {
		super(masinaConfigurata);
		
	}
	@Override
	public String Descriere() {
		return masinaConfigurata.Descriere()+",Sistem Audio Harman/Kardon";
		
	}
	@Override
	public int Pret() {
		return masinaConfigurata.Pret()+ 200 ;
	}
}
