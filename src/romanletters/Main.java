package romanletters;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String result = "";
				int number = Integer.parseInt(line);
				while (number >= 1000) {
					result += "M";
					number -= 1000;
				}

				if (number >= 900) {
					result += "CM";
					number -= 900;
				}

				if (number >= 500) {
					result += "D";
					number -= 500;
				}

				if (number >= 400) {
					result += "CD";
					number -= 400;
				}

				while (number >= 100) {
					result += "C";
					number -= 100;
				}

				if (number >= 90) {
					result += "XC";
					number -= 90;
				}

				if (number >= 50) {
					result += "L";
					number -= 50;
				}

				if (number >= 40) {
					result += "XL";
					number -= 40;
				}

				while (number >= 10) {
					result += "X";
					number -= 10;
				}

				if (number >= 9) {
					result += "IX";
					number -= 9;
				}

				while (number >= 5) {
					result += "V";
					number -= 5;
				}

				if (number >= 4) {
					result += "IV";
					number -= 4;
				}

				while (number >= 1) {
					result += "I";
					number--;
				}

				System.out.println(result);
			}

		}
		// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

}
