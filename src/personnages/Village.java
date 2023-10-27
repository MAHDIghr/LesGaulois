package personnages;

import java.util.Arrays;

public class Village {

	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] Villageois;

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		Villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gauloi) {
		int i = 0;
		while (Villageois[i] != null) {
			i++;
		}
		Villageois[i] = gauloi;
		nbVillageois++;
	}

	public Gaulois trouverHabitant(int numHabitant) {
		return Villageois[numHabitant];
	}
	
	public void afficherVillageois() {
		System.out.println("Bienvenu au village : "+ getNom() +" \nle chef de ce village est : "
				+ chef.getNom() + "\n\ndans ce village on trouve les magnifiques gaulois : \n");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(Villageois[i].getNom());
		}
	}

	@Override
	public String toString() {
		return "Village [nom=" + nom + ", chef=" + chef + ", nbVillageois=" + nbVillageois + ", Villageois="
				+ Arrays.toString(Villageois) + "]";
	}
	


	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		Chef Abraracourcix = new Chef("Abraracourcix", 6, 0, village);
		village.chef = Abraracourcix;
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("obelix", 8);
		village.ajouterHabitant(Obelix);
		village.ajouterHabitant(Asterix);
		
		village.afficherVillageois();

	}
}