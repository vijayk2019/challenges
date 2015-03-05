package swapcase;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String changedcase = "";
				for (int i = 0; i < line.length(); i++) {
					char singlechar = line.charAt(i);
					if (singlechar >= 'a' && singlechar <= 'z') {
						singlechar = Character.toUpperCase(singlechar);
					} else {
						singlechar = Character.toLowerCase(singlechar);
					}
					changedcase = changedcase + singlechar;
				}
				System.out.println(changedcase);
			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}
}