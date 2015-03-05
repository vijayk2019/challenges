package shortestrepeatstring;

import java.io.*;
import java.util.*;

public class Main {

	public static int searchSmallRepeatString(String inline) {
		int smallsequence = 1;

		for (int i = 0; i < inline.length() - smallsequence; i++) {
			String String1 = inline.substring(0, smallsequence); // Start with
																	// smallest
																	// possible
																	// sequence
																	// to find
																	// common
																	// sequence
																	// and
																	// increment
																	// substring
																	// untill
																	// find
																	// smallest
																	// common
																	// subsequence
			String Strring2 = inline.substring(smallsequence, smallsequence
					+ smallsequence);

			if (String1.equals(Strring2)) {
				return (smallsequence);
			}
			smallsequence++;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				int smallrepeatlength = searchSmallRepeatString(line);

				if (smallrepeatlength == -1) {
					System.out.println(line.length());
				} else {
					System.out.println(smallrepeatlength);
				}
			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'" + ex);
		}
	}

}
