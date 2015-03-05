package trailingstring;

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

				String[] StringSeparated = line.split(",");
				String FirstString = StringSeparated[0].trim();
				String SecondString = StringSeparated[1].trim();
				if (SecondString.length() > FirstString.length()) {
					System.out.println(0);
				} else {
					String LastPartOfFirstString = FirstString
							.substring(FirstString.length()
									- SecondString.length());

					if (LastPartOfFirstString.equals(SecondString)) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				}

			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

}
