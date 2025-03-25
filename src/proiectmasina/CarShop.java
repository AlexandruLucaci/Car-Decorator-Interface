package proiectmasina;

public class CarShop {

	public static void main(String[] args) {
		Masina masina = new MasinaDeBaza();
		System.out.println(masina.Descriere()+" €"+masina.Pret());

		masina = new LuminiAmbientale(masina);
		System.out.println(masina.Descriere()+" €"+masina.Pret());

		masina = new OglinziRabatabile(masina);
		System.out.println(masina.Descriere()+" €"+masina.Pret());
		
		masina = new ScauneIncalzite(masina);
		System.out.println(masina.Descriere()+" €"+masina.Pret());
	}
}
