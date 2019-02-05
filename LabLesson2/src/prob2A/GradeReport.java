package prob2A;

public class GradeReport {
	private String grade;
	public Student student;
	
	public GradeReport(Student st) {
		this.student=st;

	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

}
