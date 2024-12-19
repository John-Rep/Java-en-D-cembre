package animalDevoir;

public class Poisson extends Animal{

	private int nombreNageoires;
	private boolean eauDouce;
	
	public Poisson(String nom, int age, String espece, double poids, int nombreNageoires, boolean eauDouce) {
		super(nom, age, espece, poids);
		this.nombreNageoires = nombreNageoires;
		this.eauDouce = eauDouce;
	}
	
	public void nager() {
		System.out.print(this.nom + " is swimming");
		if (this.eauDouce) {
			System.out.println(" in fresh water");
		} else {
			System.out.println(" in salt water");
		}
	}
	
	public void grignoter(double quantiteNourriture) {
		this.manger(quantiteNourriture);
		System.out.println("The fish is nibbling its food");
	}
	
	public void crier() {
		System.out.println("Glou-glou");
	}
	
}
