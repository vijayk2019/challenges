package BitPositions;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		String path = args[0];
		String line = null;
		try{
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line = bufferedReader.readLine()) != null){
			String[] inputArgs = line.split(",");
				if(inputArgs.length!=3)
				{
					System.out.println("File not correct. Input in wrong format\n'");
					break;
				}
				Integer n = Integer.parseInt(inputArgs[0]);
				Integer p1 = Integer.parseInt(inputArgs[1]);
				Integer p2 = Integer.parseInt(inputArgs[2]);
				boolean result = bitPositions(n, p1, p2);
				System.out.println(result);
			}
		}//try ends here
		
		catch(Exception ex){
			System.out.println("Unable to open file '" + path +ex+ "'");
		}

	}
	
	private static boolean bitPositions(Integer number, Integer pos1, Integer pos2) {
		if(((number << (32 - pos1) >> 31) ^ (number << (32 - pos2) >> 31)) == 0 ){
			return true;
		}
		else{
			return false;
		}
	}

}
