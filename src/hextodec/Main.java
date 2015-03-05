package hextodec;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// file logic goes here
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String input_hex = line;
				System.out.println(Integer.parseInt(input_hex, 16));

			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

}
