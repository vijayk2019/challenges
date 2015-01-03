package reverseadd;
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
			
				 if (line.length() == 0) {
		                continue;
		            }

	            int input = Integer.parseInt(line);
	            int num_iter = 0;
	            while (true) {
	                if (checkPalindString(Integer.toString(input).toCharArray())) {
	                    System.out.println(num_iter + " " + input);
	                    break;
	                }

	                num_iter++;
	                input = input + inputReverse(Integer.toString(input).toCharArray());
	            }
			
			}//while loop ends here 
		 bufferedReader.close();	
		}//try ends here
		catch(Exception ex){
			System.out.println("Unable to open file '" + path + "'");
		}
	}

	public static int inputReverse(char[] inputCharArray){
	        
	        for (int i = 0; i < inputCharArray.length/2; i++) {
	            char temp = inputCharArray[i];
	            inputCharArray[i] = inputCharArray[inputCharArray.length -1 -i];
	            inputCharArray[inputCharArray.length -1 - i] = temp;
	        }
	        String temp = new String(inputCharArray);
	        return (Integer.parseInt(temp));
	 }
	
	public static boolean checkPalindString(char[] charInput){

        for (int i = 0; i < charInput.length/2; i++) {
            if (charInput[i] != charInput[charInput.length-i-1]) {
                return false;
            }
        }

        return true;
 }
	
}
