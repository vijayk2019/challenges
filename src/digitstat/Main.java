package digitstat;

import java.io.*;
import java.util.*;

public class Main {

	private static List<Integer> retCircuit(int input) {
		List<Integer> circuits = new ArrayList<Integer>();
		int ptr = input;
		int initial = input;
		while (!circuits.contains(ptr)) {
			circuits.add(ptr);
			ptr = (input *= initial) % 10;
		}
		return circuits;
	}

	private static String retrieveCount(long gap, long extra,
			List<Integer> circuit) {
		long[] counts = new long[10];
		for (int i = 0; i < 10; i++)
			counts[i] = circuit.contains(i) ? gap : 0;
		for (int i = 0; i < extra; i++) {
			int current = circuit.get(i);
			counts[current]++;
		}
		StringBuilder stringRes = new StringBuilder();
		for (int i = 0; i < 10; i++)
			stringRes.append(", " + i + ": " + counts[i]);
		return stringRes.toString().substring(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				String[] splitValues = line.split(" ");
				int number = Integer.valueOf(splitValues[0]);
				long power = Long.valueOf(splitValues[1]);

				List<Integer> circuit = retCircuit(number);
				int cktSize = circuit.size();
				long gap = power / cktSize;
				long difference = gap * cktSize;
				long extra = power - difference;

				System.out.println(retrieveCount(gap, extra, circuit));

			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'");
		}

	}

}
