package LongestCommonSubsequence;
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
			String[] input = line.split(";");
			String result = longestCommSeq(input[0], input[1]);
			System.out.println(result);
			}//while loop ends here 
		 bufferedReader.close();	
		}//try ends here
		catch(Exception ex){
			System.out.println("Unable to open file '" + path + "'");
		}
		
	}
	
	
	    public static String longestCommSeq(String input1, String input2)
	    {
	        int length1 = input1.length();
	        int length2 = input2.length();
	 
	        int[][] matrix = new int[length1 + 1][length2 + 1];
	 
	        for (int i = length1 - 1; i >= 0; i--)
	        {
	            for (int j = length2 - 1; j >= 0; j--)
	            {
	                if (input1.charAt(i) == input2.charAt(j)){
	                    matrix[i][j] = matrix[i + 1][j + 1] + 1;	
	                }
	                else {
	                    matrix[i][j] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
	                }
	            }
	        }
	 
	        StringBuffer resbuff = new StringBuffer();
	        int k = 0, m = 0;
	        while (k < length1 && m < length2) 
	        {
	            if (input1.charAt(k) == input2.charAt(m)) 
	            {
	                resbuff.append(input1.charAt(k));
	                k++;
	                m++;
	            }
	            else if (matrix[k + 1][m] >= matrix[k][m + 1]){
	                k++;	
	            }
	            else{
	            	m++;	
	            }
	        }
	          return resbuff.toString();
	     }

}
