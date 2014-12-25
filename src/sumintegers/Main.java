package sumintegers;

import java.io.*;
import java.util.*; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		try{
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int summation = 0; 
		while((line = bufferedReader.readLine()) != null){
			summation = summation + Integer.parseInt(line);
			}
		System.out.println(summation);
		}//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'"+ex);
				}
	}

}
