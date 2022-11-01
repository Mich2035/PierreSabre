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
		int econ=getArgent();
		int argentdonné=(getArgent()*10)/100;
		super.parler(beneficiaire.getNom()+" prend ces "+argentdonné+" sous");
		beneficiaire.recevoir(argentdonné);
		econ-=argentdonné;
	}
	public void provoquer(Yakuza adversaire) {
		int force=2*honneur;
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fais à ce pauvre marchand!");
			parler("Je t'ai eu petit yakusa");
			super.gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur+=1;
		
			
		} else {
			honneur-=1;
			parler("J'ai perdu contre ce yakuza,mon honneur et ma bourse ont en pris un coup");
			super.perteArgent(getArgent());
			adversaire.gagner(getArgent());
				
			}
			
		}
	}
	

