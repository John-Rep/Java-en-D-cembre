package objectOriented.exempleAbstract;

public class Carre extends Forme {

	private double cote;
	
	public Carre(double cote) {
		this.cote = cote;
	}
	
	public double calculerSurface() {
		return cote * cote;
	}
	
	public double calculerPerimetre() {
		return 4 * cote;
	}
	
}
