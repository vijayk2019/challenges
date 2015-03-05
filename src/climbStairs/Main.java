package climbStairs;

import java.io.*;
import java.util.*;

public class Main {

	public static HashSet ways = new HashSet();
	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		ways.add(1);// intial ways to add in set
		ways.add(2);// intial ways to add in set
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				if (ways.contains(1)) {
					// System.out.println(1);
				}
				if (ways.contains(2)) {
					// System.out.println(2);
				}

				System.out.println("input: " + Integer.parseInt(line));
				System.out.println(climbWays(Integer.parseInt(line)));

			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}
	}

	public static int climbWays(int input) {
		if (ways.contains(input)) {
			System.out.println("Contains input:" + input);
			return input;
		}

		int result = climbWays(input - 1) + climbWays(input - 2);
		// System.out.println("result : "+ result);
		if (!ways.contains(input)) {
			ways.add(result);
			count++;
			System.out.println("result added in set: " + result + " Count: "
					+ count);
		}
		return (result);
	}

}
