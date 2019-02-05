package prob2A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu2 = new Student("Sebastian");
		Student stu1 = new Student("Carlos");
		
		stu2.getGrade().setGrade("A+");
		stu1.getGrade().setGrade("A");
		
		System.out.println("Name: "+stu1.getName() + " grade is: " + stu1.getGrade().getGrade());
		System.out.println("Name: "+stu2.getName() + " grade is: " + stu2.getGrade().getGrade());
		
		GradeReport gra1 = new GradeReport(stu1);
		GradeReport gra2 = new GradeReport(stu2);
		System.out.println("Student that has the Grade Report: " + gra1.getStudent());
		System.out.println("Student that has the Grade Report: " + gra2.getStudent());
	}

}
