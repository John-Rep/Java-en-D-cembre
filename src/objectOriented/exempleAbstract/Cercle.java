package objectOriented.exempleAbstract;

public class Cercle extends Forme {

	private double diametre;

	public Cercle(double diametre) {
		this.diametre = diametre;
	}

	public double calculerSurface() {
		return Math.PI * Math.pow(diametre / 2, 2);
	}
	
	public double calculerPerimetre() {
		return diametre * Math.PI;
	}
}
