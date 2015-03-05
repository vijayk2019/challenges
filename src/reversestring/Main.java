package reversestring;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				String result = "";
				String[] currentword = line.split("[ \t]+");
				for (int i = currentword.length - 1; i >= 0; i--) {
					result += currentword[i] + " ";
				}

				System.out.println(result.trim());

			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}

	}

}
