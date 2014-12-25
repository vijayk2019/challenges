package queryboard;
import java.io.*;
import java.util.*; 
public class Main {
	
	//Function for Set and query commands goes here!

	public static void setRowCmd(int row, int value, int[][] array) {
    	for (int i  = 0; i < 256; i++) {
    		array[i][row] = value; 
    	}
    }
    
	public static void setColumnCmd(int column, int value, int[][] array) {
    	for (int i = 0; i < 256; i++) {
    		array[column][i] = value; 
    	}
    }
	
  public static void queryRowCmd(int row, int[][] array) {
	    	int summation = 0; 
	    	for (int i = 0; i < 256; i++) {
	    		summation += array[i][row];
	    	}
	    	System.out.println(summation); 
	    }
  
  public static void queryColCmd(int column, int[][] array) {
  		int summation = 0; 
  		for (int i = 0; i < 256; i++) {
  			summation += array[column][i]; 
  		}
  		System.out.println(summation); 
  }
  
  //Main function starts
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file logic goes here
				String path = args[0];
				String line = null;
				int[][] array = new int[256][256];
				try{
				FileReader fileReader = new FileReader(path);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				while((line = bufferedReader.readLine()) != null){
					
					Scanner Scan = new Scanner(line); 
					String command = Scan.next(); 
					if (command.equalsIgnoreCase("SetCol")) {
						setColumnCmd(Scan.nextInt(), Scan.nextInt(), array);
					} 
					else if (command.equalsIgnoreCase("SetRow")) {
						setRowCmd(Scan.nextInt(), Scan.nextInt(), array);
					} 
					else if (command.equalsIgnoreCase("QueryRow")) {
						queryRowCmd(Scan.nextInt(), array);
					} 
					else {
						queryColCmd(Scan.nextInt(), array);
					}
					
					Scan.close();
				  }

				}//try ends here
				catch(Exception ex){
									System.out.println("Unable to open file '" + path + "'"+ex);
									}
	}

}
