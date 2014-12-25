package findawriter;
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
		
		while((line = bufferedReader.readLine()) != null){
			String[] sentence = line.split("\\|");
			String firstpart = sentence[0]; 
			String writer = ""; 
			String[] key = sentence[1].trim().split("[ \t]+"); 
			for (int i = 0; i < key.length; i++) {
				int index = Integer.parseInt(key[i]) - 1;
				writer += firstpart.charAt(index) + ""; 
			}
			
			System.out.println(writer); 
			}
		}//try ends here
		catch(Exception ex){
			System.out.println("Unable to open file '" + path + "'");
		}
	}

}
