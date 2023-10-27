package scenario;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Histoire {

	public static void main(String[] args) {

		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 25);
		Romain Minus = new Romain("Minus", 6);
		Druide Panoramix = new Druide("Panoramix", 10, 5);

		Panoramix.parler("Je vais aller préparer une petite potion...");
		Panoramix.preparePotion();
		Panoramix.booster(Obelix);
		Obelix.parler("Par Bélénos, ce n'est pas juste !");
		Panoramix.booster(Asterix);
		Asterix.parler("Bonjour");
		Minus.parler("gau un gau gau ....");
		Asterix.frapper(Minus);

	}

}