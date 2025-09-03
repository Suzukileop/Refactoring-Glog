package iut.bad;

public class Homme extends Humain {
    public Homme() {}
    
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

	/**
	 * @return
	 */
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}
}