package animalDevoir;

public class Serpent extends Animal {

	private double longueur;
	private boolean venimeux;
	
	public Serpent(String nom, int age, String espece, double poids, double longueur, boolean venimeux) {
		super(nom, age, espece, poids);
		this.longueur = longueur;
		this.venimeux = venimeux;
	}
	
	public void mordre() {
		if (venimeux) {
			System.out.println(this.nom + " has bitten a victim, and it is venimous");
		} else {
			System.out.println(this.nom + " has bitten a victim, and it is not venimous");
		}
		
	}
	
	public void avaler(double quantiteNourriture) {
		this.manger(quantiteNourriture);
		System.out.println("The snake swallows its victim whole!");
	}
	
	public void crier() {
		System.out.println("Sssssss");
	}
	
}
