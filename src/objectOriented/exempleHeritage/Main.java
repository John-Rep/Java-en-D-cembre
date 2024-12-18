package objectOriented.exempleHeritage;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee("David", 42, "€13000");
		Developper dev1 = new Developper("Duke", 32, "4200€", "Python");

		System.out.println(dev1.getSalary());

		System.out.println(presentation(dev1));

		System.out.println(presentationDev(dev1));

	}

	public static String presentation(Employee emp) {
		return "Bonjour, je suis " + emp.getName();
	}

	public static String presentationDev(Developper dev) {
		return "Bonjour, je suis " + dev.getName() + " et je fais du " + dev.getLanguage();
	}
}
