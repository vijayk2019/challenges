package wordstodigit;

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

			while ((line = bufferedReader.readLine()) != null) {

				String[] wordsfordigit = line.split(";");
				int not_proper_flag = 0;
				String[] digitwordmap = { "zero", "one", "two", "three",
						"four", "five", "six", "seven", "eight", "nine" };

				for (int i = 0; i < wordsfordigit.length; i++) {// for loop for
																// al words in
																// line. ;
																// seperated.

					for (int j = 0; j < digitwordmap.length; j++) {// for loop
																	// for
																	// checking
																	// if words
																	// in line
																	// has
																	// corresponding
																	// digit
																	// mapped
																	// and print
																	// it.
						if (wordsfordigit[i].equals(digitwordmap[j])) {
							System.out.print(j);
							not_proper_flag = 1;
						}
					}
					if (not_proper_flag != 1) {
						System.out.print(-1);
						not_proper_flag = 0;
					}
				}
				System.out.println();

			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'" + ex);
		}

	}

}
