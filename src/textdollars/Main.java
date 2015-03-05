package textdollars;

import java.io.*;
import java.util.*;

public class Main {

	public static final String[] less20 = { "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (Integer.parseInt(line) == 0) {
					continue;
				}
				System.out.println(dollarsToText(Integer.parseInt(line))
						+ "Dollars");

			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

	public static String dollarsToText(int num) {
		String result = null;
		if (num < 20 && num > 0) {
			return less20[num - 1];
		} else if (num < 100) {
			if (num >= 20 && num < 30) {
				result = "Twenty";
			}
			if (num >= 30 && num < 40) {
				result = "Thirty";
			}
			if (num >= 40 && num < 50) {
				result = "Forty";
			}
			if (num >= 50 && num < 60) {
				result = "Fifty";
			}
			if (num >= 60 && num < 70) {
				result = "Sixty";
			}
			if (num >= 70 && num < 80) {
				result = "Seventy";
			}
			if (num >= 80 && num < 90) {
				result = "Eighty";
			}
			if (num >= 90) {
				result = "Ninety";
			}
			if (num % 10 != 0) {
				result += dollarsToText(num % 10);
			}
			return result;
		} else if (num < 1000) {
			result = dollarsToText(num / 100) + "Hundred";
			if (num % 100 > 0) {
				result += dollarsToText(num % 100);
			}
			return result;
		} else if (num < 1000000) {
			result = dollarsToText(num / 1000) + "Thousand";
			if (num % 1000 > 0) {
				result += dollarsToText(num % 1000);
			}
			return result;
		} else if (num < (int) Math.pow(10, 9)) {
			result = dollarsToText(num / (int) Math.pow(10, 6)) + "Million";
			if (num % 1000 > 0) {
				result += dollarsToText(num % (int) Math.pow(10, 6));
			}
			return result;
		} else {
			result = dollarsToText(num / (int) Math.pow(10, 9)) + "Billion";
			if (num % 1000 > 0) {
				result += dollarsToText(num % (int) Math.pow(10, 9));
			}
			return result;
		}

	}
}
