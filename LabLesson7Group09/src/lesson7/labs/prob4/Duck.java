package lesson7.labs.prob4;

public abstract class Duck implements FlyBehavior, QuackBehavior{
	public void swim() {
		System.out.println("    Swiming");
	}
	public void display() {
		System.out.println("    Displaying");
	}

}
