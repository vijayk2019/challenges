package pileOfBricks;

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
				double length_hole = -1.0, width_hole = -1.0;
				String[] firstdiv = line.split("\\|");
				String[] twoD_ip = firstdiv[0].split("\\s+"); // Seperating hole
																// inputs in 2
																// strings
				int x1 = Integer.parseInt(twoD_ip[0].substring(1,
						twoD_ip[0].indexOf(",")));// hole input
				int y1 = Integer.parseInt(twoD_ip[0].substring(
						twoD_ip[0].indexOf(",") + 1, twoD_ip[0].length() - 1));// hole
																				// input
				int x2 = Integer.parseInt(twoD_ip[1].substring(1,
						twoD_ip[1].indexOf(",")));// hole input
				int y2 = Integer.parseInt(twoD_ip[1].substring(
						twoD_ip[1].indexOf(",") + 1, twoD_ip[1].length() - 1));// hole
																				// input
				hole hole1 = new hole(x1, y1, x2, y2);
				String[] bricksdiv = firstdiv[1].split(";");// separating bricks
				String result = null;
				for (int i = 0; i < bricksdiv.length; i++) {
					String[] lastdiv = bricksdiv[i].split("\\s+");
					int index = Integer.parseInt(lastdiv[0].substring(1,
							lastdiv[0].length()));
					int bric_x = Integer.parseInt(lastdiv[1].substring(1,
							lastdiv[1].indexOf(",")));
					int bric_y = Integer.parseInt(lastdiv[1].substring(
							lastdiv[1].indexOf(",") + 1,
							lastdiv[1].lastIndexOf(",")));
					int bric_z = Integer.parseInt(lastdiv[1].substring(
							lastdiv[1].lastIndexOf(",") + 1,
							lastdiv[1].length() - 1));
					int bric_x2 = Integer.parseInt(lastdiv[2].substring(1,
							lastdiv[2].indexOf(",")));
					int bric_y2 = Integer.parseInt(lastdiv[2].substring(
							lastdiv[2].indexOf(",") + 1,
							lastdiv[2].lastIndexOf(",")));
					int bric_z2 = Integer.parseInt(lastdiv[2].substring(
							lastdiv[2].lastIndexOf(",") + 1,
							(lastdiv[2].length() - 2)));
					bricks brickObj = new bricks(bric_x, bric_y, bric_z,
							bric_x2, bric_y2, bric_z2);
					if (brickObj.length <= hole1.length
							&& brickObj.height <= hole1.height) {
						if (result == null) {
							result = lastdiv[0].substring(1,
									lastdiv[0].length());
						} else {
							result += "," + index;
						}
					}

				}
				if (result != null) {
					System.out.println(result);
				} else {
					System.out.println("-");
				}
			}// while loop ends here
			bufferedReader.close();
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'     " + ex);
			ex.printStackTrace();
		}
	}// main ends here

}

final class hole {
	public double height = 0.0, length = 0.0;
	int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

	hole(int x1, int y1, int x2, int y2) {
		height = Math.abs(y2 - y1);
		length = Math.abs(x2 - x1);
	}
}

final class bricks {
	public double height = 0.0, length = 0.0;
	int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

	bricks(int x1, int y1, int z1, int x2, int y2, int z2) {
		height = Math.abs(z1 - z2);
		length = Math.abs(x1 - x2);
	}
}