package evenNum;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    	//file logic goes here
    			String path = args[0];
    			String line = null;
    			try{
    			FileReader fileReader = new FileReader(path);
    			BufferedReader bufferedReader = new BufferedReader(fileReader);
    			
    			while((line = bufferedReader.readLine()) != null){
    					Scanner scan = new Scanner(line);
			            int number = scan.nextInt(); 
			            if (number % 2 == 0) {
			                System.out.println(1); 
			            } else {
			                System.out.println(0); 
			            }
    				}
    			}//try ends here
    			catch(Exception ex){
    				System.out.println("Unable to open file '" + path + "'"+ex);
    			}
    }	
}