package objectOriented.exempleHeritage;

public class Developper extends Employee {

	private String language;

	public Developper(String name, int age, String salary, String language) {
		super(name, age, salary);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
