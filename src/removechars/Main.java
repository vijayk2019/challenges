package removechars;
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
					String[] split = line.split(",");
					String sentence = split[0].trim();
					String chars_remove = split[1].trim();
					String final_out = ""; 
					for (int i = 0; i < sentence.length(); i++) {
						String charString = "" + sentence.charAt(i); 
						if(!chars_remove.contains(charString)){
							final_out = final_out + charString; 
						}
					}
					
					System.out.println(final_out.trim()); 
					
					}//while loop ends here 
				 bufferedReader.close();	
			 }//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'");
				}
	}

}
