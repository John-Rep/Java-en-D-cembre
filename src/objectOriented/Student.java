package objectOriented;

public class Student {
	
//	Les attribus
	
	private String name;
	private int age;
	private Note[] grades;
	
//	Les constructeurs
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.grades = new Note[5];
	}
	
	public Student(String name, int age, Note[] grades) {
		this.name = name;
		this.age = age;
		this.grades = grades;
	}
	
	public double WeightedAvg() {
		int grades = 0;
		int coefs = 0;
		for (int i = 0; i < this.grades.length; i++) {
			grades += this.grades[i].getGrade() * this.grades[i].getCoef();
			coefs += this.grades[i].getCoef();
		}
		return (double) grades / coefs;
	}
	
	public double Average() {
		int grades = 0;
		int coefs = 0;
		for (Note note: this.grades) {
			grades += note.getGrade() * note.getCoef();
			coefs += note.getCoef();
		}
		return (double) grades / coefs;
	}
	
	public double GradesAvg() {
		int grades = 0;
		for (int i = 0; i < this.grades.length; i++) {
			grades += this.grades[i].getGrade();
		}
		return (double) grades / this.grades.length;
	}
	
	public String getAllInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ": " + age + " ans \n");
		sb.append("Notes: \n");
		for (Note note : grades) {
			sb.append("   " + note.getSubject() + ": "
					+ note.getGrade() + " ("
					+ note.getCoef() + ") \n");
		}
		sb.append("Moyenne: " + Average());
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Note[] getGrades() {
		return grades;
	}

	public void setGrades(Note[] grades) {
		this.grades = grades;
	}

}
