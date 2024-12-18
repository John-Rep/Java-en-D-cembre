package objectOriented;

public class Note {

	private String subject;
	private int coef;
	private int grade;
	
	public Note(String subject, int coef, int grade) {
		super();
		this.subject = subject;
		this.coef = coef;
		this.grade = grade;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}

