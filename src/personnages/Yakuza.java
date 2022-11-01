package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;

	public Yakuza(String nom,String boisson,int argent,String clan) {
		
		super(nom,boisson,argent);
	}
	@Override
	public int getArgent() {

		return super.getArgent();
	}

	@Override
	public int gagnerArgent(int gain) {
		
		return super.gagnerArgent(gain);
	}

	
	public void prendreParole() {
		
		super.parler("Tiens,tiens,ne serait-ce pas un faible marchant qui passe par là?");
		super.parler("Marco,si tu tiens à la vie donne moi ta bourse");
		
	}

	@Override
	public void direBonjour() {
		
		super.direBonjour();
	}
	public void extorquer(Commercant victime) {
		int argentVolé=victime.seFaireExtorquer();
		int argent=super.gagnerArgent(argentVolé);
		parler("J'ai piqué les "+argentVolé+" sous de "+victime.getNom()+" ce qui me fait "+argent+" sous dans ma poche.Hi!Hi!");
		reputation+=1;
	}



}
