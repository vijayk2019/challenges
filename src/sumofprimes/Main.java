package sumofprimes;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int summation = 1;
		int primecount = 0;
		int numbers = 0;

		while (primecount < 1000) {
			numbers++;
			if (numbers % 2 != 0) { // doesn't check if number is even
				if (isPrimenum(numbers)) {
					summation += numbers;
					primecount++;
				}
			}
		}
		System.out.println(summation);
	}

	// Returns whether the given integer is prime
	public static boolean isPrimenum(int num) {
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
