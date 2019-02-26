package lesson9.labs.prob14;

import java.util.Optional;

public class MySingletonLazy {

	private static Optional<MySingletonLazy> singleton = Optional.empty();
	static int count;

	private MySingletonLazy() {
		count++;
	}

	public static MySingletonLazy getIntance() {

		if (!singleton.isPresent()) {
			singleton = Optional.of(new MySingletonLazy());
		}
		return singleton.get();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getIntance().count);
		System.out.println(getIntance().count);
		System.out.println(getIntance().count);
	}

}
