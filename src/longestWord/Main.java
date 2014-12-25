package longestWord;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
				//file logic goes here
				String path = args[0];
				String line = null;
				try{
				FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				while((line = bufferedReader.readLine()) != null){
					
						String String_long = ""; 
						Scanner Scan = new Scanner(line); 
						while(Scan.hasNext()) {
							String fetched_word = Scan.next();
							if ((fetched_word.length()) > (String_long.length())) {
								String_long = fetched_word;
							}
						}
						System.out.println(String_long); 
					}
				}//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'"+ex);
				}

	}

}
