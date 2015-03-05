package nonrepeat;

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
				String firstnonrepeat = "";
				for (int i = 0; i < line.length(); i++) {
					String singlechar = line.charAt(i) + "";
					if (!line.substring(0, i).contains(singlechar)
							&& !line.substring(i + 1).contains(singlechar)) {
						firstnonrepeat = singlechar;
						break;
					}
				}
				System.out.println(firstnonrepeat);
			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

}
