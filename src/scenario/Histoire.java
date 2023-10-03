package scenario;

import personnages.Gaulois;
import personnages.Romain;

public class Histoire {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Romain Minus = new Romain("Minus", 6);
		
		Asterix.parler("Bonjour A tous");
		Minus.parler("un gau ... Un gaugau ....");
		Asterix.frapper(Minus);
		
		
		
		

	}

}
