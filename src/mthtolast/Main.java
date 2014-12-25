package mthtolast;

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
					String[] elements = line.split("[ \t]+");
					String mthtolast_index = elements[elements.length - 1];
					int req_position = Integer.parseInt(mthtolast_index); 
					if (req_position < elements.length) {
						String req_element = elements[elements.length - req_position - 1];
						System.out.println(req_element);
					}
			   }//while loop ends here 
				 bufferedReader.close();	
			 }//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'");
				}
			
			
	}

}
