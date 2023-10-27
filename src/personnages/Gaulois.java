package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String nom;
	private int force;
	private int effetPotion = 1;

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "le gaulois " + nom + ":";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)* effetPotion);
	}

	

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion( int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est "+ forcePotion +" fois décuplée.");
		
	}
	
	public static void main(String[] args) {
		Gaulois mahdi = new Gaulois("mahdi", 10 );
		mahdi.boirePotion(mahdi.force);
	}
}