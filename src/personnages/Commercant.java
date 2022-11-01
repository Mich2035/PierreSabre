package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom,String boisson,int argent) {
		super(nom,boisson,argent);
		
	}
	

	@Override
	public void parler(String texte) {
		
		super.parler(texte);
	}


	@Override
	public void direBonjour() {
		
		super.direBonjour();
	}

	@Override
	public void boire() {
		
		super.boire();
	}

	@Override
	public void acheter(String bien, int prix) {
		
		super.acheter(bien, prix);
	}
	public int seFaireExtorquer() {
		int eco=getArgent();
		perteArgent(super.getArgent());	
		parler("J'ai tout perdu!Le monde est trop injuste...");
		
		return eco;
		
		
	}
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
	
		parler(argent+" sous!"+" Je te remercie généreux donateur");
		
	}

	  
}
