package animalDevoir;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animaux = new Animal[4];
		animaux[0] = new Lion("Alex", 15, "Lion", 185.3, "Savannah", 14, 29);
		animaux[1] = new Oiseau("Jerry", 7, "Bird", 11.7, 4038, "Yellow");
		animaux[2] = new Serpent("Ekans", 4, "Snake", 63.9, 9.4, true);
		animaux[3] = new Poisson("Nemo", 2, "Fish", 3.7, 2, false);
		
		for (Animal animal : animaux) {
			animal.afficherInfo();
			animal.crier();
			switch(animal.getEspece()) {
				case "Lion":
					((Lion) animal).chasser();
					((Lion) animal).deplacer();
					((Lion) animal).devorer(28.3);
					break;
				case "Bird":
					((Oiseau) animal).voler(5082);
					((Oiseau) animal).picorer(2.4);
					break;
				case "Snake":
					((Serpent) animal).mordre();
					((Serpent) animal).avaler(34.2);
					break;
				case "Fish":
					((Poisson) animal).nager();
					((Poisson) animal).grignoter(1.1);
					break;
			}
			System.out.println();
		}
		
	}
	
}
