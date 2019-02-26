package lesson8.labs.prob1;

import java.util.function.Predicate;

public class PartG {

	private String varA = "variableA";
	private Predicate<PartG> predicate = p -> p.equals(this); // this::equals; 

	public PartG(String varA) {
		this.varA = varA;
	}

	public boolean myMethod(PartG cl) {
		return predicate.test(cl);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof PartG))
			return false;
		PartG e = (PartG) obj;
		return e.varA.equals(this.varA);
	}

	public static void main(String[] args) {
		PartG myClassA = new PartG("instanceVarB");
		PartG myClassB = new PartG("instanceVarB");
		boolean result = myClassA.myMethod(myClassB);
		System.out.println(result);
	}

}