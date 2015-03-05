package longestline;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// file logic goes here
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int max_print = Integer.parseInt(bufferedReader.readLine()); // first
																			// line
																			// containing
																			// max
																			// lines
																			// to
																			// print
			String string_start = bufferedReader.readLine(); // First string in
																// file
			List<String> result = new ArrayList<String>();
			result.add(string_start); // Storing results in list

			while ((line = bufferedReader.readLine()) != null) {

				String next = line;
				for (int i = 0; i < result.size(); i++) {

					if (next.length() > result.get(i).length()) {
						result.add(i, next);
						break;
					}

					if (next.length() <= result.get(result.size() - 1).length()) {
						result.add(next);
						break;
					}

				}

			}// while loop ends here
			bufferedReader.close();

			for (int j = 0; j < max_print; j++) {
				System.out.println(result.get(j)); // printing result
			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}

	}// main function ends here

}
