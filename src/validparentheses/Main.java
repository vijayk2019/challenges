package validparentheses;

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

				if (validparenth(line)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}
			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'" + ex);
		}

	}

	public static boolean validparenth(String line) {

		Stack<Character> stackforline = new Stack<Character>();

		for (int i = 0; i < line.length(); i++) {
			char currentchar = line.charAt(i);

			if (openBracketchar(currentchar)) {
				stackforline.push(currentchar);
			} else if (stackforline.isEmpty()
					|| !validParaPair(stackforline.pop(), currentchar)) {
				return false;
			}
		}

		return stackforline.isEmpty();
	}

	// function to check opening braces
	public static boolean openBracketchar(char inchar) {
		if (inchar == '(' || inchar == '[' || inchar == '{') {
			return true;
		} else {
			return false;
		}
	}

	// function to check if given two input braces are complete pair or not
	public static boolean validParaPair(char first, char second) {
		if (first == '[') {
			if (second == ']') {
				return true;
			} else {
				return false;
			}
		} else if (first == '{') {
			if (second == '}') {
				return true;
			} else {
				return false;
			}
		} else {
			if (second == ')') {
				return true;
			} else {
				return false;
			}
		}
	}

}
