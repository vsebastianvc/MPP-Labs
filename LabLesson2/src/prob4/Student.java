package prob4;

import java.util.*;

public class Student {
	
	private String id;
	
	String name;
	
	List<TranscriptEntry> grades;
	
	public Student() {
		this.grades = new ArrayList<>();
	}
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
	public void addGrade(TranscriptEntry transcriptEntry) {
		this.grades.add(transcriptEntry);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TranscriptEntry> getGrades() {
		return grades;
	}
	
}
