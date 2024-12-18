package objectOriented.exempleAbstract;

public class Main {

	public static void main(String[] args) {

//		afficherSurface();
		Carre carre = new Carre(20);
		Rectangle rect = new Rectangle(5, 7);
		Cercle cercle = new Cercle(9);
		
		afficherSurface(carre);
		afficherSurface(rect);
		afficherSurface(cercle);
		
	}

	public static void afficherSurface(Forme forme) {
		System.out.println(forme.calculerSurface());
	}

}
