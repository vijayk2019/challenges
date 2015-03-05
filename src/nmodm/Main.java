package nmodm;

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

				String[] inputs = line.split(",");
				int num1 = Integer.parseInt(inputs[0]);
				int num2 = Integer.parseInt(inputs[1]);
				int division_res = num1 / num2;
				int mod = num1 - (division_res * num2);
				System.out.println(mod);
			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'" + ex);
		}
	}

}
