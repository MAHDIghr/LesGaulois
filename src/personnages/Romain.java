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
		switch (nbEquipement) {
		case 2:
			System.out.println("« Le soldat " + getNom() + " est déjà bien protégé !  » ");
			break;
		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("« Le soldat " + getNom() + " possède déja " + equipement.getNom() + "!");
			} else {
				this.equipement[1] = equipement;
				nbEquipement++;
				System.out.println(" Le soldat " + getNom() +" s’équipe avec un " + equipement.getNom());
			}
			break;
		default:
			this.equipement[0] = equipement;
			nbEquipement++;
			System.out.println(" Le soldat " + getNom() +" s’équipe avec un " + equipement.getNom());
			break;
		}

	}

	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		System.out.println(Minus);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.BOUCLIER);
		Minus.sEquiper(Equipement.CASQUE);
	}

}
