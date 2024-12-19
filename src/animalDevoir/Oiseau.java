package animalDevoir;

public class Oiseau extends Animal {

	private int hauterVolMax;
	private String couleurPlumes;
	
	public Oiseau(String nom, int age, String espece, double poids, int hauterVolMax, String couleurPlumes) {
		super(nom, age, espece, poids);
		this.hauterVolMax = hauterVolMax;
		this.couleurPlumes = couleurPlumes;
	}
	
	public void voler(int hauteur) {
		if (hauteur > this.hauterVolMax ) {
			this.hauterVolMax = hauteur;
			System.out.println(this.nom + " is flying higher than ever before at " + hauteur + "meters");
		} else {
			System.out.println(this.nom + " is flying at " + hauteur + ", nothing too remarkable");
		}
	}
	
	public void picorer(double quantiteNourriture) {
		this.manger(quantiteNourriture);
		System.out.println("The bird pecks at its food");
	}
	
	public void crier() {
		System.out.println("Chirp chirp");
	}
	
}
