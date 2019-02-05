package prob2;

public class StringUtility {
	public static int countLetters(String args) {
		if (args == null) {
			return 0;
		}
		return args.length();

	}

	public static String reverseLetters(String str) {
		if (str == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();

	}

	public static String removeDuplicates(String args) {
		if (args == null) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		String[] container = args.split("");

		for (String string : container) {
			if (!builder.toString().contains(string)) {
				builder.append(string);
			}

		}
		return builder.toString();

	}
}
