package sumofdigit;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file logic goes here
				String path = args[0];
				String line = null;
				try{
				FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				while((line = bufferedReader.readLine()) != null){
					Scanner Scan = new Scanner(line); 
					while (Scan.hasNextInt()) {
						int number = Scan.nextInt(); 
						int summation = 0; 
						while (number != 0) {
							summation += number % 10; 
							number /= 10; 
							}
						
						System.out.println(summation); 
						}
					}
				}//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'"+ex);
				}
	}
}
