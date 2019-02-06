package lesson7.labs.prob4;

public interface FlyBehavior {
	public default void fly() {
	   System.out.println("    Fly with wings");
	};
}
