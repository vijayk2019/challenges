package stackchallenge;
import java.io.*;
import java.util.*;

public class Main {
	private  static int a[];
	private  static int top;
	private  static int size;
	
	public static void Stack(int size_src){
		size = size_src;
		a = new int[size];
		top = -1;
	}

	public static boolean push(int value){
		if(top >= size){
			return false;
		}
		a[++top] = value;
		return true;
	}
	
	public static int pop(){
		if(top < 0){
			return -1;
		}
		return a[top--];
	}
	
	public static int stacksize(){
		return (top+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = args[0];
		String line = null;
		Stack(100);//Can make dynamic stack if we want by scanning lines and counting # of digits. Going with static fixed size stack of 100 in this challenge 
		try{
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line = bufferedReader.readLine()) != null){
			
			Scanner Scan = new Scanner(line); 
            while (Scan.hasNextInt()) {
                int input_num = Scan.nextInt(); 
                push(input_num); 
            }
            
            String line_output = "";
            int i = 0;  
            int stack_size =stacksize();
            while (i < stack_size) {
                if (i % 2 == 0)
                {
                	line_output = line_output + pop() + " "; 
                } 
                else 
                {
                    pop(); 
                }
                
                i++; 
            }
            
            System.out.println(line_output.trim()); 
            
	   }//while loop ends here 
		 bufferedReader.close();	
	 }//try ends here
		catch(Exception ex){
			System.out.println("Unable to open file '" + path + "'");
		}
	}//main function ends here
	
}


