package temp;
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
				System.out.println(line);
				System.out.println();
			   }//while loop ends here 
				 bufferedReader.close();	
			 }//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'");
				}
	}

}
