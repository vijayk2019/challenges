package capitalizewords;
import java.util.*;
import java.io.*;
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
						 	String updated = "";  
				            Scanner Scan = new Scanner(line); 
				            while(Scan.hasNext()) {
				                String nextword = Scan.next(); 
				                updated += Character.toUpperCase(nextword.charAt(0)) + nextword.substring(1) + " "; 
				            }
			            
			            System.out.println(updated.trim()); 
					}
				}//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'"+ex);
				}
	}

}
