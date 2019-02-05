package prob4;

public class StudentSectionFactory {

	public static Section createSection(int secNum, String courseName) {
		Section section = new Section();
		section.setCourseName(courseName);
		section.setSectionNumber(secNum);
		return section;
	}
	
	public static Student createStudent(String id, String name) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;
	}
	
	public static void newTranscriptEntry(Student student, Section section, String grade) {
		if(student == null || section == null) {
			throw new IllegalArgumentException("Student or Section cannot be null");
			}
		TranscriptEntry transcriptEntry = TranscriptEntry.newTranscriptEntry(student, section);
		transcriptEntry.grade = grade;
		student.addGrade(transcriptEntry);
		section.addGrade(transcriptEntry);
	}
	
}
