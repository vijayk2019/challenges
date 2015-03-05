package distancecal;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				Scanner Scan = new Scanner(line);
				String pt1 = Scan.next() + " " + Scan.next();
				String pt2 = Scan.next() + " " + Scan.next();

				int x1 = Integer.parseInt(pt1.substring(1, pt1.indexOf(",")));
				int y1 = Integer.parseInt(pt1.substring(pt1.indexOf(",") + 2,
						pt1.length() - 1));

				int x2 = Integer.parseInt(pt2.substring(1, pt2.indexOf(",")));
				int y2 = Integer.parseInt(pt2.substring(pt2.indexOf(",") + 2,
						pt2.length() - 1));

				double distance = Math.sqrt(Math.pow(x1 - x2, 2)
						+ Math.pow(y1 - y2, 2));

				System.out.println(((int) distance));
			}
		}// try ends here
		catch (Exception ex) {
			System.out.println("Unable to open file '" + path + "'" + ex);
		}

	}
}
