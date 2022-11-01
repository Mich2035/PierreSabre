package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("prof", "kombucha", 44);

		prof.direBonjour();
		prof.boire();
		prof.acheter("boisson", 12);
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);

	}
}