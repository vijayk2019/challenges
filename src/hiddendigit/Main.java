package hiddendigit;
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
						String lineresult = "";
						for (int i = 0; i < line.length(); i++) {
							char c = line.charAt(i); 
							if (c >= 'a' && c <= 'j') {
								lineresult += c - 'a'; 
							} else if (c >= '0' && c <= '9') {
								lineresult += c; 
							}
						}
						
						if (lineresult.equals("")) {
							System.out.println("NONE");
						} else {
							System.out.println(lineresult);
						}
					}
				}//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'"+ex);
				}
	}

}
