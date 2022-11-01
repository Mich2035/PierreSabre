package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println("("+this.nom+")-" + texte + " ");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}

	public void boire() {
		parler("Mmmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche.Je vais pouvoir m'offrir une " + bien + " à " + prix
					+ " sous");
		} else {
			parler("Je n'ai plus que " + this.argent + " en poche." + "Je ne peux meme pas m'offrir un " + bien + " à "
					+ prix + "sous");
		}
	}

	public int gagnerArgent(int gain) {
		argent = argent + gain;
		return argent;

	}

	public int perteArgent(int perte) {
		argent = argent - perte;
		return argent;
	}
}
