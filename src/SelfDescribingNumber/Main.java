import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (SelfDCheck(line)) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
		}// try ends here

		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + ex + "'");
		}
	}

	// Public void main ends here

	public static boolean SelfDCheck(String input) {
		for (int i = 0; i < input.length(); i++) {
			int digit = Integer.parseInt(input.charAt(i) + "");
			int counter = 0;
			for (int j = 0; j < input.length(); j++) {
				if ((input.charAt(j) + "").equals(i + "")) {
					counter++;
				}

			}

			if (counter != digit) {
				return false;
			}
		}
		return true;
	}
}