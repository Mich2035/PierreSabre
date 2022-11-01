package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom,String boisson,int argent) {
		super(nom,boisson,argent);
	}
	

	@Override
	public void direBonjour() {

		super.direBonjour();
	}


	public void donnner(Commercant beneficiaire) {
		int argentdonné=(getArgent()*10)/100;
		super.parler(beneficiaire.getNom()+" prend ces "+argentdonné+" sous");
		beneficiaire.recevoir(argentdonné);
	}

}