package iut.bad;

public class Femme extends Humain {
    public Femme() {}
    
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

	/**
	 * @return
	 */
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}
}