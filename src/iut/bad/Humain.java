package iut.bad;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    
    
    public Humain() {}
    
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    public void details() {
        System.out.println(toString());
    }

	/**
	 * @return
	 */
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}
	
	@Override
	public void manger() {
	    System.out.println("Je mange");
	}

	@Override
	public void boire() {
	    System.out.println("Je bois");
	}
}