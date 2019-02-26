package prob2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	public static String FILE_LOCATION = "src/prob2/output.txt";
	public final static String TO_PRINT = "This is the string to print to file.";

	Properties prop = new Properties();
	FileInputStream input = null;

	void writeText(String filename, String text) {
		try {
			input = new FileInputStream("src/prob2/config.properties");
			prop.load(input);
			FILE_LOCATION = prop.getProperty("path");
			System.out.println(prop.getProperty("path"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try (BufferedWriter buf = new BufferedWriter(new FileWriter(new File(filename)))) {
			buf.write(text);
		} catch (IOException e) {
			LOG.warning("IOException thrown when reading file: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		NewFileIO old = new NewFileIO();
		old.writeText(FILE_LOCATION, TO_PRINT);

	}

}
