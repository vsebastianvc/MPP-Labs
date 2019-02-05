package prob4;

class TranscriptEntry {
	
	Student student;
	Section section;
	String grade;
	
	TranscriptEntry() {
		// TODO Auto-generated constructor stub
	}
	
	public Student getStudent() {
		return student;
	}

	public Section getSection() {
		return section;
	}

	private TranscriptEntry(Student student, Section section) {
		this.student = student;
		this.section = section;
	}
	
	public static TranscriptEntry newTranscriptEntry(Student student, Section section) {
		if(student == null)
			throw new NullPointerException("Null student");
		if(section == null)
			throw new NullPointerException("Null section");
		
		return new TranscriptEntry(student, section);
	}
	
	public String toString() {
		return "Student: " + student.getName() + "\n"
				+ "Course name: " + section.getCourseName() + "\n"
				+ "Section number: " + section.getSectionNumber() + "\n"
				+ "Grade: " + grade + "\n";
	}
	
	
}
