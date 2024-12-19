package animalDevoir;

public abstract class Animal {

	protected String nom;
	private int age;
	private String espece;
	private double poids;
	
	public Animal(String nom, int age, String espece, double poids) {
		this.nom = nom;
		this.age = age;
		this.espece = espece;
		this.poids = poids;
	}
	
	public abstract void crier();
	
	public void afficherInfo() {
		System.out.println("Name: " + nom);
		System.out.println("Age: " + age + " years old");
		System.out.println("Species: " + espece);
		System.out.println("Weight: " + poids);
	}
	
	public void manger(double quantiteNourriture) {
		System.out.println(nom + " ate " + quantiteNourriture + "kgs of food");
		this.poids += quantiteNourriture;
	}
	
	public String getEspece() {
		return this.espece;
	}
	
}
