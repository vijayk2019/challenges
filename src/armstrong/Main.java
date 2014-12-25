package armstrong;

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
					
						int addition = 0; 
						for (int i = 0; i < line.length(); i++) {
							int singledigit = Integer.parseInt(line.charAt(i) + "");
							double Nth_power = Math.pow(singledigit, line.length());
							addition += Nth_power; 
						}
						
						if (addition == Integer.parseInt(line)) {
							System.out.println("True");
							} 
						else {
							System.out.println("False");
							}
					}
				}//try ends here
				catch(Exception ex){
					System.out.println("Unable to open file '" + path + "'");
				}
	}

}
