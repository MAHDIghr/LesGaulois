package personnages;

public class Romain {
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force >= 0 : "erreur : la force ne peut pas etre negative ";
	}

	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "erreur : la force d'un romain ne peut pas etre negative ";
		int forceDebut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("AIE");
		} else {
			parler("j abandonne .. ");
		}
		assert forceDebut < force : " erreur : la force du romain n'a pas deminuee ";
	}
	
	public void sEquiper(Equipement equipement) {
		
		
	}

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		System.out.println(Minus);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);

	}

}
