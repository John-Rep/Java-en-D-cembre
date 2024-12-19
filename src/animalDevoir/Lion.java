package animalDevoir;

public class Lion extends Mammifere {

	private int force;
	private int nombreChassesReussies;
	
	public Lion(String nom, int age, String espece, double poids, String habitat,
			int force, int nombreChassesReussies) {
		super(nom, age, espece, poids, habitat);
		this.force = force;
		this.nombreChassesReussies = nombreChassesReussies;
	}

	public void crier() {
		System.out.println("Roar");
	}
	
	public void chasser() {
		this.nombreChassesReussies++;
		System.out.println(this.nom + " has successfully hunted again!");
		System.out.println("Now it has successfully killed " + this.nombreChassesReussies + " of its prey");
	}
	
	public void devorer(double quantiteNourriture) {
		this.manger(quantiteNourriture);
		System.out.println("The lion devours its prey");
	}
	
}
