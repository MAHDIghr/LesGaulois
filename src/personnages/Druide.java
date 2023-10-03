package personnages;

import java.util.Random;


public class Druide {
	public Druide(String nom, int effetPotionMax, int effetPotionMin) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;	
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
			+ effetPotionMax + ".");
	}
	private String nom;
	private int effetPotionMax;
	private int effetPotionMin;
	private int  forcePotion = 1;
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	private void preparePotion() {
		Random random = new Random();
		int effetPotionMax = random.nextInt();
		if (effetPotionMax > 7) {
			System.out.println("« J'ai préparé\r\n" + 
					"une super potion de force » : "+ effetPotionMax);
			
		} else {
			System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est\r\n" + 
					"seulement de force :"+ effetPotionMax);

		}
		
	
	}
	
	public static void main(String[] args) 
		
		Druide Panoramix = new Druide("Panoramix", effetPotionMax, effetPotionMin)
	}


}

