package countprime;

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

				String[] numbers = line.split(",");
				int intial_num = Integer.parseInt(numbers[0]);
				// System.out.println("intial num: "+intial_num);
				int last_num = Integer.parseInt(numbers[1]);
				// System.out.println("last num: "+last_num);
				int primecount = 0;

				for (int i = intial_num; i <= last_num; i++) {
					if (isPrimenum(i)) {
						primecount++;
						// System.out.println("primecount for : "+ i +" is :"
						// +primecount);
					}
				}

				System.out.println(primecount);
			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

	// Returns whether the given integer is prime
	// Returns whether the given integer is prime
	public static boolean isPrimenum(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
