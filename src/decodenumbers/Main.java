package decodenumbers;

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
				int count = 0;
				String operate_line = line;
				if ((operate_line.length() == 1) && (isDecodable(operate_line))) {
					count++;
				} else {
					int substring_ptr = 0;
					for (int i = 0; i < operate_line.length(); i++) {

					}

				}

			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

	public static boolean isDecodable(String substring) {

		int input = Integer.parseInt(substring);
		if (input >= 1 && input <= 26) {
			return true;
		}
		return false;
	}
}
