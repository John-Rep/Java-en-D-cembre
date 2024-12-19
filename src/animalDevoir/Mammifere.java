package animalDevoir;

public abstract class Mammifere extends Animal {

	private String habitat;
	
	public Mammifere(String nom, int age, String espece, double poids, String habitat) {
		super(nom, age, espece, poids);
		this.habitat = habitat;
	}
	
	public void deplacer() {
		System.out.println(this.nom + " is walking around in the " + habitat);
	}
	
}
