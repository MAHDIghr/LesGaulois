package personnages;

import java.util.Random;

public class Druide {
	public Druide(String nom, int effetPotionMax, int effetPotionMin) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}

	private String nom;
	private int effetPotionMax;
	private int effetPotionMin;
	private int forcePotion = 1;

	public String getNom() {
		return nom;
	}


	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparePotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax);
		if (forcePotion > 7) {
			System.out.println("je suis "+ getNom() +"  J'ai prepare une super potion de force ! : " + forcePotion);

		} else {
			System.out.println("je suis "+ getNom() +" Je n'ai pas trouve tous les ingredients, ma potion est seulement de force :"
					+ forcePotion);

		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obelix")) {
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix",10, 5);
		System.out.println(Panoramix);
		Panoramix.preparePotion();
		
	}

	

}

