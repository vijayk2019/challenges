package compressedSequence;

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

				String[] num_sequence = line.split("[ \t]+");
				int default_count = 1;
				int previous_ptr = Integer.parseInt(num_sequence[0]);
				String lineresult = "";
				for (int i = 1; i < num_sequence.length; i++) {
					int current_num = Integer.parseInt(num_sequence[i]);
					if (previous_ptr != current_num) {
						lineresult += default_count + " " + previous_ptr + " ";
						previous_ptr = current_num;
						default_count = 1;
					} else {
						default_count++;
					}
				}

				lineresult += default_count + " " + previous_ptr;

				System.out.println(lineresult);
			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'" + ex);
		}

	}

}
