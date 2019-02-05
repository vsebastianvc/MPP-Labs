package Prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	
	PersonWithJob(String n, double s) {
		this.person=new Person(n);
		salary = s;
	}
	
	public Person getPerson() {
		return person;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) {
			return false;
		}
		if(aPerson.getClass() != getClass()) {
			return person.equals(aPerson);
		}
		PersonWithJob p = (PersonWithJob) aPerson;
		return person.getName().equals(p.person.getName()) && this.getSalary() == p.getSalary();
	}
	
	/*
	 * public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}*/
	public static void main(String[] args) {
		// Original problem , happend because the object p2 is  type Person and 
		// the object p1 is type PersonWithJob and it doesn't mean that a Person is a PersonWithJob but in the condition 
		//if(!(aPerson instanceof PersonWithJob)) return true and then return false.
		
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
