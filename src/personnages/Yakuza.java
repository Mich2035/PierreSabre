package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=4;

	public Yakuza(String nom,String boisson,int argent,String clan) {
		
		super(nom,boisson,argent);
		this.clan=clan;
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
	public String getClan() {
		return clan;
	}
	public int getReputation() {
		return reputation;
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

	public int perdre() {
		int nouv=getArgent();
		super.perteArgent(getArgent());
		parler("J'ai perdu mon duel et mes "+nouv+" sous,snif...J'ai déshonoré le clan de "+getClan());
		return reputation-=1;
	}

	public int gagner(int gain) {
		int econ=getArgent();
		//int nouv=super.gagnerArgent();
		int nouv=gagnerArgent(9);
		parler("ce ronin pensait vraiment battre "+getNom()+"du clan "+getClan()+"? je l'ai depouillé de ses "+nouv+" sous");
		
		return reputation+=1;
	}

}
