package objectOriented;

public class Main {

	public static void main(String[] args) {
		
		Note[] notes = new Note[] {new Note("Math", 2, 18), new Note("Physics", 1, 17), new Note("Litterature", 3, 14)};
		
		Student john = new Student("John", 23, notes);
		
		System.out.println(john.getAllInfo());
		
		
	}
	
}
