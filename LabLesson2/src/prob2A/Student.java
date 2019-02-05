package prob2A;

public class Student {

	private String name;
	public GradeReport grade;
	
	public Student(String name) {
		super();
		this.name = name;
		this.grade = new GradeReport(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradeReport getGrade() {
		return grade;
	}

	public void setGrade(GradeReport grade) {
		this.grade = grade;
	}

	public String toString () {
		return this.name;
	}
	
	
	
}
